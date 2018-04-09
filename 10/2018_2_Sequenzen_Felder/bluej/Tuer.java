class Tuer
{
    String zustand;
    Tuer()
    { 
        zustand = "geschlossen"; 
    }
    String zustandGeben() {
        return zustand;
    }
    void oeffnen() {
        zustand = "offen";
    }
    void schliessen() {
        zustand = "geschlossen";
    }
}
