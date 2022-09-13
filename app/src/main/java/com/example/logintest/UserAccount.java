package com.example.logintest;

/**
 *
 */
public class UserAccount {
    private String emailId;     //이메일 아이디
    private String password;    //비밀번호
    private String idToken;     //Firebase Uid(고유 토큰정보)

    //firebase에서 빈 생성자를 만들어야 한다.
    public UserAccount() { }
    //토큰 가져오기 get, set
    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    //이메일을 가져오기 편하게 get, set 사용한다.

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
