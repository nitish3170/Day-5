import java.util.Scanner;

public class SumOfThree {
    public static void Sorting(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size= sc.nextInt();
        int [] nums=new int[size];
        System.out.println("Enter the numbers");
        for (int i=0;i<size;i++){
            nums[i]= sc.nextInt();
        }

        Sorting(nums);
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if (nums[i]+nums[j]+nums[k]>0)
                    k--;
                else if(nums[i]+nums[j]+nums[k]<0)
                    j++;
                else{
                    count++;
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;

                }

            }

        }
        System.out.printf("Number of triplet that sum to zero: %d",count);
    }
}
