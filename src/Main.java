import static java.lang.System.out;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 20;

        boolean trueandfalse = true;

        while (trueandfalse) {
            out.println("\n1. Завдання 1");
            out.println("2. Завдання 2");
            out.println("3. Завдання 3");
            out.println("4. Завдання 4");
            out.println("5. Завдання 5");
            out.println("6. Завдання 6");
            out.println("7. Завдання 7");
            out.println("8. Завдання 8");
            out.println("9. Завдання 9");
            out.println("10. Завдання 10");
            out.println("11. Завдання 11");
            out.println("12. Завдання 12");
            out.println("0. Вихід\n");

            int choice = scanner.nextInt();

            if (choice == 0) {
                out.println("Вихід з програми.");
                scanner.close();
                trueandfalse = false;
            }

            switch (choice) {
                case 1:
                    out.println("\n");
                    out.println("Завдання 1:");

                    out.println("“Your time is limited,");
                    out.println("so don't waste it");
                    out.println("living someone else's life”");
                    out.println("Steve Jobs");
                    out.println("\n");
                    break;

                case 2:
                    out.println("\n");
                    out.println("Завдання 2:");

                    out.println("Введіть значення: ");
                    double value = scanner.nextDouble();

                    out.println("Введіть відсоток: ");
                    double percentage = scanner.nextDouble();

                    double result = (value * percentage) / 100;

                    out.println(percentage + "% від " + value + " дорівнює " + result);
                    out.println("\n");
                    break;

                case 3:
                    out.println("\n");
                    out.println("Завдання 3:");

                    out.println("Введіть перше число: ");
                    int num1 = scanner.nextInt();
                    out.println("Введіть друге число: ");
                    int num2 = scanner.nextInt();
                    out.println("Введіть третє число: ");
                    int num3 = scanner.nextInt();

                    String combinedString = "" + num1 + num2 + num3;

                    int combinedNumber = Integer.parseInt(combinedString);

                    out.println("Сформоване число: " + combinedNumber);
                    out.println("\n");
                    break;

                case 4:
                    out.println("\n");
                    out.println("Завдання 4:");

                    scanner.nextLine();

                    out.println("Введіть шестизначне число: ");
                    String input = scanner.nextLine();

                    if (input.length() != 6 || !input.matches("\\d{6}")) {
                        out.println("Помилка: необхідно ввести шестизначне число.");
                    } else {
                        char[] digits = input.toCharArray();
                        char temp;

                        temp = digits[0];
                        digits[0] = digits[5];
                        digits[5] = temp;

                        temp = digits[1];
                        digits[1] = digits[4];
                        digits[4] = temp;

                        String result1 = new String(digits);

                        out.println("Змінене число: " + result1);
                    }
                    out.println("\n");
                    break;

                case 5:
                    out.println("\n");
                    out.println("Завдання 5:");

                    out.println("Введіть номер місяця (1-12): ");
                    int month = scanner.nextInt();

                    if (month >= 1 && month <= 12) {
                        switch (month) {
                            case 12:
                            case 1:
                            case 2:
                                out.println("Winter");
                                break;
                            case 3:
                            case 4:
                            case 5:
                                out.println("Spring");
                                break;
                            case 6:
                            case 7:
                            case 8:
                                out.println("Summer");
                                break;
                            case 9:
                            case 10:
                            case 11:
                                out.println("Autumn");
                                break;
                        }
                    } else {
                        out.println("Помилка: необхідно ввести номер місяця від 1 до 12.");
                    }
                    out.println("\n");
                    break;

                case 6:
                    out.println("\n");
                    out.println("Завдання 6:");

                    out.println("Введіть кількість метрів: ");
                    double meters = scanner.nextDouble();

                    out.println("Виберіть одиницю виміру для конвертації: ");
                    out.println("1. Мілі (miles)");
                    out.println("2. Дюйми (inches)");
                    out.println("3. Ярди (yards)");
                    int choice1 = scanner.nextInt();

                    switch (choice1) {
                        case 1:
                            double miles = meters / 1609.344;
                            out.println(meters + " метрів = " + miles + " миль");
                            break;
                        case 2:
                            double inches = meters * 39.3701;
                            out.println(meters + " метрів = " + inches + " дюймів");
                            break;
                        case 3:
                            double yards = meters * 1.09361;
                            out.println(meters + " метрів = " + yards + " ярдів");
                            break;
                        default:
                            out.println("Помилка: необхідно вибрати 1, 2 або 3.");
                    }
                    out.println("\n");
                    break;

                case 7:
                    out.println("\n");
                    out.println("Завдання 7:");

                    out.println("Введіть перше число: ");
                    int num4 = scanner.nextInt();
                    out.println("Введіть друге число: ");
                    int num5 = scanner.nextInt();

                    int start = Math.min(num4, num5);
                    int end = Math.max(num4, num5);

                    out.println("Введіть числа в діапазоні від " + start + " до " + end + ":");

                    for (int i = start; i <= end; i++) {
                        if (i % 2 != 0) {
                            out.print(i + " ");
                        }
                    }
                    out.println("\n");
                    break;

                case 8:
                    out.println("\n");
                    out.println("Завдання 8:");

                    out.println("Введіть початкове значення для таблиці множення: ");
                    int start1 = scanner.nextInt();
                    out.println("Введіть кінцеве значення для таблиці множення: ");
                    int end1 = scanner.nextInt();

                    if (start1 > end1) {
                        int temp = start1;
                        start1 = end1;
                        end1 = temp;
                    }

                    for (int i = start1; i <= end1; i++) {
                        for (int j = 1; j <= 10; j++) {
                            out.printf("%d * %d = %d%n", i, j, (i * j));

                        }
                        out.println();
                    }
                    out.println("\n");
                    break;

                case 9:
                    out.println("\n");
                    out.println("Завдання 9:");

                    int[] array = new int[size];
                    Random random = new Random();
                    for (int i = 0; i < size; i++) {
                        array[i] = random.nextInt(201) - 100;
                    }

                    int min = array[0];
                    int max = array[0];

                    for (int i = 1; i < size; i++) {
                        if (array[i] < min) {
                            min = array[i];
                        }
                        if (array[i] > max) {
                            max = array[i];
                        }
                    }

                    int countNegative = 0;
                    int countPositive = 0;
                    int countZero = 0;

                    for (int i = 0; i < size; i++) {
                        if (array[i] < 0) {
                            countNegative++;
                        } else if (array[i] > 0) {
                            countPositive++;
                        } else {
                            countZero++;
                        }
                    }

                    Arrays.sort(array);

                    System.out.println("Одномірний масив випадкових чисел: ");
                    printArray(array);

                    out.println("\nМінімальне значення: " + min);
                    out.println("Максимальне значення: " + max);
                    out.println("Кількість від'ємних значень: " + countNegative);
                    out.println("Кількість додатніх значень: " + countPositive);
                    out.println("Кількість нулів: " + countZero);
                    out.println("\n");
                    break;

                case 10:
                    out.println("\n");
                    out.println("Завдання 10:");

                    int[] array1 = new int[size];
                    Random random1 = new Random();
                    for (int i = 0; i < size; i++) {
                        array1[i] = random1.nextInt(201) - 100;
                    }

                    out.println("Одномірний масив випадкових чисел:");
                    printArray(array1);

                    int[] evenNumbers = extractEvenNumbers(array1);

                    out.println("\nМасив парних чисел:");
                    printArray(evenNumbers);

                    int[] oddNumbers = extractOddNumbers(array1);

                    out.println("\nМасив непарних чисел:");
                    printArray(oddNumbers);

                    int[] negativeNumbers = extractNegativeNumbers(array1);

                    out.println("\nМасив від'ємних чисел:");
                    printArray(negativeNumbers);

                    int[] positiveNumbers = extractPositiveNumbers(array1);

                    out.println("\nМасив додатніх чисел:");
                    printArray(positiveNumbers);
                    out.println("\n");
                    break;

                case 11:
                    out.println("\n");
                    out.println("Завдання 11:");

                    drawLine(10, Direction.HORIZONTAL, '*');
                    drawLine(5, Direction.VERTICAL, '#');
                    out.println("\n");
                    break;
                case 12:
                    out.println("\n");
                    out.print("Введіть розмір масиву: ");
                    int size1 = scanner.nextInt();
                    scanner.nextLine();

                    int[] array2 = new int[size1];
                    out.println("Введіть " + size1 + " елементи масиву, розділені комами:");
                    String input2 = scanner.nextLine();
                    String[] inputArray = input2.split(",");

                    if (inputArray.length != size1) {
                        out.println("Помилка: кількість введених елементів не відповідає розміру масиву.");
                        return;
                    }

                    for (int i = 0; i < size1; i++) {
                        array2[i] = Integer.parseInt(inputArray[i].trim());
                    }

                    out.print("Введіть напрям сортування (asc для зростання, desc для спадання): ");
                    String direction = scanner.next();

                    if (direction.equalsIgnoreCase("asc")) {
                        sortAscending(array2);
                    } else if (direction.equalsIgnoreCase("desc")) {
                        sortDescending(array2);
                    } else {
                        out.println("Некоректний напрям сортуванняю Введіть 'asc' або 'desc'.");
                    }

                    out.println("Відсортований масив:");
                    out.println(Arrays.toString(array2));
                    out.println("\n");
                    break;
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            out.print(array[i] + " ");
        }
        out.println();
    }

    public static int[] extractEvenNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                result[index++] = number;
            }
        }
        return result;
    }

    public static int[] extractOddNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                result[index++] = number;
            }
        }
        return result;
    }

    public static int[] extractNegativeNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number < 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number < 0) {
                result[index++] = number;
            }
        }
        return result;
    }

    public static int[] extractPositiveNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number > 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int number : array) {
            if (number > 0) {
                result[index++] = number;
            }
        }
        return result;
    }

    public static void drawLine(int length, Direction direction, char symbol) {
        switch (direction) {
            case HORIZONTAL:
                drawHorizontalLine(length, symbol);
                break;
            case VERTICAL:
                drawVerticalLine(length, symbol);
                break;
            default:
                out.println("Некоректний напрямок. Підтримуються тільки HORIZONTAL і VERTICAL.");
        }
    }

    public static void drawHorizontalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            out.print(symbol);
        }
        out.println();
    }

    public static void drawVerticalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            out.println(symbol);
        }
    }

    public enum Direction {
        HORIZONTAL, VERTICAL
    }

    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    public static void sortDescending(int[] array) {
        Arrays.sort(array);
        reverse(array);
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}