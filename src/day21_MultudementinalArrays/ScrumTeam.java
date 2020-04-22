package day21_MultudementinalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String[] DevTeam = {"Ruslan", "Simon", "Kybi", "Lennon"};
        String[] TestersTeam = {"Irina", "Diana", "Yurii"};
        String[] PO = {"Barzy", "Donald"};
        String [][] ScrumTeam = {DevTeam, TestersTeam,PO };
        ScrumTeam[0][3]="Jean";
        System.out.println(ScrumTeam[0][3]);
        String info = ScrumTeam[1][2];
        System.out.println(info);

        for(String eachEmployee: ScrumTeam[2]){
            System.out.println(eachEmployee);
        }

        String[] DevTeam2 = {"Rubi", "Guri", "Berry"};
        ScrumTeam[0]=DevTeam2;
        for(String eachEmployee: ScrumTeam[0]){
            System.out.println(eachEmployee);
        }



    }

}
