import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // パラメータ取得（例: ?first=太郎&last=山田）
        String first = request.getParameter("first");
        String last = request.getParameter("last");

        // JSPに渡す
        request.setAttribute("firstName", first);
        request.setAttribute("lastName", last);

        // JSPへフォワード
        RequestDispatcher rd = request.getRequestDispatcher("/name.jsp");
        rd.forward(request, response);
    }
}
