import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        //food.set(0, "sushi");
        //Раскомментировать строку 13 для примера замещения значения

        //food.remove(2);
        //Раскомментировать строку 16 для примера удаления значения

        //food.clear();
        //Строка 19 - удаление значений

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}