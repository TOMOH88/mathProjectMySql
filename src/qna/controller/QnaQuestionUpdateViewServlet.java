package qna.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qna.model.service.QnaService;
import qna.model.vo.Qna;

/**
 * Servlet implementation class QnaUpdateViewServlet
 */
@WebServlet("/qqupview")
public class QnaQuestionUpdateViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QnaQuestionUpdateViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int qnaNo = Integer.parseInt(request.getParameter("no"));
		
		Qna qna = new QnaService().qnaDetail(qnaNo);
		
		RequestDispatcher view = null;
		if(qna != null) {
			view = request.getRequestDispatcher("views/qna/qnaQUpdateView.jsp");
			request.setAttribute("qna", qna);
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher("views/qna/qnaError.jsp");
			request.setAttribute("message", qnaNo + "번 상세보기 실패");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
