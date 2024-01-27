public class SilverGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        System.out.println("Создан новый сундук");
        return new SilverReward();
    }

}
