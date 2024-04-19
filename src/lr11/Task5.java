package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Напишите функцию, которая принимает на вход список строк и возвращает новый список,
// содержащий только те строки, которые содержат заданную подстроку.
public class Task5 {
    public static void main(String[] args){
        String string = "Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые содержат " +
                "заданную подстроку.";

        List<String> strings = List.of(string.split(","));
        System.out.println("\nСтрока после считывания: \n");
        for(String s : strings){
            System.out.println(s);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите подстроку: ");
        String subString = in.nextLine();

        List<String> stringAfter = filterSubString(strings, subString);

        System.out.println("\nСтрока после фильтрации:\n");
        for(String s : stringAfter){
            System.out.println(s);
        }

    }

    public static List<String> filterSubString(List<String> strings, String subString){
        return strings.stream().filter(s -> s.contains(subString)).collect(Collectors.toList());
    }

}