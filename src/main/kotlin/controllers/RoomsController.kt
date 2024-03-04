package org.danieer.com.controllers

import org.danieer.com.entities.Room
import org.danieer.com.utils.Printer

class RoomsController {
    private val printer = Printer()
    private val roomList = mutableListOf<Room>()

    fun registerRoom() {
        printer.printMsg("Ingrese el precio por noche")
        val pricePerNight = readln().toDouble()
        printer.printMsg("Ingrese la capacidad")
        val capacity: Int = readln().toInt()
        printer.printMsg("Ingrese el numero de habitacion")
        val roomNumber: Int = readln().toInt()
        val isAvailable = true

        val addedRoom = Room(
            pricePerNight,
            capacity,
            roomNumber,
            isAvailable
        )
        roomList.add(addedRoom)
    }

    fun modifyRoom() {}

    fun getRoomByIndex(index: Int): Room {
        return roomList[index]
    }

    fun showRooms() {
        var counter = 1
        for (room in roomList) {
            printer.printMsg("$counter" + room.getRoomData())
            counter++
        }
    }

}