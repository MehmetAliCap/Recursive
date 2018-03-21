public class Test {

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] array = { { 1, 0, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 3, 1 }, { 1, 1, 0, 1 } };
        System.out.print(deepSum(array, n, m));
    }

    public static int deepSum(int[][] data){
        //n*n
        return deepSum(data, data.length, data.length);
    }
    private static int deepSum(int[][] data, int n, int m){
        if (n ==1)
            return deepSumCol(data ,m, 0);
        if (data )
        else
            return  deepSum(data, n-1,m) + deepSumCol(data, m, n-1);
    }

    private static int deepSumCol(int[][] data, int n ,int m){
        if (n ==1)
            return data[m][0];
        else{
            return  deepSumCol(data, n -1,m) + data[m][n-1];
        }

    }
}