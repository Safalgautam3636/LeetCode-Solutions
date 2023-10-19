class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            //System.out.println(Arrays.toString(matrix[i]));
            reverse(matrix[i]);
        }
        
        
    }
    void reverse(int[]arr){
        int first=0;
        int last=arr.length-1;
        while(first<=last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
}