package lr11;
//Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые содержат только буквы (без цифр и символов).
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        String string = "В коридоре 7 дверей, все вдоль 1 стены. За 1 из дверей сидит 1 кот." + " Вам нужно его найти. Вы можете открывать только 1 дверь в час. " +
                "Если бы кот всегда сидел за 1 и той же дверью, вам бы потребовалось максимум 7 часов, чтобы его найти..." +
                "Но хитрый зверь каждый час перемещается, то вправо, то влево — правда, всегда только к соседней двери." + " Сколько времени вам понадобится, чтобы найти кота за дверями? ";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после считывания: \n");
        for(String s : strings){
            System.out.println(s);
        }

        List<String> stringAfter = filterOnlyLetters(strings);

        System.out.println("\nСтрока после фильтрации:\n");
        for(String s : stringAfter){
            System.out.println(s);
        }


    }

    public static List<String> filterOnlyLetters(List<String> strings){

        return strings.stream().filter(s -> s.matches("[а-яА-Я]+")).collect(Collectors.toList());
    }
}