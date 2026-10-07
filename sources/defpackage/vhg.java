package defpackage;

import one.me.startconversation.StartConversationScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class vhg implements p7c {
    public final /* synthetic */ StartConversationScreen a;

    public vhg(StartConversationScreen startConversationScreen) {
        this.a = startConversationScreen;
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) {
        zv8[] zv8VarArr = StartConversationScreen.A;
        StartConversationScreen startConversationScreen = this.a;
        vv vvVar = startConversationScreen.d;
        zv8[] zv8VarArr2 = StartConversationScreen.A;
        zv8 zv8Var = zv8VarArr2[0];
        vvVar.b(startConversationScreen, Boolean.TRUE);
        vv vvVar2 = startConversationScreen.e;
        zv8 zv8Var2 = zv8VarArr2[1];
        vvVar2.b(startConversationScreen, charSequence);
        xhg xhgVarP1 = startConversationScreen.p1();
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        ((f9b) xhgVarP1.q.g.getValue()).setValue(string);
    }

    @Override // defpackage.p7c
    public final void X() {
        StartConversationScreen startConversationScreen = this.a;
        vv vvVar = startConversationScreen.f;
        zv8 zv8Var = StartConversationScreen.A[2];
        vvVar.b(startConversationScreen, Boolean.FALSE);
        startConversationScreen.z.f(false);
    }

    @Override // defpackage.p7c
    public final void n() {
        StartConversationScreen startConversationScreen = this.a;
        vv vvVar = startConversationScreen.f;
        zv8 zv8Var = StartConversationScreen.A[2];
        vvVar.b(startConversationScreen, Boolean.TRUE);
        startConversationScreen.z.f(true);
    }
}
