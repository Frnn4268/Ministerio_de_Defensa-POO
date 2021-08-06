package Packacge_Soldado;

public class Infanteria implements Cuerpo_Ejercito{

    @Override
    public void Codigo() {
        System.out.println("002");
    }

    @Override
    public void Tipo() {
        System.out.println("Tipo: Infantería");
    }
}