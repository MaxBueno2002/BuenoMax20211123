
public class BuenoMax20211123Enu7a {
    public static void main(String[] args) throws Exception {
        char majusculas=65;     //Aqui definim el caracter de majuscula a 65, perque segons el codi ASCII la A majuscula esta a la posicio 65.

        char minsusculas=97;    //Aqui definim el caracter de minuscula a 97 ja que segons el codi ASCII la a minuscula esta en la posicio 97.


        char[] arrayMinus=new char[26];  //Definim l'array de les majuscules i el de les minuscules.

        char[] arrayMajus=new char[26];  //amb 26 posicions ja que hi ha 26 lletres al abecedari catalá.

        //Aqui s'entren les dades de la a-z i de la A-Z
        for (int i = 0; i < arrayMajus.length; i++) {
            arrayMajus[i]=majusculas;
            majusculas++;
            arrayMinus[i]=minsusculas;
            minsusculas++;
        }

        //Mostro totes les dades en ordre que te l'array de minuscules
        for (int i = 0; i < arrayMinus.length; i++) {
            System.out.print(arrayMinus[i]);
            System.out.print(" ");
        }

        //Mostro totes les dades en ordre que te l'array de majuscules
        for (int i = 0; i < arrayMajus.length; i++) {
            System.out.print(arrayMajus[i]);
            System.out.print(" ");
        }
        


    }
    
}
