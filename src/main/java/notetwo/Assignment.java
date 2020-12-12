package notetwo;

public class Assignment {

    public static void main(String[] args) {
        int num = 4;
        int variable;

        variable = num; // variable = 4;
        System.out.println("= 연산 : " + variable);

        variable += num; // variable = 4 + 4
        System.out.println("+= 연산 : " + variable);

        variable -= num; // variable = 8 - 4
        System.out.println("-= 연산 : " + variable);

        variable *= num; // variable = 4 * 4
        System.out.println("*= 연산 : " + variable);

        variable /= num; // variable = 16 / 4
        System.out.println("/= 연산 : " + variable);

        variable %= num; // variable = 4 % 4
        System.out.println("%= 연산 : " + variable);

        variable = 10;
        variable &= 2; // variable = 10 & 2
        System.out.println("&= 연산 : " + variable);

        variable = 10;
        variable |= 2; // variable = 10 | 2
        System.out.println("|= 연산 : " + variable);

        variable = 10;
        variable ^= 2; // variable = 10 ^ 2
        System.out.println("^= 연산 : " + variable);

        variable = 10;
        variable <<= 2; // variable = 10 << 2
        System.out.println("<<= 연산 : " + variable);

        variable = 10;
        variable >>= 2; // variable = 10 >> 2
        System.out.println(">>= 연산 : " + variable);

        variable = 10;
        variable >>>= 2; // variable = 10 >>> 2
        System.out.println(">>>= 연산 : " + variable);
    }
}

