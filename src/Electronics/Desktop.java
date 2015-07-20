
public class Desktop extends BasicElectronics{
	public String Processor;
	public String GraphicsCard;
	public String PSU;
	public String Case;
	public String MOBO;
	public String getProcessor() {
		return Processor;
	}
	public void setProcessor(String processor) {
		Processor = processor;
	}
	public String getGraphicsCard() {
		return GraphicsCard;
	}
	public void setGraphicsCard(String graphicsCard) {
		GraphicsCard = graphicsCard;
	}
	public String getPSU() {
		return PSU;
	}
	public void setPSU(String pSU) {
		PSU = pSU;
	}
	public String getCase() {
		return Case;
	}
	public void setCase(String case1) {
		Case = case1;
	}
	public String getMOBO() {
		return MOBO;
	}
	public void setMOBO(String mOBO) {
		MOBO = mOBO;
	}
	public Desktop(String brand, double watts, double cost, String name,
			String processor, String graphicsCard, String pSU, String case1,
			String mOBO) {
		super(brand, watts, cost, name);
		Processor = processor;
		GraphicsCard = graphicsCard;
		PSU = pSU;
		Case = case1;
		MOBO = mOBO;
	}
	@Override
	public String toString() {
		return "Desktop [Processor=" + Processor + ", GraphicsCard="
				+ GraphicsCard + ", PSU=" + PSU + ", Case=" + Case + ", MOBO="
				+ MOBO + ", Brand=" + Brand + ", watts=" + watts + ", cost="
				+ cost + ", name=" + name + "]";
	}
	

}
