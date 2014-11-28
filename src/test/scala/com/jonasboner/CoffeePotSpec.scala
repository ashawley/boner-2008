package com.jonasboner.test

import com.jonasboner.PotSensor
import com.jonasboner.Heater
import com.jonasboner.Warmer

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen
import org.scalamock.scalatest.MockFactory

class CoffeePotSpec extends FreeSpec with ShouldMatchers with GivenWhenThen with MockFactory {

  object TestEnvironment extends MockFactory {
    lazy val heater = mock[Heater]
    lazy val potSensor = mock[PotSensor]
    lazy val warmer = mock[Warmer](this)
  }
}
