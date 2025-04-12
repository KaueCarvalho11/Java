package conversao;

public class PolegadaToMetro {
    public static void main(String[] args) {
      double polegada = 0;
      int contador = 0;

      for(polegada = 0; polegada <= 144; polegada ++){
        System.out.println(polegada + " polegadas equivalem a " + polegada * 0.0254 + " metros");
        
        contador++;

        if (contador == 12) {
            System.out.println(""); 
            contador = 0;     
        }
      }
    }
}
