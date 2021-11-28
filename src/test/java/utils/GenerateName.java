package utils;

public class GenerateName {
    public static String getRandomName() {
        int quantidadeDeSilabasNome;
        quantidadeDeSilabasNome = getRandomIntInclusive(4, 4);

        String nome = "";

        for (int contadorSilaba = 1; contadorSilaba < quantidadeDeSilabasNome; contadorSilaba++) {
            nome = nome + getConsoanteAleatorio() + getVogalAleatorio();
        }
        return nome;
    }

    private static int getRandomIntInclusive(int minimo, int maximo) {
        minimo = (int) Math.ceil(minimo);
        maximo = (int) Math.ceil(maximo);
        return (int) (Math.floor(Math.random() * (maximo - minimo + 1)) + minimo);

    }

    private static String getVogalAleatorio() {
        String listaVogais = "aeiou";
        int numeroAleatorio;
        numeroAleatorio = (int) getRandomIntInclusive(1, 5);
        return listaVogais.substring(numeroAleatorio - 1, numeroAleatorio);

    }

    private static String getConsoanteAleatorio() {
        String listaConsoantes = "bcdfghjklmnprstwyz";
        int numeroAleatorio;
        numeroAleatorio = getRandomIntInclusive(1, 19);

        return listaConsoantes.substring(numeroAleatorio - 1, numeroAleatorio);
    }
}
