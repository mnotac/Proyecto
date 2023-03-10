import java.util.Random;
import java.util.Scanner;

public class LucesFora {

    private boolean[][] tablero;
    private int dimension;

    public LucesFora(int dimension) {
        this.dimension = dimension;
        this.tablero = new boolean[dimension][dimension];
        // Generar tablero aleatorio
        Random rand = new Random();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                this.tablero[i][j] = rand.nextBoolean();
            }
        }
    }

    public void imprimirTablero() {
        System.out.println("Tablero:");
        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                if (this.tablero[i][j]) {
                    System.out.print("⚪️ ");
                } else {
                    System.out.print("⚫️ ");
                }
            }
            System.out.println();
        }
    }