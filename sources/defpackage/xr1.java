package defpackage;

import android.widget.LinearLayout;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class xr1 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ LinearLayout f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr1(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        LinearLayout linearLayout = (LinearLayout) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                xr1 xr1Var = new xr1(3, lq4Var, 0);
                xr1Var.f = linearLayout;
                xr1Var.invokeSuspend(sbiVar);
                break;
            case 1:
                xr1 xr1Var2 = new xr1(3, lq4Var, 1);
                xr1Var2.f = linearLayout;
                xr1Var2.invokeSuspend(sbiVar);
                break;
            case 2:
                xr1 xr1Var3 = new xr1(3, lq4Var, 2);
                xr1Var3.f = linearLayout;
                xr1Var3.invokeSuspend(sbiVar);
                break;
            case 3:
                xr1 xr1Var4 = new xr1(3, lq4Var, 3);
                xr1Var4.f = linearLayout;
                xr1Var4.invokeSuspend(sbiVar);
                break;
            case 4:
                xr1 xr1Var5 = new xr1(3, lq4Var, 4);
                xr1Var5.f = linearLayout;
                xr1Var5.invokeSuspend(sbiVar);
                break;
            case 5:
                xr1 xr1Var6 = new xr1(3, lq4Var, 5);
                xr1Var6.f = linearLayout;
                xr1Var6.invokeSuspend(sbiVar);
                break;
            default:
                xr1 xr1Var7 = new xr1(3, lq4Var, 6);
                xr1Var7.f = linearLayout;
                xr1Var7.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        a8g a8gVar = pq3.j;
        LinearLayout linearLayout = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                linearLayout.setBackgroundColor(a8gVar.l(linearLayout).b.b().f);
                break;
            case 1:
                ch3.d0(obj);
                linearLayout.setBackgroundColor(a8gVar.h(linearLayout).b().b);
                break;
            case 2:
                ch3.d0(obj);
                linearLayout.setBackgroundColor(a8gVar.h(linearLayout).b().b);
                break;
            case 3:
                ch3.d0(obj);
                linearLayout.setBackgroundColor(a8gVar.h(linearLayout).b().b);
                break;
            case 4:
                ch3.d0(obj);
                linearLayout.setBackgroundColor(a8gVar.h(linearLayout).b().d);
                break;
            case 5:
                ch3.d0(obj);
                linearLayout.setBackgroundColor(a8gVar.h(linearLayout).b().b);
                break;
            default:
                ch3.d0(obj);
                RegistrationNeuroAvatarsScreen.o1(linearLayout, a8gVar.h(linearLayout));
                break;
        }
        return sbiVar;
    }
}
