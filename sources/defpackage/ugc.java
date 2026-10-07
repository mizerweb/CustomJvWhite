package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ugc {
    public final int a;
    public final boolean b;
    public final boolean c;

    public ugc(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugc)) {
            return false;
        }
        ugc ugcVar = (ugc) obj;
        return this.a == ugcVar.a && this.b == ugcVar.b && this.c == ugcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpponentRegistrationTimeoutSettings(timeoutSeconds=");
        sb.append(this.a);
        sb.append(", isPhoneRecallEnabled=");
        sb.append(this.b);
        sb.append(", isOpponentNoNetworkEnabled=");
        return qt4.r(sb, this.c, ")");
    }
}
