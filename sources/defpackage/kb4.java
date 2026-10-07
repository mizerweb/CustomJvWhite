package defpackage;

import android.app.Activity;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.login.restrict.RestrictLoginScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class kb4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ConfirmPhoneScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb4(lq4 lq4Var, ConfirmPhoneScreen confirmPhoneScreen) {
        super(2, lq4Var);
        this.e = 0;
        this.g = confirmPhoneScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ConfirmPhoneScreen confirmPhoneScreen = this.g;
        switch (i) {
            case 0:
                kb4 kb4Var = new kb4(lq4Var, confirmPhoneScreen);
                kb4Var.f = obj;
                return kb4Var;
            case 1:
                kb4 kb4Var2 = new kb4(confirmPhoneScreen, lq4Var, 1);
                kb4Var2.f = obj;
                return kb4Var2;
            default:
                kb4 kb4Var3 = new kb4(confirmPhoneScreen, lq4Var, 2);
                kb4Var3.f = obj;
                return kb4Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((kb4) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((kb4) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((kb4) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof bb4) {
                    ml9.b(confirmPhoneScreen);
                    lg9 lg9Var = lg9.b;
                    lg9Var.getClass();
                    o65.c(lg9Var.b(), ":chat-list", null, null, 6);
                } else if (rbbVar instanceof eb4) {
                    confirmPhoneScreen.getRouter().E();
                    lg9.b.e(((eb4) rbbVar).b);
                } else if (rbbVar instanceof cb4) {
                    bk8 bk8Var = (bk8) confirmPhoneScreen.k.getValue();
                    cb4 cb4Var = (cb4) rbbVar;
                    String str = cb4Var.b;
                    String strQ1 = confirmPhoneScreen.q1();
                    fgd fgdVar = cb4Var.c;
                    bk8Var.getClass();
                    bk8Var.c(oc9.e(new InputNameScreen(str, strQ1, fgdVar, bk8Var.b), null, null), "InputNameScreen");
                } else if (rbbVar instanceof ab4) {
                    ((bk8) confirmPhoneScreen.k.getValue()).a((2 & 1) != 0, false);
                } else if (rbbVar instanceof db4) {
                    Activity activity = confirmPhoneScreen.getActivity();
                    g74 g74Var = activity instanceof g74 ? (g74) activity : null;
                    if (g74Var != null) {
                        g74Var.a.a((mb4) confirmPhoneScreen.t.getValue());
                    }
                    sb8.O(confirmPhoneScreen.getContext(), ((db4) rbbVar).b);
                } else if (rbbVar instanceof za4) {
                    bk8 bk8Var2 = (bk8) confirmPhoneScreen.k.getValue();
                    bk8Var2.getClass();
                    bk8Var2.c(oc9.e(new RestrictLoginScreen(bk8Var2.b), null, null), "RestrictLoginScreen");
                } else if (rbbVar instanceof i65) {
                    ml9.b(confirmPhoneScreen);
                    lg9.b.e((i65) rbbVar);
                }
                break;
            case 1:
                String str2 = (String) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr = ConfirmPhoneScreen.z;
                vo8 vo8Var = (vo8) confirmPhoneScreen.y.m(confirmPhoneScreen, ConfirmPhoneScreen.z[10]);
                if ((vo8Var == null || !vo8Var.isActive()) && confirmPhoneScreen.x == null && !((Boolean) confirmPhoneScreen.u1().u.getValue()).booleanValue()) {
                    confirmPhoneScreen.v1(str2);
                }
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = ConfirmPhoneScreen.z;
                confirmPhoneScreen.s1().I0(0, (String) obj2);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb4(ConfirmPhoneScreen confirmPhoneScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = confirmPhoneScreen;
    }
}
