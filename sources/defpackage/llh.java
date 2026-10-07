package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class llh {
    public static final klh Companion = new klh();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;

    public /* synthetic */ llh(int i, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z4;
        }
        if ((i & 16) == 0) {
            this.e = "***";
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = "sip";
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llh)) {
            return false;
        }
        llh llhVar = (llh) obj;
        return this.a == llhVar.a && this.b == llhVar.b && this.c == llhVar.c && this.d == llhVar.d && cqk.d(this.e, llhVar.e) && cqk.d(this.f, llhVar.f) && this.g == llhVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + zo5.d(zo5.d(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("TelecomConfig(extendedStates=", this.a, ", removeAccountOnCallEnd=", this.b, ", earlyConnectionDestroy=");
        qt4.B(", maskPhoneNumber=", ", dummyPhoneNumber=", sbB, this.c, this.d);
        nbh.G(sbB, this.e, ", defaultScheme=", this.f, ", showCallerName=");
        return qt4.r(sbB, this.g, ")");
    }

    public llh() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = "***";
        this.f = "sip";
        this.g = false;
    }
}
