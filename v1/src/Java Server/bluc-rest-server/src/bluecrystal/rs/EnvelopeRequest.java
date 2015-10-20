package bluecrystal.rs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnvelopeRequest {
	private String sha1;
	private String sha256;
	private String certificate;
	private String time;
	private String policy;
	private String signature;
	private String crl;

	public EnvelopeRequest() {
		super();
	}

	public String getSha1() {
		return sha1;
	}

	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}

	public String getSha256() {
		return sha256;
	}

	public void setSha256(String sha256) {
		this.sha256 = sha256;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getCrl() {
		return crl;
	}

	public void setCrl(String crl) {
		this.crl = crl;
	}

}