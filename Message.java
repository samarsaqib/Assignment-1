import java.time.LocalDateTime;
public class Message{
   private String sender;
   private String receiver;
   private String content;
   private int messageId;
   private boolean status;
   private LocalDateTime timeStamp;

      Message(String sender,String receiver,String content,int messageId,boolean status){
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.messageId = messageId;
        this.status = status;
        timeStamp = LocalDateTime.now();
   }
       public void setSender(String sender ){

        this.sender = sender;
       }
       
       public void setReceiver(String receiver){
        this.receiver = receiver;
       
       }
       public void setContent(String content){
          this.content = content;
        
       }
       public void setMessageid(int messageId){
         this.messageId = messageId;
       
       }
       public void setStatus(boolean status){
           this.status = status;
       }
       public LocalDateTime getDatentime(){
            return timeStamp;
       }
       public String getSender(){
            return sender;
       }
        public String getReceiver(){
          return receiver;
       }
        public String getContent(){
         return content;
       }
        public int getMessageid(){
         return messageId;
       }
        public boolean getStatus(){
         return status;
       }
       //public String toString(){
        //return String.format(format: "%s,%s,%s,%b,%s",getsender(),getreceiver(),getcontent(),getMessageId(),getstatus());
       //}
}

