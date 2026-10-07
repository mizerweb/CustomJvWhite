package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jo6 implements no6 {
    public final rj5 a;

    public jo6(rj5 rj5Var) {
        this.a = rj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo6) && this.a == ((jo6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.a + ')';
    }
}
