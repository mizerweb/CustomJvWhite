package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class dad extends hih {
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;

    public dad(long j, long j2, long j3, int i, long j4) {
        super(kfc.Q3);
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        f(j2, "pollId");
        f(j3, "messageId");
        c(i, "answerId");
        if (j4 > 0) {
            f(j4, "marker");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dad)) {
            return false;
        }
        dad dadVar = (dad) obj;
        return this.c == dadVar.c && this.d == dadVar.d && this.e == dadVar.e && this.f == dadVar.f && this.g == dadVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qt4.g(zo5.c(this.f, qt4.g(qt4.g(Long.hashCode(this.c) * 31, 31, this.d), 31, this.e), 31), 31, this.g);
    }
}
