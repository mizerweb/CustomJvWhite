package defpackage;

import one.me.startconversation.StartConversationScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class phg implements zj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ phg(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    @Override // defpackage.zj4
    public final boolean f(int i) {
        CharSequence charSequenceO1;
        int i2 = this.a;
        StartConversationScreen startConversationScreen = this.b;
        switch (i2) {
            case 0:
                zv8[] zv8VarArr = StartConversationScreen.A;
                CharSequence charSequenceO2 = startConversationScreen.o1();
                return !(charSequenceO2 == null || charSequenceO2.length() == 0);
            default:
                if (i != startConversationScreen.r.l() + startConversationScreen.v.l() + startConversationScreen.q.l()) {
                    return i == startConversationScreen.x.l() && ((charSequenceO1 = startConversationScreen.o1()) == null || charSequenceO1.length() == 0);
                }
                return true;
        }
    }
}
