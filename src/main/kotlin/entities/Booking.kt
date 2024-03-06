package org.danieer.com.entities

class Booking(
    private val room: Room,
    val customer: Customer,
    private val startDate: String,
    private val endDate: String,
    private var totalNights: Int,
    private var isCancelled: Boolean = false,
) {
    private var totalPrice = 0.0

    fun calculatePrice() {
        totalPrice = room.pricePerNight * totalNights
    }

    fun cancelBooking() {
        isCancelled = true
    }

    fun updateNights(totalNights: Int) {
        this.totalNights = totalNights
    }

    fun getTotal(): Double = totalPrice

    fun getBookingData(): String {
        return "Nombre cliente ${customer.getCustomerData()}" + "Total de noches: $totalNights" +
                "Fecha inicio :  $startDate" +
                "Fecha final :  $endDate" +
                "Total : $totalPrice"
    }
}