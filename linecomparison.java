
public class linecomparison { public static void main(String[] args) {int y3 = (int) (Math.floor(Math.random()*10)) ;
int x4 = (int) (Math.floor(Math.random()*10)) ;
int y4 = (int) (Math.floor(Math.random()*10)) ;

length1 = (int)  Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
length2 = (int)  Math.sqrt(Math.pow(x4-x3, 2)+ Math.pow(y4-y3, 2));

System.out.println("length1 " +x1 +"," +y1+ " and "+x2 +"," +y2 + " is " +length1 );
System.out.println("length2 " +x3 +"," +y3+ " and "+x4 +"," +y4 + " is " +length2 );
}

}




