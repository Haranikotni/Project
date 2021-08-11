
        public class Calculator {
            public int add(int n1, int n2) {
                return n1 + n2;
            }

            public int mul(int n1, int n2) {
                return n1 * n2;

            }

            public int reverse(int n1) {
                int re = 0;
                while (n1 != 0) {
                    int r = n1 % 10;
                    re = re * 10 + r;
                    n1 = n1 / 10;

                }
                return re;
            }
        }


    /*public static void main(String[] args) {
       // Calculator cl=new Calculator();

        //System.out.println("add"+ cl.add(1,2));
       // System.out.println("add"+ cl.mul(1,2));
        //System.out.println("add"+ cl.reverse(1234));
   // }*/

}
