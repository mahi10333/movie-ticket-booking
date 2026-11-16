import java.util.Scanner;

public class MovieBooking {
   public MovieBooking() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("=======================");
      System.out.println("Welcome to CineBook.");
      System.out.println("=======================");
      System.out.println("Available Movies are: ");
      System.out.println("1. Materialists Rs.250");
      System.out.println("2. The Conjuring: Last Rites Rs.290");
      System.out.println("3. 28 years later Rs.200");
      System.out.println("4. Black Bag Rs.220");
      System.out.println("5. Weapons Rs.290");
      System.out.println("6. Another Simple Favour Rs.200");
      System.out.println("7. The Strangers: Chapter 2 Rs.250");
      System.out.println("8. Eternity Rs.230");
      System.out.println("========================");
      System.out.println("Show Timings are: ");
      System.out.println("11. 10:00 A.M.");
      System.out.println("21. 1:00 P.M.");
      System.out.println("31. 4:00 P.M.");
      System.out.println("41. 7:00 P.M.");
      System.out.println("51. 10:00 P.M.");
      System.out.println("=========================");
      System.out.println("Ticket Category Selection: ");
      System.out.println("12. Standard");
      System.out.println("22. Premium");
      System.out.println("32. VIP");
      System.out.print("Which movie you want to watch?: ");
      int var2 = var1.nextInt();
      System.out.print("What show timings you would prefer?: ");
      int var3 = var1.nextInt();
      System.out.print("Which ticket you would like to choose?: ");
      int var4 = var1.nextInt();
      System.out.print("How many tickets do you want?: ");
      int var5 = var1.nextInt();
      System.out.println("=============================");
      System.out.println("Apply Coupon");
      System.out.println("Apply coupon code: ");
      String var6 = var1.next();
      String var7 = "";
      short var8 = 0;
      String var9 = "";
      String var10 = "";
      double var11 = (double)0.0F;
      double var13 = (double)0.0F;
      double var15 = (double)0.0F;
      double var17 = (double)0.0F;
      boolean var19 = true;
      boolean var20 = true;
      boolean var21 = true;
      boolean var22 = false;
      switch (var2) {
         case 1:
            var7 = "Materialists";
            var8 = 250;
            break;
         case 2:
            var7 = "The Conjuring: Last Rites";
            var8 = 290;
            break;
         case 3:
            var7 = "28 years later";
            var8 = 200;
            break;
         case 4:
            var7 = "Black Bag";
            var8 = 220;
            break;
         case 5:
            var7 = "Weapons";
            var8 = 290;
            break;
         case 6:
            var7 = "Another Simple Favour";
            var8 = 200;
            break;
         case 7:
            var7 = "The Strangers: Chapter 2";
            var8 = 250;
            break;
         case 8:
            var7 = "Eternity";
            var8 = 230;
            break;
         default:
            System.out.println("Invalid choice selection.");
            var19 = false;
      }

      if (var19) {
         switch (var3) {
            case 11:
               var9 = "10:00 A.M.";
               break;
            case 21:
               var9 = "1:00 P.M.";
               break;
            case 31:
               var9 = "4:00 P.M.";
               break;
            case 41:
               var9 = "7:00 P.M.";
               break;
            case 51:
               var9 = "10:00 P.M.";
               break;
            default:
               System.out.println("Invalid show timings.");
               var20 = false;
         }

         if (var20) {
            switch (var4) {
               case 12:
                  var10 = "Standard";
                  break;
               case 22:
                  var10 = "Premium";
                  break;
               case 32:
                  var10 = "VIP";
                  break;
               default:
                  System.out.println("Invalid ticket category");
                  var21 = false;
            }

            if (var21) {
               if (var5 > 0 && var5 <= 10) {
                  short var23 = 0;
                  if (var10.equals("Premium")) {
                     var23 = 100;
                  } else if (var10.equals("VIP")) {
                     var23 = 200;
                  }

                  var11 = (double)((var8 + var23) * var5);
                  if (var6.equalsIgnoreCase("CINE10")) {
                     var13 = var11 * 0.1;
                  } else if (var6.equalsIgnoreCase("NOCOUPON")) {
                     var13 = (double)0.0F;
                  } else {
                     System.out.println("Invalid coupon code. No discount applied.");
                  }

                  double var24 = var11 - var13;
                  var17 = var24 * 0.05;
                  var15 = var24 + var17;
                  var22 = true;
                  System.out.println("=======================");
                  System.out.println("Booking Successful!");
                  long var26 = System.currentTimeMillis();
                  System.out.println("Booking ID: CB" + var26);
                  System.out.println("You selected: " + var7);
                  System.out.println("Selected ticket category: " + var10);
                  System.out.println("Show timings: " + var9);
                  System.out.println("Base Ticket Price: " + var8);
                  System.out.println("Number of tickets: " + var5);
                  System.out.println("Final Amount: " + var15);
                  System.out.println();
                  System.out.println("Booking Status: Confirmed");
                  System.out.println();
                  System.out.println("=======================");
                  System.out.println("ENJOY YPOUR MOVIE");
                  System.out.println("=======================");
               } else {
                  System.out.println("Please enter valid ticket number.");
               }
            }
         }

         if (var22) {
            System.out.println("==================");
            System.out.println("CINEBOOK BILL");
            System.out.println("==================");
            System.out.println("Movie: " + var7);
            System.out.println("ShowTime: " + var9);
            System.out.println("Category: " + var10);
            System.out.println("Base Ticket Price: Rs." + var8);
            System.out.println("Quantity: " + var5);
            System.out.println("-----------------------");
            System.out.printf("Subtotal: Rs.%.2f%n", var11);
            System.out.printf("Discount: Rs.%.2f%n", var13);
            System.out.printf("Tax (5%%): Rs.%.2f%n", var17);
            System.out.println("-----------------------");
            System.out.printf("Final Amount: Rs.%.2f%n", var15);
            thankyoumessage();
         }
      }

      var1.close();
   }

   static void thankyoumessage() {
      System.out.println("====================");
      System.out.println("THANK YOU FOR BOOKING");
      System.out.println("====================");
   }
}
