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
        System.out.println("Введите первое число и нажмите Enter");
        double num1 = scanner.nextDouble();
        //Ввод операции
        System.out.println("Выберите операцию: +, -, *, / и нажмите Enter");
        //считываем введеную операцию
        char operation = scanner.next().trim().charAt(0);
        System.out.println("Введите второе число и нажмите Enter");
        double num2 = scanner.nextDouble();
        //Обработка операций над значениями
        System.out.print("Ответ:\t");
        Operation op = resultOperation.getOper(operation);
        System.out.println(op.exec(num1, num2));
    }
}
