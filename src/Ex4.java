import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {

            int w = 0;
            for (int i = 0;i<2;i++){
                for (int j = 0;j<3;){
                    int q = (int) (Math.random()*3)+1;

                    Scanner sc = new Scanner(System.in);
                    w = sc.nextInt();
                    if (q==w){
                        j++;
                        if (j==3){
                            i = 2;
                            System.out.println("Перемога)))))))))))");
                        }
                    }else if (i==0) {
                        System.out.println("Помилка");
                        break;
                    }else {
                        System.out.println("Програш");
                        break;
                    }
                }
            }
    }
}
