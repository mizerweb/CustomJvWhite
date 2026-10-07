package ru.ok.android.externcalls.sdk.api;

import defpackage.fg7;
import defpackage.it0;
import defpackage.qf7;
import defpackage.sbi;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class OkApiServiceInternal$joinToConversation$request$1 extends fg7 implements qf7 {
    public OkApiServiceInternal$joinToConversation$request$1(Object obj) {
        super(2, 0, OkApiService.class, obj, "addJoinToConversationParams", "addJoinToConversationParams(Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/api/common/BasicApiRequest$Builder;)V");
    }

    @Override // defpackage.qf7
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StartCallApiParams) obj, (it0) obj2);
        return sbi.a;
    }

    public final void invoke(StartCallApiParams startCallApiParams, it0 it0Var) {
        ((OkApiService) this.receiver).addJoinToConversationParams(startCallApiParams, it0Var);
    }
}
