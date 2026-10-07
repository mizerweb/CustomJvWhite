package defpackage;

import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

/* JADX INFO: loaded from: classes3.dex */
public final class oq8 extends gfd {
    public final OkApiServiceInternal i;
    public final ps4 j;
    public final StartCallApiParams k;
    public final PeerIdGenerator l;

    public oq8(OkApiServiceInternal okApiServiceInternal, ps4 ps4Var, InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, StartCallApiParams startCallApiParams, PeerIdGenerator peerIdGenerator, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, y3e y3eVar, ConversationParticipant conversationParticipant, hh6 hh6Var) {
        super(internalIdsResolver, externalIdsResolver, conversationPreparedStat, z, z2, y3eVar, conversationParticipant, hh6Var);
        this.i = okApiServiceInternal;
        this.j = ps4Var;
        this.k = startCallApiParams;
        this.l = peerIdGenerator;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public final v7g execute(ActionParams actionParams) {
        return a(true, new dx4(this, 22, (nq8) actionParams));
    }
}
