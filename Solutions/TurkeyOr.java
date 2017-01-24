import java.util.*;

public class TurkeyOr 
{
   private ArrayList<Integer> numbers;

   public TurkeyOr(ArrayList<Integer> temp)
   {
      numbers = temp;
   }

   public boolean canTravel(int d)
   {
      for(int tickets = 0; tickets < (int)Math.pow(3, numbers.size()); tickets++)
      {
      	int t = tickets;
      	int sum = 0;
      	for(int c = 0; c < numbers.size(); c++)
      	{
      		sum += ( (t % 3) - 1) * numbers.get(c);
      		t /= 3;
      	}
      	if(sum == d)
      	{
      		return true;
      	}
      }
      return false;
   }
}
