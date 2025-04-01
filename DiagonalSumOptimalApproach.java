public class DiagonalSumOptimalApproach{

    public static void solution(int matric[][]){

        int sum=0;

        for(int i=0;i<matric.length;i++){

            // step 1
            // here second i refer as j index
            sum+=matric[i][i];

            if(i != matric.length-1-i){

                //here matric.length-1-i is refer as j index
                sum += matric[i][matric.length-1-i];

            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){

        int matrix[][]={{1,2,3},
        {5,6,7},
        {9,10,11}};

                    solution(matrix);
    }
}
