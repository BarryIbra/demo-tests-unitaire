package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class SaisonTest {
     @Test
    void testValueOfLibelleNominalCases() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
    }

     @Test
    void testValueOfLibelleInvalidLibelle() {
        assertNull(Saison.valueOfLibelle("Inconnu"), "Un libellé inexistant devrait retourner null");
    }

    @Test
    void testValueOfLibelleNull() {
        assertNull(Saison.valueOfLibelle(null), "Un libellé null devrait retourner null");
    }
}
