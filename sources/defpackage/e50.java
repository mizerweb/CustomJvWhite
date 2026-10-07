package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e50 extends h50 {
    public final long a;
    public final tnh b;
    public final String c;

    public e50(long j, tnh tnhVar, String str) {
        this.a = j;
        this.b = tnhVar;
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
        if (!(obj instanceof e50)) {
            return false;
        }
        e50 e50Var = (e50) obj;
        return this.a == e50Var.a && this.b.equals(e50Var.b) && cqk.d(this.c, e50Var.c);
    }

    public final int hashCode() {
        int iC = zo5.c(this.b.c, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Processing(messageId=");
        sb.append(this.a);
        sb.append(", textSize=");
        sb.append(this.b);
        return qt4.q(sb, ", attachId=", this.c, ")");
    }
}
