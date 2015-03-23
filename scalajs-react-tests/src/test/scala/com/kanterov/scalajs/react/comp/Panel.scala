package com.kanterov.scalajs.react.comp

import com.kanterov.scalajs.react._

object Panel extends TypedReactSpec {
  case class State()
  case class Props(children: ReactDOM*)

  def getInitialState(self: This) = State()

  @scalax
  def render(self: This) = {
    <div className="panel">
      {
        self.props.children
      }
    </div>
  }
}
