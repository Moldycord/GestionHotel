package org.danieer.com.controllers

import org.danieer.com.utils.Printer

class MenuController {

    private val printer = Printer()
    private val bookingsController = BookingsController()
    private val customersController = ClientsController()
    private val roomsController = RoomsController()

    fun showMenu() {

        printer.apply {
            printMsg("Ingrese una opción")
            printMsg("1 - Registrar habitación")
            printMsg("2 - Registrar Cliente")
            printMsg("3 - Crear reserva ")
            printMsg("4 - Mostrar habitaciones")

            val selectedOption = readln().toInt()
            validateOptions(selectedOption)
        }
    }

    private fun validateOptions(selectedOption: Int) {
        when (selectedOption) {
            1 -> {
                roomsController.registerRoom()
                showMenu()
            }

            2 -> {
                customersController.registerCustomer()
                showMenu()
            }

            3 -> {
                selectCustomerAndClient()
                showMenu()
            }

            4 -> {
                roomsController.showRooms()
                showMenu()
            }
        }
    }

    private fun selectCustomerAndClient() {
        printer.printMsg("Seleccione un cliente")
        customersController.showCustomers()

        val selectedCustomerIndex = readln().toInt()
        val customer = customersController.getCustomerByIndex(selectedCustomerIndex - 1)

        printer.printMsg("Seleccione una habitacion")
        roomsController.showRooms()
        val selectedRoomIndex = readln().toInt()
        val room = roomsController.getRoomByIndex(selectedRoomIndex - 1)

        bookingsController.createBooking(customer, room)
    }
}