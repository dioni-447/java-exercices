
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        int arrayLength = birdsPerDay.length;
        return birdsPerDay[arrayLength-1];
    }

    public void incrementTodaysCount() {
        int i;
        int arrayLength = birdsPerDay.length;
        birdsPerDay[arrayLength-1]=birdsPerDay[arrayLength-1]+1;
    }

    public boolean hasDayWithoutBirds() {
        boolean tem=false;
        int arrayLength = birdsPerDay.length;
        for(int i=0;i<arrayLength;i++){
            if(birdsPerDay[i]==0){
                tem=true;
            }
        }return tem;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int soma=0, i=0;
        int arrayLength = birdsPerDay.length;
        while(i!=numberOfDays && i<arrayLength){
            soma=soma+birdsPerDay[i];
            i++;
        }return soma;
    }

    public int getBusyDays() {
        int dias=0;
        int arrayLength = birdsPerDay.length;
        for(int i=0;i<arrayLength;i++){
            if(birdsPerDay[i]>=5){
                dias++;
            }
        }
        return dias;
    }
}
