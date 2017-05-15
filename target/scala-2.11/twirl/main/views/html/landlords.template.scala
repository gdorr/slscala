
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object landlords_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object landlords_Scope1 {
import socialLandlordDatabase._
import scala.collection.mutable._

class landlords extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ListBuffer[landlord],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(param: ListBuffer[landlord]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.31*/("""

"""),_display_(/*7.2*/header/*7.8*/ {_display_(Seq[Any](format.raw/*7.10*/("""
 """),format.raw/*8.2*/("""<div class="container-fluid">

	<div class="row">
	
	    <div class="col-lg-12">
	
	        <div class="panel-group"  id="landlordlist">
	            	"""),_display_(/*15.16*/for(p <- param) yield /*15.31*/ {_display_(Seq[Any](format.raw/*15.33*/("""

	            """),format.raw/*17.14*/("""<div class="panel panel-primary">
	            
		                <div class="panel-heading">
		                <p class="panel-title">
		                    <a href="#LL"""),_display_(/*21.36*/p/*21.37*/.ID),format.raw/*21.40*/("""" data-parent="#landlordlist" data-toggle="collapse">
		                        """),_display_(/*22.28*/p/*22.29*/.Landlord),format.raw/*22.38*/("""
		                    """),format.raw/*23.23*/("""</a></p>
		                </div>
		                <div class="panel-collapse collapse" id="LL"""),_display_(/*25.63*/p/*25.64*/.ID),format.raw/*25.67*/("""">
		                <div class="panel-body">
						    """),_display_(/*27.12*/p/*27.13*/.RPCode),format.raw/*27.20*/("""<br />
						    """),_display_(/*28.12*/p/*28.13*/.RegAddr(0)),format.raw/*28.24*/("""<br />
						    """),_display_(/*29.12*/p/*29.13*/.RegAddr(1)),format.raw/*29.24*/("""<br />
						    """),_display_(/*30.12*/p/*30.13*/.RegAddr(2)),format.raw/*30.24*/("""<br />
						    """),_display_(/*31.12*/p/*31.13*/.RegAddr(3)),format.raw/*31.24*/("""<br />
						    """),_display_(/*32.12*/p/*32.13*/.RegAddr(4)),format.raw/*32.24*/("""<br />
						    """),_display_(/*33.12*/p/*33.13*/.Postcode),format.raw/*33.22*/("""<br />
						    """),_display_(/*34.12*/p/*34.13*/.Phone),format.raw/*34.19*/("""<br />
						    """),_display_(/*35.12*/p/*35.13*/.Designation),format.raw/*35.25*/("""<br />
						    """),_display_(/*36.12*/p/*36.13*/.RegDate),format.raw/*36.21*/("""<br />
						    """),_display_(/*37.12*/p/*37.13*/.LegalEntity),format.raw/*37.25*/("""<br />
						    """),_display_(/*38.12*/p/*38.13*/.Country),format.raw/*38.21*/("""<br />
						    """),_display_(/*39.12*/p/*39.13*/.UCLSEmail),format.raw/*39.23*/("""<br />
						    """),_display_(/*40.12*/p/*40.13*/.UCFSEmai),format.raw/*40.22*/("""<br />
						    """),_display_(/*41.12*/p/*41.13*/.FirstContact),format.raw/*41.26*/("""<br />
						    """),_display_(/*42.12*/p/*42.13*/.Email),format.raw/*42.19*/("""
						    """),format.raw/*43.11*/("""</div>
		            
		                </div>
						
				
				
	            
	            </div>
	            """)))}),format.raw/*51.15*/("""
	        """),format.raw/*52.10*/("""</div>
	    </div>
		
	</div>
</div>
""")))}))
      }
    }
  }

  def render(param:ListBuffer[landlord]): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((ListBuffer[landlord]) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}
}

/**/
object landlords extends landlords_Scope0.landlords_Scope1.landlords
              /*
                  -- GENERATED --
                  DATE: Mon May 15 18:07:31 BST 2017
                  SOURCE: /home/gdo/workspace/soclordsscala/app/views/landlords.scala.html
                  HASH: 892aaf8b14797fa1ff7fdfaef0bb1eae1bdf1853
                  MATRIX: 647->100|771->129|799->132|812->138|851->140|879->142|1058->294|1089->309|1129->311|1172->326|1370->497|1380->498|1404->501|1512->582|1522->583|1552->592|1603->615|1726->711|1736->712|1760->715|1844->772|1854->773|1882->780|1927->798|1937->799|1969->810|2014->828|2024->829|2056->840|2101->858|2111->859|2143->870|2188->888|2198->889|2230->900|2275->918|2285->919|2317->930|2362->948|2372->949|2402->958|2447->976|2457->977|2484->983|2529->1001|2539->1002|2572->1014|2617->1032|2627->1033|2656->1041|2701->1059|2711->1060|2744->1072|2789->1090|2799->1091|2828->1099|2873->1117|2883->1118|2914->1128|2959->1146|2969->1147|2999->1156|3044->1174|3054->1175|3088->1188|3133->1206|3143->1207|3170->1213|3209->1224|3352->1336|3390->1346
                  LINES: 24->5|29->5|31->7|31->7|31->7|32->8|39->15|39->15|39->15|41->17|45->21|45->21|45->21|46->22|46->22|46->22|47->23|49->25|49->25|49->25|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35|60->36|60->36|60->36|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|75->51|76->52
                  -- GENERATED --
              */
          