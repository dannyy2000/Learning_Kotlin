package OOP_EXERCISES

fun main() {
    val car1 = Car(model = "Benz", year = 2023, price = -1.00)
    val car2 = Car(model = "Toyota", year = 2020, price = 1500.00)

    car1.setPrice(-1.00)
//    println(car2.getPrice())
    println(car1.setDiscount1())
//    println(car2.setDiscount2())
}