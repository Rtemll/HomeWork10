import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork10 {
    public static void main(String[] args) {

        System.out.println(Stream.of("Lern", "Uuuuuuuuppppp")
                .map(s->s.split(""))//Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct()
                .limit(10)//лимит стрим по количеству элементов
                .skip(3)//пропускает 3 элемента
                .sorted()//сортирует
                .collect(Collectors.toList()));// выводит ввиде списка


        System.out.println(Stream.of(120, 410, 85, 32, 314, 12, 120, 410, 85, 324, 234, 678, 893, 754, 547)
                .distinct()
                .sorted()
                .filter(x -> x > 100)
                .map(x -> x + 11)
                .limit(4)
                .skip(2).collect(Collectors.toList()));// выводит ввиде списка
}}
