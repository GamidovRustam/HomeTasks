# Homeworks
Solved homeworks for Go Java Course

  Task 1.
  
    Написать, скомпилировать и запустить из консоли программу, печатающую на экран сообщение: "Hi, I'm your first Java program! Stay tuned!"
    Результат ДЗ:
    Загрузи файл с расширением .java в свой репозиторий на GitHub. Ссылку на выполненное ДЗ с репозитория выложи тут в LMS системе. Как пользоваться GitHub можешь посмотреть в видео в Модуле 0.

    Comments:
      "module01.java" - was written in notepad++
      "Module1Solution.java"  - was written by using Intelij IDEA
      
      
  Task 2.
  
    1. Создать UML диаграмму с классами Текстовый файл, Аудио файл, Файл изображения, используя класс Файл. Создать класс Директория,  содержащий файлы разных форматов.
    2. Создать UML диаграмму с классами Роза, Ромашка, Астра, используя класс Цветок. Собрать Букет цветов. Дополнить систему классами Тюльпан и Розовый куст.
    3. Создать UML диаграмму с классами Гитара, Фортепиано, Труба, используя класс Музыкальный инструмент. Открыть Музыкальный магазин.
    Результат ДЗ:
    Загрузи три UML диаграммы в формате картинок в свой репозиторий на GitHub. Ссылку на выполненное ДЗ с репозитория выложи тут в LMS системе. Как пользоваться GitHub можешь посмотреть в видео в Модуле 0.
    
    Comments:
      - I pasted 3 UML diagrams in one image (for easiest viewing).
      - In my opinion, the text of this assignment is controversial.


  Task 4.

  Написать классы на Java соответствующие UML диаграммам из задания к Модулю 2. Создать проект с исходниками и загрузить его на GitHub.
      
      
  1. Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.

  2. Создать класс преобразующий значение температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении.

  3. Создать класс вычисляющий расстояние между двумя точками, представленными координатами в двумерном пространстве (x1, y1), (x2, y2).
  

  Task 5.
  
  1. Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[]).
  2. Выбрать один из алгоритмов сортировки массивов и реализовать его 
  

  Task 6.

  1.  Дополнить код уже имеющихся классов из ДЗ к модулям 4 и 5 обработкой исключительной ситуации. При этом использовать УЖЕ         СУЩЕСТВУЮЩИЙ класс (например, IllegalStateException)

  2. Добавить в магазин инструментов метод, который готовит к отгрузке партию музыкальных инструментов согласно заказу.
 
    Сигнатура метода:
    public List<Instrument> prepareInstruments(Map<String, Integer> order){...}
     
    В заказе (Map<String, Integer> order) хранится название инструмента и количество необходимых инструментов.
     
    Ключем в заказе является одна из строк "piano", "guitar", "trumpet"
     
    Создать свое исключение, которое будет брошено в случае, когда ключ в заказе другой.
     
    Каким-то образом (самостоятельно выбрать решение) обработать ситуацию, когда количество элементов в заказе отрицательное, нулевое.
     
    После выполнения метода из магазина должны пропасть те инструменты, которые были отгружены.
    В случае, когда количество запрашиваемых инструментов определенного типа больше, чем количество доступных инструментов в магазине, должно быть брошено исключение. Выбрать наиболее подходящее из доступных в стандартной библиотеке исключений



