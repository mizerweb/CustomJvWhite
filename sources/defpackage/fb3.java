package defpackage;

import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class fb3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ ChatScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb3(ChatScreen chatScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatScreen chatScreen = this.g;
        switch (i) {
            case 0:
                fb3 fb3Var = new fb3(chatScreen, lq4Var, 0);
                fb3Var.f = ((Boolean) obj).booleanValue();
                return fb3Var;
            default:
                fb3 fb3Var2 = new fb3(chatScreen, lq4Var, 1);
                fb3Var2.f = ((Boolean) obj).booleanValue();
                return fb3Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((fb3) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((fb3) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ChatScreen chatScreen = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (z) {
                    chatScreen.getRouter().C(chatScreen);
                }
                break;
            default:
                ch3.d0(obj);
                ou7 ou7Var = ChatScreen.L1;
                mjg mjgVar = chatScreen.W1().k;
                Boolean boolValueOf = Boolean.valueOf(z);
                mjgVar.getClass();
                mjgVar.j(null, boolValueOf);
                qt4.C(z, chatScreen.k2().N1, null);
                if (z && chatScreen.y == null) {
                    vt3 vt3Var = new vt3(chatScreen);
                    chatScreen.getRouter().a(vt3Var);
                    chatScreen.y = vt3Var;
                }
                break;
        }
        return sbiVar;
    }
}
