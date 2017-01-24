public class PetersPeppers 
{
   private int six;
   private int eleven;
   private int thirteen;
   
   public Triple getTriple(int num)
   {
       Triple best = new Triple(0, 0, 0);
	   /*   add code   */
	   int total13 = -1;
	   int total11 = -1;
	   int total6 = -1;
	   int packs = num;
	   for(int count13 = 0; count13 * 13 <= num; count13++)
	   {
	   	   for(int count11 = 0; count11 * 11 <= num; count11++)
	   	   {
	   	   	   for(int count6 = 0; count6 * 6 <= num; count6++)
	   	   	   {
	   	   	   	   if(count13 * 13 + count11 * 11 + count6 * 6 == num)
	   	   	   	   {
	   	   	   	   	   int count = count6 + count11 + count13;
	   	   	   	   	   if( (count < packs) || ( (count == packs) && (count13 > total13) ) )
	   	   	   	   	   {
	   	   	   	   	   	   total13 = count13;
	   	   	   	   	   	   total11 = count11;
	   	   	   	   	   	   total6 = count6;
	   	   	   	   	   	   packs = count;
	   	   	   	   	   }
	   	   	   	   }
	   	   	   }
	   	   }
	   }
	   best = new Triple(total6, total11, total13);
       return best;
   }
}
