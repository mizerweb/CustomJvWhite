package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q65 extends f2 {
    public final af7 c;
    public final af7 d;

    public /* synthetic */ q65(o0j o0jVar) {
        this(new i94(12), o0jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q65)) {
            return false;
        }
        q65 q65Var = (q65) obj;
        return cqk.d(this.c, q65Var.c) && cqk.d(this.d, q65Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAnimations(push=" + this.c + ", pop=" + this.d + ")";
    }

    public q65(af7 af7Var, af7 af7Var2) {
        super(af7Var, af7Var2);
        this.c = af7Var;
        this.d = af7Var2;
    }
}
