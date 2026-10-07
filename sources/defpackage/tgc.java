package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class tgc {
    public static final sgc Companion = new sgc();
    public static final tgc d = new tgc();
    public final boolean a;
    public final boolean b;
    public final int c;

    public /* synthetic */ tgc(int i, int i2, boolean z, boolean z2) {
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
            this.c = 0;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgc)) {
            return false;
        }
        tgc tgcVar = (tgc) obj;
        return this.a == tgcVar.a && this.b == tgcVar.b && this.c == tgcVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.t(zo5.B("OpponentRegistrationTimeoutConfig(recallToPhone=", this.a, ", isOpponentNoNetworkEnabled=", this.b, ", timeoutSeconds="), this.c, ")");
    }

    public tgc() {
        this.a = false;
        this.b = false;
        this.c = 0;
    }
}
