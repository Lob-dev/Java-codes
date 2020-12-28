package notesix;


// 다트 게임은 총 3번
// 숫자\문자\옵션(true,false) * 3
//

public class DartSGame {

    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1D2S3T*"));
    }

    public static int solution(String dartResult) {
        int [] points = new int[3];
        int idx = 0;
        StringBuilder temp = new StringBuilder();

        for(int i=0 ; i<dartResult.length() ; i++) {
            char c = dartResult.charAt(i);

            if(c >= '0' && c <= '9') {
                temp.append(c);

            } else if(c == 'S' || c == 'D'|| c == 'T'){
                int point = Integer.parseInt(temp.toString());

                if(c == 'D') {
                    point = (point * point);
                }
                if(c == 'T') {
                    point = (point * point * point);
                }

                points[idx++] = point;
                temp = new StringBuilder();

            } else {
                if(c == '#') {
                    points[idx-1] *= -1;
                } else {
                    points[idx-1] *= 2;

                    if(idx-2 >= 0) {
                        points[idx-2] *= 2;
                    }
                }
            }
        }
        return points[0] + points[1] + points[2];
    }
}
