public class Ex3 {
    public static void main(String[] args) {

            int q = (int) (Math.random()*(101));
            System.out.println("Число "+q);

            if (q>99){
                System.out.print(q/100+" ");
                System.out.print(q % 100 / 10+" ");
                System.out.print(q % 10+" ");
                System.out.println("\n3 числа");

            }else if (q>9){
                System.out.print(q % 100 / 10+" ");
                System.out.print(q % 10+" ");
                System.out.println("\n2 числа");

            } else {
                System.out.print(q);

                System.out.println("\n1 число");
            }

    }
}
