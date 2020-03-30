class Receipt {
    private List<Item> artikli = new ArrayList();

    public void addItem(Item item) {
        artikli.add(item);
    }

    public void removeItem(Item item) {
        artikli.remove(item);
    }

    public double vkupno() {
        double vkupno = 0;
        forEach (Item item : artikli) {
            vkupno = vkupno + item.getCena();
        }
    }

}