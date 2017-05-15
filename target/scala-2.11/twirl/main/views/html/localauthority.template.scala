
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object localauthority_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object localauthority_Scope1 {
import socialLandlordDatabase._
import scala.collection.mutable._

class localauthority extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(param: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.17*/("""
	
"""),_display_(/*7.2*/header/*7.8*/ {_display_(Seq[Any](format.raw/*7.10*/("""
"""),format.raw/*8.1*/("""<div class="container-fluid">

	<div class="row">
	    <div class="col-lg-12">
	        Enter your home postcode
	        <input type="text" id="dataentry" /><button onclick="searchforLA_clicked()">Search <span class="glyphicon glyphicon-search"></span></button>	
	    </div>
	</div>
	
	<div class="row">
	    <div class="col-lg-12">
	        <div class="panel-group" id="landlordlist">
	            <div class="panel panel-primary">
	                <div class="panel-heading">
	                    <h3 class="panel-title">
	                        Your local authority
	                    </h3>
	                </div>
	                <div class="panel-body">
						<div id="localauthority"></div>
	                </div>
	            </div>
	        </div>
	    </div>
	</div>

</div>
""")))}))
      }
    }
  }

  def render(param:String): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}
}

/**/
object localauthority extends localauthority_Scope0.localauthority_Scope1.localauthority
              /*
                  -- GENERATED --
                  DATE: Mon May 15 17:04:58 BST 2017
                  SOURCE: /home/gdo/workspace/soclordsscala/app/views/localauthority.scala.html
                  HASH: 7e0902e3b195c826c33bfa10f4e78dfc6c80b649
                  MATRIX: 648->93|758->108|787->112|800->118|839->120|866->121
                  LINES: 24->5|29->5|31->7|31->7|31->7|32->8
                  -- GENERATED --
              */
          