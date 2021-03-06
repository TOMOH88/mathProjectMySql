package question.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import question.model.service.QuestionService;
import question.model.vo.Question;


/**
 * Servlet implementation class SemesterSelect
 */
@WebServlet("/asemester")
public class AdminSemesterSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminSemesterSelect() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Question> list = new QuestionService().semesterSelect();

		// 전송할 json 객체 준비
		JSONObject sendJson = new JSONObject();
		// 리스트 객체들을 저장할 json 배열 객체 준비
		JSONArray jsonArr = new JSONArray();

		
		for (Question q : list) {
			
			JSONObject userJson = new JSONObject();
			
			userJson.put("semester", URLEncoder.encode(q.getSemester(), "UTF-8"));
			
			jsonArr.add(userJson);
		}

		
		sendJson.put("list", jsonArr);

		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(sendJson.toJSONString());
		out.flush();
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
