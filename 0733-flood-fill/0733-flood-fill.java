class Solution {
    private void dfs(int[][] image,int i,int j,int color,int storeInitial){
        // image[sr][sc]=color;
        if(i>=0&&j>=0&&i<=image.length-1&&j<=image[0].length-1&&image[i][j]==storeInitial&&storeInitial!=color){
            image[i][j]=color;
            dfs(image,i+1,j,color,storeInitial);
            dfs(image,i,j+1,color,storeInitial);
            dfs(image,i-1,j,color,storeInitial);
            dfs(image,i,j-1,color,storeInitial);
        }
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int storeInitial=image[sr][sc];
        for(int i=0;i<image.length;i++){
          for(int j=0;j<image[0].length;j++)  {
              if(i==sr&&j==sc){
                  dfs(image,i,j,color,storeInitial);
              }
            
        }
        }
        return image;
        
    }
    
}