package hw12_exception;

import java.util.*;

public class HW12_Exception {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Please input an age:");
        try {
            age = input.nextInt();
            checkAge(age);
        } catch (AgeTooSmallException e) {
            System.out.println(e.getMessage());

        } catch (AgeTooBigException e) {
            System.out.println(e.getMessage());

        } catch (AgeNotQualifiedException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Exit Program");
        }

    }

    public static void checkAge(int num) throws AgeTooSmallException, AgeTooBigException, AgeNotQualifiedException {
        if (num >= 0 && num < 20) {
            throw new AgeTooSmallException("your age is too young.");
        } else if (num > 50) {
            throw new AgeTooBigException("your age is too old.");
        } else if (num < 0) {
            throw new AgeNotQualifiedException("your age have to be >=0.");
        } else {
            System.out.println("The age which you entered is「 " + num + " 」."); 
        }

    }

}
