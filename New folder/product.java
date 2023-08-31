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
       System.out.println(pcode+" "+pname+" "+price);
       
   }  
   static void findlowest(double price1,double price2, double price3){
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
 public static void main(String[] args){
       product ob[] = new product [3];
       ob[0]=new product(1,"a",1000.00);
       ob[1]=new product(2,"b",200.50);
	   ob[2]=new product(3,"c",300.25);
	   ob[0].display();
	   ob[1].display();
	   ob[2].display();
	   findlowest(ob[0].price,ob[1].price,ob[2].price);
	   
   }
}
