

package netStuff
import play.api.libs.json._
import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.duration._
import play.api.mvc._
import play.api.libs.ws._
import play.api.http.HttpEntity
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._
import akka.util.ByteString
import scala.concurrent.ExecutionContext

class restCall @Inject() (ws: WSClient) {
    val request: WSRequest = ws.url("https://mapit.mysociety.org//postcode/BB5%203AE")
  
}

