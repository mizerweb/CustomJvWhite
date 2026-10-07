package ru.ok.android.externcalls.sdk;

import defpackage.rg4;
import defpackage.sg4;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements rg4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ ConversationParams c;
    public final /* synthetic */ sg4 d;
    public final /* synthetic */ sg4 e;

    public /* synthetic */ x(ConversationImpl conversationImpl, sg4 sg4Var, ConversationParams conversationParams, sg4 sg4Var2) {
        this.b = conversationImpl;
        this.d = sg4Var;
        this.c = conversationParams;
        this.e = sg4Var2;
    }

    @Override // defpackage.rg4, defpackage.tg4
    public final void accept(Object obj) throws Throwable {
        int i = this.a;
        sg4 sg4Var = this.e;
        sg4 sg4Var2 = this.d;
        ConversationParams conversationParams = this.c;
        ConversationImpl conversationImpl = this.b;
        switch (i) {
            case 0:
                conversationImpl.lambda$runStartConversation$17(sg4Var2, conversationParams, sg4Var, (ConversationStart.Result) obj);
                break;
            default:
                conversationImpl.lambda$performConfroomJoin$13(conversationParams, sg4Var2, sg4Var, (JoinConversation.Response) obj);
                break;
        }
    }

    public /* synthetic */ x(ConversationImpl conversationImpl, ConversationParams conversationParams, sg4 sg4Var, sg4 sg4Var2) {
        this.b = conversationImpl;
        this.c = conversationParams;
        this.d = sg4Var;
        this.e = sg4Var2;
    }
}
