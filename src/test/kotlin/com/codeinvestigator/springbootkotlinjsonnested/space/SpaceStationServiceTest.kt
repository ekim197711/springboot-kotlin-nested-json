package com.codeinvestigator.springbootkotlinjsonnested.space

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class SpaceStationServiceTest {
    @Autowired
    lateinit var spaceStationService: SpaceStationService

    @Test
    fun spaceStation() {
        val spaceStation = spaceStationService.spaceStation()
        println("My spacestation $spaceStation")
        val eagleship = spaceStation.spaceships.find { ship -> ship.name == "Eagle" }
        println("My Spaceship $eagleship")
    }
}