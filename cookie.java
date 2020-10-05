public class cookie {
    String cookieFlavor;
    String cookieColor;
    String cookieCandy;
    int cookieNum;
    
    public cookie(String flavor,String color,String candy, int number){
    cookieFlavor = flavor;
    cookieColor = color;
    cookieCandy = candy;
    cookieNum = number;
    }
    
    public static void main( String[] args){
       
    cookie c1 = new cookie("vanilla","pink","Butterfinger",2);
    cookie c2 = new cookie("chocolate chip","golden","Reeses",3);
                        
        
     System.out.println("I bought " + c1.cookieNum + " " + c1.cookieColor + ", " + c1.cookieFlavor + " cookies with " + c1.cookieCandy + " pieces.");
     System.out.println("I am eating " + c2.cookieNum + " " + c2.cookieColor + ", " + c2.cookieFlavor + " cookies with " + c2.cookieCandy + " pieces.");
    
    }
}


// $javac cookie.java
// $java -Xmx128M -Xms16M cookie
// I bought 2 pink, vanilla cookies with Butterfinger pieces.
// I am eating 3 golden, chocolate chip cookies with Reeses pieces.
