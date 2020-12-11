package notefive;

public class While {

    public static void main(String[] args) {
        int x = 8;
        int ans = 0;

        while (x!=0){
            x = x/2;
            ans++;
        }

        System.out.println(ans);
    }
}
