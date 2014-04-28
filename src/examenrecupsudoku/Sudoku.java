package examenrecupsudoku;

public class Sudoku {
    public static final char ESPACIO = '.';
    public char[][] tablero;
    private int tamFila;
    private int tamCol;
            
    public Sudoku(int tamFila, int tamCol){
        this.tamFila = tamFila;
        this.tamCol = tamCol;
        tablero = new char[tamFila][tamCol];
        
        for(int f=0; f<tamFila; f++) {
            for(int c=0; c<tamCol; c++) {
                tablero[f][c] = ESPACIO;
            }
        }
    }

    @Override
    public String toString() {
        String retorno = "";
        for(int f=0; f<tamFila; f++) {
            for(int c=0; c<tamCol; c++) {
                retorno += tablero[f][c];
            }
            retorno += '\n';
        }    
        return retorno;
    }

    
    
    
}
