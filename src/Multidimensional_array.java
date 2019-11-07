public class Multidimensional_array {
    public static void main(String[] args) {
        int[][] ints={{1, 2, 3},{4, 5, 6},{7,8,9}};
        for(int i=0; i<ints.length; i++){
            for(int j=0;j<ints[i].length;j++){
                System.out.print(ints[i][j]+" ");}
            System.out.println();
        }
    }
}
