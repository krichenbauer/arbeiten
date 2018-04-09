class SBahn
{   Tuer tueren[];
    double geschwindigkeit;
    SBahn()
    {
        tueren = new Tuer[24];
        for (int i = 0; i < 24; i++) {
            tueren[i] = new Tuer();
        }
        geschwindigkeit = 0.0;
    }
    void tuerenSchliessen() {
        for (int i = 0; i < 24; i++) {
            tueren[i].schliessen();
        }
    }
    void geschwindigkeitSetzen(double v) {
        geschwindigkeit = v;
    }
}
