class Main {
  public static void main(String[] args) {
   boolean flag = false;
    int age = 30;
      age +=  40;
    System.out.println("I'm"+ age + " years old.");
    //Создаем массив данных.String-  обьект
    String[] names = new String[] { "Josh", "Bill", "Andrew"};
    // Создаем цикл (For), который будет итеррировать значения в массив
    for (String name : names) {
      //String name- название переменной, names-название массива или коллекции
      System.out.println(name);
    }
    //Для каждого элемента массива мы выполняем код,который находится в фигурных скобках
//Добавляем еще один элемент в массив "Andrew"
    //Создаем новые условия с помощью if
    if (age > 70){
      System.out.println("Too old");
      // меняем возраст в age +=
    } else if (age >= 40) {
      System.out.println("Age is more than 40 but less than 70");
      //меняем ,как было в age на 40
      //Если мы хотим включить значение больше 40, то мы должны написать в условие >=40(где указано else if)
    }
    }
}