package de.thws.maven.klausurvorbereitung.fahrzeugSimulation;

import java.util.List;

public class main {
    public static void main(String[] args){
        List<Fahrzeug> fuhrpark = List.of(new Auto(), new Fahrrad(), new Elektroauto());

        fuhrpark.forEach(auto -> {
                    auto.fahre();
                    auto.tankstand();
        });

        Fahrzeug[] test = {new Auto(), new Elektroauto(), new Fahrrad()};
        fahrzeugeTesten(test);
    }

    public static void fahrzeugeTesten(Fahrzeug[] fs){
        for(Fahrzeug f : fs){
            f.fahre();
            f.tankstand();
        }
    }
}
