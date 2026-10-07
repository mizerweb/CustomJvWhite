package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p9i {
    public final vi9 a;

    public p9i(vi9 vi9Var) {
        this.a = vi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9i) && this.a == ((p9i) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypingState(typing=" + this.a + ")";
    }
}
