package com.example.java_quiz_game;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "Which language runs on the JVM?",
            "Which keyword is used to create a class in Java?",
            "Which method is the entry point of a Java program?",
            "Which data type stores true or false?",
            "What is the index of the first element in an array?",
            "Which keyword is used to inherit a class?",
            "Which symbol is used for single-line comments in Java?",
            "Which package contains the Scanner class?",
            "Which keyword creates an object?",
            "Which loop executes at least once?",
            "Which keyword exits a loop immediately?",
            "Which keyword skips the current loop iteration?",
            "Which method compares two strings by content?",
            "What is the default value of an int instance variable?",
            "Which concept hides internal implementation details?",
            "Which keyword is used to implement an interface?",
            "What does JVM stand for?",
            "Which block handles exceptions?",
            "Which language is primarily used to structure web pages?",
            "Which SQL command retrieves data from a table?"
        };

        String[][] options = {
            {"Python", "Java", "C", "HTML"},
            {"function", "define", "class", "object"},
            {"start()", "main()", "run()", "execute()"},
            {"int", "char", "boolean", "float"},
            {"1", "0", "-1", "2"},
            {"implements", "extends", "inherits", "super"},
            {"//", "/*", "#", "<!--"},
            {"java.io", "java.util", "java.lang", "java.net"},
            {"class", "new", "create", "this"},
            {"for", "while", "do-while", "foreach"},
            {"continue", "skip", "break", "return"},
            {"break", "continue", "exit", "stop"},
            {"==", "compare()", "equals()", "isEqual()"},
            {"null", "0", "1", "-1"},
            {"Inheritance", "Polymorphism", "Encapsulation", "Compilation"},
            {"extends", "implements", "import", "package"},
            {"Java Virtual Machine", "Java Variable Method",
             "Joint Virtual Machine", "Java Visual Machine"},
            {"try-catch", "if-else", "for-loop", "switch"},
            {"CSS", "JavaScript", "HTML", "Python"},
            {"INSERT", "UPDATE", "SELECT", "DELETE"}
        };

        // Correct option numbers
        int[] correctAnswers = {
            2, 3, 2, 3, 2,
            2, 1, 2, 2, 3,
            3, 2, 3, 2, 3,
            2, 1, 1, 3, 3
        };

        int score = 0;

        System.out.println("==================================");
        System.out.println("          JAVA QUIZ GAME");
        System.out.println("==================================");
        System.out.println("Answer all 20 questions.");
        System.out.println("Enter an option from 1 to 4.\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("----------------------------------");
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            int answer;

            while (true) {
                System.out.print("Your answer (1-4): ");

                String input = scanner.nextLine();

                try {
                    answer = Integer.parseInt(input);

                    if (answer >= 1 && answer <= 4) {
                        break;
                    }

                    System.out.println("Please enter a number from 1 to 4.");

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter a number.");
                }
            }

            if (answer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct answer: "
                        + options[i][correctAnswers[i] - 1]);
            }
        }

        System.out.println("\n==================================");
        System.out.println("             QUIZ RESULT");
        System.out.println("==================================");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (questions.length - score));
        System.out.println("Final Score     : " + score + "/" + questions.length);
        System.out.println("Percentage      : " + (score * 100 / questions.length) + "%");
        System.out.println("==================================");

        if (score >= 16) {
            System.out.println("Excellent performance!");
        } else if (score >= 10) {
            System.out.println("Good effort! Keep learning.");
        } else {
            System.out.println("Keep practising. You can improve!");
        }

        scanner.close();
    }
}