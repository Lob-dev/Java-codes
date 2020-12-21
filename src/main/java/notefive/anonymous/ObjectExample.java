package notefive.anonymous;

public class ObjectExample {

    public static void main(String[] args) throws Throwable {
        ObjectExample example = new ObjectExample();

        System.out.println(example.toString());

        System.out.println(example.equals(example));

        System.out.println(example.hashCode());

        System.out.println(example.getClass());

    }

}
