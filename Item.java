class Item {
	int id;
	String name;
	double price;
	double danok; // e.g. 5%

	public Item() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDanok(double danok) {
		this.danok = danok;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDanok() {
		return danok;
	}

	public double getCena() {
		double tax = price * (danok / 100);
		return price + tax;
	}

	double taxReturn () {
		double tax = price * (danok / 100);
		double taxReturn = tax * 0.15;
		return taxReturn;
	}
}