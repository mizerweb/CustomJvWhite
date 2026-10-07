package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uwg implements wwg {
    public final ku5 a;

    public uwg(ku5 ku5Var) {
        this.a = ku5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwg) && this.a.equals(((uwg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Drawing(layer=" + this.a + ")";
    }
}
