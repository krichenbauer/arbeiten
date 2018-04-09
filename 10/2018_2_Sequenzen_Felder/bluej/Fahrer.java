class Fahrer
{
    SBahn bahn;
    
    Fahrer(SBahn b)
    {
        bahn = b;
    }

    void losFahren() {
        bahn.tuerenSchliessen();
        bahn.geschwindigkeitSetzen(80);
    }

}
