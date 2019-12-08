package com.codeinvestigator.springbootkotlinjsonnested.space

data class SpaceStation(var name: String, var inhabitants: Int, var spaceships:List<SpaceShip> ) {
    constructor():this("NOT_SET", -1, listOf())
}
