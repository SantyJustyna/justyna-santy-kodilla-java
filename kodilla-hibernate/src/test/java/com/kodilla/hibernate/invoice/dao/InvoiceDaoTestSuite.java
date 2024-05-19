package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){

        //Given
        Item item1 = new Item(new BigDecimal(10), 2, new BigDecimal(20));
        Item item2 = new Item(new BigDecimal(20), 3, new BigDecimal(60));
        Item item3 = new Item(new BigDecimal(15), 2, new BigDecimal(30));
        item1.setProduct(new Product("apple"));
        item2.setProduct(new Product("strawberry"));
        item3.setProduct(new Product("banana"));
        Invoice invoice = new Invoice("2024/02/12_9876");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceID = invoice.getId();

        //Then
        assertNotEquals(0, invoiceID);

        //CleanUp
        invoiceDao.deleteById(invoiceID);

    }
}
