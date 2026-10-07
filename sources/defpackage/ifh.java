package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ifh implements ny8, Serializable {
    public af7 a;
    public volatile Object b = ku6.p;
    public final Object c = this;

    public ifh(af7 af7Var) {
        this.a = af7Var;
    }

    @Override // defpackage.ny8
    public final boolean d() {
        return this.b != ku6.p;
    }

    @Override // defpackage.ny8
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        ku6 ku6Var = ku6.p;
        if (obj != ku6Var) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == ku6Var) {
                objInvoke = this.a.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
