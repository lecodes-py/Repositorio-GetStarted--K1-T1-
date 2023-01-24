public class Arrays {
    public static void main (String[] args){
        //Declarando uma variável do tipo array
        String [] values = new String [25];
        //Atribuindo valores para a variável
        values [0] = "Letícia";
        values [10] = "Emmanuel";
        values [24] = "Marinete";
        //Imprimindo dados (e testando a vazia)
        System.out.println(values[0]);
        System.out.println(values[10]);
        System.out.println(values[1]);
        //Desafio do curso
        String [] words = new String[] {"My","Name", "is"};
        System.out.println(words[2]);
        //Declarando outro array com a variável words
        words = new String [10];
        System.out.println(words[3]);
    }
}
