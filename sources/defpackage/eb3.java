package defpackage;

import android.view.View;
import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class eb3 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ChatScreen h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb3(lq4 lq4Var, ChatScreen chatScreen, int i) {
        super(2, lq4Var);
        this.h = chatScreen;
        this.f = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatScreen chatScreen = this.h;
        switch (i) {
            case 0:
                eb3 eb3Var = new eb3(lq4Var, chatScreen, this.f);
                eb3Var.g = obj;
                return eb3Var;
            default:
                eb3 eb3Var2 = new eb3(lq4Var, chatScreen);
                eb3Var2.g = obj;
                return eb3Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((eb3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((eb3) create(obj, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        fcc fccVar;
        int i = this.e;
        ChatScreen chatScreen = this.h;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Object obj2 = this.g;
                ch3.d0(obj);
                ylc ylcVar = (ylc) obj2;
                yf3 yf3Var = (yf3) ylcVar.a;
                q9f q9fVar = (q9f) ylcVar.b;
                View view = chatScreen.getView();
                if (view == null) {
                    return sbiVar;
                }
                ou7 ou7Var = ChatScreen.L1;
                if (cqk.d(chatScreen.g2().getRightActions(), ybc.a) || !cqk.d(chatScreen.g2().getRightActions(), yf3Var.g)) {
                    chatScreen.g2().setRightActions(yf3Var.g);
                }
                chatScreen.g2().setTitle(yf3Var.b);
                ChatScreen.E1(chatScreen, chatScreen.g2(), (sol.e(chatScreen.d) || sol.d(chatScreen.d)) ? false : yf3Var.d);
                ynh ynhVar = yf3Var.c;
                chatScreen.g2().s(ynhVar != null ? ynhVar.b(view.getContext()) : null, yf3Var.i);
                if (sol.e(chatScreen.d) || sol.d(chatScreen.d)) {
                    fccVar = null;
                } else {
                    fccVar = new fcc(yf3Var.e, yf3Var.f, yf3Var.a, yf3Var.h ? xvb.a : null, this.f, 8);
                }
                chatScreen.g2().setAvatar(fccVar);
                boolean z = q9fVar instanceof n9f;
                q7c q7cVar = q7c.d;
                q7c q7cVar2 = q7c.c;
                if (z) {
                    if (chatScreen.c2().getState() != q7cVar2 && chatScreen.c2().getState() != q7cVar) {
                        return sbiVar;
                    }
                    chatScreen.c2().b();
                    return sbiVar;
                }
                if (!(q9fVar instanceof o9f)) {
                    if (q9fVar instanceof m9f) {
                        return sbiVar;
                    }
                    ore.o();
                    return null;
                }
                if (chatScreen.c2().getState() != q7cVar2 && chatScreen.c2().getState() != q7cVar && chatScreen.getView() != null) {
                    chatScreen.g2().i(false);
                    t7c t7cVarC2 = chatScreen.c2();
                    t7cVarC2.setExpandWithAnimation(((o9f) q9fVar).a);
                    t7cVarC2.c(true);
                }
                nma.M(chatScreen.U1(), 4, 2);
                return sbiVar;
            default:
                Object obj3 = this.g;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                lx2 lx2Var = (lx2) obj3;
                ou7 ou7Var2 = ChatScreen.L1;
                x9h x9hVar = (x9h) chatScreen.E.getValue();
                this.g = null;
                this.f = 1;
                Object objK0 = yab.K0(((n0c) x9hVar.D()).a(), new p7g(lx2Var, x9hVar, chatScreen.getContext(), null, 10), this);
                hu4 hu4Var = hu4.a;
                if (objK0 != hu4Var) {
                    objK0 = sbiVar;
                }
                return objK0 == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb3(lq4 lq4Var, ChatScreen chatScreen) {
        super(2, lq4Var);
        this.h = chatScreen;
    }
}
