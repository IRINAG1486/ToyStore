# Задание 2
Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
Применяя принципы ООП и работу с файлами.

Абстрактный класс Toys содержит поля для идентификации игрушек: наименование, количество, вес, частота (используется для случайного выбора призовых игрушек).
Данный класс содержит метод public void Sort, с помощью которого игрушки, выбранные для розыгрыша, сортируются в зависимости от веса. Самые тяжелые игрушки розыгрываются в первую очередь.
Метод  public void getToy используется для выдачи призовых игрушек выбранным участникам розыгрыша. Так же в этом методе происходит запись полученной информации в текстовый файл.
Метод getCount позволяет получить остаток игрушек определенного вида.


Абстрактные классы Cars, Dolls, SoftToys, EducationalToys расширяют класс Toys.


Классы Barbie, Bear, Lego, Truck являются наследниками классов Cars, Dolls, SoftToys, EducationalToys. Абстрактные классы Cars, Dolls, SoftToys, EducationalToys могут быть расширены другими подобными наследниками.

Класс Participants содержит информацию об участниках розыгрыша. С помощью метода getRandomParticipants из общего количества участников случайным образом выбираются 10 человек.


