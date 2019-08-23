
//wihout lamda expression



public class Calculate {
    public static void main(String[] args) {

        Math1.m = new Math1() {

            public int power(int x) {
                return x * x;
            }
        };
    }
}
