class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Steffi");
        Student s2 = new Student(102, "Chris");

        s1.display();
        System.out.println();
        s2.display();
    }
}