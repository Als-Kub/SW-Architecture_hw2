public class CopperGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        System.out.println("Создан новый сундук");
        return new CopperReward();
    }
    
}
