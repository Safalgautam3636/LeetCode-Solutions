class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target=image[sr][sc];
        
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                    if(i==sr&&j==sc){
                        
                        dfs(image,target,color,i,j);
                    }
                
            }
        }
        
        return image;
    }
    void dfs(int[][]image,int target,int color,int i,int j){
       
        if(i<=image.length-1&&j<=image[0].length-1&&i>=0&&j>=0&&image[i][j]==target&&target!=color){
                System.out.println(i+""+j);
                image[i][j]=color;
               
                dfs(image,target,color,i+1,j);
                dfs(image,target,color,i-1,j);
                dfs(image,target,color,i,j-1);
                dfs(image,target,color,i,j+1);}
        
    }
    
}