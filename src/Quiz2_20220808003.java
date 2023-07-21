public class Quiz2_20220808003 {
    public static void main(String[] args) {

    }
    //this method allows us to change or nullify the duplicate values in an array
    //that way we can create an array that retains its order without having any
    //unneeded places filled with the same numbers
    public static int[] eliminateDuplicates(int[] duplicate){
        int n = 10;
        int[] temporary = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (duplicate[i] != duplicate[i + 1])
                temporary[j++] = duplicate[i];
        temporary[j++] = duplicate[n - 1];
        for (int i = 0; i < j; i++)
            duplicate[i] = temporary[i];
        return temporary;
    }
    //this method allows user to get the closest point OR the closest points of a value to an index
    //it can be used to calculate in geometrical problems
    public static int[] getClosestPoints(double[][] array, int index){
        int[] points = new int[array.length];
        for(int i = 0 ; i < points.length ; i++) {
            for (int j = 0; j < points.length; j++) {
                if (points[i] > points[j]) {
                    int temp = points[i];
                    points[i] = points[j];
                    points[j] = temp;
                }
            }
            if(points[index] > points[i]) {
                index = i;
            }
        }


        return points;
    }
    //this method allows the user to see which employee worked the most and sort them accordingly
    //a manual sort method has been used here to display the workers in a decreasing list finally
    //we can see how much each worker had worked
    public static int[] employeeWorkingHours(int[][] workers){
        int[] hours = new int[workers.length];
        int sumHours = 0;
        for(int i = 0 ; i < hours.length ; i++){
            for (int j = 0 ; j < hours.length ; j++){
                if (hours[i]>hours[j]) {
                    int temp = hours[i];
                    hours[i] = hours[j];
                    hours[j] = temp;
                }
            }
            sumHours += hours[i];
        }

        return hours;
    }
    //this method allows us to create a random numbers list while excluding a number out of it
    //we use the int... variable to exclude more than 1 number, that way where can be made a list
    //of random numbers from 1 to 10 excluding the numbers 3, 5 and 8
    public static int random(int start, int end, int... exclude){
        int number = start + (int) (Math.random() * (end - start + 1));
        for(int i = 0; i<exclude.length ; i++){
            while(number == exclude[i]){
                random(start,end,exclude);
            }
        }
        return number;
    }
}
