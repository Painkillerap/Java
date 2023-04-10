// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

package DZ.dz1;

import java.util.Scanner;

public class Program0 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите список камней: ");
        String stones = iScanner.nextLine();
        System.out.printf("Введите драгоценный камень: ");
        String jewels = iScanner.nextLine();
        iScanner.close();
        System.out.print(Jewels_in_Stones(jewels, stones));
    }

    public static String Jewels_in_Stones(String jewels, String stones) {

        char[] array = jewels.toCharArray();
        char sim_a = array[0];
        char sim_b = array[1];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (stones.charAt(i) == sim_a) {
                count1++;
            }
            if (stones.charAt(i) == sim_b) {
                count2++;
            }
        }
        String result = String.valueOf(sim_a) + String.valueOf(count1) + String.valueOf(sim_b) + String.valueOf(count2);
        return result;
    }
}
