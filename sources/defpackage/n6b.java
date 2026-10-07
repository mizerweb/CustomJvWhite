package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n6b {
    public final ha9 a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;

    public n6b(ha9 ha9Var, String str, String str2, long j, String str3) {
        this.a = ha9Var;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6b)) {
            return false;
        }
        n6b n6bVar = (n6b) obj;
        return cqk.d(this.a, n6bVar.a) && cqk.d(this.b, n6bVar.b) && this.c.equals(n6bVar.c) && this.d == n6bVar.d && cqk.d(this.e, n6bVar.e);
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.d(zo5.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountDetails(localAccountId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.d);
        return qt4.q(sb, ", initials=", this.e, ")");
    }
}
