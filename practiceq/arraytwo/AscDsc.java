package practiceq.arraytwo;

public class AscDsc {
    public static void main(String[] args) {
        int arr[] = {10, 2, 5, 30, 14, 50, 21};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }


        System.out.print("Ascending Order:");
        for(int n : arr) System.out.print(n+" ");

        System.out.print("Descending order");
        for(int i = arr.length-1; i>=0; i--) System.out.print(arr[i]+" ");
    }
}

