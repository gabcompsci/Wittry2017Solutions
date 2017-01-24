public class HPCipher
{
   //  add your own instance variables
   final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   final String SPACE = " ";
   String coded;
   String condensed;

   public HPCipher(String mess)
   {
      // add code
      coded = mess;
      condensed = coded;
      while(condensed.indexOf(SPACE) >= 0)
      {
          int index = condensed.indexOf(SPACE);
          String front = condensed.substring(0, index);
          String back = condensed.substring(index + 1);
          condensed = front + back;
      }
   }

/*
 *    precondition s1.length() == 1   &&   s2.length() == 1
 */
   public int letterDifference(String s1, String s2)
   {
      int s1Index = LETTERS.indexOf(s1);
      int s2Index = LETTERS.indexOf(s2);
      if(s2Index < s1Index)
      {
      	s2Index += 26;
      }
      return (s2Index - s1Index);
      // return -1;
   }
   
   public String decode(String code)
   {
       String answer = "";
       int start = 0;
       int difference = 0;
       boolean match = false;
       while(!match)
       {
       	  difference = letterDifference(condensed.substring(start, start + 1), code.substring(0, 1));
       	  int pos = 1;
       	  match = true;
       	  while(match && pos < code.length())
       	  {
       	      String codeCh = code.substring(pos, pos + 1);
       	      String condCh = condensed.substring(start + pos, start + pos + 1);
       	      if(letterDifference(condCh, codeCh) != difference)
       	      {
       	          match = false;
       	          start++;
       	      }
       	      else
       	      {
       	          pos++;
       	      }
       	  }
       }
       for(int pos = 0; pos < coded.length(); pos++)
       {
       	  String ch = coded.substring(pos, pos + 1);
       	  if(!ch.equals(SPACE))
       	  {
       	      int chPos = (LETTERS.indexOf(coded.substring(pos, pos + 1)) + difference) % 26;
       	      ch = LETTERS.substring(chPos, chPos + 1);
       	  }
       	  answer += ch;
       }
       // return "";
       return answer;
   }
}
