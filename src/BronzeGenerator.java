public class BronzeGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        System.out.println("Создан новый сундук");
        return new BronzeReward();
    }

}
