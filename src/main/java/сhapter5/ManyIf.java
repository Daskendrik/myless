package сhapter5;

public class ManyIf {
    public static void main(String[] args){

        int month = 4; //МОй любимый апрель
        String season;
        if (month ==12 || month == 1 || month == 2) {
            season = "зиме";
        }
        else if ( month>2 & month<6) {
            season = "весне";
        }
        else if (month>5 & month<9) {
            season = "лету";
        }
        else if (month>8 & month<12){
            season = "осени";
        }
        else {
            season = "вымышленному сезону";
        }
        System.out.println("Апрель относится к " + season + ".");

    }
}
