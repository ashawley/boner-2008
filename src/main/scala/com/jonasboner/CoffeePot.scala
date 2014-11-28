package com.jonasboner

trait OnOffDevice {
  def on: Unit
  def off: Unit
}
trait SensorDevice {
  def isCoffeePresent: Boolean
}

class Heater extends OnOffDevice {
  def on = println("heater.on")
  def off = println("heater.off")
}
class PotSensor extends SensorDevice {
  def isCoffeePresent = true
}

class Warmer(env: {
  val potSensor: SensorDevice
  val heater: OnOffDevice
}) {
  def trigger = {
    if (env.potSensor.isCoffeePresent) env.heater.on
    else env.heater.off
  }
}

class Client(env: { val warmer: Warmer }) {
  env.warmer.trigger
}

object Config {
  lazy val potSensor = new PotSensor
  lazy val heater = new Heater
  lazy val warmer = new Warmer(this)
}

object CoffeePot extends App {
  new Client(Config)
}
