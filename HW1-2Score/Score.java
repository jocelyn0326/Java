
import java.util.Scanner;

public class Score {

    public static void main(String args[]) {
        int stu[];
        stu = new int[11];
        int count81 = 0;  //81~100���H��
        int count60 = 0;  // 60~80���H��
        int count0 = 0; //0~59���H��
        int max = 0, min = 0;
        int sum = 0;
        float average = 0, variation = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J10��P�Ǫ����Z");
        for (int i = 1; i <= 10; i++) {
            System.out.print("��" + i + "��G");
            stu[i] = Integer.parseInt(scanner.nextLine());
            sum += stu[i];
        }
        average = (float)sum/10 ;
        for (int i = 1; i <= 10; i++) {
            variation += ( Math.pow( stu[i]-average, 2)) / 10;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("��" + i + "��G" + stu[i]);
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

        System.out.println("�����G" + average + "��");
        System.out.printf("�ܲ��ơG%.2f\n", variation);
        System.out.println("�̰����G" + max);
        System.out.println("�̧C���G" + min);
        System.out.println("���Ƥ���81-100�H�ơG" + count81 + "�H");
        System.out.println("���Ƥ���60-80�H�ơG" + count60 + "�H");
        System.out.println("���Ƥ���0-59�H�ơG" + count0 + "�H");
    }
}
