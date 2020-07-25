
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileInfo : String, tweets : List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
	<title></title>
	</head>
	<body>	
	<h1> Profile info</h1>
	"""),_display_(/*9.3*/profileInfo),format.raw/*9.14*/("""
    """),format.raw/*10.5*/("""<ol>
	"""),_display_(/*11.3*/for(index <- 0 until tweets.size) yield /*11.36*/{_display_(Seq[Any](format.raw/*11.37*/("""
	"""),format.raw/*12.2*/("""<li>
	<p> """),_display_(/*13.7*/tweets(index)),format.raw/*13.20*/(""" """),format.raw/*13.21*/("""</p>
  	 </li>
  """)))}),format.raw/*15.4*/("""
      """),format.raw/*16.7*/("""</ol>    
	</body>
</html>"""))
      }
    }
  }

  def render(profileInfo:String,tweets:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(profileInfo,tweets)

  def f:((String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (profileInfo,tweets) => apply(profileInfo,tweets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 22:34:39 EDT 2018
                  SOURCE: C:/Users/syeda/Desktop/final1/New folder/play-java-starter-example/app/views/profile.scala.html
                  HASH: 32b2bd7ae1e5be2d9b50f3f92cc6c703efb79e0c
                  MATRIX: 963->1|1103->46|1130->47|1247->139|1278->150|1310->155|1343->162|1392->195|1431->196|1460->198|1497->209|1531->222|1560->223|1608->241|1642->248
                  LINES: 28->1|33->1|34->2|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|45->13|45->13|47->15|48->16
                  -- GENERATED --
              */
          