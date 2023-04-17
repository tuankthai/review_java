package review_java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.DayOfWeek;
import java.time.Month;

public class AllTests {
    Scanner scanner;
    StringBuilder bldStr = new StringBuilder();

    public AllTests(Scanner scanner) {
        this.scanner = scanner;

    }

    private void printArrayList(ArrayList<String> strArr) {
        bldStr.append("BEGIN ");
        for (String msg : strArr) {
            bldStr.append(msg + ",");
        }
        System.out.println(bldStr.toString());
        bldStr.setLength(0);
    }

    public void testArrayList() {
        ArrayList<String> strArr = new ArrayList<>(
                Arrays.asList("jujubee", "Apple", "Fig"));
        ArrayList<Flower> FloArr = new ArrayList<>(
                Arrays.asList(new Flower("rose"), new Flower("poppy")));
        ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(23, 24, 25));

        printArrayList(strArr);

        strArr.add("Avocado");
        printArrayList(strArr);

        String fruit = strArr.get(0);
        strArr.remove(fruit);
        printArrayList(strArr);

        // strArr.clear(); //REMEMBER
        strArr.set(0, "Pear"); // REMEMBER
        printArrayList(strArr);
        strArr.add(0, "orange"); // REMEMBER
        printArrayList(strArr);
        System.out.println("SIZE " + strArr.size()); // REMEMBER

        System.out.println((new Flower("Rose")).toString());
    }

    private void printMsg(String msg) {
        System.out.println(msg);

    }

    public void testSubstring() {
        String msg = new String("go to school in June. too excited!");
        printMsg(msg.substring(2));
        printMsg(msg.substring(2, 10));

        int idx = msg.indexOf("to");
        printMsg(msg.substring(idx + 3));

        idx = msg.indexOf("to", idx + 2);
        printMsg(msg.substring(idx));

    }

    public void testScanner() {
        System.out.println("enter a integer:");
        int nbr = scanner.nextInt();
        printMsg("you enter: " + nbr);

        System.out.println("enter a string:");
        scanner.nextLine(); // skip end of line
        String line = scanner.nextLine();
        printMsg("you enter: " + line);

        System.out.println("enter a boolean:");
        boolean boo = scanner.nextBoolean(); // skip end of line
        printMsg("you enter: " + boo);

        System.out.println("enter a double:");
        double dbl = scanner.nextDouble(); // skip end of line
        printMsg("you enter: " + dbl);

        System.out.println("enter a WORD:");
        String word = scanner.next(); // skip end of line
        printMsg("you enter: " + word);

        System.out.println("enter something:");
        if (scanner.hasNextInt()) {
            nbr = scanner.nextInt();
            printMsg("you enter int: " + nbr);

        } else {
            if (scanner.hasNextBoolean()) {

                boo = scanner.nextBoolean();
                printMsg("you enter boolean: " + boo);
            } else {
                if (scanner.hasNextLine()) {
                    scanner.nextLine(); // skip end of line
                    line = scanner.nextLine();
                    printMsg("you enter string: " + line);
                } else {

                }

            }

        }

        scanner.close(); // REMEMBER

    }

    public void testString() {
        String msg = "string abc";
        String msgB = "string ABC";
        printMsg(msg + " has size: " + msg.length());

        if (msg.equalsIgnoreCase(msgB)) {
            printMsg(msg + " equals " + msgB);
        }
    }

    public void testStringFormat() {
        String msg = String.format("test string format %2$,+010.2f, %<(,10.2f", 9000.500, -8020.899);
        printMsg(msg);
    }

    private void printArray(String[] strArr) {
        System.out.println("print string array:");
        for (String msg : strArr) {
            bldStr.append(msg + ",");
        }
        System.out.println(bldStr.toString());
        bldStr.setLength(0);

    }

    public void testArray() {
        String[] strArrX = { "tom", "thuy", "tamara" };
        String[] strArrY = new String[8];
        String[] strArrZ;

        strArrZ = new String[2];
        int[] intArr = { 12, 13, 14 };

        strArrZ[0] = "carrot";
        strArrZ[1] = "celery";

        printArray(strArrX);
        System.out.println("strArrX has length :" + strArrX.length); // lenght is attr of array, not a method REMEMBER
        printArray(strArrZ);

    }

    private void tryThrowOne() {
        throw new IllegalArgumentException("bad arg");

    }

    private void tryThrowTwo() {
        throw new NullPointerException("bad pointer");

    }

    public void testException() {
        try {

            // tryThrowOne();
            tryThrowTwo();
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException detected: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException detected: " + e.getMessage());

        }
    }

    private void printEnumList() {
        bldStr.append("show enum list:  ");
        for (NewEnum dirEnum : NewEnum.values()) {
            bldStr.append(dirEnum.getName() + ",");
        }

        System.out.println(bldStr);
        bldStr.setLength(0);
    }

    private void printEnumArrList(ArrayList<NewEnum> enumList) {

        bldStr.append("show enum Arraylist:  ");
        for (NewEnum aEnum : enumList) {
            bldStr.append(aEnum.getName() + ",");

        }
        System.out.println(bldStr);
        bldStr.setLength(0);
    }

    private void printDaysOfWeek() {
        bldStr.append("show days of week:  ");
        for (DayOfWeek day : DayOfWeek.values()) {
            bldStr.append(day + ",");
        }
        System.out.println(bldStr);
        bldStr.setLength(0);
    }

    private void printMonths() {
        bldStr.append("show months:  ");
        for (Month month : Month.values()) {
            bldStr.append(month + ",");
        }
        System.out.println(bldStr);
        bldStr.setLength(0);
    }

    public void testEnum() {
        NewEnum newEnumX;
        ArrayList<NewEnum> enumList = new ArrayList<>();

        printEnumList();

        newEnumX = NewEnum.valueOf("NORTH"); // REMEMBER
        enumList.add(newEnumX);
        newEnumX = NewEnum.valueOf("WEST"); // REMEMBER
        enumList.add(newEnumX);
        newEnumX = NewEnum.valueOf("EAST"); // REMEMBER
        enumList.add(newEnumX);
        newEnumX = NewEnum.valueOf("SOUTH"); // REMEMBER
        enumList.add(newEnumX);
        printEnumArrList(enumList);

        newEnumX = NewEnum.xformToEnum("North");
        enumList.add(newEnumX);
        printEnumArrList(enumList);

        // newEnumX = NewEnum.xformToEnum("Ocean"); //no such thing. exception!!
        printDaysOfWeek();
        printMonths();

    }

    public void testObjEquality() {
        Flower plantA = new Flower("rose");
        Flower plantB = new Flower("lily");

        System.out.println("test obj equality:  ");

        if (plantA.equals(plantB)) {
            System.out.println("yes, they are equals");

        } else {
            System.out.println("no, they are not equals");
        }
    }

}