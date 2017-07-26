package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import PrimeNumbers.PrimeNumbersBeans;
import java.util.*;

public final class PrimeNumbers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    HttpSession hs = request.getSession();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>prime numbers</title>\n");
      out.write("    </head>\n");
      out.write("    <body onLoad=\"document.ans_form.ans.focus()\">\n");
      out.write("        <form action=\"PrimeNumbers\" method=\"POST\" name=\"ans_form\">\n");
      out.write("            <input type=\"text\" name=\"ans\" value=\"\" size=\"10\" maxlength=\"10\" placeholder=\"X\" pattern=\"[0-9０-９]+$\" title=\"自然数（正の整数）を入力してください\">\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" name=\"btnSubmit\" value=\"番目の素数は？\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 if (hs.getAttribute("PNB") != null) {
            PrimeNumbersBeans PNB = (PrimeNumbersBeans)hs.getAttribute("PNB");
      out.write("\n");
      out.write("            ");
      out.print( PNB.getAns());
      out.write("番目の素数は\n");
      out.write("            ");
      out.print( PNB.getLastPN());
      out.write("<br><br>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            チェック項目数(仮)：");
      out.print( PNB.getRoops().size() );
      out.write("<br>\n");
      out.write("            演算回数：");
      out.print( PNB.getRoopsSum() );
      out.write("<br>\n");
      out.write("            各整数ごとに素数かチェックするためにループした回数：<br>\n");
      out.write("            ");
for (int roop : PNB.getRoops()) {
      out.write("\n");
      out.write("                ");
      out.print( roop + " ");
      out.write("\n");
      out.write("            ");
 }
      out.write("<br>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
