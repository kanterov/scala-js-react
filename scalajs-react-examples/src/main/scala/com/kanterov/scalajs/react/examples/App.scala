package com.kanterov.scalajs.react.examples

import org.scalajs.dom._
import com.kanterov.scalajs.react._
import scala.scalajs.js.annotation.JSExport
import com.kanterov.scalajs.react.examples.todomvc.TodoApp
import com.kanterov.scalajs.react.examples.timer.Timer
import com.kanterov.scalajs.react.examples.hello.HelloMessage
import com.kanterov.scalajs.react.examples.say.Say
import com.kanterov.scalajs.react.examples.children.Children
import com.kanterov.scalajs.react.examples.export.Export

@JSExport("App")
object App {

  @JSExport
  def todoApp(parent: html.Element) = {
    React.renderComponent(
      TodoApp(TodoApp.Props()),
      parent
    )
  }

  @JSExport
  def timer(parent: html.Element) = {
    React.renderComponent(
      Timer(Timer.Props()),
      parent
    )
  }

  @JSExport
  def hello(parent: html.Element) = {
    React.renderComponent(
      HelloMessage(HelloMessage.Props("Jack")),
      parent
    )
  }

  @JSExport
  def say(parent: html.Element) = {
    React.renderComponent(
      Say(Say.Props()),
      parent
    )
  }

  @JSExport
  def export(parent: html.Element) = {
    React.renderComponent(
      Export(Export.Props()),
      parent
    )
  }

  @JSExport
  def children(parent: html.Element) = {
    Children.main(parent)
  }

}
