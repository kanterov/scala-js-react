/*
 * Copyright 2014 Xored Software, Inc.
 * Copyright 2015 Gleb Kanterov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kanterov.scalajs.react.event

import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js

@js.native
trait TypedSyntheticEvent[+T <: dom.EventTarget] extends SyntheticEvent {
  override val target: T = js.native
}

@js.native trait TypedClipboardEvent[T <: dom.EventTarget] extends ClipboardEvent with TypedSyntheticEvent[T]
@js.native trait TypedFocusEvent[T <: dom.EventTarget] extends FocusEvent with TypedSyntheticEvent[T]
@js.native trait TypedFormEvent[T <: dom.EventTarget] extends FormEvent with TypedSyntheticEvent[T]
@js.native trait TypedKeyboardEvent[T <: dom.EventTarget] extends KeyboardEvent with TypedSyntheticEvent[T]
@js.native trait TypedMouseEvent[T <: dom.EventTarget] extends MouseEvent with TypedSyntheticEvent[T]
@js.native trait TypedTouchEvent[T <: dom.EventTarget] extends TouchEvent with TypedSyntheticEvent[T]
@js.native trait TypedUIEvent[T <: dom.EventTarget] extends UIEvent with TypedSyntheticEvent[T]
@js.native trait TypedWheelEvent[T <: dom.EventTarget] extends WheelEvent with TypedSyntheticEvent[T]

@js.native
trait TypedInputFormEvent extends TypedFormEvent[html.Input] {
  val value: String = js.native
}

@js.native
trait TypedCheckboxFormEvent extends TypedFormEvent[html.Input] {
  val checked: Boolean = js.native
}

@js.native
trait TypedOptionFormEvent extends TypedFormEvent[html.Input] {
  val selected: Boolean = js.native
}
