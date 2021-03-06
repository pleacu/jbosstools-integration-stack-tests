package org.jboss.tools.runtime.reddeer.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.tools.runtime.reddeer.Namespaces;

@XmlRootElement(name = "destination", namespace = Namespaces.SOA_REQ)
@XmlAccessorType(XmlAccessType.FIELD)
public class SAPDestination {

	@XmlElement(name = "ashost", namespace = Namespaces.SOA_REQ)
	private String ashost;

	@XmlElement(name = "sysnr", namespace = Namespaces.SOA_REQ)
	private String sysnr;

	@XmlElement(name = "client", namespace = Namespaces.SOA_REQ)
	private String client;

	@XmlElement(name = "passwd", namespace = Namespaces.SOA_REQ)
	private String passwd;

	@XmlElement(name = "password", namespace = Namespaces.SOA_REQ)
	private String password;

	@XmlElement(name = "user", namespace = Namespaces.SOA_REQ)
	private String user;

	@XmlElement(name = "userName", namespace = Namespaces.SOA_REQ)
	private String userName;

	@XmlElement(name = "lang", namespace = Namespaces.SOA_REQ)
	private String lang;

	public String getAshost() {
		return ashost;
	}

	public void setAshost(String ashost) {
		this.ashost = ashost;
	}

	public String getSysnr() {
		return sysnr;
	}

	public void setSysnr(String sysnr) {
		this.sysnr = sysnr;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}
