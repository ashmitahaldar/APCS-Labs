//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MilesPerHour
{
    public static double getMPH( int dist, int hrs, int mins )
    {
        double rate = Math.round(dist / (hrs + (mins / 60.0)));
        return rate;
    }
}

