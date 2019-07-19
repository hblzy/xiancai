package com.dao;

import java.util.List;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Orderform;
import com.entity.Page;
import com.entity.Refurdform;
import com.entity.Users;

public interface AdminDao {
	
	

	//����Ա
	public List login(Admin a);
	public List<Admin> findAdmin();
	public void updateAdmin(Admin a);
	public Admin findAdminById(int id);
	public void insertAdmin(Admin a);
	
	//��Ϣ
	public List<Message> findAllMessage(final int offset,final int length);
	public int getAllRowCount6();
	public void insertMessage1(Message m);
	public void insertMessage2(Message m);
	public void insertMessage3(Message m);
	public List<Message> findMessage1(final int offset,final int length);
	public int getMessageRowCount1();
	public List<Message> findMessage2(final int offset,final int length);
	public int getMessageRowCount2();
	public List<Message> findMessage3(final int offset,final int length);
	public int getMessageRowCount3();
	
	//�û�����
	public List<Users> findAllUser(final int offset,final int length);
	public int getAllRowCount7();
	public void deleteUser(Users u);
	public Users findUserById(int userid);
	public void updateUser(Users u);
	
	//���
	/* ��ҳ��ѯ hql  ��ѯ����  offset  ��ʼ��¼  length  һ�β�ѯ������¼     @return ��ѯ�ļ�¼���� */
	public List<Goods> findAllGood1(final int offset,final int length);
	public List<Goods> findAllGood2(final int offset,final int length);
	/* ��ѯ���еļ�¼��  hql ��ѯ���� return �ܼ�¼��  */
	public int getAllRowCount1();
	public int getAllRowCount2();
	public Users findUserByGoodId(int goodid);
	public Goods findGoodById(int goodid);
	public void updateGood(Goods g);//���ϼ�
	public void updateGood2(Goods g);//���޸�
	
	//�¼�
	public List<Goods> findAllGood3(final int offset,final int length);
	public int getAllRowCount3();
	public void updateGood1(Goods g);//���¼�
	
	//�˿�
	public List<Refurdform> findRefurdform1(final int offset,final int length);
	public List<Refurdform> findRefurdform2(final int offset,final int length);
	public int getAllRowCount4();
	public int getAllRowCount5();
	public Refurdform findRefurdformById(int id);
	public void updateRefurdform(Refurdform rf);//ͬ���˿�
	public void updateRefurdform1(Refurdform rf);//�ܾ��˿�
	public Goods findGoodByRefurdId(int refurdid);
	public Users findUserByRefurdId(int refurdid);
	
	
}
