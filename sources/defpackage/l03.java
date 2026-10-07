package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l03 extends zq0 {
    public final long b;

    public l03(long j, long j2) {
        super(j);
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l03.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l03 l03Var = (l03) obj;
        return this.b == l03Var.b && this.a == l03Var.a;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.b), Long.valueOf(this.a));
    }

    @Override // defpackage.zq0
    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "ChatLeaveEvent(requestId=", ", chatId="));
    }
}
