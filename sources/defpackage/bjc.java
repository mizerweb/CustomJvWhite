package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class bjc {
    public final int a;
    public final Long b;
    public final long c;
    public final Long d;

    public bjc(int i, Long l, long j, Long l2) {
        this.a = i;
        this.b = l;
        this.c = j;
        this.d = l2;
    }

    public final ul9 a() {
        String str;
        ul9 ul9Var = new ul9(3);
        int i = this.a;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "REPLY";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "FORWARD";
        }
        ul9Var.put("type", str);
        Long l = this.b;
        if (l != null) {
            ul9Var.put(ApiProtocol.PARAM_CHAT_ID, l);
        }
        ul9Var.put("messageId", Long.valueOf(this.c));
        Long l2 = this.d;
        if (l2 != null) {
            ul9Var.put("postId", l2);
        }
        return ul9Var.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjc)) {
            return false;
        }
        bjc bjcVar = (bjc) obj;
        return this.a == bjcVar.a && cqk.d(this.b, bjcVar.b) && this.c == bjcVar.c && cqk.d(this.d, bjcVar.d);
    }

    public final int hashCode() {
        int iD = qt4.D(this.a) * 31;
        Long l = this.b;
        int iG = qt4.g((iD + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        Long l2 = this.d;
        return iG + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "OutgoingMessageLink(type=" + r5a.l(this.a) + ", chatId=" + this.b + ", messageId=" + this.c + ", postId=" + this.d + ")";
    }

    public bjc(int i, long j, Long l) {
        this(i, l, j, null);
    }
}
