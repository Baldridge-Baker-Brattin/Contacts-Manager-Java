//import java.io.*;
//import java.nio.file.*;
//import java.util.*;
//
//public class Input {
//
//    public static void deleteContact() throws IOException {
//        Input entry = new Input();
//        System.out.println("Which entry would you like to delete?");
//        String deletedValue = entry.getString().toLowerCase();
//        List<String> fileContents = Files.readAllLines(dataFilePath);
//        List<String> modifiedList = new ArrayList<>();
//        System.out.println();
//        for (String item: fileContents){
//            if(!item.toLowerCase().contains(deletedValue)){
//                modifiedList.add(item);
//            }
//        }
//        Files.write(dataFilePath, modifiedList);
//        System.out.print("Contact has been deleted");
//        printFileContents();
//        System.out.println();
//    }
//
//
//    public static void printFileContents() throws IOException {
//        List<String> fileContents = Files.readAllLines(dataFilePath);
//        System.out.println();
//        System.out.printf("%-20s | %-s |%n", "Name", "Phone Number");
//        System.out.println("-------------------------------------------");
//        for(int i = 0; i < fileContents.size(); i++){
//            System.out.printf("%s%n", fileContents.get(i));
//        }
//    }
//
//
//    public static String formatPhoneNum(String aNum){
//        String phoneNumber = "";
//        if(aNum.length() == 10){
//            phoneNumber = String.format("%s-%s-%s", aNum.substring(0,3), aNum.substring(3,6), aNum.substring(6));
//        }else if(aNum.length() == 7){
//            phoneNumber =String.format("%s-%s-%s", "xxx", aNum.substring(0,3), aNum.substring(3));
//        }
//        return phoneNumber;
//    }
//
//
//
//    public static void addContact() throws IOException {
//        Input entry = new Input();
//        System.out.println("\nEnter your new contacts name: ");
//        String name = entry.getString();
//        System.out.println("\nEnter new contact's phone number:");
//        String number = formatPhoneNum(entry.getString());
//        Files.write(
//                dataFilePath,
//                Arrays.asList(String.format("%-20s | %s |", name, number)),
//                StandardOpenOption.APPEND
//        );
//        System.out.print("Contact has been added");
//        printFileContents();
//        System.out.println();
//    }
//
//
//
//
//    public static void searchContact() throws IOException{
//        Input entry = new Input();
//        System.out.println("Search for contact:");
//        String search = entry.getString();
//        List<String> fileContents = Files.readAllLines(dataFilePath);
//        System.out.println();
//        for(String contact: fileContents) {
//            if(contact.toLowerCase().contains(search.toLowerCase())) {
//                System.out.println(contact);
//            }
//        }
//    }
//}