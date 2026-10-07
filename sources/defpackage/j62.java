package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j62 {
    public final ti1 a;

    public j62(ti1 ti1Var) {
        this.a = ti1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j62) && this.a == ((j62) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Feedback(feedback=" + this.a + ")";
    }
}
