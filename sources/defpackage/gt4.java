package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gt4 implements it4 {
    public final ynh a;

    public gt4(ynh ynhVar) {
        this.a = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt4) && cqk.d(this.a, ((gt4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(message=" + this.a + ")";
    }
}
