package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s1g extends ck4 {
    public final tnh a;
    public final cf7 b;

    public s1g(tnh tnhVar, cf7 cf7Var) {
        this.a = tnhVar;
        this.b = cf7Var;
    }

    public final ynh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1g)) {
            return false;
        }
        s1g s1gVar = (s1g) obj;
        return this.a.equals(s1gVar.a) && this.b.equals(s1gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", dismissListener=" + this.b + ")";
    }
}
