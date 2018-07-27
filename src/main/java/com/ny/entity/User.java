package com.ny.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 用户的实体类
 * @author N.Y
 *
 */
public class User {
	private int user_id;
	private String username;
	private String password;
	private boolean member;
	private String realName;
	private boolean gender;
	private String idcard;
	private String phone_nume;
	private String address_original;
	private String address_living_1;
	private String address_living_2;
	private String photo;
	
	private List<House> hos;  //关联的House类型属性集合
	private List<Car> cars;  //关联的Car类型属性集合
	private List<Paper> pas;  //关联的Paper类型属性集合
	private List<Quali> qus;  //关联的Qualification类型属性集合
	private List<Drive> drs;  //关联的Drive类型属性集合
	private List<Contact> cos;  //关联的Contact类型属性集合
	private List<Creditcard> crs;  //关联的Creditcard类型属性集合
	private List<Education> eds;  //关联的Education类型属性集合
	private List<EmerContactFM> ecfs;  //关联的EmerContactFM类型属性集合
	private List<EmerContactWM> ecws;  //关联的EmerContactWM类型属性集合
	private List<Fund> fus;  //关联的Fund类型属性集合
	private List<Loan> los;  //关联的Loan类型属性集合
	private List<RiskInvestUser> rius;  //关联的RiskInvestUser类型属性集合
	private List<Security> ses;  //关联的Security类型属性集合
	private List<BlacklistCreditUser> bcus;  //关联的BlacklistCreditUser类型属性集合
	private List<BlacklistLegalUser> blus;  //关联的BlacklistLegalUser类型属性集合
	private List<BlacklistUser> bus;  //关联的BlacklistUser类型属性集合
	private List<Workout> wos;  //关联的Workout类型属性集合
	private List air = new ArrayList();
	private List<CardOut12M> co12m;  //关联的CardOut12M类型属性集合
	private List<CardOut3M> co3m;  //关联的CardOut3M类型属性集合
	private List<CardOut6M> co6m;  //关联的CardOut6M类型属性集合
	private List<Invest> ins;  //关联的Invest类型属性集合
	private List<Job> jos;  //关联的Job类型属性集合
	private List wor = new ArrayList();
	
	
	
	public List getWor() {
		return wor;
	}
	public void setWor(List wor) {
		this.wor = wor;
	}
	public List<Job> getJos() {
		return jos;
	}
	public void setJos(List<Job> jos) {
		this.jos = jos;
	}
	public List<Invest> getIns() {
		return ins;
	}
	public void setIns(List<Invest> ins) {
		this.ins = ins;
	}
	public List<CardOut12M> getCo12m() {
		return co12m;
	}
	public void setCo12m(List<CardOut12M> co12m) {
		this.co12m = co12m;
	}
	public List<CardOut3M> getCo3m() {
		return co3m;
	}
	public void setCo3m(List<CardOut3M> co3m) {
		this.co3m = co3m;
	}
	public List<CardOut6M> getCo6m() {
		return co6m;
	}
	public void setCo6m(List<CardOut6M> co6m) {
		this.co6m = co6m;
	}
	public List getAir() {
		return air;
	}
	public void setAir(List air) {
		this.air = air;
	}
	public List<Workout> getWos() {
		return wos;
	}
	public void setWos(List<Workout> wos) {
		this.wos = wos;
	}
	public List<BlacklistUser> getBus() {
		return bus;
	}
	public void setBus(List<BlacklistUser> bus) {
		this.bus = bus;
	}
	public List<BlacklistLegalUser> getBlus() {
		return blus;
	}
	public void setBlus(List<BlacklistLegalUser> blus) {
		this.blus = blus;
	}
	public List<BlacklistCreditUser> getBcus() {
		return bcus;
	}
	public void setBcus(List<BlacklistCreditUser> bcus) {
		this.bcus = bcus;
	}
	public List<Security> getSes() {
		return ses;
	}
	public void setSes(List<Security> ses) {
		this.ses = ses;
	}
	public List<RiskInvestUser> getRius() {
		return rius;
	}
	public void setRius(List<RiskInvestUser> rius) {
		this.rius = rius;
	}
	public List<Loan> getLos() {
		return los;
	}
	public void setLos(List<Loan> los) {
		this.los = los;
	}
	public List<Fund> getFus() {
		return fus;
	}
	public void setFus(List<Fund> fus) {
		this.fus = fus;
	}
	public List<EmerContactFM> getEcfs() {
		return ecfs;
	}
	public void setEcfs(List<EmerContactFM> ecfs) {
		this.ecfs = ecfs;
	}
	public List<EmerContactWM> getEcws() {
		return ecws;
	}
	public void setEcws(List<EmerContactWM> ecws) {
		this.ecws = ecws;
	}
	public List<Education> getEds() {
		return eds;
	}
	public void setEds(List<Education> eds) {
		this.eds = eds;
	}
	public List<Creditcard> getCrs() {
		return crs;
	}
	public void setCrs(List<Creditcard> crs) {
		this.crs = crs;
	}
	public List<Contact> getCos() {
		return cos;
	}
	public void setCos(List<Contact> cos) {
		this.cos = cos;
	}
	public List<Drive> getDrs() {
		return drs;
	}
	public void setDrs(List<Drive> drs) {
		this.drs = drs;
	}
	public List<Quali> getQus() {
		return qus;
	}
	public void setQus(List<Quali> qus) {
		this.qus = qus;
	}
	public List<Paper> getPas() {
		return pas;
	}
	public void setPas(List<Paper> pas) {
		this.pas = pas;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public List<House> getHos() {
		return hos;
	}
	public void setHos(List<House> hos) {
		this.hos = hos;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getPhone_nume() {
		return phone_nume;
	}
	public void setPhone_nume(String phone_nume) {
		this.phone_nume = phone_nume;
	}
	public String getAddress_original() {
		return address_original;
	}
	public void setAddress_original(String address_original) {
		this.address_original = address_original;
	}
	public String getAddress_living_1() {
		return address_living_1;
	}
	public void setAddress_living_1(String address_living_1) {
		this.address_living_1 = address_living_1;
	}
	public String getAddress_living_2() {
		return address_living_2;
	}
	public void setAddress_living_2(String address_living_2) {
		this.address_living_2 = address_living_2;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

}
