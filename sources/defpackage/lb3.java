package defpackage;

import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class lb3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ChatScreen f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb3(ChatScreen chatScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = chatScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatScreen chatScreen = this.f;
        switch (i) {
            case 0:
                return new lb3(chatScreen, lq4Var, 0);
            default:
                return new lb3(chatScreen, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((lb3) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((lb3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                ChatScreen chatScreen = this.f;
                ou7 ou7Var = ChatScreen.L1;
                chatScreen.F1();
                break;
            default:
                ch3.d0(obj);
                String strT = np4.t(this.f);
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, strT, "Start subscribing on viewModel.events", null);
                    }
                }
                ChatScreen chatScreen2 = this.f;
                ou7 ou7Var2 = ChatScreen.L1;
                xd3 xd3VarK2 = chatScreen2.k2();
                zv8[] zv8VarArr = xd3.X1;
                xd3VarK2.Q(null);
                xd3 xd3VarK3 = this.f.k2();
                if (!((xb9) xd3VarK3.G()).c0() && ((f5d) ((wo6) xd3VarK3.s.getValue())).q() && !((Boolean) xd3VarK3.N1.getValue()).booleanValue()) {
                    yab.i0(xd3VarK3.b, ((n0c) xd3VarK3.H()).a(), 0, new ed3(xd3VarK3, null, 1), 2);
                }
                break;
        }
        return sbi.a;
    }
}
