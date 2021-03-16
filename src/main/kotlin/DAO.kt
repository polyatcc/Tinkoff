class DAO {
    companion object {
        private val customers: List<Customer> = listOf(Customer("Polina","Tceneva", 1), Customer("Polina","A", 2), Customer("Polina","B", 3), Customer("Polina","C", 4), Customer("Polina","D", 5), Customer("Polina","E", 6), Customer("Polina","F", 7), Customer("Polina","G", 8), Customer("Polina","H", 9), Customer("Polina","I", 10))
        private val items: List<Item> = listOf(Item("Water", "1324", 1), Item("Computer game", "3352", 2), Item("Cat", "2394", 7), Item("Tie", "239", 10), Item("Water", "24559", 8), Item("Ogurchiki kak y babushki", "8934", 6), Item("Muhoboika", "92421", 9), Item("Krisa: korm dlya kota", "45302", 4), Item("Kaktus", "23045", 5), Item("Rubber ducklings", "342304", 3))

        class CustomException :
            IllegalStateException("Item with such id wasn't found")

        fun getNameItemByItemId(iId : Int) : Item {
            val itemWithId = items.filter { it.idItem == iId }[0] ?: throw CustomException()
            return itemWithId
        }
        fun getItems() : List<Item> {
            return items
        }
        fun getCustomers() : List<Customer> {
            return customers
        }
    }
}