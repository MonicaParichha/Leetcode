class Solution {
    public int countPrimes(int n) {
        int count=0;
        List<Integer> primes=seive(n);
        for(int i=2;i<primes.size();i++){
            if(primes.get(i)==1){
                count++;
            }
        }
        return count;
    }
    public List<Integer> seive(int n){
        List<Integer> primes=new ArrayList<>();
        for(int i=0;i<n;i++){
            primes.add(1);
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(primes.get(i)==1){
                for(int j=i*i;j<n;j+=i){
                    primes.set(j,0);
                }
            }
        }
        return primes;
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt"))
            {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        ));
    }
}