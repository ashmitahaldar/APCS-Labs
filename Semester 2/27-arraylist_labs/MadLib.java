//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
    private ArrayList<String> verbs;
    private ArrayList<String> nouns;
    private ArrayList<String> adjectives;
    private String story;

    public MadLib(String fileName)
    {
        // initialize instance variables
        verbs = new ArrayList<String>();
        nouns = new ArrayList<String>();
        adjectives = new ArrayList<String>();
        story = "";
        
        //load stuff
        loadNouns();
        loadVerbs();
        loadAdjectives();
        
        try{
            // load the story
            Scanner file = new Scanner(new File(fileName));

            // build the story, replacing special characters with noun/verb/adj
            while (file.hasNext()){
                String word = file.next();
                if (word.equals("#")){
                    story += getRandomNoun() + " ";
                }
                else if (word.equals("@")){
                    story += getRandomVerb() + " ";
                }
                else if (word.equals("&")){
                    story += getRandomAdjective() + " ";
                }
                else {
                    story += word + " ";
                }
            }
            
        }
        catch(Exception e){
            out.println("Houston we have a problem!");
        }        
    }

    public void loadNouns()
    {
        try{        
            //add code here
            Scanner file = new Scanner(new File("nouns.txt"));
            while (file.hasNext()) {
                nouns.add(file.next());
            }
        }
        catch(Exception e)
        {
        }            
    }

    public void loadVerbs()
    {
        try{    
            //add code here
            Scanner file = new Scanner(new File("verbs.txt"));
            while (file.hasNext()) {
                verbs.add(file.next());
            }
        }
        catch(Exception e)
        {
        }
    }

    public void loadAdjectives()
    {
        try{
            //add code here 
            Scanner file = new Scanner(new File("adjectives.txt"));
            while (file.hasNext()) {
                adjectives.add(file.next());
            }
        }
        catch(Exception e)
        {
        }
    }

    public String getRandomVerb()
    {
        String verb = "";
        verb = verbs.get((int)(Math.random()*(verbs.size())));
        return verb;
    }

    public String getRandomNoun()
    {
        String noun = "";
        noun = nouns.get((int)(Math.random()*(nouns.size())));
        return noun;
    }

    public String getRandomAdjective()
    {
        String adj = "";
        adj = adjectives.get((int)(Math.random()*(adjectives.size())));
        return adj;
    }        

    public String toString()
    {
        return story;
    }
}