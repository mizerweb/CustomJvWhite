package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class vr9 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ ssc f;
    public /* synthetic */ ssc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr9(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        ssc sscVar = (ssc) obj;
        ssc sscVar2 = (ssc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                vr9 vr9Var = new vr9(i2, lq4Var, 0);
                vr9Var.f = sscVar;
                vr9Var.g = sscVar2;
                return vr9Var.invokeSuspend(sbiVar);
            case 1:
                vr9 vr9Var2 = new vr9(i2, lq4Var, 1);
                vr9Var2.f = sscVar;
                vr9Var2.g = sscVar2;
                return vr9Var2.invokeSuspend(sbiVar);
            case 2:
                vr9 vr9Var3 = new vr9(i2, lq4Var, 2);
                vr9Var3.f = sscVar;
                vr9Var3.g = sscVar2;
                return vr9Var3.invokeSuspend(sbiVar);
            default:
                vr9 vr9Var4 = new vr9(i2, lq4Var, i2);
                vr9Var4.f = sscVar;
                vr9Var4.g = sscVar2;
                return vr9Var4.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        ssc sscVar = ssc.b;
        boolean z = false;
        ssc sscVar2 = ssc.a;
        switch (i) {
            case 0:
                ssc sscVar3 = this.f;
                ssc sscVar4 = this.g;
                ch3.d0(obj);
                int iOrdinal = sscVar3.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    int iOrdinal2 = sscVar4.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            return lhd.b;
                        }
                        ore.o();
                        return null;
                    }
                }
                return lhd.a;
            case 1:
                ssc sscVar5 = this.f;
                ssc sscVar6 = this.g;
                ch3.d0(obj);
                if (Build.VERSION.SDK_INT >= 34 && sscVar5 == sscVar && sscVar6 == sscVar2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ssc sscVar7 = this.f;
                ssc sscVar8 = this.g;
                ch3.d0(obj);
                return Boolean.valueOf(sscVar7 == sscVar2 || sscVar8 == sscVar2);
            default:
                ssc sscVar9 = this.f;
                ssc sscVar10 = this.g;
                ch3.d0(obj);
                if (Build.VERSION.SDK_INT >= 34 && sscVar9 == sscVar && sscVar10 == sscVar2) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
