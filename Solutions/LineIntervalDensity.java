public class LineIntervalDensity 
{
	private Interval[] interval;
/*
 *   precondition   inter.length > 0 & contains Intervals
 */
   public LineIntervalDensity(Interval[] inter)
   {
      interval = inter;
   }

   public double lowerLimit()
   {
      double min = interval[0].getLeft();
      for(int i = 1; i < interval.length; i++)
      {
      	if(interval[i].getLeft() < min)
      	{
      		min = interval[i].getLeft();
      	}
      }

      return min;
   }

   public double upperLimit()
   {
      double max = interval[0].getRight();
      for(int i = 1; i < interval.length; i++)
      {
      	if(interval[i].getRight() > max)
      	{
      		max = interval[i].getRight();
      	}
      }

      return max;
   }

   public int density(double x)
   {
      int answer = 0;
      for(int i = 0; i < interval.length; i++)
      {
      	if(x >= interval[i].getLeft() && x < interval[i].getRight())
      	{
      		answer++;
      	}
      }

      return answer;
   }

   public int maxDensity()
   {
      int answer = 0;

      for(int i = 0; i < interval.length; i++)
      {
      	if(density(interval[i].getLeft()) > answer)
      	{
      		answer = density(interval[i].getLeft());
      	}
      }
      return answer;
   }
}
