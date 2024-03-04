package org.danieer.com.entities

class Room(
    val pricePerNight: Double,
    val capacity: Int,
    val roomNumber: Int,
    val isAvailable: Boolean = true
) {
    //Cuerpo de la clase

    fun getRoomData(): String {
        return "Numero de habitacion: $roomNumber Precio por noche: $pricePerNight Capacidad : $capacity Disponible: ${if (isAvailable) "Si" else "No"}"
    }
}