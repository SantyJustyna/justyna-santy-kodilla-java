package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Siembieda", "Katharsis", 2020, "yy"));
        bookSet.add(new Book("Myśliwski", "Traktat...", 2007, "xx"));
        bookSet.add(new Book("Myśliwski", "Widnokrąg", 1997, "zz"));
        bookSet.add(new Book("Malaparte", "Kaputt", 1944, "ee"));
        bookSet.add(new Book("Siembieda", "Gambit", 2010, "uu"));


        //When
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2007, median);

    }
}
