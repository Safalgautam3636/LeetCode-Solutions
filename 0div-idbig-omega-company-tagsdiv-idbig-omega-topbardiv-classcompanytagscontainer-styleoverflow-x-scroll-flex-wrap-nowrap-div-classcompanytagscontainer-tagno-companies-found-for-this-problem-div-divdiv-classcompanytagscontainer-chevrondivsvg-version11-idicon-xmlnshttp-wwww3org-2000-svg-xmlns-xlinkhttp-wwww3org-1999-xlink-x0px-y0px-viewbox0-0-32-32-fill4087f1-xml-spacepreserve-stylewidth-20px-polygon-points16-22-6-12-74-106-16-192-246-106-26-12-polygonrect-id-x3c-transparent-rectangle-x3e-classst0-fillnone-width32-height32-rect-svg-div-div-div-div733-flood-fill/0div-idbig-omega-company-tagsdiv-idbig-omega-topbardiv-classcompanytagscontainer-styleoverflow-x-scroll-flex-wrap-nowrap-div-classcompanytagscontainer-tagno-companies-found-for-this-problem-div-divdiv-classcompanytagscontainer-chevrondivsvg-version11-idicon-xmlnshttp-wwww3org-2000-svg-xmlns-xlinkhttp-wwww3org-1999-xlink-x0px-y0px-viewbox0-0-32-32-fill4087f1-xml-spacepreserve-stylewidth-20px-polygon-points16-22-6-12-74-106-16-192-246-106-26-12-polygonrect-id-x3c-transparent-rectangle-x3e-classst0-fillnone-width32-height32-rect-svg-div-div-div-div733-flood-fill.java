class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(i==sr&&j==sc){
                    dfs(i,j,image,color,image[i][j]);
                }
            }
        }
        return image;
    }
    
    void dfs(int i,int j,int[][]image,int target,int initial){
        if(i<=image.length-1&&j<=image[0].length-1&&i>=0&&j>=0&&image[i][j]==initial&&target!=initial){
            image[i][j]=target;
            dfs(i-1,j,image,target,initial);
            dfs(i,j-1,image,target,initial);
            dfs(i+1,j,image,target,initial);
            dfs(i,j+1 ,image,target,initial);
        }
    }
}