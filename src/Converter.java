public class Converter {

    private int stepToSm;
    private int stepToKal;

    public Converter(int stepsRate, int kalRate) {
    //данные задаются в мэйне, чтобы соотношение шагов/см/кал можно было поменять в любой момент в зависимости от человека
        stepToSm = stepsRate;
        stepToKal = kalRate;
    }

    public double stepsToKm(int steps) {
        return (double) Math.round(steps * stepToSm / 100000 * 100)/100;
    }

    public double stepsToKKal(int steps) {
        return (double) Math.round(steps * stepToKal / 10)/100; //делим на 1000 для перевода и умножаем на 100, итого делим на 10
        //умножаем на 100, округляем до ближайшего целого и делим на 100
    }
}
