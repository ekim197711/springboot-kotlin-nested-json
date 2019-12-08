package com.codeinvestigator.springbootkotlinjsonnested.space

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Service

@Service
class SpaceStationService {

    fun spaceStation(): SpaceStation{
        val mapper = ObjectMapper()
        val jsonfile = ClassPathResource("spacestation.json")
        val station = mapper.readValue(jsonfile.inputStream, SpaceStation::class.java)
        return station
    }
}