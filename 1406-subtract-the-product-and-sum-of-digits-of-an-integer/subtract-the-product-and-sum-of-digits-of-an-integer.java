class Solution {
    public int subtractProductAndSum(int n) {
         int sum=0,multiplication=1;
        while(n>0){
            int rem = n%10;
            sum += rem;
            multiplication *= rem;
            n/=10;
    }
    return multiplication-sum;
    }
}