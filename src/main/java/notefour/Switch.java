package notefour;

public class Switch {
    public static void main(String[] args) {


    }

    public class Employee {
        // 필수적인 속성, 의존성
        private final String firstname;
        private final String lastname;
        // 선택적인 속성, 의존성
        private String email;
        private String address;
        private String phone;

        // Default Constructor 는 필수적인 의존성(final) 을 포함하여야한다.
        public Employee(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public Employee(String firstname, String lastname, String email, String address, String phone) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
            this.address = address;
            this.phone = phone;
        }
    }
}
