package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaisonTest {

   private Maison maison=new Maison();

    @Test
    void testAjouterPiece() {
        
        assertEquals(0, maison.nbPieces());
        assertEquals(0, maison.calculerSurface());
        maison.ajouterPiece(new Salon(1, 30));
        assertEquals(1, maison.nbPieces());
        maison.ajouterPiece(new SalleDeBain(1, 12));
        assertEquals(2, maison.getPieces().length);
       
    }

    @Test
    void testAjouterPieceNull(){
        maison.ajouterPiece(null);
        assertEquals(0, maison.nbPieces());


    }


    @Test
    void testCalculerSurface() {
        maison.ajouterPiece(new Salon(0, 25));
        maison.ajouterPiece(new SalleDeBain(1, 15));
        assertEquals(40, maison.calculerSurface());

    }

    @Test
    void testSuperficieEtage() {
        maison.ajouterPiece(new Salon(0, 25));
        maison.ajouterPiece(new Chambre(0, 15));
        maison.ajouterPiece(new SalleDeBain(1, 10));
        assertEquals(40, maison.superficieEtage(0)); 
        assertEquals(10, maison.superficieEtage(1)); 
        assertEquals(0, maison.superficieEtage(2));

    }

    @Test
    void testSuperficieTypePiece() {
        maison.ajouterPiece(new Salon(0, 25));
        maison.ajouterPiece(new Salon(1, 30));
        maison.ajouterPiece(new Chambre(1, 15));
        assertEquals(55, maison.superficieTypePiece("Salon")); 
        assertEquals(15, maison.superficieTypePiece("Chambre")); 
        assertEquals(0, maison.superficieTypePiece("Cuisine"));

    }

    @Test
    void testSuperficieTypePieceNullType() {
        maison.ajouterPiece(new Salon(0, 25));
        assertEquals(0, maison.superficieTypePiece(null));
    }

}
