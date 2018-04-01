package Project_Calculator_OOP;

import java.util.Scanner;

/**
 * Created by 1 on 24.03.2018.
 * Калькулятор в стиле ООП
 */
//Класс Calculator_OOP передает себе в качестве параметра объект CalculatorLogic и выполнят метод exec
public class Calculator_OOP {
    public static void main(String[] args) {
        //Создаем экземпляр класса CalculatorLogic
        CalculatorLogic calclogic = new CalculatorLogic();
        //Создаем экземпляр класса Calculator с агрументом в виде объекта CalculatorLogic
        Calculator calc = new Calculator(calclogic);
        //Выполняем метод exec для объекта Calculator
        calc.exec();
    }
}

//Интерфейс Operation выполняет действия над операциями
interface Operation {
    double exec(double first_value, double second_value);
}

//Сложение
class Addition implements Operation {
    public double exec(double first_value, double second_value) {
        return (first_value + second_value);
    }
}

class Subtraction implements Operation {
    public double exec(double first_value, double second_value) {
        return (first_value - second_value);
    }
}

class Multiply implements Operation {
    public double exec(double first_value, double second_value) {
        return (first_value * second_value);
    }
}

class Division implements Operation {
    public double exec(double first_value, double second_value) {
        /**
         * Задание №7. Проверяем, если второе значение равно 0, то выбрасываем исключение
         */
        if (second_value == 0) {
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        return (first_value / second_value);
    }
}

// Интерфейс Operations, создающий перечисленные выше объекты (CalculatorLogic).
interface Operations {
    Operation getOper(char op);
}

class CalculatorLogic implements Operations {
    char resOperation;
    public Operation operation;

    //метод выполняет арифметические операции над числами
    public Operation getOper(char op) {
        this.resOperation = op;
        switch (resOperation) {
            case '+': {
                operation = new Addition();
                break;
            }
            case '-': {
                operation = new Subtraction();
                break;
            }
            case '*': {
                operation = new Multiply();
                break;
            }
            case '/': {
                operation = new Division();
                break;
            }
            default:
        }
        return operation;
    }
}

class Calculator {

    CalculatorLogic resultOperation;

    public Calculator(CalculatorLogic resultOperation) {
        this.resultOperation = resultOperation;
    }
    //Ввод и вывод операции
    public void exec() {
        //Поток ввода
        Scanner scanner = new Scanner(System.in);
        /**
         * Для задания №7 Проверяем на ввод не корректных значений с помощью исключений try catch
         */
        try {
            System.out.println("Введите первое число и нажмите Enter");
            double num1 = scanner.nextDouble();
            //Ввод операции
            System.out.println("Выберите операцию: +, -, *, / и нажмите Enter");
            //считываем введеную операцию
            char operation = scanner.next().trim().charAt(0);
            System.out.println("Введите второе число и нажмите Enter");
            double num2 = scanner.nextDouble();
            //Обработка операций над значениями
            Operation op = resultOperation.getOper(operation);
            //Если введеная операция не null, то выводим ответ, иначе ошибка
            try {
                if (op != null) System.out.println("Ответ: " + op.exec(num1, num2));
                else System.out.println("Error: Не верная операция!");
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
            //System.out.print("Ответ:\t");
        } catch (Exception e) {
            System.out.println("Ошибка: Не верное значение!");
        }
    }
}