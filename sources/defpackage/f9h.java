package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f9h {
    public final g9h a;

    public f9h(g9h g9hVar) {
        this.a = g9hVar;
    }

    public final g9h a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9h) && this.a == ((f9h) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonState(status=" + this.a + ")";
    }
}
