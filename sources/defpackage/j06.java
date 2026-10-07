package defpackage;

import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes3.dex */
public final class j06 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ dr3 f;
    public /* synthetic */ kbc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j06(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        dr3 dr3Var = (dr3) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                j06 j06Var = new j06(i2, lq4Var, 0);
                j06Var.f = dr3Var;
                j06Var.g = kbcVar;
                j06Var.invokeSuspend(sbiVar);
                break;
            case 1:
                j06 j06Var2 = new j06(i2, lq4Var, 1);
                j06Var2.f = dr3Var;
                j06Var2.g = kbcVar;
                j06Var2.invokeSuspend(sbiVar);
                break;
            default:
                j06 j06Var3 = new j06(i2, lq4Var, 2);
                j06Var3.f = dr3Var;
                j06Var3.g = kbcVar;
                j06Var3.invokeSuspend(sbiVar);
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
                dr3 dr3Var = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                kbcVar.getIcon();
                dr3Var.setImageTintList(ColorStateList.valueOf(-1));
                dr3Var.setInnerColor(kbcVar.h().a);
                break;
            case 1:
                dr3 dr3Var2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                kbcVar2.getIcon();
                dr3Var2.setImageTintList(ColorStateList.valueOf(-1));
                dr3Var2.setStrokeColor(-1);
                break;
            default:
                dr3 dr3Var3 = this.f;
                kbc kbcVar3 = this.g;
                ch3.d0(obj);
                kbcVar3.getIcon();
                dr3Var3.setImageTintList(ColorStateList.valueOf(-1));
                dr3Var3.setInnerColor(kbcVar3.h().a);
                break;
        }
        return sbiVar;
    }
}
