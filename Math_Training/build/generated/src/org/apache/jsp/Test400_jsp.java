package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class Test400_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    int x = (Integer)hs.getAttribute("x");
    int y = (Integer)hs.getAttribute("y");
    int xy = (Integer)hs.getAttribute("xy");
    boolean tf = (Boolean)hs.getAttribute("tf");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>400マス計算</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>\n");
      out.write("            ");

                if(xy == -1){
                   out.print("よろしくお願いします<br><br>"); 
                }else if(tf){
                    out.print("正解です<br><br>");
                }else{
                    out.print("不正解です<br>正解は "+xy+" です<br>");
                }
            
      out.write("\n");
      out.write("            <form action=\"Test400\" method=\"POST\">\n");
      out.write("                ");
      out.print( x+" × "+y+" ＝ ");
      out.write("\n");
      out.write("                <input type=\"text\" name=\"ans\" value=\"\">\n");
      out.write("                <input type=\"submit\" name=\"btnSubmit\" value=\"次へ\">\n");
      out.write("            </form>\n");
      out.write("        </h1>\n");
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
