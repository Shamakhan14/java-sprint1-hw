public class StepTracker {

    private int goal = 10000;
    private int[][] stepsMatrix;

    public StepTracker() { //конструктор с массивом 12х30
        stepsMatrix = new int[12][30];
    }

    public void printMonth(int month) { //вывод данных за месяц
        for (int i = 1; i<=30; i++) {
            System.out.print(i + "день: " + stepsMatrix[month-1][i-1] + ", ");
        }
        System.out.println();
    }

    public int stepsSum (int month) { //вывод суммы шагов
        int sumSteps = 0;
        for (int i = 0; i<=29; i++) {
            sumSteps = sumSteps + stepsMatrix[month-1][i];
        }
        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        return sumSteps;
    }

    public void maxSteps (int month) { //вывод максимального количества шагов
        int max = 0;
        for (int i = 0; i <= 29; i++) {
            if (max < stepsMatrix[month-1][i]) {
                max = stepsMatrix[month-1][i];
            }
        }
        System.out.println("Максимальное количество шагов за месяц: " + max);
    }

    public void averageSteps (int sumSteps) {
        System.out.println("Среднее количество шагов: " + sumSteps/30);
    }

    public void series (int month) {
        int series = 0;
        int maxSeries = 0;
        for (int i = 0; i <= 29; i++) {
            if (stepsMatrix[month -1][i] >= goal) {
                series = series +1;
                if (series > maxSeries) {
                    maxSeries = series;
                }
            } else {
                series = 0;
            }
        }
        System.out.println("Максимальная серия тренировок: " + maxSeries);
    }

    public int[][] stepInput(int month,int day,int steps) { //ввод количества шагов за день
        stepsMatrix[month-1][day-1] = steps;
        return stepsMatrix;
    }

    public int printGoal() { //печать текцщей цели шагов
        return goal;
    }

    public int newGoal(int newGoal) { //замена цели
        goal = newGoal;
        return goal;
    }
}
