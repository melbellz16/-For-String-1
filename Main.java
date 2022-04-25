class Main {
  public static void main(String[] args) {
   boolean flag = false;
    int age = 30;
      age +=  1;
    System.out.println("I'm"+ age + " years old.");
    //Создаем массив данных.String-  обьект
    String[] names = new String[] { "Josh", "Bill"};
    // Создаем цикл (For), который будет итеррировать значения в массив
    for (String name : names) {
      //String name- название переменной, names-название массива или коллекции
      System.out.println(name);
    }
    

    
    }
}