package defpackage;

import ru.ok.android.externcalls.sdk.ConversationFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ks4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationFactory b;

    public /* synthetic */ ks4(ConversationFactory conversationFactory, int i) {
        this.a = i;
        this.b = conversationFactory;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ConversationFactory conversationFactory = this.b;
        switch (i) {
            case 0:
                return conversationFactory.lambda$new$0();
            case 1:
                return conversationFactory.lambda$new$1();
            default:
                return conversationFactory.lambda$getRemoteSettings$17();
        }
    }
}
