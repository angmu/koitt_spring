package com.javalec.ex.dao;

import java.util.ArrayList;

import com.javalec.ex.dto.BDto;

public interface IDao {

	public ArrayList<BDto> list();
	public void write(final String bName,final String bTitle,final String bContent);
	public BDto contentView(String bId);
	public void upHit(final String bId);
	public BDto modifyView(String bId);
	public void modify(final int bId,final String bName,final String bTitle,final String bContent);
	public void delete(final String bId);
	public BDto reply_view(String bId);
	public void reply(final String bName,final String bTitle,final String bContent,final int bGroup,final int bStep,final int bIndent);
	public void replyshape(final int bGroup,final int bStep);
	public BDto loginCheck(BDto bDto);
	
}
