class Graph
{
    
    String[] knoten;
    int anzahlKnoten;
    int[][] kanten;

    Graph()
    {
        knoten = new String[20];
        kanten = new int[20][20];
        anzahlKnoten = 0;
    }
    
    boolean neuerKnoten(String bezeichnung) 
    {
        if (anzahlKnoten < 20) {
            int position = anzahlKnoten;
            knoten[position] = bezeichnung;
            
            anzahlKnoten++;
            return true;
        } else {
            return false;
        }
    }
    
    boolean neueKante(String knotenA, String knotenB, 
                      int wert) 
    {
        int a = knotenSuchen(knotenA);
        int b = knotenSuchen(knotenB);
    
        if (a > -1 && b > -1) {
            kanten[a][b] = wert;
            return true;
        }
        
        return false;
    }
    
    int kanteAusgeben(String knotenA, String knotenB) 
    {
        int a = knotenSuchen(knotenA);
        int b = knotenSuchen(knotenB);
    
        if (a > -1 && b > -1) {
            return kanten[a][b];
        } else {
            return -1;
        }
    }

    int knotenSuchen(String bezeichnung) 
    {
        for(int i = 0; i<anzahlKnoten; i++) {
            if (knoten[i].equals(bezeichnung)){
                return i;
            }
        }
        
        return -1;
    }
    
    void ausgeben()  {
        System.out.println("Adjazenzmatrix:");
        
        for (int x = 0; x < anzahlKnoten; x++) {
            for (int y = 0; y < anzahlKnoten; y++) {
                System.out.print(kanten[x][y]);
                System.out.print(",");
            }
            System.out.println();
        }
    }

}
