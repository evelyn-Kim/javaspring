package jdbc01;

public class Member {
	private String mid,mname,mpwd,mintro;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMpwd() {
		return mpwd;
	}

	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}

	public String getMintro() {
		return mintro;
	}

	public void setMintro(String mintro) {
		this.mintro = mintro;
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", mname=" + mname + ", mpwd=" + mpwd + ", mintro=" + mintro + "]";
	}
	
	
}
