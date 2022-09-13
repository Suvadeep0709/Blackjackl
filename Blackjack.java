import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        
       
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        int yourCard1=drawRandomCard();
        int yourCard2=drawRandomCard();
        System.out.println("\n You got a \n"+cardString(yourCard1)+"n and a \n"+cardString(yourCard2));
        int total=Math.min(yourCard1, 10)+Math.min(yourCard2, 10);
        System.out.println("Your total is "+total);
        int dealerCard1=drawRandomCard();
        int dealerCard2=drawRandomCard();
        System.out.println("");
        System.out.println("The dealer shows \n"+cardString(dealerCard1)+"\nand has a card facing down \n"+faceDown());
        int dealerTotal=dealerCard1+dealerCard2;
        System.out.println("\nThe dealer's total is hidden");
        System.out.println("");
        while(true){
            String a=hitOrStay();
            if (a.equals("hit")){
                int yourCard3=drawRandomCard();
                total+=Math.min(yourCard3, 10);
                System.out.println("\n You got a \n"+cardString(yourCard3)+"\n");
                System.out.println("Your new total is "+total);
                if (total>21){
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
            }
            if (a.equals("stay")){
                break;
            }
        }
        System.out.println("Dealers Turn");
        System.out.println("");
        System.out.println("The dealers cards are \n"+cardString(dealerCard1)+"\n"+cardString(dealerCard2));
        while(dealerTotal<17){
            int dealerCard3=drawRandomCard();
            System.out.println("Dealer gets a new card +\n"+cardString(dealerCard3));
            System.out.println("");
            dealerTotal+=Math.min(dealerCard3, 10);
            System.out.println("The dealers total are "+dealerTotal);
            if(dealerTotal>17){
                break;
            }
            
        }
        if(dealerTotal>21){
            System.out.println("Bust! Dealer loses");
            System.exit(0);
        }
        if (total>dealerTotal){
            System.out.println("Player wins ");
        }
        if (dealerTotal>total){
            System.out.println("Dealer Wins");
        }
         scan.close();

    }

    
    public static int drawRandomCard(){
        return (int)((Math.random()*13)+1);
    }

    public static String cardString(int cardNumber){
        switch(cardNumber){
            case 1 : return  "   _____\n"+
                            "  |A _  |\n"+ 
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____V|\n";
   
            case 2 : return     "   _____\n"+              
                                "  |2    |\n"+ 
                                "  |  o  |\n"+
                                "  |     |\n"+
                                "  |  o  |\n"+
                                "  |____Z|\n";
            case 3 : return "   _____\n" +
                            "  |3    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____E|\n";
            case 4 : return "   _____\n" +
                            "  |4    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  | o o |\n"+
                            "  |____h|\n";
            case 5 : return "   _____ \n" +
                            "  |5    |\n" +
                            "  | o o |\n" +
                            "  |  o  |\n" +
                            "  | o o |\n" +
                            "  |____S|\n";
            case 6 : return 
                            "   _____ \n" +
                            "  |6    |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  |____6|\n";
            case 7 : return  "   _____ \n" +
                            "  |7    |\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |____7|\n";
            case 8 : return "   _____ \n" +
                            "  |8    |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  |____8|\n";
            case 9 : return  "   _____ \n" +
                            "  |9    |\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |____9|\n";
            case 10 : return "   _____ \n" +
                                "  |10  o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |___10|\n";
            case 11 : return "   _____\n" +
                            "  |J  ww|\n"+ 
                            "  | o {)|\n"+ 
                            "  |o o% |\n"+ 
                            "  | | % |\n"+ 
                            "  |__%%[|\n";
            case 12 : return "   _____\n" +
                            "  |Q  ww|\n"+ 
                            "  | o {(|\n"+ 
                            "  |o o%%|\n"+ 
                            "  | |%%%|\n"+ 
                            "  |_%%%O|\n";
            case 13 : return  "   _____\n" +
                                "  |K  WW|\n"+ 
                                "  | o {)|\n"+ 
                                "  |o o%%|\n"+ 
                                "  | |%%%|\n"+ 
                                "  |_%%%>|\n";

            default: return " ";
        }

    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();

        while (!(response.equals("hit") || response.equals("stay"))) {
            System.out.println("Please write hit or stay");
            response = scan.nextLine();
        }
        return response;
    }
            
        }
    

