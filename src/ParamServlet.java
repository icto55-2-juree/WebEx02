import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/param")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ParamServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");
		String hobby[] = request.getParameterValues("hobby");
		String check_mail = request.getParameter("check_mail");
		String kind = request.getParameter("kind");
		String content = request.getParameter("content");

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		out.println("<h1>당신이 입력한 정보입니다.</h1> <hr>");
		out.println("이름=" + name + "<br>");
		out.println("직종=" + kind + "<br>");
		if (hobby == null) {
			out.println("취미=선택한 항목이 없습니다.");
		} else {
			out.println("취미=");
			for (String h : hobby) {
				out.println(h + " ");
			}
			out.println("<br>");
		}
		out.println("메일 수신 여부=" + check_mail + "<br>");
		out.println("가입소감=" + content + "<br><hr>");
		out.println("<a href='form_test.jsp'>다시</a>");
	}

}
