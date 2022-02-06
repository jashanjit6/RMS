import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class RMS {
    public void inventorymanagement(int p, int pp, int ppp) throws FileNotFoundException {
        int Totalexpense=0;
        //final int ds;
        int inv = 0;
        File file = new File("C:\\\\Users\\\\nls86\\\\Desktop\\\\Javafullstack\\\\hackathon\\\\ingredients.txt");
        Scanner sc = new Scanner(file);
        Scanner sc1 = new Scanner(file);

        while (sc.hasNext()) {
            inv = inv + 1;
            //System.out.println(sc.next());
            sc.next();
        }
        //System.out.println(inv);
        String[] ingredient_name = new String[inv];
        //String [] initial_quantity = new String[inv];
        //String [] cost = new String[inv];
        Integer[] initial_quantity = new Integer[inv]; //need 2 change this to double from integer for adding double quantities
        Integer[] cost = new Integer[inv];
        //Integer [] test = new Integer[inv];
        int i = 0;
        while (sc1.hasNext()) {
            ingredient_name[i] = sc1.next();
            //initial_quantity[i] = sc1.next();
            // iq[i]=Integer.parseInt(initial_quantity[i]);
            initial_quantity[i] = Integer.parseInt(sc1.next()); //need to change to parseDouble from parseInt
            cost[i] = Integer.parseInt(sc1.next());
            // iq[i]=Integer.parseInt(cost[i]);
            i = i + 1;
        }
        //System.out.println("intitial quantity: "+initial_quantity[0]);
        if(p==99&& pp==1 && ppp==1)
        {
            for (int t = 0; t < (inv / 3); t++) {
                System.out.println("Ingredient Name= " + ingredient_name[t] + " " + "Initial Quantity= " + initial_quantity[t] + " " + "Cost= " + cost[t]);
            }
        }
        else if(p==100 && pp==1 && ppp==1)
        {
            System.out.println();
            for (int t = 0; t < (inv / 3); t++) {
                System.out.println((t+1)+"." + ingredient_name[t]);
            }
        }
        else if(p==101 && ppp==1|| p==102 && ppp==1 || p==103 && ppp==1 || p==104 && ppp==1 || p==105 && ppp==1 || p==106 && ppp==1 ||p==107 && ppp==1 ||p==108 && ppp==1||p==109 && ppp==1||p==110 && ppp==1 ||p==111 && ppp==1 ||p==112 && ppp==1 ||p==113 && ppp==1)
        {
            int g=101;

            int tq= initial_quantity[p-g]; // we need to assign it to initialized variable else it wont do operation with index
            int tquantity = tq+pp;
            initial_quantity[p-g]= tquantity;
            int temp2=initial_quantity[p-g];
            int ct= cost[p-g];
            Totalexpense=ct*pp;

        }
        //else {}
//        if(p==204 && pp==1 && ppp==1) {
//            //System.out.println("Total Expense: " + Totalexpense);
//            //System.out.println("Total Expense: " + ds);
//        }
        int rr = 0;
        File file2 = new File("C:\\Users\\nls86\\Desktop\\Javafullstack\\hackathon\\accounts.txt");
        Scanner ia = new Scanner(file2);
        Integer[] acc = new Integer[10];
        while (ia.hasNext()) {
            acc[rr] = Integer.parseInt(ia.next());
            // iq[i]=Integer.parseInt(cost[i]);
            rr = rr + 1;
        }
        if(ppp==2) {
            //System.out.println("i am printing perfectly");
            int add_money_from_orders=p;
            int remove_expense=pp;
            int atm =acc[0];
            System.out.println("Currently Account Balance: " + (atm+add_money_from_orders-remove_expense));
        }
        if(ppp==3) {
            //System.out.println("i am printing perfectly");
            int add_money_from_orders1=p;
            int remove_expense1=pp;
            int atm1 =acc[0];
            //System.out.println("Currently Account Balance: " + (atm1+add_money_from_orders1-remove_expense1));
            int i1 = atm1 + add_money_from_orders1 - remove_expense1;
            //int do =atm1+add_money_from_orders1-remove_expense1;
            if(i1>5000)
            {
                System.out.println("Net Profit: "+(i1-5000));
            }
            else if(i1==5000)
            {
                System.out.println("Currently there is no Net profit or Loss , make some orders to gain profit");
            }
            else
            {
                System.out.println("We are in Loss improve orders to gain ");
            }
        }
    }
    public static void main(String[] args) throws Exception
    {
        //--------------------adding code---------------------------
        RMS rms=new RMS();
        //int storeingredientordered=0;
        int[] storequantityordered=new int[15];
        int totalexpense=0;
        int addtoaccountbalance=0;
        while(true) {
            System.out.println("Welcome To Restaurant Management System:)");
            Scanner op = new Scanner(System.in);    //System.in is a standard input stream
            System.out.println("Enter your preference which you want to perform ");
            System.out.println("1.Ingredients Info");
            System.out.println("2.Order specific ingredients");
            System.out.println("3.Total sale");
            System.out.println("4.Total Expense");
            System.out.println("5.Net Profit");
            System.out.println("6.Place Order");
            System.out.println("7.Exit");
            //System.out.println("8.Do you need to exit from the RMS ? Type 8 to exit");
            System.out.println("Please Choose The Option from 1 to 7 in the above list : ");
            int a = op.nextInt();
            if (a == 1) {
                rms.inventorymanagement(99, 1, 1);
            }


            if (a == 7) {
                System.out.println("Thank you, Please Use our Service again :-)");
                System.exit(0);
            }
            if (a == 2) {
                int quant = 0;
                System.out.println("Below are the Ingredients Info initially");
                rms.inventorymanagement(99, 1, 1);
                System.out.println("Please choose the ingredients you want to order/purchase from below list ");
                rms.inventorymanagement(100, 1, 1);
                System.out.println("NOTE: Choose each iteam only once if you want a correct Total expense");
                System.out.println("Enter your choice, Quantity Required here: ");
                //inventorymanagement(101);
                int ch = op.nextInt();
                quant = op.nextInt();
                int mysum = ch + 100;
                for(int i=1;i<=13;i++)
                {
                    int qt=0;
                    int jj=0;
                    if(ch==i)
                    {
                        //int qt=0;
                        if(ch==1)
                        {
                            qt=50;
                            jj=10;
                        }
                        if(ch==2){qt=30;jj=5;}
                        if(ch==3){qt=45;jj=4;}
                        if(ch==4){qt=90;jj=2;}
                        if(ch==5){qt=100;jj=3;}
                        if(ch==6){qt=50;jj=2;}
                        if(ch==7){qt=30;jj=7;}
                        if(ch==8){qt=40;jj=6;}
                        if(ch==9){qt=10;jj=3;}
                        if(ch==10){qt=150;jj=4;}
                        if(ch==11){qt=30;jj=2;}
                        if(ch==12){qt=3;jj=3;}
                        if(ch==13){qt=10;jj=2;}
                        storequantityordered[i]+=quant;
                        int temp1=storequantityordered[i];
                        //System.out.println("quantity: "+temp1+" price: "+qt);
                        totalexpense+=(temp1*qt);
                        //System.out.println("Total expense is: "+totalexpense);
                        System.out.println("Total Quantity present is: "+(temp1+jj));
                    }
                }
                //if(ch==1){inventorymanagement(101);}
                rms.inventorymanagement(mysum, quant, 1);
                //System.out.println("Choice: "+mysum+"Quantity ordered: "+quant);

            }
            if (a == 4) {
                //rms.inventorymanagement(204, 1, 1);
                //System.out.println("Total Expense: " + rms.);
                System.out.println("Total expense is: "+totalexpense);
            }

            if(a == 6) {
                int ord1 = 0;
                File fr1 = new File("C:\\Users\\nls86\\Desktop\\Javafullstack\\hackathon\\receipe.txt");
                System.out.println("");
                System.out.println("Choose the items which you want to order:");
                Scanner sc1 = new Scanner(fr1);

                String[] a1= new String[150];
                while(sc1.hasNextLine())
                {
                    a1[ord1]=sc1.nextLine();
                    ord1 = ord1 +1;
                }
                int q=0;

                String[] ha = new String[20];
                int serial = 1;
                for(int k=0;k<ord1;k++) {
                    String[] words = a1[k].split("\\s+");
                    System.out.println(words[0]);
                }
                System.out.println("Please enter the Order: ");
                Scanner userinput = new Scanner(System.in);
                int usr = userinput.nextInt();
                if(usr > 0 && usr < ord1) {
                    System.out.println("Please enter the quantity: ");
                    Scanner quan2 = new Scanner(System.in);
                    int quan21 = quan2.nextInt();
                    Map<String, Double> items = new HashMap<>();
                    for(int k=0;k<ord1;k++) {
                        if(k == usr-1) {
                            String[] words2 = a1[k].split("\\s+");

                            if(words2.length == 9) {
                                items.put(words2[1], Double.parseDouble(words2[2]));
                                items.put(words2[3], Double.parseDouble(words2[4]));
                                items.put(words2[5], Double.parseDouble(words2[6]));
                                items.put(words2[7], Double.parseDouble(words2[8]));
                            } else {
                                items.put(words2[1], Double.parseDouble(words2[2]));
                                items.put(words2[3], Double.parseDouble(words2[4]));
                            }

                            int ord11 = 0;
                            File file = new File("C:\\\\Users\\\\nls86\\\\Desktop\\\\Javafullstack\\\\hackathon\\\\ingredients.txt");
                            Scanner sc11 = new Scanner(file);

                            String[] a11= new String[150];
                            while(sc11.hasNextLine()) {
                                a11[ord11] = sc11.nextLine();
                                ord11 = ord11 + 1;
                            }

                            boolean ordertrue = true;
                            for(int j=0;j<ord11;j++) {
                                String[] words1 = a11[j].split("\\s+");
                                for (Map.Entry<String, Double> entry : items.entrySet()) {
                                    String key = entry.getKey();
                                    Double value = entry.getValue();
                                    //System.out.println(words1[0]); //remove line
                                    if (key.equals(words1[0])) {
                                        double value1 = value * quan21;
                                        // System.out.println(words1[1]); //remove line
                                        if (value1 <= Integer.parseInt(words1[1])) {
                                        } else {
                                            ordertrue = false;
                                        }
                                    }
                                }
                            }
                            if(ordertrue) {
                                System.out.println(". d / order is placed successfully.");
                            } else {
                                System.out.println("Your order is not placed successfully.");
                            }

                        }
                    }
                } else {
                    System.out.println("Please enter the correct value");
                }
            }
            if(a==5)
            {
                rms.inventorymanagement(addtoaccountbalance,totalexpense,3);
            }
            System.out.println("Wanna check cuurent aaccount Balance then Type 1, if Not means Type 2 (please do not type any thing other than Integer number) : ");
            Scanner yn = new Scanner(System.in);
            int balance=yn.nextInt();
            //int some=Integer.parseInt(yn.nextLine());
            if(balance==1)
            {
                rms.inventorymanagement(addtoaccountbalance,totalexpense,2);
            }
            //else
            //{

            //}
        }
    }

}