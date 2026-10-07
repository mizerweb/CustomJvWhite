package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class d4b extends hih {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4b(long j, long j2, dja djaVar, Long l) {
        super(kfc.T1);
        String str = djaVar.b;
        if (j2 == 0) {
            ore.p("param messageId can't be 0");
            throw null;
        }
        if (str.length() == 0) {
            ore.p("param reaction.id can't be empty");
            throw null;
        }
        f(j, ApiProtocol.PARAM_CHAT_ID);
        if (l != null) {
            this.a.put("postId", l);
        }
        f(j2, "messageId");
        g("reaction", ouk.a(new ylc("reactionType", djaVar.a.name()), new ylc("id", str)));
    }

    @Override // defpackage.hih
    public final boolean j() {
        return true;
    }
}
