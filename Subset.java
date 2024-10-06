public class Main
{
    public static boolean findSumPresent(int[] arr,int i,int sum,int target){
        System.out.println("now : "+sum);
        if(sum==target){
            //flag= true;
            return true;
        }
        if(i>=arr.length){
            return false;
        }
        
    return findSumPresent(arr,i+1,sum+arr[i],target)||findSumPresent(arr,i+1,sum,target);
    }
	public static void main(String[] args) {
		int[] arr={1,2,4};
		int target=7;
		//boolean flag=false;
		boolean flag=findSumPresent(arr,0,0,target);
		if(flag){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}
