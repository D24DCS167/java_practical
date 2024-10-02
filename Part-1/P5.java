/*An electric appliance shop assigns code 1 to motor,2 to 
fan,3 to tube and 4 for wires. All other items have code 5 or 
more. While selling the goods, a sales tax of 8% to 
motor,12% to fan,5% to tube light,7.5% to wires and 3% 
for all other items is charged. A list containing the product 
code and price in two different arrays. Write a java 
  program using switch statement to prepare the bill. */

  public class P5
   {
     public static void main(String[] args) 
     {
         int[] arr_code={1,2,3,4,5};
         double[] arr_price={900.0,850.0,400.0,150.0,750.0};
         double totalBill = 0;
        
         System.out.println("----------------------------------------------------------------");
         System.out.print("| Product Code |        Price      |  Tax Rate  | Total Price  |\n");
         System.out.println("----------------------------------------------------------------");
         for (int i = 0; i < arr_code.length; i++) 
         {
         int code = arr_code[i];
         double price = arr_price[i];
         double tax;
         
         switch (code) {
            case 1:
                tax=0.08;
                break;
            case 2:
                tax=0.12;
                break;
            case 3:
                tax=0.05;
                break;
            case 4:
                tax=0.075;
                break;
            case 5:
                tax=0.03;
                break;
            default:
                throw new AssertionError();
         }
         double taxAmount = price * tax;
         double totalPrice = price + taxAmount;

         totalBill += totalPrice;

         System.out.printf("|      %d       |      %.2f     |    %.2f    |    %.2f    |\n",code,price*100,tax,totalPrice);
        }
         System.out.println("----------------------------------------------------------------");
        System.out.printf("|                                         Total Bill: %.2f  |\n", totalBill);
         System.out.println("----------------------------------------------------------------");
     }
   }
