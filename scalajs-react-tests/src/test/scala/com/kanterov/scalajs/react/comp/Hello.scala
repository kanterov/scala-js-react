package com.kanterov.scalajs.react.comp

import com.kanterov.scalajs.react._

object Hello extends TypedReactSpec {
  case class Props(name: String)
  case class State()

  def getInitialState(self: This) = State()

  @scalax
  def render(self: This) = {
    <h1>Hello {self.props.name}!</h1>
  }
}

