package ru.ok.android.externcalls.sdk;

import defpackage.cf7;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;

    public /* synthetic */ v(ConversationImpl conversationImpl, int i) {
        this.a = i;
        this.b = conversationImpl;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        ConversationImpl conversationImpl = this.b;
        switch (i) {
            case 0:
                return conversationImpl.getCallParticipantId((ParticipantId) obj);
            default:
                return conversationImpl.lambda$new$5((List) obj);
        }
    }
}
