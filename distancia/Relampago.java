/*
Calculando a distância de um ouvindo para o local de queda de um relâmpago, com base em velocidade do som e intervalo entre o momento de ter visto o relâmpago e o momento da escuta do mesmo predefinidos.
 */

package distancia;

class Relampago {
    public static void main(String[] args) {
        int VelocidadeSom = 1100;
        double IntervaloRelampago = 7.2;
        double DistanciaTotal = VelocidadeSom * IntervaloRelampago;

        System.out.println("Distância do ouvinte para o local de queda do relâmpago é de " + DistanciaTotal + " pés");
    }
}
