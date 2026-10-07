package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class koe extends hoe implements dg7 {
    public final int b;

    public koe(int i, lq4 lq4Var) {
        super(lq4Var);
        this.b = i;
    }

    @Override // defpackage.dg7
    public final int getArity() {
        return this.b;
    }

    @Override // defpackage.mq0
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        zfe.a.getClass();
        return age.a(this);
    }
}
