package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rr4 implements vr4 {
    public final int a;

    public rr4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr4) && this.a == ((rr4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Seeking(progress=", ")");
    }
}
