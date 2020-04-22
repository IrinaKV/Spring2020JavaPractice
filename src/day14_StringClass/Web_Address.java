package day14_StringClass;

public class Web_Address {
    public static void main(String[] args) {
        String website = "cybertek.www.Gov";
        website = website.toLowerCase();


        boolean validEnding = website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov");

        if(website.startsWith("www.")&&validEnding){
            System.out.println("valid address");
        }else {
            System.out.println("Invalid Address");
        }
    }
}
