package com.jonasboner.test

import com.jonasboner.OnOffDeviceComponentImpl
import com.jonasboner.SensorDeviceComponentImpl
import com.jonasboner.WarmerComponentImpl

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen
import org.scalamock.scalatest.MockFactory

class CoffeePotSpec extends FreeSpec with ShouldMatchers with GivenWhenThen with MockFactory {

  trait TestEnvironment extends OnOffDeviceComponentImpl with SensorDeviceComponentImpl with WarmerComponentImpl {
    val onOff = mock[Heater]
    val sensor = mock[PotSensor]
    val warmer = mock[Warmer]
  }
}
