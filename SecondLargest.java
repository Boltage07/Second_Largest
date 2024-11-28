
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int Secondlargest=Integer.MIN_VALUE;
        for(int k:arr){
            if(k>largest){
                Secondlargest=largest;
                largest=k;
            }
            else if(k>Secondlargest&&k<largest){
                Secondlargest=k;
            }
            
        }
        if(Secondlargest==Integer.MIN_VALUE){
        return -1;}
        return Secondlargest;
    }
}
