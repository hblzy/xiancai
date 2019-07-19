package com.entity;

import java.io.Serializable;
import java.util.List;

public class Page{
	
	
	private int allRow; //�ܼ�¼��
	private int totalPage;  //��ҳ��
	private int currentPage;  //��ǰҳ
	private int pageSize;  //ÿҳ�ļ�¼��
	private boolean isFirstPage;  //�Ƿ�Ϊ��ǰ��һҳ
	private boolean isLastPage;  //�Ƿ�Ϊ���һҳ
	private boolean hasPreviousPage;  //�Ƿ���ǰһҳ
	private boolean hasNextPage;  //�Ƿ�����һҳ
	private List<Goods> list;  //Ҫ���ص�ĳһҳ�ļ�¼�б�
	private List<Refurdform> list1;
	private List<Message> list2;  //Ҫ���ص�ĳһҳ�ļ�¼�б�
	private List<Users> list3;
	
	public List<Users> getList3() {
		return list3;
	}
	public void setList3(List<Users> list3) {
		this.list3 = list3;
	}
	public List<Refurdform> getList1() {
		return list1;
	}
	public List<Message> getList2() {
		return list2;
	}
	public void setList2(List<Message> list2) {
		this.list2 = list2;
	}
	public void setList1(List<Refurdform> list1) {
		this.list1 = list1;
	}
	public List<Goods> getList() {
		return list;
	}
	public void setList(List<Goods> list) {
		this.list = list;
	}
	public int getAllRow() {
		return allRow;
	}
	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public boolean isFirstPage() {
		return isFirstPage;
	}
	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}
	public boolean isLastPage() {
		return isLastPage;
	}
	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}
	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}
	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	/**
	 * ��ʼ����ҳ��Ϣ
	 */
	public void init(){
	this.isFirstPage = isFirstPage;
	this.isLastPage = isLastPage;
	this.hasPreviousPage = hasPreviousPage;
	this.hasNextPage = hasNextPage;
	}
	/**
	 * ������ҳ��  ��̬����
	 * @param pageSize  ÿҳ�ļ�¼��
	 * @param allRow  �ܼ�¼��
	 * @return ��ҳ��
	 */
	public static int countTatalPage(final int pageSize,final int allRow){
	int toalPage = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize + 1;
	return toalPage;
	}
	/**
	 * ���㵱ǰҳ��ʼ�ļ�¼
	 * @param pageSize ÿҳ��¼��
	 * @param currentPage ��ǰ�ڼ�ҳ
	 * @return ��ǰҳ��ʼ��¼��
	 */
	public static int countOffset(final int pageSize,final int currentPage){
	final int offset = pageSize * (currentPage - 1);
	return offset;
	}
	/**
	 * ���㵱ǰҳ����Ϊ0���������URL��û�С�?page = ������1����
	 * @param page ����Ĳ���������Ϊ�գ���0  �򷵻�1��
	 * @return
	 */
	public static int countCurrentPage(int page){
	final int curpage = (page == 0 ? 1 : page);
	return curpage;
	} 
	
}
