class Grocery
{
	public String name="lucky store";
	private String quantity="6 kg";
	private String item="rice";
	private int wait=12;
	public void setQuantity(String quantity){
		this.quantity=quantity;}
		public void setItem(String item){
			this.item=item;
		}
		public void setWait(int wait){
			this.wait=wait;
		}
	
	public String getQuantity(){
		return quantity;
	}
	public String getItem(){
		return item;
	}
	public int getWait(){
		return wait;}
}
class Grocery1
{
	public static void main(String[]args){
		Grocery g=new Grocery();
		System.out.println(g.name);
		g.setQuantity("10 kg");
		System.out.println(g.getQuantity());
		g.setItem("Dal");
		System.out.println(g.getItem());
	    g.setWait(15);
		System.out.println(g.getWait());

}
}