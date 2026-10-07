package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k32 extends phl {
    public final long a;
    public final boolean b;

    public k32(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.phl
    public final boolean b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k32)) {
            return false;
        }
        k32 k32Var = (k32) obj;
        return this.a == k32Var.a && this.b == k32Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "Chat(chatId=", ", isVideo=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
