package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d50 extends h50 {
    public final long a;
    public final xnh b;
    public final String c;

    public d50(long j, xnh xnhVar, String str) {
        this.a = j;
        this.b = xnhVar;
        this.c = str;
    }

    @Override // defpackage.h50
    public final String a() {
        return this.c;
    }

    @Override // defpackage.h50
    public final long b() {
        return this.a;
    }

    @Override // defpackage.h50
    public final ynh c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d50)) {
            return false;
        }
        d50 d50Var = (d50) obj;
        return this.a == d50Var.a && this.b.equals(d50Var.b) && cqk.d(this.c, d50Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedDownload(messageId=");
        sb.append(this.a);
        sb.append(", textSize=");
        sb.append(this.b);
        return qt4.q(sb, ", attachId=", this.c, ")");
    }
}
