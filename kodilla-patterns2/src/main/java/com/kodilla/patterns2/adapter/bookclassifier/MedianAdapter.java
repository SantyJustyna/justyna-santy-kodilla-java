package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();
        Book[] bookArray = bookSet.toArray(new Book[bookSet.size()]);
        for (int n = 0; n < bookArray.length; n++) {
            books.put(new BookSignature(bookArray[n].getSignature()),
                    new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(bookArray[n].getAuthor(),
                            bookArray[n].getTitle(), bookArray[n].getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
