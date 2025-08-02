class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int min=Integer.MAX_VALUE;
        
        HashMap<Integer, Integer> bas1=new HashMap<>();
        HashMap<Integer, Integer> bas2=new HashMap<>();

        for(int b1: basket1){
            bas1.put(b1, bas1.getOrDefault(b1, 0)+1);
            min=Math.min(b1, min);
        } 
        for(int b2: basket2) {
            bas2.put(b2, bas2.getOrDefault(b2, 0)+1);
            min=Math.min(b2, min);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int total=0;

        for(int b1:bas1.keySet()) {
            int op=Math.abs(bas1.get(b1)-bas2.getOrDefault(b1, 0));
            if(op%2==1) return -1;
            total+=op/2;
            int num=1;
            while(num<=op/2) {
                pq.add(b1);
                num++;
            }
        }

        for(int b2:bas2.keySet()){
            if(!bas1.containsKey(b2)){
                int op=bas2.get(b2);
                if(op%2==1) return -1;
                total+=op/2;
                int num=1;
                while(num<=op/2) {
                    pq.add(b2);
                    num++;
                }
            }
        }

        long ans=0;
        int count=total/2;
        while(count>0){
            ans+=Math.min(min*2, pq.poll());
            count--;
        }
        return ans;
    }
}