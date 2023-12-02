package pojos;
import java.time.LocalDate;
import javax.persistence.*;
@Entity //mandatory class lvl annotation
@Table(name="users_tbl") //set table name
public class User {
	/*
	 * userld (PK) ,name,email,password role enum confirmPassword, regAmount;
	 * LocalDate/Date re Date• byte[] image;
	 */
	@Id //Mandatory=> pk Constraint
//	@GeneratedValue // default
	@GeneratedValue(strategy = GenerationType.IDENTITY) // default
	@Column(name="user_id")
	private Integer userId;
	private String name;
	@Column(length = 20, unique = true)
	private String email;
	@Column(length=15,nullable = false)
	private String password;
	@Transient //skips from persistence //skipped from creation of column
	private String confirmPassword;
	@Enumerated(EnumType.STRING)
	@Column(name="user_role",length =20)
	private UserRole userRole;
	@Column(name = "reg_amount")
	private double regAmount;
	@Column(name = "reg_date")
	private LocalDate regDate;
	@Lob //coloun type blob
	private byte[] image;
	
	public User(String name, String email, String password, String confirmPassword, UserRole userRole, double regAmount,
			LocalDate regDate) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.userRole = userRole;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}

	public User() {
	System.out.println("in user Ctor");
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", userRole=" + userRole + ", regAmount=" + regAmount
				+ ", regDate=" + regDate + ", image="+ "]";
	}
	
	
}
