/**
 @Author:
 Period:
 Date Started: Dec 09, 2016
 Date Completed:
 Assignment #:
 Description:
*/
//import apcslib.*;
//import chn.util.*;

import java.util.*;

public class Wittry2017 
{
	public static void main(String args[]) 
	{
		System.out.println("   *** HPCipher ***");
		HPCipher hp = new HPCipher("P JVKL AOLYLMVYL P HT");
		System.out.println(hp.letterDifference("A", "E"));
		System.out.println(hp.letterDifference("Z", "B"));
		System.out.println(hp.decode("IA"));
		System.out.println(hp.decode("DETH"));
        HPCipher hpc = new HPCipher("HIGSHI QI");
		System.out.println(hpc.decode("EM"));
		System.out.println(hpc.decode("DE"));
		
		System.out.println("   *** LineIntervalDensity ***");
 		Interval[] itv1 = {new Interval(1, 4), new Interval(4, 8)};
	    LineIntervalDensity lid1 = new LineIntervalDensity(itv1);
	    System.out.println(lid1.lowerLimit());
	    System.out.println(lid1.upperLimit());
	    System.out.println(lid1.density(0));
	    System.out.println(lid1.density(3.7));
	    System.out.println(lid1.maxDensity());
    	Interval[] itv2 = {new Interval(0, 3), new Interval(-4, 5),
                         new Interval(5, 10), new Interval(-1, 7)};
	    LineIntervalDensity lid2 = new LineIntervalDensity(itv2);
	    System.out.println(lid2.lowerLimit());
	    System.out.println(lid2.upperLimit());
	    System.out.println(lid2.density(-1));
	    System.out.println(lid2.density(7.7));
	    System.out.println(lid2.maxDensity());

		System.out.println("   *** MiningCenter ***");
	    ArrayList<Site> mines = new ArrayList<Site>();
	    mines.add(new Site(10, 0));
	    mines.add(new Site(6,7));
	    mines.add(new Site(-6,8));
	    mines.add(new Site(-9,-8));
	    MiningCenter mc = new MiningCenter(mines);
		System.out.println(mc.getCenter());
		ArrayList<Site> mines1 = new ArrayList<Site>();
		mines1.add(new Site(0, 0));
		mines1.add(new Site(0, 5));
	    mines1.add(new Site(5, 0));
	    MiningCenter mc1 = new MiningCenter(mines1);
		System.out.println(mc1.getCenter());
		ArrayList<Site> mines2 = new ArrayList<Site>();
		mines2.add(new Site(1, -5));
		mines2.add(new Site(-10, 5));
		mines2.add(new Site(-2, 5));
		mines2.add(new Site(10, 10));
		mines2.add(new Site(5, -5));
		MiningCenter mc2 = new MiningCenter(mines2);
		System.out.println(mc2.getCenter());
      		
		System.out.println("   *** PetersPeppers ***");
		PetersPeppers pp = new PetersPeppers();
		System.out.println(pp.getTriple(6));
		System.out.println(pp.getTriple(55));
		System.out.println(pp.getTriple(88));
		System.out.println(pp.getTriple(42));
		System.out.println(pp.getTriple(27));
		System.out.println(pp.getTriple(1));
      		
		System.out.println("   *** RPSSL ***");
		RPSSL game = new RPSSL();
		System.out.println(game.playRound(new Player("Sheldon", "rock"),
                 new Player("Leonard", "rock")));
		System.out.println(game.playRound(new Player("Sheldon", "paper"),
                 new Player("Howard", "rock")));
		System.out.println(game.playRound(new Player("Raj", "spock"),
                 new Player("Penny", "paper")));
		System.out.println(game.playRound(new Player("Amy", "lizard"),
                 new Player("Leonard", "scissors")));

		System.out.println("   *** TurkeyOr ***");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(5));
		al.add(new Integer(2));
		al.add(new Integer(3));
		TurkeyOr tw = new TurkeyOr(al);
		System.out.println(tw.canTravel(-10));
		System.out.println(tw.canTravel(-8));
		System.out.println(tw.canTravel(-7));
		System.out.println(tw.canTravel(-6));
		System.out.println(tw.canTravel(-5));
		System.out.println(tw.canTravel(-4));
		System.out.println(tw.canTravel(-3));
		System.out.println(tw.canTravel(-2));
		System.out.println(tw.canTravel(-1));
		System.out.println(tw.canTravel(0));
		System.out.println(tw.canTravel(1));
		System.out.println(tw.canTravel(2));
		System.out.println(tw.canTravel(3));
		System.out.println(tw.canTravel(4));
		System.out.println(tw.canTravel(5));
		System.out.println(tw.canTravel(6));
		System.out.println(tw.canTravel(7));
		System.out.println(tw.canTravel(8));
		System.out.println(tw.canTravel(10));
		System.out.println(tw.canTravel(-11));
		System.out.println(tw.canTravel(-9));
		System.out.println(tw.canTravel(9));
		System.out.println(tw.canTravel(11));
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(new Integer(5));
		a2.add(new Integer(2));
		a2.add(new Integer(3));
		a2.add(new Integer(1));
		TurkeyOr tw1 = new TurkeyOr(a2);
		System.out.println(tw1.canTravel(0));
		System.out.println(tw1.canTravel(1));
		System.out.println(tw1.canTravel(2));
		System.out.println(tw1.canTravel(3));
		System.out.println(tw1.canTravel(4));
		System.out.println(tw1.canTravel(5));
		System.out.println(tw1.canTravel(6));
		System.out.println(tw1.canTravel(7));
		System.out.println(tw1.canTravel(8));
		System.out.println(tw1.canTravel(9));
		System.out.println(tw1.canTravel(10));
		System.out.println(tw1.canTravel(11));
		System.out.println(tw1.canTravel(12));
	}
}
