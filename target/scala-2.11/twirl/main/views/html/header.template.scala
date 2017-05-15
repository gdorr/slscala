
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
   <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />


    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="/assets/javascript/code.js"></script>
    <link rel="stylesheet" href="/assets/stylesheets/mycss.css" />

</head>

<body>

    <div class="container-fluid">
	    <div class="row">
		    <nav class="navbar navbar-default">
		        <div class="container-fluid">
		
		            <div class="col-lg-2">
		
		                <div class="navbar-header">
		                    <img class="navbar-text" width="90" src="/assets/images/logo.png" alt "DWP logo" />
		
		                </div>
		            </div>
		            <div class="col-lg-6">
		            </div>
		            <div class="col-lg-4">
		                <div class="btn-group">
		                    <button type="button" class="btn btn-primary">About</button>
		                    <button type="button" class="btn btn-primary">Contact us</button>
		                    <button type="button" class="btn btn-primary">Help</button>
		                </div>
		            </div>
		
		        </div>
		    </nav>
		</div>

		<div class="row">
			"""),_display_(/*46.5*/content),format.raw/*46.12*/("""
		"""),format.raw/*47.3*/("""</div>
	</div>
	
    <script>
        $(document).ready(function() """),format.raw/*51.38*/("""{"""),format.raw/*51.39*/("""

        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/(""");

    </script>
</body>
</html>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Sun May 14 16:03:41 BST 2017
                  SOURCE: /home/gdo/workspace/soclordsscala/app/views/header.scala.html
                  HASH: 15cd477c42f2c8abc5886714b77689bb1e968e2c
                  MATRIX: 527->1|637->16|664->17|2118->1445|2146->1452|2176->1455|2271->1522|2300->1523|2337->1533|2366->1534
                  LINES: 20->1|25->1|26->2|70->46|70->46|71->47|75->51|75->51|77->53|77->53
                  -- GENERATED --
              */
          