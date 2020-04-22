package day11_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "chrome";

        switch (browserName){
            case "chrome":
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;
            case "safari":
            case "Safari":
                System.out.println("Safari is opening...");
                break;
            case "opera":
            case "Opera":
                System.out.println("Opera is opening...");
                break;
            default:
                System.out.println("Invalid Browser Num");

        }
    }
}
