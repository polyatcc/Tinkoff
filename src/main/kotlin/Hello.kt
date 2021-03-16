import java.util.*
class CustomException(message: String) : Exception(message)
fun main() {
    try {
        println(Service.mergeCustomerItem());
        println(Service.sortedShoppingTrackByNameItem())
        println(Service.filteredShoppingTrack { it.nameCustomer == "Polina" })
        println(Service.groupedShoppingTrackBySurnameCustomer())
    }
    catch (e: Exception) {
        print(e.message)
    }
}