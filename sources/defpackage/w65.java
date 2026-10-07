package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w65 implements lq4 {
    public hv8 a;
    public lq4 b;
    public Object c;

    public final void a(iv8 iv8Var) {
        this.b = iv8Var;
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        return k66.a;
    }

    @Override // defpackage.lq4
    public final void resumeWith(Object obj) {
        this.b = null;
        this.c = obj;
    }
}
