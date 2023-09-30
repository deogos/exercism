class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int daysWithoutBirds : birdsPerDay) {
            if (daysWithoutBirds == 0) {
                return true;
            }

        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalCount = 0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for (int i = 0; i < numberOfDays; i++) {
            totalCount += birdsPerDay[i];
        }
        return totalCount;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
