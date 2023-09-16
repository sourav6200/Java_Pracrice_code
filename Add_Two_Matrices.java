public class Add_Two_Matrices {
    public static void main(String[] args) {
        int [][] mat1={{1,2,3},
                                {5,7,9}};
         int [][] mat2={{3,5,7},
                                {8,6,4}};
        int [][] result={{0,0,0},
                                {0,0,0}};
                                for(int i=0;i<mat1.length;i++){// row nunber of times
                                    for(int j=0;j<mat1[i].length;j++){// columm number of times
                                        System.out.format("Setting value for i=%d and j=%d\n",i,j);
                                        result[i][j]=mat1[i][j]+mat2[i][j];
                                    }
                                }
        // Printing the elements of 2-D Array
      for(int i=0;i<mat1.length;i++){// row nunber of times
                                    for(int j=0;j<mat1[i].length;j++){// columm number of times
                          System.out.print(result[i][j] +"  ");  
                                        result[i][j]=mat1[i][j]+mat2[i][j];
                                    }
                                    System.out.println("  ");//Printing new line
                                }                          
    }
}
