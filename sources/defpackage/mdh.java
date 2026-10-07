package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mdh extends nq4 implements dg7 {
    public final int d;

    public mdh(int i, lq4 lq4Var) {
        super(lq4Var);
        this.d = i;
    }

    @Override // defpackage.dg7
    public int getArity() {
        return this.d;
    }

    @Override // defpackage.mq0
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        zfe.a.getClass();
        return age.a(this);
    }
}
