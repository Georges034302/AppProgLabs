public class AverageDays {

    public static void main(String[] args){
        int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;
        for(int i=0; i<months.length; i++){
            sum += months[i];
        }
        System.out.println("Average days per month = "+(double)sum/months.length);
    }
}

