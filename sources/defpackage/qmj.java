package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class qmj {
    public static final pmj Companion = new pmj();
    public final String a;

    public /* synthetic */ qmj(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            shl.b(i, 1, omj.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmj) && cqk.d(this.a, ((qmj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("WebAppRequestPhoneRequest(requestId=", this.a, ")");
    }
}
