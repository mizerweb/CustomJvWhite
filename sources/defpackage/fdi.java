package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class fdi implements ny8, Serializable {
    public af7 a;
    public Object b;

    @Override // defpackage.ny8
    public final boolean d() {
        return this.b != ku6.p;
    }

    @Override // defpackage.ny8
    public final Object getValue() {
        if (this.b == ku6.p) {
            this.b = this.a.invoke();
            this.a = null;
        }
        return this.b;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
