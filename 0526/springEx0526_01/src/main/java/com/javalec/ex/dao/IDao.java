package com.javalec.ex.dao;

import java.util.ArrayList;

import com.javalec.ex.dto.BDto;

public interface IDao {
	public ArrayList<BDto> list();

	public void write(String bName, String bTitle, String bContent);

	public BDto contentView(String bId);

	public void delete(String bId);

	public void modify(String bId, String bName, String bTitle, String bContent);

	public BDto modifyView(String bId);

	public BDto reply_view(String bId);

	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep,
			String bIndent);

	public void replyshape(String bGroup, String bStep);

	public void upHit(String bId);
}
