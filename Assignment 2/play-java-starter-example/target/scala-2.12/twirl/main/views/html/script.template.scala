
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

object script extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(request: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

  """),format.raw/*3.3*/("""<!DOCTYPE html> 
  <html>
  
  <meta charset="utf-8" />
  <title>Reactive Tweets</title>
  
  
  <h2>Reactive Tweets</h2>
  <body>  

  
  <input type="text" id="name" >
  <br/>
    <button type="button" onclick="chk()">submit</button>
   
  
  <div id="output"></div> 
  
  <script type='text/javascript' src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
  <script language="javascript" type="text/javascript">

  var output;

  function init()
  """),format.raw/*27.3*/("""{"""),format.raw/*27.4*/("""
    """),format.raw/*28.5*/("""output = document.getElementById("output");

  """),format.raw/*30.3*/("""}"""),format.raw/*30.4*/("""

  """),format.raw/*32.3*/("""function chk()"""),format.raw/*32.17*/("""{"""),format.raw/*32.18*/("""
	  """),format.raw/*33.4*/("""var x = document.getElementById("name").value;
	  var n = "http://localhost:9000/script?keyword="+x;
	  testWebSocket(n);
  """),format.raw/*36.3*/("""}"""),format.raw/*36.4*/("""

  """),format.raw/*38.3*/("""function testWebSocket(n)
  """),format.raw/*39.3*/("""{"""),format.raw/*39.4*/("""
    """),format.raw/*40.5*/("""websocket = new WebSocket("ws://localhost:9000/ws");
    
    var xhttp = new XMLHttpRequest();
	  
	  xhttp.open("GET", n, true);
	  xhttp.send();
	  
    websocket.onopen = function(evt) """),format.raw/*47.38*/("""{"""),format.raw/*47.39*/(""" """),format.raw/*47.40*/("""onOpen(evt) """),format.raw/*47.52*/("""}"""),format.raw/*47.53*/(""";
    websocket.onclose = function(evt) """),format.raw/*48.39*/("""{"""),format.raw/*48.40*/(""" """),format.raw/*48.41*/("""onClose(evt) """),format.raw/*48.54*/("""}"""),format.raw/*48.55*/(""";
    websocket.onmessage = function(evt) """),format.raw/*49.41*/("""{"""),format.raw/*49.42*/(""" """),format.raw/*49.43*/("""onMessage(evt) """),format.raw/*49.58*/("""}"""),format.raw/*49.59*/(""";
    websocket.onerror = function(evt) """),format.raw/*50.39*/("""{"""),format.raw/*50.40*/(""" """),format.raw/*50.41*/("""onError(evt) """),format.raw/*50.54*/("""}"""),format.raw/*50.55*/(""";
  """),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""
  """),format.raw/*52.3*/("""function onOpen(evt)
  """),format.raw/*53.3*/("""{"""),format.raw/*53.4*/("""
    """),format.raw/*54.5*/("""var sent_message = JSON.stringify("Handshake"); 
    doSend(sent_message);
    writeToScreen("connected");
  """),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""

  """),format.raw/*59.3*/("""function onClose(evt)
  """),format.raw/*60.3*/("""{"""),format.raw/*60.4*/("""
    """),format.raw/*61.5*/("""writeToScreen("DISCONNECTED");
  """),format.raw/*62.3*/("""}"""),format.raw/*62.4*/("""

  """),format.raw/*64.3*/("""function onMessage(evt)
  """),format.raw/*65.3*/("""{"""),format.raw/*65.4*/("""
	
	"""),format.raw/*67.2*/("""var ResultObj = JSON.parse(evt.data);
	//writeToScreen(Result.Obj.response.tweets);
	writeLinks(ResultObj.response);

  """),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""

  """),format.raw/*73.3*/("""function onError(evt)
  """),format.raw/*74.3*/("""{"""),format.raw/*74.4*/("""
    """),format.raw/*75.5*/("""writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data);
  """),format.raw/*76.3*/("""}"""),format.raw/*76.4*/("""

  """),format.raw/*78.3*/("""function doSend(message)
  """),format.raw/*79.3*/("""{"""),format.raw/*79.4*/("""
    """),format.raw/*80.5*/("""websocket.send(message);
  """),format.raw/*81.3*/("""}"""),format.raw/*81.4*/("""

  """),format.raw/*83.3*/("""function writeToScreen(message)
  """),format.raw/*84.3*/("""{"""),format.raw/*84.4*/("""
	   """),format.raw/*85.5*/("""var pre = document.createElement("p");
	   pre.style.wordWrap = "break-word";
	   pre.innerHTML = message;
	   output.appendChild(pre);
  """),format.raw/*89.3*/("""}"""),format.raw/*89.4*/("""
  
  """),format.raw/*91.3*/("""function writeTweets(message)
  """),format.raw/*92.3*/("""{"""),format.raw/*92.4*/("""
	   """),format.raw/*93.5*/("""var pre = document.createElement("p");
	   pre.style.wordWrap = "break-word";
	   pre.innerHTML = message;
	   output.appendChild(pre);
  """),format.raw/*97.3*/("""}"""),format.raw/*97.4*/("""
  
  """),format.raw/*99.3*/("""function writeLinks(message)
  """),format.raw/*100.3*/("""{"""),format.raw/*100.4*/("""    
	
	  """),format.raw/*102.4*/("""if(Boolean(!document.getElementById(message.words)))"""),format.raw/*102.56*/("""{"""),format.raw/*102.57*/("""
		   """),format.raw/*103.6*/("""// Your existing code unmodified...
		var br = document.createElement("br");
		var iDiv = document.createElement("div");
		iDiv.id = message.words;
		iDiv.style.height = "200px";
		        iDiv.style.width = "auto";
				iDiv.style.overflow='auto'
		        iDiv.style.backgroundColor = '#BDBDBD';
		document.getElementsByTagName('body')[0].appendChild(iDiv);
		document.body.appendChild(br);

		// Now create and append to iDiv
		var br = document.createElement("br");
		var str = message.handle;

		    var result = str.link("https://localhost:9000/profile/"+message.handle);
		    var fullresult = message.words+result + message.tweets;
		   
		    document.getElementById(message.words).innerHTML = fullresult;
		    document.getElementById(message.words).appendChild(br);

		// The variable iDiv is still good... Just append to it.

		"""),format.raw/*126.3*/("""}"""),format.raw/*126.4*/("""else"""),format.raw/*126.8*/("""{"""),format.raw/*126.9*/("""

		
		"""),format.raw/*129.3*/("""var br = document.createElement("br");
		var element = document.getElementById(message.words);
		var str = message.handle;
		    var result = str.link("https://localhost:9000/profile/"+message.handle);
		    var fullresult = message.words+result + message.tweets;
		    document.getElementById(message.words).innerHTML += fullresult;

		document.getElementById(message.words).appendChild(br);
		// The variable iDiv is still good... Just append to it.

		"""),format.raw/*139.3*/("""}"""),format.raw/*139.4*/("""
		"""),format.raw/*140.3*/("""var theLinks = document.getElementById(message.words).getElementsByTagName("a");

		  for(var i = 0; i < theLinks.length; i++) """),format.raw/*142.46*/("""{"""),format.raw/*142.47*/("""
		    """),format.raw/*143.7*/("""theLinks[i].setAttribute('target','_blank');

		"""),format.raw/*145.3*/("""}"""),format.raw/*145.4*/("""

  """),format.raw/*147.3*/("""}"""),format.raw/*147.4*/("""
  """),format.raw/*148.3*/("""window.addEventListener("load", init, false);

  </script>
   
  </body>
  </html>"""))
      }
    }
  }

  def render(request:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 22:34:39 EDT 2018
                  SOURCE: C:/Users/syeda/Desktop/final1/New folder/play-java-starter-example/app/views/script.scala.html
                  HASH: 9108f77de28ca0ac11c338f5a5650dcc1c60a9b2
                  MATRIX: 964->1|1091->33|1123->39|1632->521|1660->522|1693->528|1769->577|1797->578|1830->584|1872->598|1901->599|1933->604|2087->731|2115->732|2148->738|2204->767|2232->768|2265->774|2489->970|2518->971|2547->972|2587->984|2616->985|2685->1026|2714->1027|2743->1028|2784->1041|2813->1042|2884->1085|2913->1086|2942->1087|2985->1102|3014->1103|3083->1144|3112->1145|3141->1146|3182->1159|3211->1160|3243->1165|3271->1166|3302->1170|3353->1194|3381->1195|3414->1201|3553->1313|3581->1314|3614->1320|3666->1345|3694->1346|3727->1352|3788->1386|3816->1387|3849->1393|3903->1420|3931->1421|3964->1427|4115->1551|4143->1552|4176->1558|4228->1583|4256->1584|4289->1590|4389->1663|4417->1664|4450->1670|4505->1698|4533->1699|4566->1705|4621->1733|4649->1734|4682->1740|4744->1775|4772->1776|4805->1782|4974->1924|5002->1925|5037->1933|5097->1966|5125->1967|5158->1973|5327->2115|5355->2116|5390->2124|5450->2156|5479->2157|5519->2169|5600->2221|5630->2222|5665->2229|6555->3091|6584->3092|6616->3096|6645->3097|6683->3107|7176->3572|7205->3573|7237->3577|7395->3706|7425->3707|7461->3715|7539->3765|7568->3766|7602->3772|7631->3773|7663->3777
                  LINES: 28->1|33->1|35->3|59->27|59->27|60->28|62->30|62->30|64->32|64->32|64->32|65->33|68->36|68->36|70->38|71->39|71->39|72->40|79->47|79->47|79->47|79->47|79->47|80->48|80->48|80->48|80->48|80->48|81->49|81->49|81->49|81->49|81->49|82->50|82->50|82->50|82->50|82->50|83->51|83->51|84->52|85->53|85->53|86->54|89->57|89->57|91->59|92->60|92->60|93->61|94->62|94->62|96->64|97->65|97->65|99->67|103->71|103->71|105->73|106->74|106->74|107->75|108->76|108->76|110->78|111->79|111->79|112->80|113->81|113->81|115->83|116->84|116->84|117->85|121->89|121->89|123->91|124->92|124->92|125->93|129->97|129->97|131->99|132->100|132->100|134->102|134->102|134->102|135->103|158->126|158->126|158->126|158->126|161->129|171->139|171->139|172->140|174->142|174->142|175->143|177->145|177->145|179->147|179->147|180->148
                  -- GENERATED --
              */
          