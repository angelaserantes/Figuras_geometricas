package com.ejercicios.EjerciciosFigura;

import java.util.Scanner;

public class figuras {
    float areaTriangulo;
    float areaRectangulo;
    float areaPentagono;
    float areaHexagono;

    public static float CalculoAreaTriangulo(float base, float altura) {
        figuras area1 = new figuras();
        area1.areaTriangulo = (base * altura) / 2;
        return area1.areaTriangulo;
    }

    public static float CalculoAreaRectangulo(float base, float altura) {
        figuras area2 = new figuras();
        area2.areaRectangulo = base * altura;
        return area2.areaRectangulo;
    }

    public static float CalculoAreaPentagono(float perimetro, float apotema) {
        figuras area3 = new figuras();
        area3.areaPentagono = (perimetro * apotema) / 2;
        return area3.areaPentagono;
    }

    public static float CalucloAreaHexagono(float perimetro, float apotema) {
        figuras area4 = new figuras();
        area4.areaHexagono = (perimetro * apotema) / 2;
        return area4.areaHexagono;
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Dime una figura geométrica");
        String figura = datos.nextLine();
        if (figura.contains("triángulo")) {
            System.out.println("Introduce el valor de la base");
            float base = datos.nextInt();
            System.out.println("Introduce el valor de la altura");
            float altura = datos.nextInt();
            System.out.println("El área del triángulo es " + CalculoAreaTriangulo(base, altura));
        } else if (figura.contains("rectángulo")) {
            System.out.println("Introduce el valor de la base");
            float base = datos.nextInt();
            System.out.println("Introduce el valor de la altura");
            float altura = datos.nextInt();
            System.out.println("El área del rectángulo es " + CalculoAreaRectangulo(base, altura));
        } else if (figura.contains("pentágono")) {
            System.out.println("Introduce el valor del perímetro");
            float perimetro = datos.nextInt();
            System.out.println("Introduce el valor del apotema");
            float apotema = datos.nextInt();
            System.out.println("El área del pentágono es " + CalculoAreaPentagono(perimetro,apotema));
        } else if (figura.contains("hexágono")){
            System.out.println("Introduce el valor del perímetro");
            float perimetro = datos.nextInt();
            System.out.println("Introduce el valor del apotema");
            float apotema = datos.nextInt();
            System.out.println("El área del hexágono es " + CalucloAreaHexagono(perimetro,apotema));
        }else{
            System.out.println("La figura introducida no existe");
        }
    }
}