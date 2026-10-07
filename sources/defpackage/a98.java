package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a98 extends r1 {
    public final c98 d;

    public a98(c98 c98Var, int i) {
        super(c98Var.size(), i);
        this.d = c98Var;
    }

    @Override // defpackage.r1
    public final Object a(int i) {
        return this.d.get(i);
    }
}
