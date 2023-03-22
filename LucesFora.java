
import java.util.Scanner;

public class LucesFora {

public int dimension;

public int dimensionRespaldo;


public int getDimension() {
return dimension;
}

public void setDimension(int dimension) {
this.dimension = dimension;
}

public int getDimensionRespaldo() {
return dimensionRespaldo;
}

public void setDimensionRespaldo(int dimensionRespaldo) {
this.dimensionRespaldo = dimensionRespaldo;
}


public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

LucesFora luz = new LucesFora();

System.out.print("Introduca las dimensiones del tablero: ");

luz.dimension = entrada.nextInt();

while (luz.dimension <= 3) {

System.out.print("Dimensiones muy reducidas, vuelva a introducir otras dimesiones: ");

luz.dimensionRespaldo = entrada.nextInt();

luz.dimension = luz.dimensionRespaldo;
}

entrada.close();

}
}
