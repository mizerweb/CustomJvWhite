package ru.ok.android.externcalls.sdk;

import defpackage.rg4;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements rg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ s(ConversationImpl conversationImpl, Runnable runnable, int i) {
        this.a = i;
        this.b = conversationImpl;
        this.c = runnable;
    }

    @Override // defpackage.rg4, defpackage.tg4
    public final void accept(Object obj) throws Throwable {
        int i = this.a;
        Runnable runnable = this.c;
        ConversationImpl conversationImpl = this.b;
        switch (i) {
            case 0:
                conversationImpl.lambda$refreshParams$15(runnable, (ConversationParams) obj);
                break;
            default:
                conversationImpl.lambda$resolveExternalsByInternalsIds$40(runnable, (Throwable) obj);
                break;
        }
    }
}
