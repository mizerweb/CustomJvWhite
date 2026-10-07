package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z4g implements a5g {
    public final t4g a;

    public z4g(t4g t4gVar) {
        this.a = t4gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4g) && this.a.equals(((z4g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Replace(command=" + this.a + ")";
    }
}
