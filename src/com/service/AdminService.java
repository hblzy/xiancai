package com.service;

import java.util.List;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Orderform;
import com.entity.Page;
import com.entity.Refurdform;
import com.entity.Users;

public interface AdminService {
	
	
	//��¼
	public List login(Admin a);
	
	// ����Ա
	public List<Admin> findAdmin();
	public void updateAdmin(Admin a);
	public Admin findAdminById(int id);
	public void insertAdmin(Admin a);
	
	// ��Ϣ
//	public List<Message> findAllMessage();
	public Page queryForMessage(int pageSize,int page);
	public void insertMessage1(Message m);
	public void insertMessage2(Message m);
	public void insertMessage3(Message m);
	public Page queryForMessage1(int pageSize,int page);
	public Page queryForMessage2(int pageSize,int page);
	public Page queryForMessage3(int pageSize,int page);
	
	//�û�����
	//public List<Users> findAllUser();
	public Page queryForUser(int pageSize,int page);
	public void deleteUser(Users u);
	public Users findUserById(int userid);
	public void updateUser(Users u);
	
	
	//���
	//��ҳ
	public Page queryForGood1(int pageSize,int page);
	public Page queryForGood2(int pageSize,int page);
	public Users findUserByGoodId(int goodid);
	public Goods findGoodById(int goodid);
	public void updateGood(Goods g);
	public void updateGood2(Goods g);
	
	//�¼�
	public Page queryForGood3(int pageSize,int page);
	public void updateGood1(Goods g);
	
	//�˿�
	public Page queryForRefurdform1(int pageSize,int page);
	public Page queryForRefurdform2(int pageSize,int page);
	//public List<Refurdform> findRefurdform1();
	//public List<Refurdform> findRefurdform2();
	public Refurdform findRefurdformById(int id);
	public void updateRefurdform(Refurdform rf);
	public void updateRefurdform1(Refurdform rf);
	public Goods findGoodByRefurdId(int refurdid);
	public Users findUserByRefurdId(int refurdid);
	
}
