public class RPSSL 
{
	final String [][] result =
	{
		{"rock", "lizard"},
		{"scissors", "lizard"},
		{"lizard", "paper"},
		{"spock", "rock"},
		{"paper", "spock"},
		{"rock", "scissors"},
		{"scissors", "paper"},
		{"lizard", "spock"},
		{"spock", "scissors"},
		{"paper", "rock"},
	};
    public String playRound(Player p1, Player p2)
    {
    	for(int win = 0; win < 10; win++)
    	{
    		if( (result[win][0].equals(p1.getChoice()) ) && (result[win][1].equals(p2.getChoice()) ) )
    		{
    			return(p1.getName());
    		}
    		if( (result[win][0].equals(p2.getChoice()) ) && (result[win][1].equals(p1.getChoice()) ) )
    		{
    			return(p2.getName());
    		}
    	}
	    return "TIE";
    }
}
