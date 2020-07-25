
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/syeda/Desktop/final1/New folder/play-java-starter-example/conf/routes
// @DATE:Tue Apr 10 22:34:37 EDT 2018


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
