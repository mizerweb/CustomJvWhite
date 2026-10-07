package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class p61 extends ohc implements Serializable {
    public final mf7 a;
    public final ohc b;

    public p61(mf7 mf7Var, ohc ohcVar) {
        this.a = mf7Var;
        this.b = ohcVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        mf7 mf7Var = this.a;
        return this.b.compare(mf7Var.mo41apply(obj), mf7Var.mo41apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p61)) {
            return false;
        }
        p61 p61Var = (p61) obj;
        return this.a.equals(p61Var.a) && this.b.equals(p61Var.b);
    }

    public final int hashCode() {
        return ndl.d(this.a, this.b);
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
