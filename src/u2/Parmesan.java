package u2;

public class Parmesan extends PDecorator{
    public Parmesan(PComponent decorates) {
        super(decorates);
    }
    @Override
    public double price() {
        return decorates.price() + 1.5;
    }
}
