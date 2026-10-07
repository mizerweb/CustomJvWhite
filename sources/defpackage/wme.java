package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wme implements ny8 {
    public final af7 a;
    public volatile Object b = ghb.k;
    public final Object c = this;

    public wme(af7 af7Var) {
        this.a = af7Var;
    }

    public final void a() {
        synchronized (this.c) {
            this.b = ghb.k;
        }
    }

    @Override // defpackage.ny8
    public final boolean d() {
        return this.b != ghb.k;
    }

    @Override // defpackage.ny8
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        ghb ghbVar = ghb.k;
        if (obj != ghbVar) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == ghbVar) {
                objInvoke = this.a.invoke();
                this.b = objInvoke;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
