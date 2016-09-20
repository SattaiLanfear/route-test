package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class ApplicationController @Inject() extends Controller {

  def trailing = Action {
    NoContent
  }

  def nontrailing = Action {
    NoContent
  }

  def nontrailingd = Action {
    NoContent
  }

}
