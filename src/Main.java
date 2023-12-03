public class Main {
    public static void main(String[] args) {
      //Scrivi un programma Java che dichiara una variabile intera chiamata
        // "numero" e le assegna il valore 10. Stampa il valore della variabile.

        int numero=10;
        System.out.println(numero);
        //Scrivi un programma Java che dichiara una variabile di tipo float chiamata "altezza"
        // e le assegna il valore 1.75. Stampa il valore della variabile.

        float altezza=1.75f;
        System.out.println(altezza);

        //Scrivi un programma Java che dichiara una variabile di tipo boolean chiamata
        // "isPieno" e le assegna il valore true. Stampa il valore della variabile.

        boolean isPieno=true;
        System.out.println(isPieno);


        //Scrivi un programma Java che dichiara una variabile di tipo char chiamata "lettera"
        // e le assegna il valore 'A'. Stampa il valore della variabile.


        char lettera='A';
        System.out.println(lettera);


        //Scrivi un programma Java che dichiara una variabile di tipo String chiamata
        // "nome" e le assegna il valore "Mario Rossi". Stampa il valore della variabile.

        String nome="Mario Rossi";
        System.out.println(nome);


        //Scrivi un programma Java che dichiara una variabile di tipo double chiamataù
        // "peso" e le assegna il valore 68.5. Stampa il valore della variabile.


        double peso=68.5;
        System.out.println(peso);



        //Scrivi un programma Java che dichiara due variabili intere chiamate "numero1" e "numero2" e
        // le assegna i valori 5 e 10 rispettivamente. Calcola la somma delle due variabili e
        // stampa il risultato.



        int numero1=5;
        int numero2=10;

        System.out.println(numero1 + numero2);


        //Scrivi un programma Java che dichiara una variabile di tipo long chiamata
        // "popolazioneMondiale" e le assegna il valore 7800000000. Stampa il valore della variabile.


        long popolazioneMondiale=7800000000L;

        System.out.println(popolazioneMondiale);

        //Scrivi un programma Java che dichiara una variabile di tipo byte chiamata
        // "eta" e le assegna il valore 25. Stampa il valore della variabile.


        byte eta=25;
        System.out.println(eta);

        //Scrivi un programma Java che dichiara una variabile di tipo intero chiamata "numero" e una variabile di tipo
        // double
        // chiamata "numeroDecimale". Esegui un cast della variabile "numero" in double e assegna il
        // valore risultante alla variabile "numeroDecimale". Stampa il valore della variabile "numeroDecimale".


         int numer=10;
         double numeroDecimale=(double) numer; //ecco come si fa un cast;
         System.out.println(numeroDecimale);

         //Scrivi un programma Java che dichiara una variabile di tipo double chiamata "numeroDecimale"
        // e una variabile di tipo int chiamata
        // "numeroIntero". Esegui un cast della variabile "numeroDecimale" in int e assegna il
        // valore risultante alla variabile "numeroIntero". Stampa il valore della variabile "numeroIntero"


        double numeroDecimal=12.5;
        int numeroIntero=(int) numeroDecimal;

        System.out.println(numeroIntero);

        //Scrivi un programma Java che dichiara una variabile di tipo int chiamata "numeroIntero"
        // e una variabile di tipo String chiamata "numeroStringa". Esegui un cast della variabile "numeroIntero"
        // in String e assegna il valore
        // risultante alla variabile "numeroStringa". Stampa il valore della variabile "numeroStringa".

        int numeroInter=26;
        String numeroStringa=String.valueOf(numeroInter);//per convertire un qualcosa a stringa si usa String.value0f;

        System.out.println(numeroStringa);

        //Scrivi un programma Java che dichiara una variabile di tipo String chiamata "numeroStringa"
        // e una variabile di tipo int chiamata "numeroIntero". Esegui un cast della variabile "numeroStringa"
        // in int e assegna
        // il valore risultante alla variabile "numeroIntero". Stampa il valore della variabile "numeroIntero".

        String numeroString="28308302";
        int numeroInte=Integer.parseInt(numeroString);//sistema per convertire da stringa a numero;

        System.out.println(numeroInte);

        //Scrivi un programma Java che dichiara una variabile di tipo double chiamata "numeroDecimale" e una variabile
        // di tipo int chiamata "numeroIntero". Esegui un cast della variabile "numeroDecimale" in int e assegna
        // il valore risultante alla variabile "numeroIntero". Stampa il valore della variabile "numeroIntero"

        double numeroDecima=10.99;
        int numeroInt=(int)numeroDecima;

        System.out.println(numeroInt);


        //Scrivi un programma Java che dichiara una variabile di tipo long chiamata "numeroLungo"
        // e una variabile di tipo int chiamata "numeroIntero". Esegui un cast della
        // variabile "numeroLungo" in int e assegna il valore risultante
        // alla variabile "numeroIntero". Stampa il valore della variabile "numeroIntero"


        long numeroLungo=82468726L;

        int numeroIn=(int) numeroLungo;

        System.out.println(numeroIn);


        //Scrivi un programma Java che dichiara una variabile di tipo float chiamata "numeroVirgola"
        // e una variabile di tipo double chiamata "numeroDecimale".
        // Esegui un cast della variabile "numeroVirgola" in double e assegna il valore risultante
        // alla variabile "numeroDecimale". Stampa il valore della variabile "numeroDecimale".


        float numeroVirgola=63468f;
        double numeroDe=(double) numeroVirgola;
        System.out.println(numeroDe);

        //Scrivi un programma Java che dichiara una variabile di tipo byte chiamata "numeroPiccolo"
        // e una variabile di
        // tipo int chiamata "numeroGrande". Esegui un cast della variabile "numeroPiccolo" in int e assegna
        // il valore
        // risultante alla variabile "numeroGrande". Stampa il valore della variabile "numeroGrande".


        byte numeroPiccolo=27;//se non ricordo male va -128/127;

        int numeroGrande=(int) numeroPiccolo;

        System.out.println(numeroGrande);

        //Scrivi un programma Java che dichiara una variabile di tipo double chiamata "numeroDecimale"
        // e una variabile
        // di tipo String chiamata "numeroStringa". Esegui un cast della variabile "numeroStringa"
        // in double e assegna
        // il valore risultante alla variabile "numeroDecimale". Stampa il valore della
        // variabile "numeroDecimale".

        double numeroD=12.2;
        String numeroStr=String.valueOf(numeroD);

        System.out.println(numeroStr);

        //Scrivi un programma Java che calcola la somma di due numeri interi e stampa il risultato.


        int num=23;
        int num2=27;
        int num3=num+num2;

        System.out.println(num3);


        //Scrivi un programma Java che calcola la differenza tra due numeri decimali e stampa il risultato.

        int n=254;
        int a=25;

        int differenza=n-a;

        System.out.println(differenza);


        //Scrivi un programma Java che calcola il prodotto di tre numeri interi e stampa il risultato.

        int nume=26;
        int nu=24;

        int prodotto=nume * nu;

        System.out.println(prodotto);

        //divisione;

        int divi=25;

        int sione=26;

        int divisione=divi / sione;

        System.out.println(divisione);



        //Scrivi un programma Java che calcola la potenza di un numero intero e stampa il risultato.


        double po=23;

        double tenza=25;

        double potenza=Math.pow(po,tenza);

        System.out.println(potenza); //per usare int bisogna fare il cast potenza=(int) Math.pow(po.tenza);

        //Scrivi un programma Java che calcola la radice quadrata di un numero decimale e stampa il risultato.


        double ra=Math.sqrt(27.8);
        System.out.println(ra);


        //Scrivi un programma Java che trova il valore massimo tra due numeri interi e stampa il risultato.


        int ma=25;

        int ssimo=258;

        int risultato=Math.max(ma,ssimo);

        System.out.println(risultato);



        //Scrivi un programma Java che trova il valore minimo tra tre numeri decimali e stampa il risultato



        int m=23;
        int inimo=24;

        int minimo=Math.min(m,inimo);

        System.out.println(minimo);


        //Scrivi un programma Java che genera un numero casuale compreso tra 1 e 100 e stampa il risultato.

        int numo=(int) (Math.random() * 100) + 1;//per generare un numero casuale da uno a cento;

        System.out.println(numo);





















    }
}