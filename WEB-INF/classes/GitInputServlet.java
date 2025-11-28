import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GitInputServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // パラメータ取得
        String first = request.getParameter("first");
        String last = request.getParameter("last");

        // レスポンスの設定
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        // HTMLを直接出力
        out.println("<html>");
        out.println("<head><title>名前表示</title></head>");
        out.println("<body>");
        out.println("<h2>入力された名前</h2>");
        out.println("<p>姓は " + (last != null ? last : "") + "</p>");
        out.println("<p>名は " + (first != null ? first : "") + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}