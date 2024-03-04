package org.danieer.com.entities

class Customer(
    private val names: String,
    private val firstLastName: String,
    private val secondLastName: String,
    private val rfc: String,
    private val address: String,
    private val bookingList: MutableList<Booking> = mutableListOf()
) {

    fun getCustomerData(): String {
        return "Nombre: $names $firstLastName $secondLastName RFC: $rfc Address: $address"
    }

    fun addBooking(booking: Booking) {
        bookingList.add(booking)
    }
}