import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {

		outsideloop: for (int j = 1; j <= 3; j++) {

			insideloop: for (int i = 1; i <= 3; i++) {

				System.out.print("STEP1:請輸入四位整數密碼:\n");
				Scanner wrt = new Scanner(System.in);
				int setpass1 = wrt.nextInt();

				//
				if (setpass1 < 0 || setpass1 > 9999) {
					System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
					break;
				}

				System.out.print("STEP2:請輸入四位整數密碼:\n");
				Scanner wrti = new Scanner(System.in);
				int setpass2 = wrti.nextInt();

				if (setpass2 < 0 || setpass2 > 9999) {
					System.out.println("密碼限制為四位整數;輸入格式錯誤\n");
					break;
				}

				else if (setpass1 == setpass2) {
					System.out.print("密碼正確");
					break outsideloop;
				}

				else if (setpass1 != setpass2) {
					System.out.print("請確認密碼一致性\n");

					if (j == 3) {
						System.out.println("EROR");
						break outsideloop;
					}
				}

			}

		}

	}
}
