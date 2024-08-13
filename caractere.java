ALGORITHME Caractere
VAR
    longueur: ENTIER := 0;
    n: ENTIER;
    nombreMots: ENTIER := 0;
    nombreVoyelles: ENTIER := 0;
    dansMot: BOOLEEN := FAUX;
    voyelles: CHAINE := "aeiouAEIOU";
    i: ENTIER := 1;   // Initialisation de i à 1
    phrase: CHAINE;
    carac: CARACTERE;
DEBUT
    Lire(phrase)
    n := longueur(phrase);
    
    POUR i DE 1 A n FAIRE
        carac := phrase[i-1];  

        SI carac = '.' ALORS
            SORTIR;  
        FIN_SI
        
        longueur := longueur + 1;
        
        SI position(carac, voyelles) > 0 ALORS  // Vérification si le caractère est dans les voyelles
            nombreVoyelles := nombreVoyelles + 1;
        FIN_SI
        
        SI carac != ' ' ET NON dansMot ALORS  // Vérification que l'on entre dans un mot
            nombreMots := nombreMots + 1;
            dansMot := VRAI;
        SINON SI carac = ' ' ALORS
            dansMot := FAUX;
        FIN_SI
    FIN_POUR
    // Affichage de la longueur,  nombres de Mots et Voyelles 
    Ecrire("Longueur: ", longueur)
    Ecrire("Nombre de mots: ", nombreMots)
    Ecrire("Nombre de voyelles: ", nombreVoyelles)
FIN
