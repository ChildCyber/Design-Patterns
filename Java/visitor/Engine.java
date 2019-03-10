class Engine {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}