package com.ua.rush.module3.lesson16.decorator;

import com.itextpdf.text.pdf.PdfPRow;

public abstract class CoffeDecorator implements Coffe {

    protected Coffe coffe;

    protected CoffeDecorator(Coffe coffe) {
        this.coffe = coffe;
    }

}
