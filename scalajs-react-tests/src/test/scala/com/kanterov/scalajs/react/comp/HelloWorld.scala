package com.kanterov.scalajs.react.comp

import com.kanterov.scalajs.react._

object HelloWorld extends TypedReactSpec {
  case class Props()
  case class State()

  def getInitialState(self: This) = State()

  @scalax
  def render(self: This) = {
    <h1>Hello World!</h1>
  }
}
