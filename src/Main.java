import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        Converter converter = new Converter(75,50);
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput !=0) { //Основоной рабочий цикл
            if (userInput == 1) {   //Ввод нового количества шагов
                System.out.println("Введите номер месяца от 1 до 12");
                int month1 = scanner.nextInt();
                System.out.println("Введите день от 1 до 30");
                int day1 = scanner.nextInt();
                System.out.println("Введите количество шагов");
                int steps1 = scanner.nextInt();
                stepTracker.stepInput(month1,day1,steps1);
                System.out.println("Количество шагов изменено");
            } else if (userInput == 2) { //Вывод статистики за месяц
                System.out.println("Введите номер месяца от 1 до 12");
                int month2 = scanner.nextInt();
                int sumSteps;
                stepTracker.printMonth(month2); //вывод шагов за каждый день
                sumSteps =  stepTracker.stepsSum(month2); //сумма шагов за месяц
                stepTracker.maxSteps(month2); //максимальное кол-во шагов в месяце
                stepTracker.averageSteps(month2); //среднее кол-во шагов
                System.out.println("Пройденная дистанция (в км): " + converter.stepsToKm(sumSteps));
                System.out.println("Кол-во сожженных килокаллорий: " + converter.stepsToKKal(sumSteps));
                stepTracker.series(month2); //максимальная серия
            } else if (userInput == 3) { //Изменить цель по количеству шагов
                System.out.println("Текущая цель:" + stepTracker.printGoal());
                int goal = -5;
                while (goal < 0) {
                    System.out.println("Введите новую цель. Цель не может быть меньше 0");
                    goal = scanner.nextInt();
                }
                stepTracker.newGoal(goal);
                System.out.println("Цель успешно обновлена");
            } else {
                System.out.println("Такой команды нет. Повторите попытку");
            }
            printMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");
    }

    public static void printMenu() {    //Метод для вывода на экран списка действий
        System.out.println("Выберите действие:");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("0. Выйти из приложения");
    }
}

