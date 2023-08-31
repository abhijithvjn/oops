public class product
{
	    int pcode;
	    String pname;
	    double price;
	    double lowest;
	    product(int c, String n, double p){
	        pcode=c;
	        pname=n;
	        price=p;
	    }
	    void display(){
	        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	        
	    }  
	    static void findLowest(double price1,double price2, double price3){
	    if(price1<=price2 && price1<=price3){
	        System.out.println("\nProduct 1 is of the lowest price!");
	        
	    }
	    else if(price2<=price1 && price2<=price3){
	        System.out.println("\nProduct 2 is of the lowest price!");
	        
	    }
	    else{
	        System.out.println("\nProduct 3 is of the lowest price!");
	        
	    }
	    
	   }
	  public static void main(String[] args)
		{
	        product obj[] = new product[3];
	        obj[0] = new product(101,"Product_1",100.0);
	        obj[1] = new product(102,"Product_2",128.40);
	        obj[2] = new product(103,"Product_3",790.00);
	        System.out.println("Product Information:\n Product_Code\tProduct_Name\tProduct_Price");
	        obj[0].display();
	        obj[1].display();
	        obj[2].display();
	        findLowest(obj[0].price,obj[1].price,obj[2].price);    
	        
	    }
	}
