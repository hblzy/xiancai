package com.action.admin;

import java.util.List;

import com.dao.AdminDao;
import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Page;
import com.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.service.AdminService;

public class shenheAction {
	
	private AdminService adminService;
	private List<Goods> list;
	private int goodId;
	private Users user;
	private Page pageBean,pageBean1;// ��װ�˷�ҳ��Ϣ���������ݵ�pageBean
	//private List<Goods> listGoods;// ���ڴ���pageBean���б���װ��good��Ϣ
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
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
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
	/*
	public String selectAdmin(){
		select();
		return "success";
	}
	*/
	public String selectGood1(){
		pageBean=adminService.queryForGood1(4, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean  
		list=this.pageBean.getList();//��ȡ����    
		//list=adminService.findAllGood1();
		ActionContext.getContext().put("daigood", list);
		select();
		return "success";
	}
	public String selectGood2(){
		pageBean1=adminService.queryForGood2(4, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean  
		list=this.pageBean1.getList();//��ȡ����    
		//list=adminService.findAllGood2();
		ActionContext.getContext().put("yigood", list);
		select();
		return "success";
	}
	public String updateGood(){
		Goods g=new Goods();
	    g.setGoodId(goodId);
	    System.out.println(goodId);
		adminService.updateGood(g);
		pageBean=adminService.queryForGood1(4, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean  
		list=this.pageBean.getList();//��ȡ����    
		ActionContext.getContext().put("daigood", list);
		//insertTomessage();
		select();
		return "success";
	}
	
	public String updateGood2(){
		Goods g=new Goods();
	    g.setGoodId(goodId);
	    System.out.println(goodId);
		adminService.updateGood2(g);
		pageBean=adminService.queryForGood1(4, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean  
		list=this.pageBean.getList();//��ȡ����    
		ActionContext.getContext().put("daixiugai", list);
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
		adminService.insertMessage1(m);
	}
	
	
	
	public String selectonegood(){
		Goods g = new Goods();
		g = adminService.findGoodById(goodId);
		ActionContext.getContext().put("g", g);
		return "success";
	}
	
	
}
