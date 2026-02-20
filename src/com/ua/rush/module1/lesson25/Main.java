package com.ua.rush.module1.lesson25;

//import com.itextpdf.kernel.pdf.*;

import java.io.ByteArrayOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {
//        ByteArrayInputStream is = new ByteArrayInputStream(new FileInputStream("test.txt").readAllBytes());
//
////        var data = is.readAllBytes();
////        System.out.println(new String(data));
//        System.out.println((char)is.read());
//        is.mark(4);
//        System.out.println((char)is.read());
//        System.out.println((char)is.read());
//        System.out.println((char)is.read());
//        System.out.println();
//        is.reset();
//        System.out.println((char)is.read());


//        BufferedImage originalImage = ImageIO.read(new File("p1.png"));
//        ByteArrayOutputStream os = new ByteArrayOutputStream();
//
//        ImageIO.write(originalImage, "jpg", os);
//
//        byte[] data = os.toByteArray();
//        System.out.println(data.length);
//
//        OutputStream os2 = new FileOutputStream("p2.jpg");
//        os2.write(data);'


//        ByteArrayOutputStream os = new ByteArrayOutputStream();
//        Document document = new Document();
//        PdfWriter writer = PdfWriter.getInstance(document, os);
//
//        document.open();
//        document.add(new Paragraph("Hello World"));
//        document.close();
//
//        Files.write(Paths.get("test.pdf"), os.toByteArray());

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(os);

        zos.putNextEntry(new ZipEntry("hello.txt"));
        zos.write("Hello World".getBytes());
        zos.closeEntry();
        zos.close();

        Files.write(Paths.get("test.zip"), os.toByteArray());




    }
}
