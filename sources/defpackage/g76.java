package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g76 implements h76 {
    public final tnh a;

    public g76(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g76) && this.a.equals(((g76) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("Scheduled(title=", this.a, ")");
    }
}
