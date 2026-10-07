package ru.ok.android.externcalls.sdk;

import defpackage.sg4;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ConversationFactory.AnonymousClass2.lambda$start$0((StartCallParams) obj2, (Conversation) obj);
                break;
            case 1:
                ConversationFactory.AnonymousClass2.lambda$start$1((StartCallParams) obj2, (Throwable) obj);
                break;
            default:
                ((ConversationImpl) obj2).lambda$performConnect$20((String) obj);
                break;
        }
    }
}
