public class BuenoMax20211123Enu7b {
    public static void main(String[] args) throws Exception {
        char majuscula=65;   
        char minsuscula=97;
        char[] arrayMinus=new char[26];  //Definim l'array de les majuscules i el de les minuscules
        char[] arrayMajus=new char[26];  //amb 26 posicions ja que hi ha 26 lletres al abecedari

        //Aqui s'entren les dades de la a-z i de la A-Z
        for (int i = 0; i < arrayMajus.length; i++) {
            arrayMajus[i]=majuscula;
            majuscula++;
            arrayMinus[i]=minsuscula;
            minsuscula++;
        }

        //Mostro les dades que te l'array de minuscules
        for (int i = 0; i < arrayMinus.length; i++) {
            System.out.print(arrayMinus[i]);
            System.out.print(" ");
        }

        //Mostro les dades que te l'array de majuscules
        for (int i = 0; i < arrayMajus.length; i++) {
            System.out.print(arrayMajus[i]);
            System.out.print(" ");
        }









    }
    
}
