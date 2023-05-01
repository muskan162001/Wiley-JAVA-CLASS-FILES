package Codes_25_Aprill;
//package Codes_25_April;

public class StringBufferDemo {

    public static void main(String[] args){
        StringBuffer chatHistory = new StringBuffer();

        String sender = "Muskan";
        String message = "Hey Guys";

        chatHistory.append(sender);
        chatHistory.append(":");
        chatHistory.append(message);
        chatHistory.append("\n");

        sender = "SAniya";
        message = "Hey Guys";

        chatHistory.append(sender);
        chatHistory.append(":");
        chatHistory.append(message);
        chatHistory.append("\n");

        System.out.println(chatHistory);

    }
    
}
