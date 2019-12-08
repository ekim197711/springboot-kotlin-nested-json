package com.codeinvestigator.springbootkotlinjsonnested.space

data class SpaceShip(var id:Int, var name:String, var crew:Int) {
    constructor():this(-1, "NOT_SET", -1)
}
