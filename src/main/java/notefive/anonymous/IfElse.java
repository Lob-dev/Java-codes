package notefive.anonymous;

public class IfElse {

    public static void main(String[] args) {

        System.out.println(monthCheck(3));
        System.out.println(monthCheck2(3));

    }
    public static String monthCheck(int num){
        int days = 0;
        if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12){
            days = 31;
        } else if (num == 4 || num == 6 || num == 9 || num == 11){
            days = 30;
        } else if (num == 2){
            days = 28;
        } else {
            days = -1;
        }
        return "입력하신 달은 "+days+"일 입니다.";
    }

    public static String monthCheck2(int num){
        int days = 0;
        switch (num) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                days = 31;
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                days = 30;
                break;
            case 2 :
                days = 28;
                break;
            default:
                days = -1;
        };
        return "입력하신 달은 "+days+"일 입니다.";
    }
}
