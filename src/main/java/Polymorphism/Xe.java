//Override: Override giống với Overload ở chỗ cũng là các phương thức 
//cùng tên nhưng Override thể hiện ở tính thừa kế nhiều hơn. 
//Tức là trong cùng một phương thức ta muốn làm thêm một công việc,
//ta sẽ dùng Overload, nhưng khi trong cùng phương thức ta lại muốn làm khác đi ta sẽ dùng Override 

package Polymorphism;

public class Xe {
	private int gia ; 
	private String mau_xe;
	
	public Xe(String mau_xe,int gia)
	{
		setGia(gia);
		setMauxe(mau_xe);
	}
	public String getMauxe() {
		return mau_xe;
	}
	public void setMauxe(String mau_xe2) {
		mau_xe=mau_xe2;	
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia2) {
		gia=gia2;
	}
	
	
	
	public void run() {
		System.out.println("30km/h");
	}
	
}
class xedap extends Xe {

	public xedap(String mau_xe, int gia) {
		super(mau_xe, gia);
		
	}
	// đa hình
		@Override
		public void run() {
			System.out.println("10km/h");
		}
}
class xehoi extends Xe
{

	public xehoi(String mau_xe, int gia) {
		super(mau_xe, gia);
		
	}
	// da hinh
		@Override
		public void run() {
			System.out.println("90km/h");
		}
}
