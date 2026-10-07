package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rbg implements tbg {
    public final ag9 a;

    public rbg(ag9 ag9Var) {
        this.a = ag9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbg) && cqk.d(this.a, ((rbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
