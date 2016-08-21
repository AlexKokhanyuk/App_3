package com.kokhanyuk.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * by Alex on 5/18/2016.
 */
public class Controller extends HttpServlet {


    private static final long serialVersionUID = 1L;

    //    public Controller() {
//        super();
//    }
//
//    public void init() throws ServletException
//    {
    // Do required initialization
//        message = "Hello World";
//    }
    // final ResourceBundle RB = ResourceBundle.getBundle("LocalStrings");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //StringBuilder users = new StringBuilder("  Users");
        //  Statement stmt = null;
        //  Connection conn = (Connection) getServletContext().getAttribute("connection");
//        try {
//
//            conn.setAutoCommit(true);
//            stmt = conn.createStatement();
//            stmt.executeQuery("select * from user where username='Kolesnik'");
//            ResultSet rs = stmt.getResultSet();
//            while (rs.next()) {
//                users.append("Id " + rs.getInt("id") + " Name " + rs.getString("UserName") + " password " + rs.getString("password") + "\n");
//            }
//            users.append("One");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        PrintWriter out = response.getWriter();
//       // String s = "Hello" + users.toString();
//        String s = "Hello";
//
//        out.println("<h1> " + s + " </h1>");
//        processRequest(request, response);


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\">");
        out.println("<title>Title</title>");
        out.println("</head><body>");
        out.println("<h1> We have Parameters: </h1>");

        Map map = request.getParameterMap();
        for (Object key : map.keySet()) {
            String keyStr = (String) key;
            String[] value = (String[]) map.get(keyStr);
            //System.out.println("Key" + (String)key + "   :   " + Arrays.toString(value));
            out.println("<h1> Key:_" + (String) key + "   :   " + Arrays.toString(value) + "+</h1>");
        }

        out.println("</body></html>");


//
//        response.setContentType("text/html");
//        response.setCharacterEncoding("UTF-8");
//
//        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html><html>");
//        out.println("<head>");
//        out.println("<meta charset=\"UTF-8\" />");
//
//        String title = RB.getString("requestparams.title");
//        out.println("<title>" + title + "</title>");
//        out.println("</head>");
//        out.println("<body bgcolor=\"white\">");
//
//        // img stuff not req'd for source code html showing
//
//        // all links relative
//
//        // XXX
//        // making these absolute till we work out the
//        // addition of a PathInfo issue
//
//        out.println("<a href=\"../reqparams.html\">");
//        out.println("<img src=\"../images/code.gif\" height=24 " +
//                "width=24 align=right border=0 alt=\"view code\"></a>");
//        out.println("<a href=\"../index.html\">");
//        out.println("<img src=\"../images/return.gif\" height=24 " +
//                "width=24 align=right border=0 alt=\"return\"></a>");
//
//        out.println("<h3>" + title + "</h3>");
//        String firstName = request.getParameter("firstname");
//        String lastName = request.getParameter("lastname");
//        out.println(RB.getString("requestparams.params-in-req") + "<br>");
//        if (firstName != null || lastName != null) {
//            out.println(RB.getString("requestparams.firstname"));
//            out.println(" = " + filter(firstName) + "<br>");
//            out.println(RB.getString("requestparams.lastname"));
//            out.println(" = " + filter(lastName));
//        } else {
//            out.println(RB.getString("requestparams.no-params"));
//        }
//        out.println("<P>");
//        out.print("<form action=\"");
//        out.print("RequestParamExample\" ");
//        out.println("method=POST>");
//        out.println(RB.getString("requestparams.firstname"));
//        out.println("<input type=text size=20 name=firstname>");
//        out.println("<br>");
//        out.println(RB.getString("requestparams.lastname"));
//        out.println("<input type=text size=20 name=lastname>");
//        out.println("<br>");
//        out.println("<input type=submit>");
//        out.println("</form>");
//
//        out.println("</body>");
//        out.println("</html>");


    }

//    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<html><head>");
//        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\">");
//        out.println("<title>Title</title>");
//        out.println("</head><body>");
//        out.println("<h1> Hello, world!!! Word </h1>");
//        out.println("</body></html>");
//
//
//    }


    public String filter(String message) {

        if (message == null)
            return (null);

        char content[] = new char[message.length()];
        message.getChars(0, message.length(), content, 0);
        StringBuilder result = new StringBuilder(content.length + 50);
        for (int i = 0; i < content.length; i++) {
            switch (content[i]) {
                case '<':
                    result.append("&lt;");
                    break;
                case '>':
                    result.append("&gt;");
                    break;
                case '&':
                    result.append("&amp;");
                    break;
                case '"':
                    result.append("&quot;");
                    break;
                default:
                    result.append(content[i]);
            }
        }
        return (result.toString());

    }

}
