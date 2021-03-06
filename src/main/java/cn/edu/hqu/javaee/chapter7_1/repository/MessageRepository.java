package cn.edu.hqu.javaee.chapter7_1.repository;

import java.util.List;

import cn.edu.hqu.javaee.chapter7_1.domain.entity.Message;

public interface MessageRepository {
	
	public List<Message> findMessageByUserId(Long userId);
	public void save(Message message);

}
