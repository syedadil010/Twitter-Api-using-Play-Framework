
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object viewtweets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results : List[String], links : List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<h1>Recent Tweets</h1>
	<ol>
		"""),_display_(/*10.4*/for(index <- 0 until results.size) yield /*10.38*/{_display_(Seq[Any](format.raw/*10.39*/("""
		"""),format.raw/*11.3*/("""<li>
			<p>
				<a href="profile/"""),_display_(/*13.23*/links(index)),format.raw/*13.35*/("""">"""),_display_(/*13.38*/links(index)),format.raw/*13.50*/("""</a>: """),_display_(/*13.57*/results(index)),format.raw/*13.71*/("""
			"""),format.raw/*14.4*/("""</p>
		</li> 
		""")))}),format.raw/*16.4*/("""
	"""),format.raw/*17.2*/("""</ol>
</body>
</html>"""))
      }
    }
  }

  def render(results:List[String],links:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(results,links)

  def f:((List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (results,links) => apply(results,links)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 22:34:39 EDT 2018
                  SOURCE: C:/Users/syeda/Desktop/final1/New folder/play-java-starter-example/app/views/viewtweets.scala.html
                  HASH: c233938b7a2e41a9cc35ff5c0a2ee234acf443e3
                  MATRIX: 972->1|1113->47|1141->49|1269->151|1319->185|1358->186|1389->190|1452->226|1485->238|1515->241|1548->253|1582->260|1617->274|1649->279|1698->298|1728->301
                  LINES: 28->1|33->1|34->2|42->10|42->10|42->10|43->11|45->13|45->13|45->13|45->13|45->13|45->13|46->14|48->16|49->17
                  -- GENERATED --
              */
          