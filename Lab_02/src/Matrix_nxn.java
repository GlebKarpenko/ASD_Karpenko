public class Matrix_nxn {

    int n;
    int matrix[][];

    public Matrix_nxn(int n) {

        this.n = n;
        this.matrix = new int[this.n][this.n];
    }

    public void create(){

        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < this.n; j++){

                if (i <= j){
                    this.matrix[i][j] = 1;
                }

                if (i > j){
                    this.matrix[i][j] = 0;
                }
            }
        }
    }

    public void show() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(this.matrix[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println();
        Lab_02 lab_02 = new Lab_02();
        lab_02.menu();
    }
}
