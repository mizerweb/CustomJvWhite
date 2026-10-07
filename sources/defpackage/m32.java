package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m32 extends phl {
    public final long a;
    public final String b;
    public final boolean c;

    public m32(long j, String str, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.phl
    public final boolean b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m32)) {
            return false;
        }
        m32 m32Var = (m32) obj;
        if (this.a != m32Var.a) {
            return false;
        }
        String str = m32Var.b;
        ifh ifhVar = ns4.b;
        return cqk.d(this.b, str) && this.c == m32Var.c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        ifh ifhVar = ns4.b;
        return Boolean.hashCode(this.c) + zo5.d(iHashCode, 31, this.b);
    }

    public final String toString() {
        return nbh.z(qt4.t(this.a, "User(userId=", ", conversationId=", ns4.c(this.b)), ", isVideo=", this.c, ")");
    }
}
