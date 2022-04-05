public class Converter {

    int stepToSm;
    int stepToKal;

    Converter(int stepsRate, int kalRate) {
    //данные задаются в мэйне, чтобы соотношение шагов/см/кал можно было поменять в любой момент в зависимости от человека
        stepToSm = stepsRate;
        stepToKal = kalRate;
    }

    double stepsToKm(int steps) {
        double km = steps * stepToSm / 100000;
        return km;
    }

    double stepsToKKal(int steps) {
        double KKal = steps * stepToKal / 1000;
        return KKal;
    }
}
