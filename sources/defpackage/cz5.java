package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class cz5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public mjg f;
    public int g;
    public final /* synthetic */ iz5 h;
    public final /* synthetic */ Uri i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz5(iz5 iz5Var, Uri uri, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = iz5Var;
        this.i = uri;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Uri uri = this.i;
        iz5 iz5Var = this.h;
        switch (i) {
            case 0:
                return new cz5(iz5Var, uri, lq4Var, 0);
            default:
                return new cz5(iz5Var, uri, lq4Var, 1);
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
        return ((cz5) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        mjg mjgVar;
        mjg mjgVar2;
        int i = this.e;
        sbi sbiVar = sbi.a;
        Uri uri = this.i;
        iz5 iz5Var = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    mjg mjgVar3 = iz5Var.v;
                    this.f = mjgVar3;
                    this.g = 1;
                    Object objB = iz5.B(iz5Var, uri, this);
                    if (objB == hu4Var) {
                        return hu4Var;
                    }
                    obj = objB;
                    mjgVar = mjgVar3;
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mjgVar = this.f;
                    ch3.d0(obj);
                }
                mjgVar.setValue(obj);
                return sbiVar;
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    mjg mjgVar4 = iz5Var.v;
                    this.f = mjgVar4;
                    this.g = 1;
                    Object objB2 = iz5.B(iz5Var, uri, this);
                    if (objB2 == hu4Var) {
                        return hu4Var;
                    }
                    obj = objB2;
                    mjgVar2 = mjgVar4;
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mjgVar2 = this.f;
                    ch3.d0(obj);
                }
                mjgVar2.setValue(obj);
                return sbiVar;
        }
    }
}
