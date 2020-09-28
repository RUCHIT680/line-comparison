
public class linecomparison { Double l1 = Double.valueOf(length1);
Double l2 = Double.valueOf(length2);

boolean compareValue = l1.equals(l2);
int m = l1.compareTo(l2);

if (compareValue)
if (m == 0)
	System.out.println("Both lines are equal");
else
	System.out.println("Both lines are not equal");
}
}

}





