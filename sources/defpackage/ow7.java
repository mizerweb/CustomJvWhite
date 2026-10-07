package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ow7 implements qw7 {
    public final long a;
    public final long b;
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public ow7(long j, long j2, List list, List list2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = list;
        this.d = list2;
        this.e = j3;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow7)) {
            return false;
        }
        ow7 ow7Var = (ow7) obj;
        return this.a == ow7Var.a && this.b == ow7Var.b && this.c.equals(ow7Var.c) && cqk.d(this.d, ow7Var.d) && this.e == ow7Var.e && this.f == ow7Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + qt4.g(qv1.c(qv1.c(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "OneToOne(opponentId=", ", chatId=");
        sbS.append(this.b);
        sbS.append(", messagesIds=");
        sbS.append(this.c);
        sbS.append(", serverMessagesIds=");
        sbS.append(this.d);
        sbS.append(", chatServerId=");
        sbS.append(this.e);
        return zo5.k(this.f, ", time=", ")", sbS);
    }
}
