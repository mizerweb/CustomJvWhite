package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class bz5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ iz5 g;
    public final /* synthetic */ Uri h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz5(iz5 iz5Var, Uri uri, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = iz5Var;
        this.h = uri;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Uri uri = this.h;
        iz5 iz5Var = this.g;
        switch (i) {
            case 0:
                return new bz5(iz5Var, uri, lq4Var, 0);
            default:
                return new bz5(iz5Var, uri, lq4Var, 1);
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
        return ((bz5) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        pzf pzfVar;
        rt3 rt3Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        Uri uri = this.h;
        iz5 iz5Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    zv8[] zv8VarArr = iz5.B;
                    if (iz5Var.G(uri, this) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ch3.d0(obj);
                            return sbiVar;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                pzfVar = iz5Var.z;
                rt3Var = rt3.b;
                this.f = 3;
                if (pzfVar.emit(rt3Var, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
                this.f = 2;
                if (iz5.E(iz5Var, this) != hu4Var) {
                    pzfVar = iz5Var.z;
                    rt3Var = rt3.b;
                    this.f = 3;
                    if (pzfVar.emit(rt3Var, this) != hu4Var) {
                        return sbiVar;
                    }
                }
                return hu4Var;
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                pzf pzfVar2 = iz5Var.z;
                aw9 aw9Var = new aw9(uri.toString(), 0L);
                this.f = 1;
                return pzfVar2.emit(aw9Var, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
