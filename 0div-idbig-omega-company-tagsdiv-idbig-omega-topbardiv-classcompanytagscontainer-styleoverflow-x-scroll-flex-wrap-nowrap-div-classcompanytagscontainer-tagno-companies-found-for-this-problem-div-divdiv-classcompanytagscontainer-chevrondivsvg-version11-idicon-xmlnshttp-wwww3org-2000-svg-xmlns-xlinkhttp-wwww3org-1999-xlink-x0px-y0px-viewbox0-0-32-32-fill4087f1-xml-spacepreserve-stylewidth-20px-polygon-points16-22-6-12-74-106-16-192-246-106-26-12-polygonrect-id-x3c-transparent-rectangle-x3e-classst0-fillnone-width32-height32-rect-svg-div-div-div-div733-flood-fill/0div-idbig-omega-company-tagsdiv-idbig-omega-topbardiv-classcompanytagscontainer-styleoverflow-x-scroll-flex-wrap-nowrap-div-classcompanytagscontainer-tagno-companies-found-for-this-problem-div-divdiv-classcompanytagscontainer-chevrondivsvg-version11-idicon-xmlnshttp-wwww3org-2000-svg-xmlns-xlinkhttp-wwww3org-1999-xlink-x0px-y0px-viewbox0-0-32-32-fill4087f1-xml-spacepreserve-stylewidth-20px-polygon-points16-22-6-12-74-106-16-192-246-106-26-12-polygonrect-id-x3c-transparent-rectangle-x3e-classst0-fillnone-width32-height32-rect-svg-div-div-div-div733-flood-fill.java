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
    
    void dfs(int i,int j,int[][]image,int color,int from){
        if(i<=image.length-1&&j<=image[0].length-1&&i>=0&&j>=0&&image[i][j]==from&&color!=from){
            image[i][j]=color;
            dfs(i-1,j,image,color,from);
            dfs(i,j-1,image,color,from);
            dfs(i+1,j,image,color,from);
            dfs(i,j+1 ,image,color,from);
        }
    }
}