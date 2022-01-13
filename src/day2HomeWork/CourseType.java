package day2HomeWork;

public enum CourseType {
    FREE(0),PAID(100);
    double price;

    CourseType(double price) {
        this.price = price;
    }
}
