package design.builder;

public class Hero {
	private String name;
	private String superpower;
	private boolean isMarvel;
	private boolean isDC;

	public String toString() {
		return this.name + " \n" + this.superpower + "\nisMarvel :" + this.isMarvel + "\nis DC: " + this.isDC;
	}

	private Hero(Builder builder) {
		name = builder.name;
		superpower = builder.superpower;
		isMarvel = builder.isMarvel;
		isDC = builder.isDC;

	}

	public static class Builder {
		private String name;
		private String superpower = "";
		private boolean isMarvel;
		private boolean isDC;

		public Builder(String name) {

			this.name = name;
		}

		public Builder addSuperPower(String power) {
			this.superpower += " " + power;
			return this;
		}

		public Builder setMarvel() {
			this.isMarvel = true;
			this.isDC = false;
			return this;
		}

		public Builder setDC() {
			this.isDC = false;
			this.isMarvel = true;
			return this;
		}

		public Hero build() {
			return new Hero(this);
		}

	}

}
