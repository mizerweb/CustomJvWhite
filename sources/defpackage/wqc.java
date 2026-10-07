package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class wqc {
    public static final vqc Companion = new vqc();
    public final int a;

    public /* synthetic */ wqc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wqc) {
            return this.a == ((wqc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Mode(code=", ")");
    }
}
