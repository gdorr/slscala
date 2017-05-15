package controllers

import javax.inject._
import socialLandlordDatabase._
import play.api._
import play.api.mvc._
import play.api.libs.ws._
import socialLandlordDatabase._
import play.api.libs.json._
import play.api.libs.concurrent.Execution.Implicits.defaultContext

@Singleton
class LandlordsController extends Controller {

  @Inject var ws: WSClient = null

  def landlords(llord: String)  = Action { implicit request =>
    {
      //ws.url("https://mapit.mysociety.org/postcode/bb53ae").get().map(r => println(r.json \ "shortcuts" \ "council" \ "district"))  

      var ss: String=llord.toUpperCase().replaceFirst("BOROUGH COUNCIL", "").replaceFirst("DISTRICT COUNCIL", "").trim()
      println("LORD: "+ss)
      Ok(views.html.landlords(socLordDB.getFiltered(ss)))
    }
  }
}
 