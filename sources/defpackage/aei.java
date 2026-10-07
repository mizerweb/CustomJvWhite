package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class aei {
    public static final zdi Companion = new zdi();
    public final String a;

    public /* synthetic */ aei(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            shl.b(i, 1, ydi.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aei) && cqk.d(this.a, ((aei) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("UnsupportedRequest(requestId=", this.a, ")");
    }
}
