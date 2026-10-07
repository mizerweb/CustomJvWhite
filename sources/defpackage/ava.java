package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ava {
    public final long a;
    public final boolean b;
    public final int c;

    public /* synthetic */ ava(long j, int i, int i2, boolean z) {
        this((i2 & 4) != 0 ? 0 : i, j, (i2 & 2) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ava)) {
            return false;
        }
        ava avaVar = (ava) obj;
        return this.a == avaVar.a && this.b == avaVar.b && this.c == avaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + nbh.n(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return qv1.o(qt4.u(this.a, "AnchorState(anchor=", ", byChatReadMark=", this.b), ", offset=", this.c, ")");
    }

    public ava(int i, long j, boolean z) {
        this.a = j;
        this.b = z;
        this.c = i;
    }
}
