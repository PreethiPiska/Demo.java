package com.tnsif.second;

class ConstructOverload {
    String name;
    int age;

    ConstructOverload() {
        name = "Unknown";
        age = 0;
    }

    ConstructOverload(String n) {
        name = n;
        age = 18;
    }

    ConstructOverload(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        ConstructOverload s = new ConstructOverload("Preethi", 21);
        s.display();
    }
}
