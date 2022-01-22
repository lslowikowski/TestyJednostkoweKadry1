package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracownikTest {

    @Test
    void poprawneNazwisko() {
        Pracownik pracownik = new Pracownik("Testowy12_Testowy12_Testowy12_Testowy12_Testowy12_abc", "Jan", 10, 100, 10);
        Assertions.assertEquals("Testowy12_Testowy12_Testowy12_Testowy12_Testowy12_", pracownik.getNazwisko());
    }

    @Test
    void poprawneImie() {
        Pracownik pracownik = new Pracownik("Testowy", "Melchior1_Melchior2_abc", 10, 100, 10);
        Assertions.assertEquals("Melchior1_Melchior2_", pracownik.getImie());
    }

    @Test
    void poprawnaStaz() {
        Pracownik pracownik = new Pracownik("Testowy", "Jan", 10, 100, 10);
        pracownik.setStaz(-1);
        Assertions.assertEquals(0, pracownik.getStaz());
        pracownik.setStaz(60);
        Assertions.assertEquals(55, pracownik.getStaz());
    }

    @Test
    void poprawneGodziny() {
        Pracownik pracownik = new Pracownik("Testowy", "Jan", 10, 100, 10);
        pracownik.setGodziny(-10);
        Assertions.assertEquals(0, pracownik.getGodziny());
        pracownik.setGodziny(330);
        Assertions.assertEquals(320, pracownik.getGodziny());
    }

    @Test
    void poprawnyKonstruktor() {
        Pracownik pracownik = new Pracownik("Testowy12_Testowy12_Testowy12_Testowy12_Testowy12_abc",
                "Melchior1_Melchior2_abc",
                10, 350, -10);
        Assertions.assertEquals("Testowy12_Testowy12_Testowy12_Testowy12_Testowy12_", pracownik.getNazwisko());
        Assertions.assertEquals("Melchior1_Melchior2_", pracownik.getImie());
        Assertions.assertEquals(320, pracownik.getGodziny());
        Assertions.assertEquals(0, pracownik.getStaz());
    }

    @Test
    void poprawneObliczaniePodstawy() {
        Pracownik pracownik = new Pracownik("Testowy", "Jan", 10, 100, 10);
        Assertions.assertEquals(1000, pracownik.obliczPodstawe());
    }

    @Test
    void poprawneObliczanieDodatku() {
        Pracownik pracownik = new Pracownik("Testowy", "Jan", 10, 100, 10);
        Assertions.assertEquals(500, pracownik.obliczDodatek() );
    }

    @Test
    void poprawneObliczenieWynagrodzenia() {
        Pracownik pracownik = new Pracownik("Testowy", "Jan", 10, 100, 10);
        Assertions.assertEquals(1500, pracownik.obliczWynagrodzenie());
    }

    @Test
    void poprawnyToString() {
        Pracownik pracownik = new Pracownik("Testowy", "Jan", 10, 100, 10);
        Assertions.assertEquals("Pracownik: Testowy Jan 1000.0 + 500.0 = 1500.0", pracownik.toString());

    }
}