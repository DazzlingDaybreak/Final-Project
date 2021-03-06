package kh.spring.dto;

import java.sql.Timestamp;

public class MemberDTO {
	private int    seq;
	private String id;
	private String pw;
	private String name;
	private String nickname;
	private String phone;
	private String email;
	private String zipcode;
	private String address1;
	private String address2;
	private String bank;
	private String account;
	private String money;
	private String grade;
	private String blacklist;
	private String kakaologin;
	private Timestamp signUp_date;
	
	
   
   public MemberDTO() {}


   public MemberDTO(int seq, String id, String pw, String name, String nickname, String phone, String email,
         String bank, String account, String money, String grade, String blacklist, String kakaologin,
         String zipcode, String address1, String address2, Timestamp signUp_date) {

   }



   public int getSeq() {
      return seq;
   }

   public void setSeq(int seq) {
      this.seq = seq;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPw() {
      return pw;
   }

   public void setPw(String pw) {
      this.pw = pw;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getBank() {
      return bank;
   }

   public void setBank(String bank) {
      this.bank = bank;
   }

   public String getAccount() {
      return account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public String getMoney() {
      return money;
   }

   public void setMoney(String money) {
      this.money = money;
   }

   public String getGrade() {
      return grade;
   }

   public void setGrade(String grade) {
      this.grade = grade;
   }

   public String getBlacklist() {
      return blacklist;
   }

   public void setBlacklist(String blacklist) {
      this.blacklist = blacklist;
   }

   public String getKakaologin() {
      return kakaologin;
   }

   public void setKakaologin(String kakaologin) {
      this.kakaologin = kakaologin;
   }

   public String getZipcode() {
      return zipcode;
   }

   public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
   }

   public String getAddress1() {
      return address1;
   }

   public void setAddress1(String address1) {
      this.address1 = address1;
   }

   public String getAddress2() {
      return address2;
   }

   public void setAddress2(String address2) {
      this.address2 = address2;
   }


   public Timestamp getSignUp_date() {
      return signUp_date;
   }


   public void setSignUp_date(Timestamp signUp_date) {
      this.signUp_date = signUp_date;
   }

}