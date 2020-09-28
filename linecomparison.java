
public class linecomparison { System.out.println("length1 " +x1 +"," +y1+ " and "+x2 +"," +y2 + " is " +length1 );
System.out.println("length2 " +x3 +"," +y3+ " and "+x4 +"," +y4 + " is " +length2 );

Double l1 = Double.valueOf(length1);
Double l2 = Double.valueOf(length2);

boolean compareValue = l1.equals(l2);

if (compareValue)
	System.out.println("Both lines are equal");
else
	System.out.println("Both lines are not equal");
}

}




