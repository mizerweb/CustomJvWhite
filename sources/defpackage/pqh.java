package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pqh implements tt4 {
    public final Object a;
    public final ThreadLocal b;
    public final rqh c;

    public pqh(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new rqh(threadLocal);
    }

    @Override // defpackage.vt4
    public final Object E(Object obj, qf7 qf7Var) {
        return qf7Var.invoke(obj, this);
    }

    @Override // defpackage.vt4
    public final vt4 I(ut4 ut4Var) {
        return this.c.equals(ut4Var) ? k66.a : this;
    }

    @Override // defpackage.tt4
    public final ut4 getKey() {
        return this.c;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }

    @Override // defpackage.vt4
    public final vt4 u0(vt4 vt4Var) {
        return lvb.x0(this, vt4Var);
    }

    @Override // defpackage.vt4
    public final tt4 x0(ut4 ut4Var) {
        if (this.c.equals(ut4Var)) {
            return this;
        }
        return null;
    }
}
