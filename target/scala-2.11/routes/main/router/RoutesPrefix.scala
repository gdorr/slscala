
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gdo/workspace/soclordsscala/conf/routes
// @DATE:Sun May 14 16:03:41 BST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
