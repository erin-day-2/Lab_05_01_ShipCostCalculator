public class Main
{

    public static void main(String[] args)
    {
	boolean freeShipping = false;
    double itemPrice = 101;
    double tax = .02;
    double shippingCost = 0;
    double totalPrice = 0;


     if (itemPrice > 100)
     {
         freeShipping = true;
         System.out.println("The shipping is free!");
     }
     else
     {
        freeShipping = false;
        shippingCost = itemPrice * tax;
        totalPrice = shippingCost + itemPrice;
        System.out.println("Shipping is not free. Your total cost is " + totalPrice + " and the shipping cost is " + shippingCost);
     }
     }
}
