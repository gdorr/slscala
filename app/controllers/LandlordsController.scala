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
      println("LORD: "+llord)
      
      Ok(views.html.header(views.html.landlords(socLordDB.getFiltered("Hyndburn"))))
    }
  }
}
 