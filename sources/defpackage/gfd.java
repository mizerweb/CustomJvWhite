package defpackage;

import java.util.Objects;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Action;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gfd implements Action {
    public final InternalIdsResolver a;
    public final ExternalIdsResolver b;
    public final ConversationPreparedStat c;
    public final boolean d;
    public final boolean e;
    public final y3e f;
    public final ConversationParticipant g;
    public final hh6 h;

    public gfd(InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, y3e y3eVar, ConversationParticipant conversationParticipant, hh6 hh6Var) {
        this.a = internalIdsResolver;
        this.b = externalIdsResolver;
        this.c = conversationPreparedStat;
        this.d = z;
        this.e = z2;
        this.f = y3eVar;
        this.g = conversationParticipant;
        this.h = hh6Var;
    }

    public final pp9 a(boolean z, af7 af7Var) {
        Object objF;
        int i = 1;
        if (this.e || z) {
            objF = ((v7g) af7Var.invoke()).f(new xr8());
        } else {
            hh6 hh6Var = this.h;
            boolean zK = hh6Var.k();
            y3e y3eVar = this.f;
            MappingContext mappingContext = new MappingContext(y3eVar, zK);
            boolean zC = hh6Var.c();
            int i2 = 5;
            boolean z2 = this.d;
            InternalIdsResolver internalIdsResolver = this.a;
            if (zC) {
                ConversationParticipant conversationParticipant = this.g;
                if ((conversationParticipant != null ? conversationParticipant.getInternalId() : null) != null) {
                    objF = ((v7g) af7Var.invoke()).f(new px8());
                } else {
                    z9g z9gVar = (z9g) af7Var.invoke();
                    v7g v7gVarResolveIdsAndGetFailed = internalIdsResolver.resolveIdsAndGetFailed(mappingContext);
                    v7g v7gVarRetryApiCallForIncoming = z2 ? RetryKt.retryApiCallForIncoming(v7gVarResolveIdsAndGetFailed, y3eVar) : RetryKt.retryApiCallForOutgoing(v7gVarResolveIdsAndGetFailed, y3eVar);
                    ldf ldfVar = ldf.k;
                    Objects.requireNonNull(z9gVar, "source1 is null");
                    Objects.requireNonNull(v7gVarRetryApiCallForIncoming, "source2 is null");
                    objF = new pp9(new z9g[]{z9gVar, v7gVarRetryApiCallForIncoming}, i2, new uik(13, ldfVar));
                }
            } else {
                z9g z9gVar2 = (z9g) af7Var.invoke();
                v7g v7gVarResolveIdsAndGetFailed2 = internalIdsResolver.resolveIdsAndGetFailed(mappingContext);
                v7g v7gVarRetryApiCallForIncoming2 = z2 ? RetryKt.retryApiCallForIncoming(v7gVarResolveIdsAndGetFailed2, y3eVar) : RetryKt.retryApiCallForOutgoing(v7gVarResolveIdsAndGetFailed2, y3eVar);
                ExternalIdsResolver externalIdsResolver = this.b;
                h64 h64VarResolveIds = externalIdsResolver.resolveIds(externalIdsResolver.collectExternalIdResolutionCandidates(), mappingContext);
                h64VarResolveIds.getClass();
                p64 p64Var = new p64(0, h64VarResolveIds);
                v7g v7gVarRetryApiCallForIncoming3 = z2 ? RetryKt.retryApiCallForIncoming(p64Var, y3eVar) : RetryKt.retryApiCallForOutgoing(p64Var, y3eVar);
                Objects.requireNonNull(z9gVar2, "source1 is null");
                Objects.requireNonNull(v7gVarRetryApiCallForIncoming2, "source2 is null");
                Objects.requireNonNull(v7gVarRetryApiCallForIncoming3, "source3 is null");
                objF = new pp9(new z9g[]{z9gVar2, v7gVarRetryApiCallForIncoming2, v7gVarRetryApiCallForIncoming3}, i2, new dul(26));
            }
        }
        return new pp9(objF, i, new rj5(22, this));
    }
}
