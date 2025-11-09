package helperClasses;

public class ExpceptionPropagation {

        void m3() {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        }

        void m2() {
            m3();
        }

        public void m1() {
            try {
                m2();
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in m1(): " + e);
                throw e;
            }
        }
}
