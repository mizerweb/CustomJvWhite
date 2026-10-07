package ru.ok.android.externcalls.sdk;

import defpackage.af7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;

    public /* synthetic */ r(ConversationImpl conversationImpl, int i) {
        this.a = i;
        this.b = conversationImpl;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        boolean zIsMeCreatorOrAdmin;
        int i = this.a;
        ConversationImpl conversationImpl = this.b;
        switch (i) {
            case 0:
                zIsMeCreatorOrAdmin = conversationImpl.isMeCreatorOrAdmin();
                break;
            case 1:
                return conversationImpl.lambda$createMediaMuteManager$6();
            case 2:
                return conversationImpl.lambda$createAsrOnlineManager$7();
            case 3:
                return conversationImpl.lambda$createAsrOnlineManager$8();
            case 4:
                zIsMeCreatorOrAdmin = conversationImpl.isDestroyed();
                break;
            case 5:
                return conversationImpl.lambda$new$1();
            case 6:
                return conversationImpl.lambda$new$2();
            case 7:
                return conversationImpl.lambda$new$3();
            default:
                return conversationImpl.lambda$new$4();
        }
        return Boolean.valueOf(zIsMeCreatorOrAdmin);
    }
}
