package no.olai;

import java.io.File;

public class DirectorySize {
    public static void main(String[] args) {

        String directory = "D:\\Java IntelliJ tredjeAAr\\PearsonLiang";


        System.out.println(getSize(new File(directory)) + " bytes");
        System.out.println(getSize(new File(directory)) / 1000 + " KB");

    }

    public static long getSize(File file) {
        long size = 0;

        if (file.isDirectory()) {
            File[] files = file.listFiles(); // All files and subdirectories
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSize(files[i]); // Recursive call
            }
        }
        else { // Base case
            size += file.length();
        }

        return size;
    }
}
