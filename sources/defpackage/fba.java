package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fba {
    public final int a;

    public /* synthetic */ fba(int i) {
        this.a = i;
    }

    public static final /* synthetic */ fba a(int i) {
        return new fba(i);
    }

    public static final boolean b(int i) {
        return i == -1;
    }

    public final /* synthetic */ int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fba) {
            return this.a == ((fba) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "SliceRequest(code=", ")");
    }
}
