package ru.ok.android.externcalls.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ConversationImpl) obj).reportIfApplicable();
                break;
            case 1:
                ((ConversationImpl) obj).onSignalingRefresh();
                break;
            case 2:
                ((ConversationImpl) obj).resolveUnknownExternals();
                break;
            default:
                ((ConversationImpl.AnonymousClass1) obj).lambda$onSample$0();
                break;
        }
    }
}
