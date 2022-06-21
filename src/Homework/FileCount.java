package Homework;

import java.io.File;

public class FileCount {

    public static void main(String[] args) {

        String Folder="/Users/patryklesiak/IdeaProjects/CP_summer_2022_master/CP_Summer_2022-master/src";
        System.out.println("Your Folder is : "+Folder);

        File f = new File(Folder);

        int countFiles = 0;
        int countFolder = 0;
        for (File file : f.listFiles()) {
            if (file.isFile()) {
                countFiles++;
            }
            if (file.isDirectory()) {
                countFolder++;
            }

        }
        System.out.println("Number of files in Folder: " + countFiles+"\nNumber of Sub-folders: "+countFolder+"\nFolder size is: "+f.length()+" B");

    }

}