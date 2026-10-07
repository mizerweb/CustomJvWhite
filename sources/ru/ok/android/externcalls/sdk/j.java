package ru.ok.android.externcalls.sdk;

import defpackage.o91;
import defpackage.rg4;
import defpackage.sg4;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements rg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ sg4 c;

    public /* synthetic */ j(ConversationImpl conversationImpl, sg4 sg4Var, int i) {
        this.a = i;
        this.b = conversationImpl;
        this.c = sg4Var;
    }

    public void a(o91 o91Var) {
        this.b.lambda$performConnect$22(this.c, o91Var);
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) throws Throwable {
        int i = this.a;
        sg4 sg4Var = this.c;
        ConversationImpl conversationImpl = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 1:
                conversationImpl.lambda$prepare$10(sg4Var, th);
                break;
            case 2:
                conversationImpl.lambda$runStartConversation$18(sg4Var, th);
                break;
            case 3:
                conversationImpl.lambda$performConfroomJoin$14(sg4Var, th);
                break;
            default:
                conversationImpl.lambda$prepareJoinByLink$12(sg4Var, th);
                break;
        }
    }
}
