package ru.ok.android.externcalls.sdk.api;

import defpackage.fg7;
import defpackage.it0;
import defpackage.sbi;
import defpackage.vf7;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class OkApiServiceInternal$startConversation$request$1 extends fg7 implements vf7 {
    public OkApiServiceInternal$startConversation$request$1(Object obj) {
        super(4, 0, OkApiService.class, obj, "addCreateConversationParamsByExternalOpponentIds", "addCreateConversationParamsByExternalOpponentIds(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/api/common/BasicApiRequest$Builder;)V");
    }

    @Override // defpackage.vf7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((ConversationParticipant) obj, (List<String>) obj2, (StartCallApiParams) obj3, (it0) obj4);
        return sbi.a;
    }

    public final void invoke(ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams, it0 it0Var) {
        ((OkApiService) this.receiver).addCreateConversationParamsByExternalOpponentIds(conversationParticipant, list, startCallApiParams, it0Var);
    }
}
