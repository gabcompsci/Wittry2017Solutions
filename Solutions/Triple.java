public class Triple {
   private int x;    // number of 6 packs
   private int y;    // number of 11 packs
   private int z;    // number of 13 packs

   public Triple (int a, int b, int c)  {
      x = a;
      y = b;
      z = c;
   }

   public int get6()  { return x;  }
   public int get11() { return y;  }
   public int get13() { return z;  }

   public void set6(int a)  { x = a; }
   public void set11(int b) { y = b; }
   public void set13(int c) { z = c; }

   public String toString() {
     return "(" + get6() + ", " + get11() + ", " + get13() + ")";
   }

   public boolean equals(Object obj) {
      Triple loc = (Triple) obj;
      return get6() == loc.get6() && get11() == loc.get11()
                  && get13() == loc.get13();
   }
}
