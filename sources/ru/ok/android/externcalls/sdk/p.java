package ru.ok.android.externcalls.sdk;

import defpackage.my7;
import defpackage.sg4;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements sg4 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ my7 c;

    public /* synthetic */ p(ConversationImpl conversationImpl, boolean z, my7 my7Var) {
        this.a = conversationImpl;
        this.b = z;
        this.c = my7Var;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        this.a.lambda$requestHoldStateChange$26(this.b, this.c, (Void) obj);
    }
}
