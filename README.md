# produttori-consumatori-pre-verifica-
Creare un programma GUI che simula lo scenario seguente:
ci sono 2 produttori che producono cibi ( panini, pizze, patatine -> gestite tramite ereditarietà / polimorfismo ) per 20 secondi, e li mettono su un tavolo condiviso.
ci sono 5 consumatori che mangiano i cibi messi sul tavolo.

i produttori produrranno 1 cibo random ( panini, pizze, patatine ) alla volta, velocemente ( il tempo cambia in base al tipo di prodotto creato, scegli te il tempo che ritieni opportuno ) ; 
i consumatori mangeranno 1 cibo random, preso dal tavolo, alla volta lentamente ( il tempo cambia in base al tipo di prodotto mangiato,  scegli te il tempo che ritieni opportuno) .

Ogni cibo generato deve avere un ID univoco.



Il programma finirà quando i produttori termineranno di produrre ( dopo 20 secondi )    E     dopo che i consumatori finiranno tutto il cibo sul tavolo.

Alla fine del programma visualizzare un riepilogo che evidenzia:

-per ogni produttore
  1)quanti e quali cibi ha prodotto
  2)la lista degli ID dei cibi prodotti
-per ogni consumatore
  1)quanti e quali cibi ha mangiato
  2)la lista degli ID dei cibi mangiati
