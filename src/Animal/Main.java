package Animal;

// Класс Животное
class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

// Класс Собака
class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        super();
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println("Собака не может пробежать такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println("Собака не может проплыть такое расстояние.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

// Класс Кот
class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFed = false;

    public Cat() {
        super();
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println("Кот не может пробежать такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() >= 1) {
            bowl.decreaseFood(1);
            this.isFed = true;
            System.out.println("Кот покушал из миски. Осталось " + bowl.getFood() + " еды.");
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public boolean isFed() {
        return isFed;
    }

    public static int getCatCount() {
        return catCount;
    }
}

// Класс Миска
class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public void increaseFood(int amount) {
        food += amount;
        System.out.println("В миске стало " + food + " еды.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание животных
        Dog dogBobik = new Dog();
        Cat catMurzik = new Cat();
        Cat catBarsik = new Cat();
        Cat catLyalya = new Cat();
        Cat catMuha = new Cat();
        Cat catLyagushka = new Cat();

        // Тестирование методов
        dogBobik.run(150);
        dogBobik.swim(5);
        catMurzik.run(150);
        catMurzik.swim(5);

        // Создание миски
        Bowl bowl = new Bowl(10);

        // Коты едят из миски
        catMurzik.eat(bowl);
        catBarsik.eat(bowl);
        catLyalya.eat(bowl);
        catMuha.eat(bowl);
        catLyagushka.eat(bowl);

        // Вывод информации о сытости котов
        System.out.println("Информация о сытости котов:");
        System.out.println("Кот Murzik сыт: " + catMurzik.isFed());
        System.out.println("Кот Barsik сыт: " + catBarsik.isFed());
        System.out.println("Кот Lyalya сыт: " + catLyalya.isFed());
        System.out.println("Кот Muha сыт: " + catMuha.isFed());
        System.out.println("Кот Lyagushka сыт: " + catLyagushka.isFed());

        // Добавление еды в миску
        bowl.increaseFood(5);

        // Вывод информации о количестве созданных животных
        System.out.println("Всего создано: " + Animal.getAnimalCount() + " животных, " + Dog.getDogCount() + " собак, " + Cat.getCatCount() + " котов.");
    }
}
