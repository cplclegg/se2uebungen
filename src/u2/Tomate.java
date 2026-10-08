package u2;

public class Tomate extends PDecorator{
    public Tomate(PComponent decorates) {
        super(decorates);
    }
    @Override
    public double price() {
        return decorates.price() + 0.5;
    }
}
