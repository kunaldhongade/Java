import java.io.*;

interface CreditCard {
       void viewCreditAmount();

       void increaseLimit() throws IOException;

       void useCard() throws IOException;

       void payCard() throws IOException;
}

class SliverCardCustomer implements CreditCard {
       String name;
       int card_no;
       double creditAmount;
       double creaditLimit;
       static int cnt;
       BufferedReader br = new BufferedReader(
                     new BufferedReader(new InputStreamReader(System.in)));

       SliverCardCustomer() {
              name = "Noname";
              card_no = 0;
              creditAmount = 0;
              creaditLimit = 50000;
       }

       public void viewCreditAmount() {
              System.out.println("Your amount is : " + creditAmount);
       }

       public void getdata() throws IOException {
              System.out.println("Enter the name : ");
              String name = (br.readLine());
              System.out.println("Enter the card number :");
              card_no = Integer.parseInt(br.readLine());
              System.out.println("Enter Credit amount : ");
              creditAmount = Double.parseDouble(br.readLine());
       }

       public void payCard() throws IOException {
              System.out.println("Enter amount to be pay");
              double pay = Double.parseDouble(br.readLine());
              creditAmount = creditAmount + pay;
              System.out.println("Balance is paid");
       }

       public void useCard() throws IOException {
              System.out.println("Enter amount : ");
              double amount = Double.parseDouble(br.readLine());
              if (amount < creditAmount) {
                     creditAmount = creditAmount - amount;
                     viewCreditAmount();
                     System.out.println("Thanks for using the service");
              } else
                     System.out.println("\nerror!");
       }

       public void increaseLimit() throws IOException {
              cnt++;
              if (cnt <= 3) {
                     System.out.println("Enter amount limit to increse : ");
                     double amt = Double.parseDouble(br.readLine());
                     if (amt <= 2500) {
                            creaditLimit = creaditLimit + amt;
                            System.out.println("Amount limit to increse Successfully : ");
                     }
                     System.out.println(
                                   "You can't increse creadit amount more than 2500 at a time ");
              } else
                     System.out.println("You can't increse limit more than 3 times ");
       }
} // end of class

class GoldCardCustomer extends SliverCardCustomer {
       static int cnt;

       public void increaseLimit() throws IOException {
              cnt++;
              if (cnt <= 3) {
                     System.out.println("Enter amount limit to increse : ");
                     double amt = Double.parseDouble(br.readLine());
                     if (amt <= 5000) {
                            creaditLimit = creaditLimit + amt;
                            System.out.println("Amount limit to increse Successfully : ");
                     }
                     System.out.println(
                                   "You can't increse creadit amount more than 2500 at a time ");
              } else
                     System.out.println("You can't increse limit more than 3 times ");
       }
}

public class demo {

       public static void main(String args[]) throws IOException {
              int ch;
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

              System.out.println("Enter the info for silver card holder : ");
              SliverCardCustomer sc = new SliverCardCustomer();
              sc.getdata();

              System.out.println("Enter the info for Gold card holder : ");
              GoldCardCustomer gc = new GoldCardCustomer();
              gc.getdata();
              do {
                     System.out.println(
                                   "1.Use silver card \n2.Pay credit for Silver card\n3.Increse limit for silver card ");
                     System.out.println(
                                   "4.Use Gold card \n5.Pay credit for Gold card\n6.Increse limit for Gold card  ");

                     System.out.println("0. exit");
                     System.out.println("Enter your choice : ");
                     ch = Integer.parseInt(br.readLine());

                     switch (ch) {
                            case 1:
                                   sc.useCard();
                                   break;
                            case 2:
                                   sc.payCard();
                                   break;
                            case 3:
                                   sc.increaseLimit();
                                   break;
                            case 4:
                                   gc.useCard();
                                   break;
                            case 5:
                                   gc.payCard();
                                   break;
                            case 6:
                                   gc.increaseLimit();
                                   break;
                            case 0:
                                   break;
                     }
              } while (ch != 0);
       }
}
