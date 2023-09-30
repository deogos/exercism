public class CarsAssemble {

    private static final int ASSEMBLY_SPEED  = 221;

    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            return (double) ASSEMBLY_SPEED * speed;
        }
        else if (speed >= 5 && speed <= 8) {
            return (double) (ASSEMBLY_SPEED * speed) * 0.9;
        }
        else if (speed == 9) {
            return (double) (ASSEMBLY_SPEED * speed) * 0.8;
        }
        else {
            return (double) (ASSEMBLY_SPEED * speed) * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        if (speed >= 1 && speed <= 4) {
            return  (ASSEMBLY_SPEED * speed) / 60;
        }
        else if (speed >= 5 && speed <= 8) {
            return (int) ((ASSEMBLY_SPEED * speed) * 0.9) /60;
        }
        else if (speed == 9) {
            return (int) ((ASSEMBLY_SPEED * speed) * 0.8) /60;
        }
        else {
            return (int) ((ASSEMBLY_SPEED * speed) * 0.77) / 60;
        }
    }
}
