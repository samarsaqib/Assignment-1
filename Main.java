import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Messageapp messageApp = new Messageapp();
        String choice = "Yes";
        while(choice.equals("Yes")){
        System.out.println("Now enter your choice with which function you wanna continue.");
         System.out.println("Enter 1 for sending message");
         System.out.println("Enter 2 for deleting message");
         System.out.println("Enter 3 for displaying message");
         System.out.println("Enter 4 for unseen message");
         System.out.println("Enter 5 for seen message");
         System.out.println("Enter 6 for searching your required message");
        int choose;
         Scanner sc = new Scanner(System.in);
         choose = sc.nextInt();
        switch(choose){
        case 1:
        messageApp.sendMessage();
        System.out.println("_________________________________________________________________");
        break;
        case 2:
        messageApp.deleteMessage();
        System.out.println("_________________________________________________________________");
        break;
         case 3:
        messageApp.receiveMessages();
        System.out.println("_________________________________________________________________");
        break;
         case 4:
        messageApp.unreadMessages();
        System.out.println("_________________________________________________________________");
        break;
         case 5:
        messageApp.readMessages();
        System.out.println("_________________________________________________________________");
        break;
         case 6:
        messageApp.searchMessage();
        System.out.println("_________________________________________________________________");
        break;
        }
        System.out.println("Enter Yes if you wanna continue");
         if(sc.hasNextLine()){
             sc.nextLine();
           }
         choice = sc.nextLine();
        }
    }
}