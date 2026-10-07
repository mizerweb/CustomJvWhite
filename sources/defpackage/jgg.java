package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jgg implements lq4, iu4 {
    public final lq4 a;
    public final vt4 b;

    public jgg(lq4 lq4Var, vt4 vt4Var) {
        this.a = lq4Var;
        this.b = vt4Var;
    }

    @Override // defpackage.iu4
    public final iu4 getCallerFrame() {
        lq4 lq4Var = this.a;
        if (lq4Var instanceof iu4) {
            return (iu4) lq4Var;
        }
        return null;
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        return this.b;
    }

    @Override // defpackage.lq4
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
