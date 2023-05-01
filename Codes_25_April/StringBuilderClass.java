//package Codes_25_April;

public class StringBuilderClass {
    
    public static void main(String[] args){
        //StringBuilder sb = new StringBuilder("Wiley");
        //sb.append("Edge");

        StringBuilder logMessage = new StringBuilder();
        long timestamp = System.currentTimeMillis();

        logMessage
            .append("[")
            .append(timestamp)
            .append("]");
        int userId = 12345;

        logMessage
            .append("User  ")
            .append(":")
            .append(userId);

        String message = "Login Succseefully";
        logMessage.append(message);

        System.out.println(logMessage);
        
    }
}
