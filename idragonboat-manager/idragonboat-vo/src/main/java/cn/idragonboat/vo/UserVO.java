package cn.idragonboat.vo;

public class UserVO {
	
	private String uuid;
	private String name;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "UserVO [uuid=" + uuid + ", name=" + name + "]";
	}
	public UserVO(String uuid, String name) {
		super();
		this.uuid = uuid;
		this.name = name;
	}
	
	public UserVO(){}
	
}
