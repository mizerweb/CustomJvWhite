package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class v9d extends hih {
    public final long c;
    public final long d;
    public final long e;
    public final f8b f;

    public v9d(long j, long j2, long j3, f8b f8bVar) {
        super(kfc.P3);
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = f8bVar;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        f(j2, "pollId");
        f(j3, "messageId");
        this.a.put("answersIds", f8bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9d)) {
            return false;
        }
        v9d v9dVar = (v9d) obj;
        return this.c == v9dVar.c && this.d == v9dVar.d && this.e == v9dVar.e && cqk.d(this.f, v9dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qt4.g(qt4.g(Long.hashCode(this.c) * 31, 31, this.d), 31, this.e);
    }
}
