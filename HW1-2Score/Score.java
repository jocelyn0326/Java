
import java.util.Scanner;

public class Score {

    public static void main(String args[]) {
        int stu[];
        stu = new int[11];
        int count81 = 0;  //81~100计
        int count60 = 0;  // 60~80计
        int count0 = 0; //0~59计
        int max = 0, min = 0;
        int sum = 0;
        float average = 0, variation = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("叫块10厩Θ罿");
        for (int i = 1; i <= 10; i++) {
            System.out.print("材" + i + "");
            stu[i] = Integer.parseInt(scanner.nextLine());
            sum += stu[i];
        }
        average = (float)sum/10 ;
        for (int i = 1; i <= 10; i++) {
            variation += ( Math.pow( stu[i]-average, 2)) / 10;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("材" + i + "" + stu[i]);
            if (stu[i] >= 81) {
                count81 += 1;
            } else {
                if (stu[i] <= 59) {
                    count0 += 1;
                } else {
                    count60 += 1;
                }
            }
        }
        for (int i = 1; i <= 10; i++) {
            max = stu[1];
            min = stu[1];
            if (stu[i] > max) {
                max = stu[i];
            }
            if (stu[i] < min) {
                min = stu[i];
            }
        }

        System.out.println("キА" + average + "だ");
        System.out.printf("跑钵计%.2f\n", variation);
        System.out.println("程蔼だ" + max);
        System.out.println("程だ" + min);
        System.out.println("だ计ざ81-100计" + count81 + "");
        System.out.println("だ计ざ60-80计" + count60 + "");
        System.out.println("だ计ざ0-59计" + count0 + "");
    }
}
