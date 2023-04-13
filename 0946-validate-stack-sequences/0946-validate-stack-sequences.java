class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>pushedArr=new Stack<>();
        int popPtr=0;
        for(int i=0;i<pushed.length;i++){
            if(pushedArr.isEmpty()){
                pushedArr.push(pushed[i]);
                if(pushed[i]==popped[popPtr]){
                    pushedArr.pop();
                    popPtr++;
                }
                
            }
            else{
                    pushedArr.push(pushed[i]);
                    while(!pushedArr.isEmpty()&&pushedArr.peek()==popped[popPtr]){
                    pushedArr.pop();
                    popPtr++;
                }
                }
        }
        return pushedArr.isEmpty()?true:false;
    }
}