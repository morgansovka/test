
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(calc(string));
    }

    public static String calc(String input) {
        String string1 = input.replaceAll(" ", "");

        String[] minMass = string1.split("-");
        if (minMass.length == 2) {
            String oneMin = minMass[0];
            String twoMin = minMass[1];
            if (isArabianNumber(oneMin) && isArabianNumber(twoMin)) {
                int firstMin = Integer.parseInt(oneMin);
                int secondMin = Integer.parseInt(twoMin);
                if ((firstMin <1 || firstMin > 10) || (secondMin <1 || secondMin > 10)) {
                    throw new IllegalArgumentException("Используй арабские числа от 1 до 10 или римские от I-X");
                }
                int min = firstMin - secondMin;
                return String.valueOf(min);
            } else if (isRomanNumber(oneMin) && isRomanNumber(twoMin)) {
                minMass = RomanToArabian(minMass);
                int firstMin = Integer.parseInt(minMass[0]);
                int secondMin = Integer.parseInt(minMass[1]);
                if ((firstMin >= 112 || secondMin >= 11)) {
                    throw new IllegalArgumentException("Используй арабские числа от 1 до 10 или римские от I-X");
                }
                int min = firstMin - secondMin;
                if(min < 1) {
                    throw new IllegalArgumentException("Ты ввел что-то неверно");
                }
                return arabianToRoman(String.valueOf(min));
            } else if(isRomanNumber(oneMin) && isArabianNumber(twoMin)){
                throw new IllegalArgumentException("Используются одновременно разные системы счисления");
            } else if(isArabianNumber(oneMin) && isRomanNumber(twoMin)){
                throw new IllegalArgumentException("Используются одновременно разные системы счисления");
            }
        }


        String[] sumMass = string1.split("\\+");
        if (sumMass.length == 2) {
            String oneSum = sumMass[0];
            String twoSum = sumMass[1];
            if(isArabianNumber(oneSum) && isArabianNumber(twoSum)) {
                String oneSum1 = oneSum.trim();
                String twoSum1 = twoSum.trim();
                int firstSum = Integer.parseInt(oneSum1);
                int secondSum = Integer.parseInt(twoSum1);
                if ((firstSum <1 || firstSum > 10) || (secondSum <1 || secondSum > 10)) {
                    throw new IllegalArgumentException("Используй арабские числа от 1 до 10 или римские от I-X");
                }
                int sum = firstSum + secondSum;
                return String.valueOf(sum);
            } else if (isRomanNumber(oneSum) && isRomanNumber(twoSum)) {
                sumMass = RomanToArabian(sumMass);
                int firstSum = Integer.parseInt(sumMass[0]);
                int secondSum = Integer.parseInt(sumMass[1]);
                if ((firstSum >= 11 || secondSum >= 11)) {
                    throw new IllegalArgumentException("Используй арабские числа от 1 до 10 или римские от I-X");
                }
                int sum = firstSum + secondSum;
                if(sum < 1) {
                    throw new IllegalArgumentException("Ты ввел что-то неверно");
                }
                return arabianToRoman(String.valueOf(sum));
            } else if(isRomanNumber(oneSum) && isArabianNumber(twoSum)){
                throw new IllegalArgumentException("Используются одновременно разные системы счисления");
            } else if(isArabianNumber(oneSum) && isRomanNumber(twoSum)){
                throw new IllegalArgumentException("Используются одновременно разные системы счисленияо");
            }
        }

        String[] divMass = string1.split("/");
        if (divMass.length == 2) {
            String oneDiv = divMass[0];
            String twoDiv = divMass[1];
            if(isArabianNumber(oneDiv) && isArabianNumber(twoDiv)) {
                String oneDiv1 = oneDiv.trim();
                String twoDiv1 = twoDiv.trim();
                int firstDiv = Integer.parseInt(oneDiv1);
                int secondDiv = Integer.parseInt(twoDiv1);
                if ((firstDiv <1 || firstDiv > 10) || (secondDiv <1 || secondDiv > 10)) {
                    throw new IllegalArgumentException("Используй арабские числа от 1 до 10 или римские от I-X");
                }
                int div = firstDiv / secondDiv;
                return String.valueOf(div);
            } else if (isRomanNumber(oneDiv) && isRomanNumber(twoDiv)) {
                divMass = RomanToArabian(divMass);
                int firstDiv = Integer.parseInt(divMass[0]);
                int secondDiv = Integer.parseInt(divMass[1]);
                if ((firstDiv >= 11 || secondDiv >= 11)) {
                    throw new IllegalArgumentException("Используй арабские числа от 1 до 10 или римские от I-X");
                }
                int div = firstDiv / secondDiv;
                if(div < 1) {
                    throw new IllegalArgumentException("Ты ввел что-то неверно");
                }
                return arabianToRoman(String.valueOf(div));
            } else if(isRomanNumber(oneDiv) && isArabianNumber(twoDiv)){
                throw new IllegalArgumentException("Используются одновременно разные системы счисления");
            } else if(isArabianNumber(oneDiv) && isRomanNumber(twoDiv)){
                throw new IllegalArgumentException("Используются одновременно разные системы счисления");
            }

        }


        String[] multiMass = string1.split("\\*");
        if (multiMass.length == 2) {
            String oneMulti = multiMass[0];
            String twoMulti = multiMass[1];
            if (isArabianNumber(oneMulti) && isArabianNumber(twoMulti)) {
                String oneMulti1 = oneMulti.trim();
                String twoMulti1 = twoMulti.trim();
                int firstMulti = Integer.parseInt(oneMulti1);
                int secondMulti = Integer.parseInt(twoMulti1);
                if ((firstMulti <1 || firstMulti > 10) || (secondMulti <1 || secondMulti > 10)) {
                    throw new IllegalArgumentException("Используй арабские числа от 1 до 10 или римские от I-X");
                }
                int multi = firstMulti * secondMulti;
                return String.valueOf(multi);
            } else if (isRomanNumber(oneMulti) && isRomanNumber(twoMulti)) {
                multiMass = RomanToArabian(multiMass);
                int firstMulti = Integer.parseInt(multiMass[0]);
                int secondMulti = Integer.parseInt(multiMass[1]);
                if ((firstMulti >= 11 || secondMulti >= 11)) {
                    throw new IllegalArgumentException("Используй арабские числа от 1 до 10 или римские от I-X");
                }
                int multi = firstMulti * secondMulti;
                if(multi < 1) {
                    throw new IllegalArgumentException("Ты ввел что-то неверно");
                }
                return arabianToRoman(String.valueOf(multi));
            } else if(isRomanNumber(oneMulti) && isArabianNumber(twoMulti)){
                throw new IllegalArgumentException("Используются одновременно разные системы счисления");
            } else if(isArabianNumber(oneMulti) && isRomanNumber(twoMulti)){
                throw new IllegalArgumentException("Используются одновременно разные системы счисления");
            }
        } throw new IllegalArgumentException("Ты ввел что-то неверно");
    }
    static String[] RomanToArabian(String[] romArray) {
        Roman first = Roman.valueOf(romArray[0]);
        Roman second = Roman.valueOf(romArray[1]);
        romArray[0] = first.getValue() + "";
        romArray[1] = second.getValue() + "";
        return romArray;
    }
    static boolean isRomanNumber(String number) {
        try {
            Roman num = Roman.valueOf(number);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }
    static boolean isArabianNumber(String number) {
        try {
            int num = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    static String arabianToRoman(String roman) {
        int num = Integer.parseInt(roman);
        Roman[] numbers = Roman.values();
        String romana = "";
        for (int i = (numbers.length - 1); i >= 0; i--) {
            while (num >= numbers[i].getValue()) {
                romana += numbers[i];
                num -= numbers[i].getValue();
                i++;
            }
        }
        return romana;
    }
}
enum Roman {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), XL(40), L(50), LC(90), C(100), D(500);
    private final int value;
    Roman(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}



