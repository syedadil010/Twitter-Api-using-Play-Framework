
package views.js

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.js._
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.JavaScriptFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.JavaScriptFormat.Appendable]](play.twirl.api.JavaScriptFormat) with _root_.play.twirl.api.Template0[play.twirl.api.JavaScriptFormat.Appendable] {

  /**/
  def apply():play.twirl.api.JavaScriptFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.3*/("""var wsUri = "ws://echo.websocket.org/";
  var output;

  function init()
  """),format.raw/*5.3*/("""{"""),format.raw/*5.4*/("""
    """),format.raw/*6.5*/("""output = document.getElementById("output");
    testWebSocket();
  """),format.raw/*8.3*/("""}"""),format.raw/*8.4*/("""

  """),format.raw/*10.3*/("""function testWebSocket()
  """),format.raw/*11.3*/("""{"""),format.raw/*11.4*/("""
    """),format.raw/*12.5*/("""websocket = new WebSocket(wsUri);
    websocket.onopen = function(evt) """),format.raw/*13.38*/("""{"""),format.raw/*13.39*/(""" """),format.raw/*13.40*/("""onOpen(evt) """),format.raw/*13.52*/("""}"""),format.raw/*13.53*/(""";
    websocket.onclose = function(evt) """),format.raw/*14.39*/("""{"""),format.raw/*14.40*/(""" """),format.raw/*14.41*/("""onClose(evt) """),format.raw/*14.54*/("""}"""),format.raw/*14.55*/(""";
    websocket.onmessage = function(evt) """),format.raw/*15.41*/("""{"""),format.raw/*15.42*/(""" """),format.raw/*15.43*/("""onMessage(evt) """),format.raw/*15.58*/("""}"""),format.raw/*15.59*/(""";
    websocket.onerror = function(evt) """),format.raw/*16.39*/("""{"""),format.raw/*16.40*/(""" """),format.raw/*16.41*/("""onError(evt) """),format.raw/*16.54*/("""}"""),format.raw/*16.55*/(""";
  """),format.raw/*17.3*/("""}"""),format.raw/*17.4*/("""

  """),format.raw/*19.3*/("""function onOpen(evt)
  """),format.raw/*20.3*/("""{"""),format.raw/*20.4*/("""
	"""),format.raw/*21.2*/("""$send.prop("disabled", false);
    writeToScreen("CONNECTED");
    doSend("WebSocket rocks");
  """),format.raw/*24.3*/("""}"""),format.raw/*24.4*/("""

  """),format.raw/*26.3*/("""function onClose(evt)
  """),format.raw/*27.3*/("""{"""),format.raw/*27.4*/("""
    """),format.raw/*28.5*/("""writeToScreen("DISCONNECTED");
  """),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""

  """),format.raw/*31.3*/("""function onMessage(evt)
  """),format.raw/*32.3*/("""{"""),format.raw/*32.4*/("""
    """),format.raw/*33.5*/("""writeToScreen('<span style="color: blue;">RESPONSE: ' + evt.data+'</span>');
    websocket.close();
  """),format.raw/*35.3*/("""}"""),format.raw/*35.4*/("""

  """),format.raw/*37.3*/("""function onError(evt)
  """),format.raw/*38.3*/("""{"""),format.raw/*38.4*/("""
    """),format.raw/*39.5*/("""writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data);
  """),format.raw/*40.3*/("""}"""),format.raw/*40.4*/("""

  """),format.raw/*42.3*/("""function doSend(message)
  """),format.raw/*43.3*/("""{"""),format.raw/*43.4*/("""
    """),format.raw/*44.5*/("""writeToScreen("SENT: " + message);
    websocket.send(message);
  """),format.raw/*46.3*/("""}"""),format.raw/*46.4*/("""

  """),format.raw/*48.3*/("""function writeToScreen(message)
  """),format.raw/*49.3*/("""{"""),format.raw/*49.4*/("""
    """),format.raw/*50.5*/("""var pre = document.createElement("p");
    pre.style.wordWrap = "break-word";
    pre.innerHTML = message;
    output.appendChild(pre);
  """),format.raw/*54.3*/("""}"""),format.raw/*54.4*/("""

  """),format.raw/*56.3*/("""window.addEventListener("load", init, false);"""))
      }
    }
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 22:34:38 EDT 2018
                  SOURCE: C:/Users/syeda/Desktop/final1/New folder/play-java-starter-example/app/views/index.scala.js
                  HASH: 0045c869d748d8d33458c2cc12de307a10edddae
                  MATRIX: 1056->2|1161->81|1188->82|1220->88|1315->157|1342->158|1375->164|1430->192|1458->193|1491->199|1591->271|1620->272|1649->273|1689->285|1718->286|1787->327|1816->328|1845->329|1886->342|1915->343|1986->386|2015->387|2044->388|2087->403|2116->404|2185->445|2214->446|2243->447|2284->460|2313->461|2345->466|2373->467|2406->473|2457->497|2485->498|2515->501|2641->600|2669->601|2702->607|2754->632|2782->633|2815->639|2876->673|2904->674|2937->680|2991->707|3019->708|3052->714|3183->818|3211->819|3244->825|3296->850|3324->851|3357->857|3457->930|3485->931|3518->937|3573->965|3601->966|3634->972|3729->1040|3757->1041|3790->1047|3852->1082|3880->1083|3913->1089|4082->1231|4110->1232|4143->1238
                  LINES: 33->1|37->5|37->5|38->6|40->8|40->8|42->10|43->11|43->11|44->12|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|49->17|49->17|51->19|52->20|52->20|53->21|56->24|56->24|58->26|59->27|59->27|60->28|61->29|61->29|63->31|64->32|64->32|65->33|67->35|67->35|69->37|70->38|70->38|71->39|72->40|72->40|74->42|75->43|75->43|76->44|78->46|78->46|80->48|81->49|81->49|82->50|86->54|86->54|88->56
                  -- GENERATED --
              */
          