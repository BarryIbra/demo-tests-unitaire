package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    void testLevenshteinDistance() {
        assertEquals(1,StringUtils.levenshteinDistance("chat", "chats") );
        assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));
        assertEquals(2, StringUtils.levenshteinDistance("Viennes", "Sienne"));
        assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));

    }

    @Test
    void testLevenshteinDistanceValeursNull(){
        assertEquals(5,StringUtils.levenshteinDistance("", "chats") );
        assertEquals(7, StringUtils.levenshteinDistance("machins", null));
    }

}
