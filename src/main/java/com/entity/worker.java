package  com.entity;

public class worker {
    private Integer wid;

    private String wname;

    private String wpassword;

    private String waccount;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }

    public String getWpassword() {
        return wpassword;
    }

    public void setWpassword(String wpassword) {
        this.wpassword = wpassword == null ? null : wpassword.trim();
    }

    public String getWaccount() {
        return waccount;
    }

    public void setWaccount(String waccount) {
        this.waccount = waccount == null ? null : waccount.trim();
    }
}