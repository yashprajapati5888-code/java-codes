package practiceq.arrayone;

public class MinMaxArray {
   public static void main(String args[]) {
        int arr[] = {2,4,5,8,3,9,17,25};
        int max = arr[0];
        int min = arr[0];

        for (int num: arr){
            if(num>max)
                max = num;
            if(num<min)
                min = num;
        }
       System.out.println("Maximum = "+max);
       System.out.println("Minimum = "+min);


   }
}


