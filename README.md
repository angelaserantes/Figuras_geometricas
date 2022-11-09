# Figuras geométricas

## diagrama de clase

```mermaid
classDiagram
class Figuras
Figuras : +float areaTriangulo
Figuras : +float areaRectangulo
Figuras : +float areaPentagono
Figuras : +float areaHexagono
Figuras : +CalculoAreaTriangulo(float base, float altura) float
Figuras : +CalculoAreaRectangulo(float base, float altura) float
Figuras : +CalculoAreaPentagono(float perimetro, float apotema) float
Figuras: +CalucloAreaHexagono(float perimetro, float apotema) float
Figuras: +main(String[] args)
```