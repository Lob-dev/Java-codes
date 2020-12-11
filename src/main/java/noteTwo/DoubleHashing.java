package noteTwo;

public class DoubleHashing {

    public static void main(String[] args) {
/*

        for (int i = 0; i < 10; i++) {
            DTO dto = new DTO(String.valueOf(i));
            int result = hash(dto);
            System.out.println(result);
        }
*/

        System.out.println(100000 ^ 100000 >>> 16);
        System.out.println(100001 ^ 100001 >>> 16);
        System.out.println(100002 ^ 100002 >>> 16);
        System.out.println(100003 ^ 100003 >>> 16);
        System.out.println(100004 ^ 100004 >>> 16);
        System.out.println(100005 ^ 100005 >>> 16);


    }
    static int hash(Object key) {
        int h; return (key == null) ? 0 :
                (h = key.hashCode()) ^ (h >>> 16);
    }

}
