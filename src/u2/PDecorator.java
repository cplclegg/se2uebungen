package u2;

public abstract class PDecorator implements PComponent {
    protected PComponent decorates;
    public PDecorator(PComponent decorates) {
        this.decorates = decorates;
    }
}