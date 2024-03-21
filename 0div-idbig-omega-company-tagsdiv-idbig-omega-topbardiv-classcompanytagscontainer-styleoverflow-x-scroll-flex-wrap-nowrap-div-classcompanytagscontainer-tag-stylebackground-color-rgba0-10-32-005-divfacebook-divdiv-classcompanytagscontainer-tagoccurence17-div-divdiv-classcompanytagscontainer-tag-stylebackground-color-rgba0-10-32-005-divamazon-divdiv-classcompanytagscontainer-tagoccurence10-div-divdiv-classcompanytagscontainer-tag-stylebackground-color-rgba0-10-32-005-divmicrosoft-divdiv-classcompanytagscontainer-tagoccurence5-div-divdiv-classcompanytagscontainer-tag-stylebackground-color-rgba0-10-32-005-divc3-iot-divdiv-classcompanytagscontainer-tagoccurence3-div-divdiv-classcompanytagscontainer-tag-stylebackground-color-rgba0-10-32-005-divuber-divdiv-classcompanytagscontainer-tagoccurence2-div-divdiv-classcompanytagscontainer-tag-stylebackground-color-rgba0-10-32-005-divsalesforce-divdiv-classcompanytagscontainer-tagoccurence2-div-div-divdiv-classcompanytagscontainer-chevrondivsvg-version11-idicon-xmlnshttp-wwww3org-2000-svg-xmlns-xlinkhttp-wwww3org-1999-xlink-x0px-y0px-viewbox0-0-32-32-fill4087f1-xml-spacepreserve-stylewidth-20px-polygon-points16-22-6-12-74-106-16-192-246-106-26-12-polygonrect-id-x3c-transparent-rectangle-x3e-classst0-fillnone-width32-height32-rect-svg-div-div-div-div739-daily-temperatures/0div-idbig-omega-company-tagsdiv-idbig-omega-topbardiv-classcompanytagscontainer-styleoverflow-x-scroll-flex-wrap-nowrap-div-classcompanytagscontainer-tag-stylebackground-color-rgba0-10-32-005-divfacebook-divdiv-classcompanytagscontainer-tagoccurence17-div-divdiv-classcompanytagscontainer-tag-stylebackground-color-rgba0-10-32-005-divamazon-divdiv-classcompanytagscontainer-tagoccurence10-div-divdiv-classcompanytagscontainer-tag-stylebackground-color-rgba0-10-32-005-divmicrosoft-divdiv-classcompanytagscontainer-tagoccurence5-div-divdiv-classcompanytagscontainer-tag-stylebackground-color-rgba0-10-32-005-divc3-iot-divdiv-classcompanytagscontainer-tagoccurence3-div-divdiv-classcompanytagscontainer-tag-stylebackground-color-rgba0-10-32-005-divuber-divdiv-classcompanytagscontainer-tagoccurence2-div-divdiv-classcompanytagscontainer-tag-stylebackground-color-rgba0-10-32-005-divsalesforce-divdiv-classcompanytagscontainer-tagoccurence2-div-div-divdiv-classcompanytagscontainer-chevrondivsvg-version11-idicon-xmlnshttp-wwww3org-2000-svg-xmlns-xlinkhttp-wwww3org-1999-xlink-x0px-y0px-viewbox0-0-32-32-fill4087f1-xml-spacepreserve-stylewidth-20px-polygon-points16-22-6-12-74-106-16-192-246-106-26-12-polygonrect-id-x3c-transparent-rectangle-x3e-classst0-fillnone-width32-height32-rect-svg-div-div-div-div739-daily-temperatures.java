class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack=new Stack<>();
        int ans[]=new int[temperatures.length];
        for(int day=0;day<temperatures.length;day++){
            while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[day]){
                ans[stack.peek()]=day-stack.pop();
            }
            stack.add(day);
        }
        
        return ans;
    }
}