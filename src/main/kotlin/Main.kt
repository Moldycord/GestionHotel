package org.danieer.com

import org.danieer.com.controllers.MenuController
import org.danieer.com.entities.Room

fun main() {
//    val menuController = MenuController()
    // menuController.showMenu()


    val room1 = Room(10.0, 2, 3, true)
    val room2 = room1

    println(room1.toString())
    println(room2.toString())
}