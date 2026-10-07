package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fa4 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof fa4) {
            return this.a == ((fa4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "SUPPORTED";
        }
        return i == 2 ? "UNSUPPORTED" : "UNKNOWN";
    }
}
