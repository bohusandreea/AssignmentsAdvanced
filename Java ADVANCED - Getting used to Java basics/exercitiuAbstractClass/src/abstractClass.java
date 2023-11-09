abstract class abstractClass {
    abstract void abstractMethod();
    void concreteMethod() { // concrete methods are still allowed in abstract classes
        System.out.println("This is a concrete method.");
    }
}
