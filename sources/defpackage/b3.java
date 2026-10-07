package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class b3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ View f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        View view = (View) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                b3 b3Var = new b3(i2, lq4Var, 0);
                b3Var.f = view;
                b3Var.g = kbcVar;
                b3Var.invokeSuspend(sbiVar);
                break;
            case 1:
                b3 b3Var2 = new b3(i2, lq4Var, 1);
                b3Var2.f = view;
                b3Var2.g = kbcVar;
                b3Var2.invokeSuspend(sbiVar);
                break;
            case 2:
                b3 b3Var3 = new b3(i2, lq4Var, 2);
                b3Var3.f = view;
                b3Var3.g = kbcVar;
                b3Var3.invokeSuspend(sbiVar);
                break;
            case 3:
                b3 b3Var4 = new b3(i2, lq4Var, i2);
                b3Var4.f = view;
                b3Var4.g = kbcVar;
                b3Var4.invokeSuspend(sbiVar);
                break;
            default:
                b3 b3Var5 = new b3(i2, lq4Var, 4);
                b3Var5.f = view;
                b3Var5.g = kbcVar;
                b3Var5.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                View view = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                view.setBackgroundColor(kbcVar.B().b);
                break;
            case 1:
                View view2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                view2.setBackgroundColor(kbcVar2.B().c);
                break;
            case 2:
                View view3 = this.f;
                kbc kbcVar3 = this.g;
                ch3.d0(obj);
                view3.setBackgroundColor(kbcVar3.b().c);
                break;
            case 3:
                View view4 = this.f;
                kbc kbcVar4 = this.g;
                ch3.d0(obj);
                view4.setBackgroundColor(kbcVar4.B().c);
                break;
            default:
                View view5 = this.f;
                kbc kbcVar5 = this.g;
                ch3.d0(obj);
                view5.setBackgroundColor(kbcVar5.l().c);
                break;
        }
        return sbiVar;
    }
}
