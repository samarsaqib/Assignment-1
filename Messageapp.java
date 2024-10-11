import java.util.Scanner;
public class Messageapp{
       Message[][] messages;
       int messagecounter = 0;
       public Messageapp(){
       messages = new Message[4][5];
      }
    public void sendMessage(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < messages.length; i++)
        {
            for(int j = 0; j < i; j++){
           System.out.println("Enter sender name        ");
           String sender = sc.nextLine();
           System.out.print("Enter  message        ");
           String content = sc.nextLine();
           System.out.print("Enter status         ");
           boolean status = sc.nextBoolean();
           if(sc.hasNextLine()){
             sc.nextLine();
           }
            messages[i][j] = new Message(sender,"Samar",content,i+1,status);
            }
            }

        }
       
    
    public void receiveMessages(){
        for(int i = 0; i <  messages.length; i++){
            for(int j = 0; j < i; j++){
            if(messages[i][j] != null){
            System.out.println("The sender name is " +messages[i][j].getSender());
            System.out.println("The receiver name is " +messages[i][j].getReceiver());
            System.out.println("The message is " +messages[i][j].getContent());
            System.out.println("The message id is " +messages[i][j].getMessageid());
            System.out.println("The status is " +messages[i][j].getStatus());
             System.out.println("The time is " +messages[i][j].getDatentime());
            }
        }
        }
    }
    public void unreadMessages(){
        int counter1 = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= 0; j++){
                if(messages[i][j].getStatus() == false){
                    counter1++;
                    if(counter1 == 1){
                    System.out.println("The persons whose messages are unread are  ");
                    }
                    System.out.println(messages[i][j].getSender());
                }
            }
        }
    }
    public void readMessages(){
     int counter2 = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= 0; j++){
                if(messages[i][j].getStatus() == true){
                    counter2++;
                    if(counter2 == 1){
                    System.out.println("The persons whose messages are read are  ");
                    }
                    System.out.println(messages[i][j].getSender());
                }
            }
        }
    }
    public void searchMessage(){
        String choice = "Yes";
        Scanner sc = new Scanner(System.in);
        while(choice.equals("Yes")){
         System.out.println("Tell the name who's message you want to see");
         String name = sc.nextLine();
         for(int i = 0; i < 4; i++){
            for(int j = 0; j <= 0; j++){
             if(messages[i][j].getSender().equals(name)){
            System.out.println("The mess of this sender is  " +messages[i][j].getContent());
            System.out.print("Do you want to continue? ");
            choice = sc.nextLine();
         }
         }
        }
        
        }
    }
    public void deleteMessage(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter name for you want to delete message  ");
         String name = sc.nextLine();
         for(int i = 0; i < 4; i++){
            for(int j = 0; j <= 0; j++){
                if(messages[i][j].getSender().equals(name)){
                    messages[i][j] = null;
                    System.out.print("Message deleted ");
                }
            }
         }
    }
}