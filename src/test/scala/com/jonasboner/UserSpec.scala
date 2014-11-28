package com.jonasboner.test

import com.jonasboner.UserServiceComponent
import com.jonasboner.UserRepositoryComponent

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen
import org.scalamock.scalatest.MockFactory

class UserSpec extends FreeSpec with ShouldMatchers with GivenWhenThen with MockFactory {

  trait TestEnvironment extends UserServiceComponent with UserRepositoryComponent {
    val userRepository = mock(classOf[UserRepository])
    val userService = mock(classOf[UserService])
  }
}
