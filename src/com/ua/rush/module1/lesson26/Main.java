package com.ua.rush.module1.lesson26;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static final int CAPACITY = 1024;

    public static void main(String[] args) throws Exception {
//        FileInputStream is = new FileInputStream("test.txt");
//        FileChannel channel = is.getChannel();
//        ByteBuffer buffer = ByteBuffer.allocate(1024);
//
//        while (channel.read(buffer) > 0) {
//            buffer.flip();
//            while (buffer.hasRemaining()) {
//                System.out.print((char) buffer.get());
//            }
//            buffer.clear();
//        }

//        FileOutputStream os = new FileOutputStream("test_buffer.txt");
//        String text = """
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                Hello World with buffer\n
//                """;
//        // System.out.println(text.getBytes().length);
//        var bytes = text.getBytes();
//        FileChannel channel = os.getChannel();
//        ByteBuffer buffer = ByteBuffer.allocate(CAPACITY);
//        for (int i = 0; i < bytes.length; i += CAPACITY) {
//            int remaining = Math.min(CAPACITY, bytes.length - i);
//
//            // allocate only as many bytes as we really have left
//            byte[] chunk = new byte[remaining];
//            System.arraycopy(bytes, i, chunk, 0, remaining);
//
//            // now you can put to buffer / write to channel
//            buffer.put(chunk);
//            buffer.flip();
//            channel.write(buffer);
//            buffer.clear();
//        }
////        buffer.flip();
////        channel.write(buffer);
//        channel.close();
//        os.close();

//
//        Path path = Paths.get("test.txt");
//        System.out.println(path.getFileSystem());
//        System.out.println(path.getFileName());
//        System.out.println(path.getParent());
//        System.out.println(path.getRoot());
//        System.out.println(path.toAbsolutePath());
//        System.out.println(path.normalize());
//
//        Path pathToMove = Paths.get("testNew.txt");

//        Files.move(path, pathToMove);

        Path p = Paths.get("testDir");
        System.out.println(Files.exists(p));
        System.out.println(Files.isDirectory(p));
        System.out.println(Files.isExecutable(p));
        System.out.println(Files.isHidden(p));
        Files.setAttribute(p, "dos:hidden", false);
        System.out.println(Files.isHidden(p));
//        System.out.println(Files.);

        Path p2 = Paths.get("testNew.txt");
        List<String> strings = Files.readAllLines(p2);
        System.out.println(strings);
        Files.write(Paths.get("t3.txt"), strings);
        var p3 = Paths.get("src", "com", "ua", "rush", "lesson26", "Main.java");
        Paths.get("src\\com\\ua\\rush\\lesson26\\Main.java");
        System.out.println(p3.toAbsolutePath());

    }


}
