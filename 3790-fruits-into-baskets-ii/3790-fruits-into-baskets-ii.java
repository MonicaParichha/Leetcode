class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        int n=fruits.length;
        int unplaced=n;
        // Arrays.sort(fruits);
        // int j=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=-1;
                    unplaced--;
                    break;
                }
            }
            
        }
        return unplaced;
    }
}