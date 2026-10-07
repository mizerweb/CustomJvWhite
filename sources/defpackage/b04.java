package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b04 implements c04 {
    public final ynh a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;

    public b04(vnh vnhVar, String str, long j, String str2, long j2) {
        this.a = vnhVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b04)) {
            return false;
        }
        b04 b04Var = (b04) obj;
        return cqk.d(this.a, b04Var.a) && cqk.d(this.b, b04Var.b) && this.c == b04Var.c && this.d.equals(b04Var.d) && this.e == b04Var.e;
    }

    public final int hashCode() {
        ynh ynhVar = this.a;
        int iHashCode = (ynhVar == null ? 0 : ynhVar.hashCode()) * 31;
        String str = this.b;
        return Long.hashCode(this.e) + zo5.d(qt4.g((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowUnblockConfirmation(description=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", avatarSourceId=");
        qv1.s(this.c, ", abbreviation=", this.d, sb);
        return zo5.k(this.e, ", userId=", ")", sb);
    }
}
