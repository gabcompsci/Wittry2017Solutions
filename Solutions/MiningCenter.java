import java.util.*;

public class MiningCenter 
{
   private ArrayList<Site> mines;
   
/*
 *    precondition: m.size() > 0
 */
   public MiningCenter(ArrayList<Site> m)  {  mines = m;  }

   private int maxDistance(Site site)
   {
   	  int answer = Math.abs(site.getX() - mines.get(0).getX())
   	  				+ Math.abs(site.getY() - mines.get(0).getY());
   	  for(int i = 1; i < mines.size(); i++)
   	  {
   	  	int distance = Math.abs(site.getX() - mines.get(i).getX())
   	  				+ Math.abs(site.getY() - mines.get(i).getY());
   	  	if(distance > answer)
   	  	{
   	  		answer = distance;
   	  	}
   	  }
   	  return answer;
   }

   public Site getCenter()  {
	  int xMin = mines.get(0).getX();
	  int xMax = mines.get(0).getX();
	  int yMin = mines.get(0).getY();
	  int yMax = mines.get(0).getY();
      for (int i = 1; i < mines.size(); i++)
      {
      	if(mines.get(i).getX() < xMin)
      	{
      		xMin = mines.get(i).getX();
      	}
      	if(mines.get(i).getX() > xMax)
      	{
      		xMax = mines.get(i).getX();
      	}
      	if(mines.get(i).getY() < yMin)
      	{
      		yMin = mines.get(i).getY();
      	}
      	if(mines.get(i).getY() > yMax)
      	{
      		yMax = mines.get(i).getY();
      	}
      }
   	  Site answer = new Site(xMin, yMin);
   	  int minMax = maxDistance(answer);
      for(int x = xMin; x <= xMax; x++)
      {
      	for(int y = yMin; y <= yMax; y++)
      	{
      		Site site = new Site(x, y);
      		if(maxDistance(site) < minMax)
      		{
      			minMax = maxDistance(site);
      			answer = site;
      		}
      		if(maxDistance(site) == minMax)
      		{
      			int absSiteX = Math.abs(site.getX());
      			int absAnswerX = Math.abs(answer.getX());
      			if(absSiteX < absAnswerX
      				|| (absSiteX == absAnswerX && site.getX() > 0) )
      			{
      				answer = site;
      			}
      				
      		}
      	}
      }

      return answer;
   }
}
