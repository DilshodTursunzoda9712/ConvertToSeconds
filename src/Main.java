import java.util.Scanner;

public class Main {
    public static int convertToSeconds(int days, int hours, int minutes) {
        int secondsFromDays = days * 3600 * 24;
        int secondsFromHours = hours * 3600;
        int secondsFromMinutes = minutes * 60;
        return secondsFromDays + secondsFromHours + secondsFromMinutes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Сколько дней потребуется на выполение?");
            int days = scanner.nextInt();
            System.out.println("Сколько часов потребуется на выполнение?");
            int hours = scanner.nextInt();
            System.out.println("Сколько минут потребуется на выполнение?");
            int minutes = scanner.nextInt();
            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime += currentTimeTask;
            if (currentTimeTask > biggestTime) {
                biggestTime = currentTimeTask;
            }
            if (currentTimeTask < smallestTime) {
                smallestTime = currentTimeTask;
            }
            System.out.println("Для завершения работы программы введите 'end' для продолжения нажмите enter");
            scanner.nextLine();
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
        }
        System.out.println("Всего потребуется:" + " " + totalTime + " " + "секунд");
        System.out.println("Самая короткая задача займёт:" + " " + smallestTime + " " + "секунд");
        System.out.println("Самая продолжительная задача займёт:" + " " + biggestTime + " " + "секунд");
    }
}