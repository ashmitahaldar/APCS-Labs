import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
/**
 * Write a description of class Steganography here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Steganography
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Steganography
     */
    public Steganography()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Clear the lower (rightmost) two bits in a pixel.
     */
    public static void clearLow(Pixel p)
    {
        // put your code here
        int red = p.getRed();
        int blue = p.getBlue();
        int green = p.getGreen();
        
        red /= 4;
        green /= 4;
        blue /= 4;
        
        red *= 4;
        green *= 4;
        blue *= 4;
        
        p.setRed(red);
        p.setGreen(green);
        p.setBlue(blue);
    }

    public static void setLow(Pixel p, Color c)
    {
        clearLow(p);

        int pred = p.getRed();
        int pblue = p.getBlue();
        int pgreen = p.getGreen();
        
        int cred = c.getRed();
        int cblue = c.getBlue();
        int cgreen = c.getGreen();

        while ((c.getRed() > 3) && (c.getGreen() > 3) && (c.getBlue() > 3))
        {
            cred /= 2;
            cgreen /= 2;
            cblue /= 2;
        }

        pred += cred;
        pgreen += cgreen;
        pblue += cblue;
        
        p.setRed(pred);
        p.setGreen(pgreen);
        p.setBlue(pblue);

    }

    public static Picture revealPicture(Picture hidden)
    {
        Picture copy = new Picture(hidden);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] source = hidden.getPixels2D();
        for (int r = 0; r < pixels.length; r++)
        {
            for (int c = 0; c < pixels[0].length; c++)
            {
                Color col = source[r][c].getColor();
                pixels[r][c].setRed(((int)col.getRed() % 4)*64);
                pixels[r][c].setGreen(((int)col.getGreen() % 4)*64);
                pixels[r][c].setBlue(((int)col.getBlue() % 4)*64);
            }
        }
        return copy;
    }
    
    public static boolean canHide(Picture source, Picture secret)
    {
        int sourceW = source.getWidth();
        int secretW = source.getWidth();
        int sourceH = source.getHeight();
        int secretH = source.getHeight();
        if ((sourceW >= secretW) && (sourceH >= secretH))
        {
            return true;
        }
        return false;
    }
    
    public static Picture testClearLow(Picture pic)
    {
        Picture picture = pic;
        Pixel[][] pixs = picture.getPixels2D();
        for (Pixel[] row : pixs)
        {
            for (Pixel column : row)
            {
                clearLow(column);
            }
        }
        return picture;
    }

    public static Picture testSetLow(Picture pic, Color color)
    {
        Picture picture = pic;
        Pixel[][] pixs = picture.getPixels2D();
        for (Pixel[] row : pixs)
        {
            for (Pixel column : row)
            {
                setLow(column, color);
            }
        }
        return picture;
    }

    public static Picture hidePicture(Picture source, Picture secret)
    {
        Picture sourceEdit = new Picture(source);
        Pixel[][] pixels = sourceEdit.getPixels2D();
        Pixel[][] secretPixels = secret.getPixels2D();
        for(int r = 0; r < secretPixels.length; r++)
        {
            for(int c = 0; c < secretPixels[r].length; c++)
            {
                Color col = secretPixels[r][c].getColor();
                setLow(pixels[r][c], col);
            }
        }
        return sourceEdit;
    }

    public static Picture hidePicture(Picture source, Picture secret, int startRow, int startCol)
    {
        Picture copy = new Picture(source);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] secretPixels = secret.getPixels2D();
        for(int r = startRow; r < startRow + secretPixels.length; r++)
        {
            for(int c = startCol; c < startCol + secretPixels[c - startRow].length; c++)
            {
                Color col = secretPixels[r - startRow][c - startCol].getColor();
                setLow(pixels[r][c], col);
            }
        }
        return copy;
    }

    public static boolean isSame(Picture pic1, Picture pic2)
    {
        Pixel[][] one = pic1.getPixels2D();
        Pixel[][] two = pic2.getPixels2D();
        
        if (pic1.getWidth() != pic2.getWidth()) return false;
        if (pic1.getHeight() != pic2.getHeight()) return false;
        
        for(int r = 0; r < one.length; r++)
        {
            for(int c = 0; c < one[r].length; c++)
            {
                if(one[r][c].getBlue() == two[r][c].getBlue() && 
                one[r][c].getGreen() == two[r][c].getGreen() && 
                one[r][c].getRed() == two[r][c].getRed())
            {}
            else
            {
                return false;
            }
        }
        }
        return true;
    }

    public static ArrayList<Point> findDifferences(Picture pic1, Picture pic2)
    {
        Pixel[][] one = pic1.getPixels2D();
        Pixel[][] two = pic2.getPixels2D();
        ArrayList<Point> pointsArr = new ArrayList<Point>();

        if (pic1.getHeight() != pic2.getHeight() && pic1.getWidth() != pic2.getWidth())
        {
            return pointsArr;
        }

        for (int r = 0; r < one.length; r++)
        {
            for (int c = 0; c < one[r].length; c++)
            {
                if (one[r][c].getBlue() != two[r][c].getBlue() && 
                one[r][c].getGreen() != two[r][c].getGreen() && 
                one[r][c].getRed() != two[r][c].getRed())
                {
                    pointsArr.add(new Point(r, c));
                }
            }
        }
        return pointsArr;
    }

    public static Picture showDifferentArea(Picture pic, ArrayList<Point> points)
    {
        Picture copy = new Picture(pic);
        Pixel[][] pixels = copy.getPixels2D();
        int pointsLen = points.size();
        
        for(int i = 0; i < pointsLen; i++)
        {
            int x = (int) points.get(i).getX();
            int y = (int) points.get(i).getY();
            
            pixels[x][y].setColor(new Color(192, 192, 192));
        }
        
        return copy;
    }

    public static ArrayList<Integer> encodeString(String s) 
    { 
        s = s.toUpperCase(); 
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) 
        { 
            if (s.substring(i,i+1).equals(" ")) 
            { 
                result.add(27); 
            } 
            else 
            {
                result.add(alpha.indexOf(s.substring(i,i+1))+1);
            } 
        }
        result.add(0);
        return result; 
    } 

    public static String decodeString(ArrayList<Integer> codes)
    {
        String result=""; 
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        for (int i=0; i < codes.size(); i++) 
        { 
            if (codes.get(i) == 27) 
            { 
                result = result + " ";
            }
            else 
            {
                result = result + 
                alpha.substring(codes.get(i)-1,codes.get(i)); 
            }
        }
        return result; 
    } 

    private static int[] getBitPairs(int num)
    {
        int[] bits = new int[3];
        int code = num;
        for (int i = 0; i < 3; i++)
        {
            bits[i] = code % 4;
            code = code / 4;
        } 
        return bits;
    }

    public static void hideText(Picture source, String s)
    {
        Pixel[][] pixels = source.getPixels2D();
        ArrayList<Integer> codeS = encodeString(s);
        
        int r = 0;
        int c = 0;
        
        for (int i = 0; i < codeS.size(); i++)
        {
            int[] bits = getBitPairs(codeS.get(i));

            clearLow(pixels[r][c]);

            pixels[r][c].setRed(pixels[r][c].getRed() + bits[2]);
            pixels[r][c].setGreen(pixels[r][c].getGreen() + bits[1]);
            pixels[r][c].setBlue(pixels[r][c].getBlue() + bits[0]);
            
            if(pixels[0].length <= c)
            {
                c = 0;
                r++;
            }
            
            c++;
        }
    }

    public static String revealText(Picture source)
    {
        Pixel[][] pixels = source.getPixels2D();
        String str = "";
        ArrayList<Integer> codes = new ArrayList<Integer>();
        boolean bool = false;
        
        for (int r = 0 ; r < pixels.length; r++)
        {
            for(int c = 0; c < pixels[0].length; c++)
            {
                int code = 0;
                
                code = 16 * (pixels[r][c].getRed() % 4) + 
                4 * (pixels[r][c].getGreen() % 4) + 
                (pixels[r][c].getBlue() % 4);
                
                if (code == 0)
                {
                    
                    bool = true;
                    break;
                    
                }
                else 
                {
                   codes.add(code);
                }
            }
            
            if (bool) break;
        }
        
        str = decodeString(codes);
        return str;
    }

    public static void main(String[] args)
    {
        
        
        /*Picture beach = new Picture("beach.jpg");
        beach.explore();
        Picture copy = testClearLow(beach);
        copy.explore();
        
        Picture beach2 = new Picture("beach.jpg");
        beach2.explore();
        
        Picture copy2 = testSetLow(beach2, Color.PINK);
        copy2.explore();

        Picture copy3 = revealPicture(copy2);
        copy3.show();
        //System.out.println(canHide(new Picture("beach.jpg"), new Picture("arch.jpg")));
        Picture beach4 = new Picture ("beach.jpg");
        Picture blue = new Picture("blue-mark.jpg");
        if(canHide(blue, beach4))
        {
            Picture hidden = hidePicture(beach4, blue);
            hidden.explore();
            Picture reveal = revealPicture(hidden);
            reveal.explore();
        }

        Picture beach = new Picture("beach.jpg");
        Picture robot = new Picture("robot.jpg");
        Picture flower1 = new Picture("flower1.jpg");
        beach.explore();

        //these lines hide 2 pics
        Picture hidden1 = hidePicture(beach, robot, 65, 208);
        Picture hidden2 = hidePicture(hidden1, flower1, 280, 110);
        hidden2.explore();

        Picture unhidden = revealPicture(hidden2);
        unhidden.explore();
        */


        
    }
}
