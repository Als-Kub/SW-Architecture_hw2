public class GoldGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        System.out.println("Создан новый сундук");
        return new GoldReward();
    }
}
