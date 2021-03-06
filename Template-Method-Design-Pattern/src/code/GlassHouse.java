package code;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}
	// Kumar Khatri
	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}
	// Teenu Meenu
	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildWindows() {
		System.out.println("Building Glass Windows");
	}
}
