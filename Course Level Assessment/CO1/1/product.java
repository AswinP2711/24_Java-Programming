class Pro {
    int pcode;
    String pname;
    double price;
}

public class product {
    public static void main(String[] args) {
        Pro product1=new Pro();
        Pro product2=new Pro();
        Pro product3=new Pro();
        String lowest;
        
        product1.pcode=001;
        product1.pname="Mouse";
        product1.price=349.40;

        product2.pcode=002;
        product2.pname="Key Board";
        product2.price=279.80;

        product3.pcode=003;
        product3.pname="Speaker";
        product3.price=599.99;

        if (product1.price < product2.price) {
            if (product1.price < product3.price) {
                lowest=product1.pname;
            }else{
                lowest=product3.pname;
            }
        }else{
            if (product2.price < product3.price) {
                lowest=product2.pname;
            }else{
                lowest=product3.pname;
            }
            
        }

        System.out.println("The product having lowest price is : "+lowest);
    }
    
}