//На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
//потом вводится натуральное число m - количество продуктов, на которые у человека аллергия.
//Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия
//и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
//название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
//Выходные данные
//Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!!
//Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
//Sample Input:
//2
//Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измельчите его. Посыпьте измельчённый арахис на мороженое.
//Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
//3
//арахис - колбаса
//клубника - вишня
//сгущенка - молоко
//Sample Output:
//Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измельчите его. Посыпьте измельчённый колбаса на мороженое.
//Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
package DZ.dz3;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Scanner jScanner = new Scanner(System.in);
        System.out.printf("Введите количество строк в книге: ");
        int num_str = iScanner.nextInt();
        String [] text=new String[num_str];
        for (int i = 0; i < num_str; i++) {
            System.out.printf("Введите рецепт: ");
            String S=jScanner.nextLine();
            text[i]=S;
        }
        int index=0;
        System.out.printf("Введите количество аллергенов: ");
        int allergen=iScanner.nextInt();
        String[] bad_food=new String[allergen];
        String[] good_food=new String[allergen];
        for (int j = 0; j < allergen; j++) {
            System.out.printf("Введите продукт аллерген и его заменитель(... - ...): ");
            String s =jScanner.nextLine();
            String[] food=s.split(" - ");
            bad_food[index]=food[0];
            good_food[index]=food[1];
            index++;
        }
        iScanner.close();
        jScanner.close();
        String[] bad_food_top=new String[allergen];
        String[] good_food_top=new String[allergen];
        for (int k = 0;  k< bad_food.length; k++) {
            bad_food_top[k]=bad_food[k].substring(0,1).toUpperCase()+bad_food[k].substring(1);
            good_food_top[k]=good_food[k].substring(0,1).toUpperCase()+good_food[k].substring(1);
        }
        for (int x = 0; x < text.length; x++) {
            String text_rep=text[x];
            for (int y = 0; y < good_food_top.length; y++) {
                text_rep=text_rep.replace(bad_food[y], good_food[y]);
                text_rep=text_rep.replace(bad_food_top[y], good_food_top[y]);
            }
            System.out.println(text_rep);
        }
    }
}