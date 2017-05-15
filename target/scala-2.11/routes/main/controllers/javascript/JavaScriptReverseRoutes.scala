
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gdo/workspace/soclordsscala/conf/routes
// @DATE:Sun May 14 16:03:41 BST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseLocalAuthorityController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def findla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocalAuthorityController.findla",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseLandlordsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def landlords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LandlordsController.landlords",
      """
        function(llord0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "landlords/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("llord", encodeURIComponent(llord0))})
        }
      """
    )
  
  }


}
