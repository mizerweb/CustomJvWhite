package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class la0 {
    public final Long a;
    public final Long b;
    public final float c;
    public final s70 d;
    public final h50 e;

    public la0(Long l, Long l2, float f, s70 s70Var, h50 h50Var) {
        this.a = l;
        this.b = l2;
        this.c = f;
        this.d = s70Var;
        this.e = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj;
        return cqk.d(this.a, la0Var.a) && cqk.d(this.b, la0Var.b) && Float.compare(this.c, la0Var.c) == 0 && cqk.d(this.d, la0Var.d) && cqk.d(this.e, la0Var.e);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (this.d.hashCode() + nbh.m((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, this.c, 31)) * 31;
        h50 h50Var = this.e;
        return iHashCode2 + (h50Var != null ? h50Var.hashCode() : 0);
    }

    public final String toString() {
        return "AudioMessageState(messageId=" + this.a + ", chatId=" + this.b + ", currentPosition=" + this.c + ", audioButtonState=" + this.d + ", loadingState=" + this.e + ")";
    }
}
