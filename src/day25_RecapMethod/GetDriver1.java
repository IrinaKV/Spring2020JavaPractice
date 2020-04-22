package day25_RecapMethod;

public class GetDriver1 {

    public static String getDriver1(String browserName) {

        switch (browserName.toLowerCase()) {
            case "chrome": {
               return "Chrome Driver";

            }
            case "firefox": {
               return "Firefox Driver";

            }
            case "safari": {
              return "Safari Driver";

            }
            case "opera": {
             return "Opera Driver";

            }
            case "edge": {
              return "Edge Driver";

            }
            default:
                return "Invalid Driver";

        }

    }
    public static String getDriver2(String browserName ){
        browserName = browserName.toLowerCase();
        if(browserName.equals("chrome")){
            return "Chrome Driver";
        }else if(browserName.equals("firefox")){
            return "Firefox Driver";
        }else if(browserName.equals("safari")){
            return "Safari Driver";
        }else if(browserName.equals("opera")){
            return "Opera Driver";
        }else if(browserName.equals("edge")){
            return "Edge Driver";
        }else return  "Invalid Driver";
    }
    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();
        return  browserName.equals("chrome")?"Chrome Driver":
                browserName.equals("firefox") ? "Firefox Driver":
                browserName.equals("safari") ? "Safari Driver":
                browserName.equals("opera") ? "Opera Driver":
                browserName.equals("edge") ? "Edge Driver":
                        "Invalid Driver";
    }


    public static void main(String[] args) {
        String str = getDriver1("edge");
        System.out.println(str);
        String str2 = getDriver2("firefox");
        System.out.println(str2);
        String str3 = getDriver3("opera");
        System.out.println(str3);
    }
}
