package vo;

public class reservation {

	private String calendarmemo_contents;
	private int calendarmemo_year;
	private int calendarmemo_month;
	private int calendarmemo_day;
	private int calendarmemo_num;
	private String calendarmemo_id;
	public reservation() {
		super();
	}
	private String calendarmemo_passwd;
	public reservation(String calendarmemo_contents, int calendarmemo_year, int calendarmemo_month,
			int calendarmemo_day) {
		super();
		this.calendarmemo_contents = calendarmemo_contents;
		this.calendarmemo_year = calendarmemo_year;
		this.calendarmemo_month = calendarmemo_month;
		this.calendarmemo_day = calendarmemo_day;
	}
	public reservation(String calendarmemo_contents, int calendarmemo_year, int calendarmemo_month,
			int calendarmemo_day, int calendarmemo_num, String calendarmemo_id, String calendarmemo_passwd) {
		super();
		this.calendarmemo_contents = calendarmemo_contents;
		this.calendarmemo_year = calendarmemo_year;
		this.calendarmemo_month = calendarmemo_month;
		this.calendarmemo_day = calendarmemo_day;
		this.calendarmemo_num = calendarmemo_num;
		this.calendarmemo_id = calendarmemo_id;
		this.calendarmemo_passwd = calendarmemo_passwd;
	}
	@Override
	public String toString() {
		return "reservation [calendarmemo_contents=" + calendarmemo_contents + ", calendarmemo_year="
				+ calendarmemo_year + ", calendarmemo_month=" + calendarmemo_month + ", calendarmemo_day="
				+ calendarmemo_day + ", calendarmemo_num=" + calendarmemo_num + ", calendarmemo_id=" + calendarmemo_id
				+ ", calendarmemo_passwd=" + calendarmemo_passwd + "]";
	}
	public String getCalendarmemo_contents() {
		return calendarmemo_contents;
	}
	public void setCalendarmemo_contents(String calendarmemo_contents) {
		this.calendarmemo_contents = calendarmemo_contents;
	}
	public int getCalendarmemo_year() {
		return calendarmemo_year;
	}
	public void setCalendarmemo_year(int calendarmemo_year) {
		this.calendarmemo_year = calendarmemo_year;
	}
	public int getCalendarmemo_month() {
		return calendarmemo_month;
	}
	public void setCalendarmemo_month(int calendarmemo_month) {
		this.calendarmemo_month = calendarmemo_month;
	}
	public int getCalendarmemo_day() {
		return calendarmemo_day;
	}
	public void setCalendarmemo_day(int calendarmemo_day) {
		this.calendarmemo_day = calendarmemo_day;
	}
	public int getCalendarmemo_num() {
		return calendarmemo_num;
	}
	public void setCalendarmemo_num(int calendarmemo_num) {
		this.calendarmemo_num = calendarmemo_num;
	}
	public String getCalendarmemo_id() {
		return calendarmemo_id;
	}
	public void setCalendarmemo_id(String calendarmemo_id) {
		this.calendarmemo_id = calendarmemo_id;
	}
	public String getCalendarmemo_passwd() {
		return calendarmemo_passwd;
	}
	public void setCalendarmemo_passwd(String calendarmemo_passwd) {
		this.calendarmemo_passwd = calendarmemo_passwd;
	}
}
