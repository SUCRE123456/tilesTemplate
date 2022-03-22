package co.micol.dbtest.member.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.dbtest.common.DbCommand;
import co.micol.dbtest.member.serviceImpl.MemberServiceImpl;
import co.micol.dbtest.member.vo.MemberVO;
import co.micol.dbtest.notice.serviceImpl.NoticeServiceImpl;
import co.micol.dbtest.notice.vo.NoticeVO;

public class MemberList implements DbCommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 공지사항 전체보기
				MemberServiceImpl dao = new MemberServiceImpl();
				List<MemberVO> list = new ArrayList<MemberVO>();

				list = dao.selectMemberList();
				request.setAttribute("members", list);

				return "member/memberList.tiles";
	}

	

}
