public class SortArray {
    public static void main(String s[])
    {
        int arr[] = {5,3,7,8,2,12,9};
        for (int i =0;i <arr.length;i++)
        {
            for(int j =i+1; j<arr.length;j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
    }



}
