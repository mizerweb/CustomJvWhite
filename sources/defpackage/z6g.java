package defpackage;

import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

/* JADX INFO: loaded from: classes3.dex */
public final class z6g extends gfd {
    public final OkApiServiceInternal i;
    public final ps4 j;
    public final ConversationParams k;

    public z6g(OkApiServiceInternal okApiServiceInternal, ps4 ps4Var, ConversationParams conversationParams, InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, y3e y3eVar, ConversationParticipant conversationParticipant, hh6 hh6Var) {
        super(internalIdsResolver, externalIdsResolver, conversationPreparedStat, z, z2, y3eVar, conversationParticipant, hh6Var);
        this.i = okApiServiceInternal;
        this.j = ps4Var;
        this.k = conversationParams;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public final v7g execute(ActionParams actionParams) {
        return a(false, new ize(22, this));
    }
}
