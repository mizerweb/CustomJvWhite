package defpackage;

import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

/* JADX INFO: loaded from: classes3.dex */
public final class jl6 extends gfd {
    public final iq8 i;
    public final ik8 j;
    public final ps4 k;

    public jl6(iq8 iq8Var, ik8 ik8Var, ps4 ps4Var, InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, y3e y3eVar, ConversationParticipant conversationParticipant, hh6 hh6Var) {
        super(internalIdsResolver, externalIdsResolver, conversationPreparedStat, z, z2, y3eVar, conversationParticipant, hh6Var);
        this.i = iq8Var;
        this.j = ik8Var;
        this.k = ps4Var;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public final v7g execute(ActionParams actionParams) {
        return new pp9(new e8g(new p64(4, new vs4((il6) actionParams, 5, this)).f(new uik(12, this)), new i1m(this), 2), 3, new due(this)).j(i3f.b());
    }
}
