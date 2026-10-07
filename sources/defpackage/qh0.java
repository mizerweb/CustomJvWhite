package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qh0 {
    public final Object a;

    public qh0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof qh0) && this.a == ((qh0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}
