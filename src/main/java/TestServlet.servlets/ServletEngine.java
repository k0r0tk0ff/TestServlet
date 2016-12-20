package TestServlet.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**.
 * Class for start program for test web
 * technology servlets.
 * @author k0r0tk0ff
 * @since 20.12.2016
 * @version 1.0
 */
public class ServletEngine extends HttpServlet {

    /**.
     * main class
     * @author k0r0tk0ff
     * @throws ServletException
     * @throws IOException
     * @version 1.0
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = new PrintWriter(response.getOutputStream());

        /**
         *  In variable out we are write what web server response
         */

        out.append(String.format("Hello, world!"));
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = new PrintWriter(response.getOutputStream());

        /**
         *  In variable out we are write what web server response
         */

        out.append(String.format("Hello, world!"));
        out.flush();
    }
}
