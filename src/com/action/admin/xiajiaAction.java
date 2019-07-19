package com.action.admin;

import java.util.List;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Page;
import com.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.service.AdminService;

public class xiajiaAction {
	
	private AdminService adminService;
	private List<Goods> list;
	private int goodId;
	private Users user;
	private Page pageBean,pageBean1;// ��װ�˷�ҳ��Ϣ���������ݵ�pageBean
	private int page = 1; // ��ʾ����ҳ�з��صĵ�ǰҳ��ֵ Ĭ��Ϊ1 ��ʾĬ����ʾ��һҳ����
	
	
	
	public Page getPageBean1() {
		return pageBean1;
	}
	public void setPageBean1(Page pageBean1) {
		this.pageBean1 = pageBean1;
	}
	public Page getPageBean() {
		return pageBean;
	}
	public void setPageBean(Page pageBean) {
		this.pageBean = pageBean;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public List<Goods> getList() {
		return list;
	}
	public void setList(List<Goods> list) {
		this.list = list;
	}
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	
	public String selectGood2(){
		pageBean=adminService.queryForGood2(4, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean  
		list=this.pageBean.getList();//��ȡ����
		ActionContext.getContext().put("yifabu", list);
		select();
		return "success";
	}
	public String selectGood3(){
		pageBean1=adminService.queryForGood3(4, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean  
		list=this.pageBean1.getList();//��ȡ����
		ActionContext.getContext().put("yixiajia", list);
		select();
		return "success";
	}
	
	public String updateGood(){
		Goods g=new Goods();
	    g.setGoodId(goodId);
		adminService.updateGood1(g);
		pageBean=adminService.queryForGood2(4, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean  
		list=this.pageBean.getList();//��ȡ����
		ActionContext.getContext().put("yifabu", list);
		insertTomessage();
		select();
		return "success";
	}
	
	
	public void select(){
		Admin admin =new Admin();
		admin=adminService.findAdminById(1);
		ActionContext.getContext().put("admin", admin);
	}
	
	public void insertTomessage(){
		Message m=new Message();
		Users u=adminService.findUserByGoodId(goodId);
		m.setUsers(u);
		adminService.insertMessage3(m);
	}

}
