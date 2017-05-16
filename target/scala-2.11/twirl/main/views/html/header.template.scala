
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
   <script src="https://cdn.polyfill.io/v2/polyfill.min.js"></script>
   <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />


    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="/assets/javascript/code.js"></script>
    <link rel="stylesheet" href="/assets/stylesheets/mycss.css" />

	<title>Social landlords</title>
</head>

<body>

    <div class="container-fluid">
	    <div class="row">
		    <nav class="navbar navbar-default">
		        <div class="container-fluid">
		
		            <div class="col-lg-2">
		
		                <div class="navbar-header">
		                    <img class="navbar-text" width="90" src="/assets/images/logo.png" alt="DWP logo" />
		
		                </div>
		            </div>
		            <div class="col-lg-6">
		            </div>
		            <div class="col-lg-4">
		                <div class="btn-group">
		                    <button type="button" class="btn btn-primary" onclick="alert('hello')">About</button>
		                    <button type="button" class="btn btn-primary">Contact us</button>
		                    <button type="button" class="btn btn-primary">Help</button>
		                </div>
		            </div>
		
		        </div>
		    </nav>
		</div>

		<div class="row">
			"""),_display_(/*48.5*/content),format.raw/*48.12*/("""
		"""),format.raw/*49.3*/("""</div>
	</div>
	
    <script>
        $(document).ready(function() """),format.raw/*53.38*/("""{"""),format.raw/*53.39*/("""

        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/(""");

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
                  DATE: Tue May 16 16:33:22 BST 2017
                  SOURCE: /home/gdo/workspace/soclordsscala/app/views/header.scala.html
                  HASH: 888c1f3bc30b646a3a4f168e9b1ef3f3cc4d7a91
                  MATRIX: 527->1|637->16|664->17|2246->1573|2274->1580|2304->1583|2399->1650|2428->1651|2465->1661|2494->1662
                  LINES: 20->1|25->1|26->2|72->48|72->48|73->49|77->53|77->53|79->55|79->55
                  -- GENERATED --
              */
          