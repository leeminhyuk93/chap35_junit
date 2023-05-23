package com.javalab.board.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.javalab.board.vo.BoardVo;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="WEB-INF/config/root-context.xml")
public class BoardDaoTest {

	@Autowired
	private BoardDao boardDao;
	
	@Test //@Ignore
	public void boardDaoNotNull() {
		assertNotNull(boardDao);
	}
	
	@Test @Ignore
	public void testSelectBoardList() {
		ArrayList<BoardVo> boardList = boardDao.selectBoardList();
		assertNotNull(boardList);
		
		for(BoardVo boardVo : boardList) {
			System.out.println(boardVo.toString());
		}
	}
	
	

}
