package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bq2 extends cq2 {
    public final tnh a;

    public bq2(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq2) && this.a.equals(((bq2) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("SomethingWentWrong(text=", this.a, ")");
    }
}
