class Grocery
{
	public String name="lucky store";
	private String quantity="6 kg";
	public void setQuantity(String quantity){
		this.quantity=quantity;
	}
	public String getQuantity(){
		return quantity;
	}
}
class Grocery1
{
	public static void main(String[]args){
		Grocery g=new Grocery();
		System.out.println(g.name);
		g.setQuantity("10 kg");
		System.out.println(g.getQuantity());

}
}