class Service {
    companion object{
        fun mergeCustomerItem() : List<ShoppingTrack> {
            return DAO.getCustomers().map { ShoppingTrack(it.nameCustomer, it.surnameCustomer, DAO.getNameItemByItemId(it.idItem).nameItem, DAO.getNameItemByItemId(it.idItem).articleItem, it.idItem) }
        }
        fun sortedShoppingTrackByNameItem () : List<ShoppingTrack> {
            return mergeCustomerItem().sortedBy { it.nameItem }
        }
        fun groupedShoppingTrackBySurnameCustomer () : Map<String, List<ShoppingTrack>> {
            return mergeCustomerItem().groupBy { it.surnameCustomer }
        }
        fun filteredShoppingTrack (predicate: (ShoppingTrack) -> Boolean) : Int{
            return mergeCustomerItem().filter { predicate(it) }.count()
        }
    }
}