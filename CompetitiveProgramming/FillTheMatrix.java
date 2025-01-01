public class FillTheMatrix {
    public static void fillVertical(){
        int [][]arr = new int[3][3];
        int n = arr[0].length;
        int m = arr.length;
        int k=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[j][i] = k++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void fillVerticalUsingFormula(){
        int [][]arr = new int[3][3];
        int n = arr[0].length;
        int m = arr.length;
        int k=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[j][i] = k++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void fillHorizontal(){
        int [][]arr = new int[3][3];
        int n = arr.length;
        int m = arr.length;
        int k=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = k++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // fillHorizontal();
        // System.out.println();
        // fillVertical();
        // fillVerticalUsingFormula();
        System.out.println(Math.pow(17, 77)%35);
        System.out.println(Integer.MAX_VALUE%35);
        System.out.println(Math.pow(17, 77));
    }
}
