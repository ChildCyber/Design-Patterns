class Body {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}