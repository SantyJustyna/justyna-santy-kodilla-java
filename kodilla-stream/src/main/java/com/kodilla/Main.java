package com.kodilla;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class Main {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Poem about Java", (text)->text.toUpperCase());
        poemBeautifier.beautify("Java Java Poem", (text)->text.toLowerCase());
        poemBeautifier.beautify("Poem about Java", (text)->text.replace('P', 't'));
        poemBeautifier.beautify("Another Java poem", (text)->"ABC" + text);
        poemBeautifier.beautify("Poem about Java", (text)->text.substring(6));
        poemBeautifier.beautify("Poem poem poem", (text)->text.replaceFirst("po", "Blabla"));



    }
}