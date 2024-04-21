package lastTask;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String randomFrom = "Normalno delay"; // ��������� ��������� ������. ������ ������� �� ��������������.
        String randomTo = "Normalno budet";  // ��������� ��������� ������. ������ ������� �� ��������������.
        int randomSalary = 10000;  // ��������� ��������� ����� ������������� �����. ������ ������� ��� ��������������.

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
                "����, ������ ��� ��� ������ ������ ����, ����� ����������� ��� �������� ������� �. ��� �� ������!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "� ��� � �� ����� ������������."
        );

        List<MailMessage> messages = Arrays.asList(
                firstMessage, secondMessage, thirdMessage
        );


// �������� ��������� �������.
        MailService<String> mailService = new MailService<>();

// ��������� ������ ����� �������� ��������
        messages.stream().forEachOrdered(mailService);

// ��������� � �������� ������� "��������� �����",
//  ��� �� ���������� ����� �������� ������ ���������, ������� ���� ��� ����������
        Map<String, List<String>> mailBox = mailService.getMailBox();

        mailBox.forEach((a,b) -> System.out.println(a+b));

        assert mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ): "wrong mailService mailbox content (1)";

        assert mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "����, ������ ��� ��� ������ ������ ����, ����� ����������� ��� �������� ������� �. ��� �� ������!",
                        "� ��� � �� ����� ������������."
                )
        ): "wrong mailService mailbox content (2)";

        //TODO
        assert mailBox.get(randomTo).equals(Collections.<String>emptyList()): "wrong mailService mailbox content (3)";

        // �������� ������ �� ���� �������.
        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

// �������� ��������� �������, ��������������� ��������.
        MailService<Integer> salaryService = new MailService<>();

// ��������� ������ ������� �������� ��������
        Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

// ��������� � �������� ������� "��������� �����",
//   ��� �� ���������� ����� �������� ������ �������, ������� ���� ��� ����������.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)): "wrong salaries mailbox content (1)";
        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)): "wrong salaries mailbox content (2)";
        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)): "wrong salaries mailbox content (3)";













        //�������� �����
        MailMessage testMessage1 = new MailMessage("AAA","BBB", "text 1");
        MailMessage testMessage2 = new MailMessage("AAA","BBB", "text 2");
        MailMessage testMessage3 = new MailMessage("AAA","BBB", "text 3");
        MailMessage testMessage4 = new MailMessage("AAA","BBB", "text 4");
        MailMessage testMessage5 = new MailMessage("AAA","BBB", "text 5");
        MailMessage testMessage6 = new MailMessage("AAA","BBB", "text 6");
        MailMessage testMessage7 = new MailMessage("AAA","BBB", "text 7");

        List<MailMessage> testMessagesList = Arrays.asList(
                testMessage1,testMessage2,testMessage3,testMessage4,testMessage5,testMessage6,testMessage7
        );
        MailService<String> testMmailService = new MailService<>();
        testMessagesList.stream().forEachOrdered(testMmailService);
        Map<String, List<String>> testMailBox = testMmailService.getMailBox();
        testMailBox.forEach((a,b) -> System.out.println(a+b));

        //���� �� equals (NPE)
        List<String> testEmpty = Collections.<String>emptyList();
        List<String> emptyList = new ArrayList<>();
        if (testEmpty.equals(emptyList)) {System.out.println("true-equals");}


    }
}
