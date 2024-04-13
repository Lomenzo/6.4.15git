package lastTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String randomFrom = "Normalno delay"; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        String randomTo = "Normalno budet";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        int randomSalary = 10000;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        assert firstMessage.getFrom().equals("Robert Howard"): "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft"): "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!"): "Wrong firstMessage content ending";

        MailMessage secondMessage = new MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        List<MailMessage> messages = Arrays.asList(
                firstMessage, secondMessage, thirdMessage
        );

// Создание почтового сервиса.
        MailService<String> mailService = new MailService<>();

// Обработка списка писем почтовым сервисом
        messages.stream().forEachOrdered(mailService);




        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "New York", "London");
        cities.forEach(printConsumer);



// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список сообщений, которые были ему отправлены
        //Map<String, List<String>> mailBox = mailService.getMailBox();

    }
}
