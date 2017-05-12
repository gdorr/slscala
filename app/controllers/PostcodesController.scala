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
class PostcodesController extends Controller {

  @Inject var ws: WSClient = null

  def postcodes(pcode: String)  = Action { implicit request =>
    {
      println("Call: "+pcode)
      ws.url("https://mapit.mysociety.org/postcode/bb53ae").get().map(r => println(r.json \ "shortcuts" \ "council" \ "district"))  
      Ok(views.html.postcodes(socLordDB.getFiltered("Hyndburn")))
    }
  }
}
 