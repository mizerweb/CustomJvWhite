package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class bgj {
    public static final agj Companion = new agj();
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ bgj(String str, int i, String str2, boolean z) {
        if (7 != (i & 7)) {
            shl.b(i, 7, zfj.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgj)) {
            return false;
        }
        bgj bgjVar = (bgj) obj;
        return cqk.d(this.a, bgjVar.a) && this.b == bgjVar.b && cqk.d(this.c, bgjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.w(zo5.A("WebAppBiometryUnavailableResponse(requestId=", this.a, ", available=", ", deviceId=", this.b), this.c, ")");
    }

    public bgj(String str, String str2) {
        this.a = str;
        this.b = false;
        this.c = str2;
    }
}
