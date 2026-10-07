package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gnj implements ynj {
    public final int a;

    public gnj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnj) && this.a == ((gnj) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "OpenFileManager(mode=", ")");
    }
}
