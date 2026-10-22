package FactoryAdapterFacade;

public class AnimalFactory {
    public static Animal getAnimal(String tipo) {
        if (tipo == null) {
            return null;
        }

        if (tipo.equalsIgnoreCase("Cachorro")) {
            return new Cachorro();
        }

        if (tipo.equalsIgnoreCase("Gato")){
            return new Gato();
        }

        throw new IllegalArgumentException("Animal inexistente!");
    }
}