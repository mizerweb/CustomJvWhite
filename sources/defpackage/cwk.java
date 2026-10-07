package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cwk extends yqk {
    private final iwk c;

    public cwk(iwk iwkVar, int i) {
        super(iwkVar.size(), i);
        this.c = iwkVar;
    }

    @Override // defpackage.yqk
    public final Object a(int i) {
        return this.c.get(i);
    }
}
