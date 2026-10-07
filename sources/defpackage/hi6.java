package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hi6 implements pi6 {
    public final gi6 a;

    public hi6(gi6 gi6Var) {
        this.a = gi6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi6) && this.a == ((hi6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(reason=" + this.a + ")";
    }
}
