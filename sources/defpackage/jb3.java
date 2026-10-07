package defpackage;

import android.view.View;
import androidx.lifecycle.LifecycleDestroyedException;
import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class jb3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ChatScreen g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb3(ChatScreen chatScreen, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = chatScreen;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        int i2 = this.h;
        ChatScreen chatScreen = this.g;
        switch (i) {
            case 0:
                return new jb3(chatScreen, i2, lq4Var, 0);
            default:
                return new jb3(chatScreen, i2, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((jb3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        n09 n09Var = n09.a;
        int i2 = this.h;
        ChatScreen chatScreen = this.g;
        hu4 hu4Var = hu4.a;
        int i3 = 0;
        int i4 = 1;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                i19 i19VarF = chatScreen.getViewLifecycleOwner().f();
                ao5 ao5Var = ao5.a;
                lk9 lk9VarS0 = rk9.a.S0();
                boolean zP0 = lk9VarS0.P0(getContext());
                n09 n09Var2 = n09.e;
                if (!zP0) {
                    n09 n09Var3 = i19VarF.d;
                    if (n09Var3 == n09Var) {
                        throw new LifecycleDestroyedException(null);
                    }
                    if (n09Var3.compareTo(n09Var2) >= 0) {
                        View view = chatScreen.getView();
                        if (view == null) {
                            return sbiVar;
                        }
                        n7j.c(view, 300L, new hb3(chatScreen, i2));
                        return sbiVar;
                    }
                }
                ib3 ib3Var = new ib3(chatScreen, i2, i3);
                this.f = 1;
                return xs3.c(i19VarF, n09Var2, zP0, lk9VarS0, ib3Var, this) == hu4Var ? hu4Var : sbiVar;
            default:
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                i19 i19VarF2 = chatScreen.lifecycleOwner.f();
                ao5 ao5Var2 = ao5.a;
                lk9 lk9VarS1 = rk9.a.S0();
                boolean zP1 = lk9VarS1.P0(getContext());
                n09 n09Var4 = n09.d;
                if (!zP1) {
                    n09 n09Var5 = i19VarF2.d;
                    if (n09Var5 == n09Var) {
                        throw new LifecycleDestroyedException(null);
                    }
                    if (n09Var5.compareTo(n09Var4) >= 0) {
                        yab.i0(chatScreen.getViewLifecycleScope(), null, 0, new jb3(chatScreen, i2, lq4Var, i3), 3);
                        return sbiVar;
                    }
                }
                ib3 ib3Var2 = new ib3(chatScreen, i2, i4);
                this.f = 1;
                return xs3.c(i19VarF2, n09Var4, zP1, lk9VarS1, ib3Var2, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
