package defpackage;

import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ab3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xx6 g;
    public final /* synthetic */ ChatScreen h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab3(xx6 xx6Var, lq4 lq4Var, ChatScreen chatScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xx6Var;
        this.h = chatScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatScreen chatScreen = this.h;
        xx6 xx6Var = this.g;
        switch (i) {
            case 0:
                ab3 ab3Var = new ab3(xx6Var, lq4Var, chatScreen, 0);
                ab3Var.f = obj;
                return ab3Var;
            case 1:
                ab3 ab3Var2 = new ab3(xx6Var, lq4Var, chatScreen, 1);
                ab3Var2.f = obj;
                return ab3Var2;
            default:
                ab3 ab3Var3 = new ab3(xx6Var, lq4Var, chatScreen, 2);
                ab3Var3.f = obj;
                return ab3Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ec6 ec6Var = (ec6) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ab3) create(ec6Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ab3) create(ec6Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ab3) create(ec6Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        wka wkaVar;
        Object poeVar2;
        Object poeVar3;
        int i = this.e;
        ChatScreen chatScreen = this.h;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ec6 ec6Var = (ec6) this.f;
                ch3.d0(obj);
                Object objA = ec6Var.a();
                if (roe.a(objA) == null) {
                    try {
                        ou7 ou7Var = ChatScreen.L1;
                        ec6 ec6Var2 = (ec6) chatScreen.U1().C.a.getValue();
                        if (ec6Var2 == null || (wkaVar = (wka) ec6Var2.a) == null || !wkaVar.a) {
                            nma.L(chatScreen.U1(), true, 2);
                            chatScreen.F1();
                        } else {
                            nma.M(chatScreen.U1(), 0, 3);
                        }
                        poeVar = sbiVar;
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    ch3.d0(poeVar);
                }
                break;
            case 1:
                ec6 ec6Var3 = (ec6) this.f;
                ch3.d0(obj);
                Object objA2 = ec6Var3.a();
                if (roe.a(objA2) == null) {
                    try {
                        ChatScreen.D1(chatScreen, (wka) objA2);
                        poeVar2 = sbiVar;
                    } catch (Throwable th2) {
                        poeVar2 = new poe(th2);
                    }
                    ch3.d0(poeVar2);
                }
                break;
            default:
                ec6 ec6Var4 = (ec6) this.f;
                ch3.d0(obj);
                Object objA3 = ec6Var4.a();
                if (roe.a(objA3) == null) {
                    try {
                        ou7 ou7Var2 = ChatScreen.L1;
                        chatScreen.p2(chatScreen.k2().M1);
                        poeVar3 = sbiVar;
                    } catch (Throwable th3) {
                        poeVar3 = new poe(th3);
                    }
                    ch3.d0(poeVar3);
                }
                break;
        }
        return sbiVar;
    }
}
