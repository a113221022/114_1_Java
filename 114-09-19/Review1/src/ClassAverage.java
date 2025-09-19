import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("輸入完成請按ctrl-z");

        while (input.hasNext()) {             // 檢查是否還有輸入
            if (input.hasNextInt()) {         // 檢查下一個輸入是否為整數
                int grade = input.nextInt();  // 讀取成績（整數）
                total += grade;               // 將成績加到總分
                gradeCounter++;               // 成績計數器加 1
            } else {
                System.out.println("輸入錯誤，請輸入整數成績！");
                input.next();                 // 跳過錯誤的輸入
            }
        }

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("總分: %d%n", total);
            System.out.printf("成績數: %d%n", gradeCounter);
            System.out.printf("平均成績: %.2f%n", average);
        } else {
            System.out.println("沒有輸入任何成績");
        }
    }
}