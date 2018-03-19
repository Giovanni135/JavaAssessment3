package parsing_json;

import java.util.ArrayList;

public class Element {
    public Element(String hydrogen, String colorless_gas, double v, double v1, String diatomic_nonmetal, String colorless, double v2, String henry_cavendish, double v3, double v4,
                   String antoine_lavoisier, int i, int i1, String gas, String s, String s1, String s2, String h, int i2, int i3, ArrayList<Integer> integers) {
    }

    public String getName() {
        return "Hydrogen";
    }

    public String getAppearance() {
        return "colorless gas";
    }

    public double getAtomic_mass() {
        return 1.008;
    }

    public double getBoil() {
        return 20.271;
    }

    public String getCategory() {
        return "diatomic nonmetal";
    }

    public String getColor() {
        return "colorless";
    }

    public double getDensity() {
        return 0.08988;
    }

    public String getDiscovered_by() {
        return "Henry Cavendish";
    }

    public double getMelt() {
        return 13.99;
    }

    public double getMolar_heat() {
        return 28.836;
    }

    public String getNamed_by() {
        return "Antoine Lavoisier";
    }

    public int getNumber() {
        return 1;
    }

    public int getPeriod() {
        return 1;
    }

    public String getPhase() {
        return "Gas";
    }

    public String getSource() {
        return "https://en.wikipedia.org/wiki/Hydrogen";
    }

    public String getSpectral_img() {
        return "https://en.wikipedia.org/wiki/File:Hydrogen_Spectra.jpg";
    }

    public String getSymbol() {
        return "H";
    }

    public String getSummary() {
        return "Hydrogen is a chemical element with chemical symbol H and atomic number 1. With an atomic weight of 1.00794 u, hydrogen is the lightest element on the periodic table. " +
                "Its monatomic form (H) is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.";
    }

    public int getXpos() {
        return 1;
    }

    public int getYpos() {
        return 1;
    }

    public ArrayList<Integer> getShells() {
        return null;
    }
}