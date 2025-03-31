public class DiagonalSum {
    
    public static void SOl(int matrix[][]){

      
        int sum=0;

        // step 1
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                // case 1
                if(i==j){
                    sum += matrix[i][j];
                }

                // case 2
                else if((i+j)==matrix.length-1){
                        sum += matrix[i][j];
                    }
                }
            

        }
        System.out.println(sum);

    }
    public static void main(String args[]){

        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
                        

                        SOl(matrix);  //T.C=(n^2)
    }
}
