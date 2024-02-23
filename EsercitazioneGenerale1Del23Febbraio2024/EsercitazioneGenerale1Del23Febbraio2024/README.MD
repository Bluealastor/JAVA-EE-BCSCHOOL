## Esercitazione del 23/02/2024:
### A – Rispondi alle seguenti domande argomentando la risposta:
+ 1) Cos’è un linguaggio di programmazione?
  + Un linguaggio di programmazione permette a chi lo usa di interagire con i computer, permette di eseguire dei compiti attraverso le informazioni fornite tramite linguaggio. Principalemnte i linguaggi si dividono in 2 categorie 
    + basso livello: è quel linguaggio che si avvicina al linguaggio macchina ed è più veloce ad essere seguito perchè non ha bisogno di un compilatore
    + alto livello: è un linguaggio facile da capire per l'uomo essendo che usa parole conosciute dall'uomo ma più lento perchè ha bisogno di essere trasformato in linguaggio macchina attraverso un compilatore

+ 2) Definisci il linguaggio Java.
  + il linguaggio java è un linguaggio di alto livello, il linguaggio si basa sull'idea di: 
    + OOP: programmazione ad oggetti, facilità la creazione e la mantenibilità del codice;
    + gestione della memoria: ha integrato una gestione automatica della memoria
    + versatilità: permette di eseguire in contemporanea diversi attività

+ 3) Cos’è un linguaggio orientato agli oggetti?
  + un linguaggio orientato ad oggetti è un linguaggio che si  avvicina al modo di pensare delle persone, bisogna astrarre la realtà avvicinando i dati al linguaggio di programmazione

+ 4) Quali sono le caratteristiche principali di Java.
  + Programmazione orientata agli oggetti
  + Gestione della memoria
  + Sicurezza
  + Versatilità

+ 5) Cos’è una variabile?
  + sono spazi di memoria usati per memorizzare dei valori

+ 6) Che differenza c’è tra un linguaggio compilato ed interpretato.
  + basso livello: è quel linguaggio che si avvicina al linguaggio macchina ed è più veloce ad essere seguito perchè non ha bisogno di un compilatore per essere interpretato
  + alto livello: è un linguaggio facile da capire per l'uomo essendo che usa parole conosciute ma più lento perchè ha bisogno di essere trasformato in linguaggio macchina attraverso un compilatore

+ 7) Come si aggiunge un commento nel linguaggio Java?
  + i commenti in java servono per aggiungere codice o commenti che non vogliamo far interpretare al compilatore o alla macchina
    per aggiugere dei commenti in java abbiamo diversi modi:
    + il metodo one line // permette di commentare una singola riga di codice 
    + il metodo multi line /* */  permette di commentare più righe contemporaneamente basta che si ritrovano all'interno dei simboli
    + il terzo metodo multi line comment /** */ si distingue dal multi line per un asterisco in più all'inizio e permette attraverso un command in console di poter creare documentazione java in formato HTML

+ 8) Che cos’è un oggetto?
  + in Java è un'istanza di una classe e rappresenta un entità con caratteristiche e comportamenti ed é composto da dati, come attributi, e da metodi, che definiscono le azioni

+ 9) Che cos’è una classe?
  + Una classe consente di definire un insieme di attributi che sono le informazioni per rappresentare ogni istanza di una classe.

+ 10) Quali sono gli operatori di confronto?
  + gli operatori di confronto conosciuti anche come operatori booleani perchè restituiscono un valore booleano true o false

+ 11) Cosa si intende per istanza?
  + un'istanza è un oggetto che viene creato a partire da una classe. Ha le sue variabili e metodi e condivide la struttura e il comportamento definiti dalla classe.

+ 12) Cos’è un attributo?
  + per attributo si intendono i valori che possiede un oggetto come: colore, nome, grandezza, numero. sono tutti quei valori che permettono di attribuire ad un oggetto le sue caratteristiche 

+ 13) Cosa sono JDK, JRE, JVM e a cosa servono?
  + JDK o Java Development Kit: è l'ambiente di sviluppo di java è un pacchetto da scaricare per poter creare un ambiente di sviluppo java
  + JRE o Java Runtime Environment: è l'insieme di JDK e JVM e serve per poter eseguire il linguagguio java su qualsiasi sistema operativo
  + JVM o Java Virtual Machine: rende possibile l’esecuzione in qualsiasi piattaforma 


+ 14) La sigla IDE cosa rappresenta?
  + IDE o Integrated Development Environment: è il software utilizzato per sviluppare programmi con i linguaggi di programmazione in cui al suo interno integra vari strumenti per lo sviluppo di un programma

+ 15) A cosa servono le librerie?
  + Una libreria è un set di funzioni organizzati con l' obiettivo di fornire del codice riusabile all’interno di un progetto

+ 16) Cos’è un metodo e a cosa serve? Qual è la firma di un metodo?
  + Un metodo è un istruzione da far eseguire a java e definiscono il comportamento di una classe.
   È la combinazione del nome e dell'elenco dei parametri.

+ 17) Definisci la differenza tra un metodo statico e un metodo d’istanza.
  + i metodi statici: appartengono solo alla classe. infatti se deve essere utilizzati viengono invocato sulla classe.
  + i metodi di istanza: sono operazioni che faccio con gli oggetti 

+ 18) Che cos’è un costruttore?
  + E' un metodo con lo stesso nome della classe a cui appartiene, permette di inizializzare una istanza della classe. Di default se non creiamo noi un costruttore java ne crea uno in automatico vuoto(non parametrizzato) che ci permetterà di poter istanziare un oggetto della classe senza creare problemi, come best practice per la creazione di una classe dobbiamo creare dei costruttori noi sia vuoto che parametrizzati

+ 19) A cosa serve l’operatore new?
  + l'operatore new permette di creare un istanza di una classe è servirà ad invocare il costruttore della classe

+ 20) Cos’è un package e a cosa serve?
  + un package è una cartella dove ragruppiamo classi o file.

+ 21) Descrivi i tipi di dato primitivi che conosci.
  + Un dato primitivo è predefinito dal linguaggio e prende il nome da una parola chiave: e sono 8:
    + Tipi interi: int, short, byte, long ---> accettano solo numeri interi si differenziano per la quantita di dati che possono memorrizare(la grandezza del numero)
    + tipi booleani: boolean ---> accettano solo 2 parametri true o false
    + tipi floatting: float e double ---> accettano numeri con la virgola e anche loro si differenziano per la quantita di dati che possono memorizzare
    + tipi testuale: char ---> si differenziano con gli altri perchè accettano un solo carattere per volta e bisogna utilizzare le appendici singole 'c'

+ 22) Cosa sono i reference?
  + le reference sono i nomi che diamo alle istanze che abbiamo creiato di una classe con il new. noi creiamo uno spazio di memoria per poter permettere a java di poter immagazzinare le informazioni di quell'oggetto

+ 23) Cosa si intende con indentazione? Perché è importante?
  + Per iddentazione si intende il metodo di scrittura del codice ed è molto importante per poter rendre leggibile il codice ad altri programmatori, un lingiuaggio che ha reso molto importante l'identazione per la scrittura del prorpio codice è Python

+ 24) Come avviene in Java il passaggio di parametri?
  + il passaggio di parametri in java avviene per reference ovvero java passa il riferimento del dato ad una nuova variabile
  infatti per poter creare una copia del dato dobbiamo creare una funzione che permetta di copiare il dato

+ 25) Descrivi l’utilizzo della parola this.
  + la parola this viene utilizzata all'interno di una classe per poter aiutare la creazione di metodi o costruttori
  che al loro interno accettano dei parametri con lo stesso nome dei parametri della classe

+ 26) Cosa sono le Stringhe in Java?
  + le stringhe in java non sono dati primitivi, infatti sono una sequenza di caratteri che rappresentano un testo

+ 27) Cos’è un blocco di codice?
  + il blocco codice si riferisce a tutte le istruzioni che noi scriviamo all'interno delle parentesi graffe {blocco codice}

+ 28) Quali strutture di controllo conosci? Descrivile e fai un esempio.
  + sono costrutti del linguaggio utilizzati per controllare il flusso di esecuzione del programma e sono:
    + controlli condizionali: if- else- else if --> che permettono di eseguire o saltare parti di codice, queste condizioni vengono determinati in precedenza da operatori di confronto inserito all'interno delle parentesi tonde
    + iterazioni: for- while- do while  --> permettono di eseguire il codice più volte scrivendolo 1 sola volta
    + switch e case: permette di eseguire o saltare il codice basandosi su dei valori

+ 29) Spiega l’utilizzo dell’operatore ternario.
  + l'operatore ternario è una variante di scrittura di if else ed è utilizzato per semplificare la scrittura per del codice scritto one line
  infatti sostituisce if else con punto interogativo ? dove prima di questo punto va scritto la condizione, e da i due punti : che separano le due condizioni  condizione da soddisfare ? condizione1 : condizione2

+ 30) Qual è la funzione di break? E di continue?
  + sono parole chiave utilizzate per influenzare il flusso di esecuzione del programma
    + break viene utilizzato per interrompere l'esecuzione del codice
    + continue viene utilizzato per saltare un interazione all'interno dei cicli


B – Esercizi Java
1) Scrivere una classe che abbia un metodo main e altri 4 metodi: uno per la somma, uno per la
sottrazione, uno per la moltiplicazione e uno per la divisione tra due numeri.
Ognuno di questi metodi deve restituire il risultato dell’operazione.
Inserire nel main delle stampe dei risultati come esempio.
2) Crea una classe Java che stampi a schermo i numeri pari da 1 a 14. Utilizza sia un ciclo while, sia
un ciclo for.
3) Creare una classe Java che stampi a schermo i numeri dispari da 14 a -3. Utilizza sia un while che
un ciclo for.
4) Creare una classe Java che stampi a schermo le tabelline dei numeri da 1 a 10.
Es.: 1*1 = 1, 1*2 = 2, …
2*1 = 2, 2*2 = 4, …
…
5) Creare una classe Media con il metodo main che stampi a schermo il calcolo della media tra 3
numeri, chiamando un metodo apposito.
6) Creare una classe Cerchio con una variabile di classe final chiamata PI_GRECO e che valga 3,14.
Questa classe deve avere un metodo main con una variabile chiamata raggio che abbia un valore
scelto dal programmatore e che stampi a schermo la circonferenza e l’area del cerchio. La classe
deve avere un metodo che calcoli la circonferenza ed un altro metodo che calcoli l’area del
cerchio.
7) Creare una classe Java che chieda all’utente quanti elementi intende inserire, e poi acquisisca in
input quel numero di elementi, che saranno numeri interi. Una volta fatto questo, si chieda
all’utente di scegliere un indice dell’array. Si scambi di posto il massimo tra gli elementi
dell’array e l’elemento con l’indice deciso dall’utente, scrivendo anche un messaggio quando le
due posizioni coincidono.
8) Creare una classe Java che rappresenti una automobile. Dotarla degli attributi che si reputino
necessari, applicando il principio dell’incapsulamento. Dotare l’automobile dei metodi necessari
per eseguire le seguenti azioni:
a. Mostrare i litri di carburante rimasto
b. Mostrare i chilometri percorsi
c. Simulare un viaggio (percorrere quindi un certo quantitativo di km e diminuire il livello
di carburante nel serbatoio). Consiglio: potrebbe essere utile inserire un attributo che
indichi il consumo per chilometri percorso
d. Rifornire il serbatoio dell’auto di un quantitativo in litri
9) Creare una classe di test con un metodo main. Creare almeno due istanze della classe
Automobile dell’esercizio 8) e mostrare qualche esempio.