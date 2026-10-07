package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r1g extends ji3 {
    public final ynh a;
    public final cf7 b;

    public r1g(ynh ynhVar, cf7 cf7Var) {
        this.a = ynhVar;
        this.b = cf7Var;
    }

    public final ynh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1g)) {
            return false;
        }
        r1g r1gVar = (r1g) obj;
        return this.a.equals(r1gVar.a) && this.b.equals(r1gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancelableSnackbar(text=" + this.a + ", cancelAction=" + this.b + ")";
    }
}
