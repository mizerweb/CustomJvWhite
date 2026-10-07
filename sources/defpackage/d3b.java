package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class d3b extends hih {
    public d3b(long j, long j2, Long l) {
        super(kfc.U1);
        if (j2 == 0) {
            ore.p("param messageId can't be 0");
            throw null;
        }
        f(j, ApiProtocol.PARAM_CHAT_ID);
        if (l != null) {
            this.a.put("postId", l);
        }
        f(j2, "messageId");
    }

    @Override // defpackage.hih
    public final boolean j() {
        return true;
    }
}
