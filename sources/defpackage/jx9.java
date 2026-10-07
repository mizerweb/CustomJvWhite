package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class jx9 extends mdh implements vf7 {
    public int e;
    public /* synthetic */ float f;
    public /* synthetic */ float g;
    public /* synthetic */ kb9 h;
    public final /* synthetic */ ny8 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx9(ny8 ny8Var, lq4 lq4Var) {
        super(4, lq4Var);
        this.i = ny8Var;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        jx9 jx9Var = new jx9(this.i, (lq4) obj4);
        jx9Var.f = fFloatValue;
        jx9Var.g = fFloatValue2;
        jx9Var.h = (kb9) obj3;
        return jx9Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        float f = this.f;
        float f2 = this.g;
        kb9 kb9Var = this.h;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            if (kb9Var == null || kb9Var.l != jb9.d) {
                return null;
            }
            xv9 xv9Var = (xv9) this.i.getValue();
            Uri uri = kb9Var.b;
            sh2 sh2Var = new sh2(kb9Var, null, 2);
            this.h = null;
            this.f = f;
            this.g = f2;
            this.e = 1;
            obj = xv9Var.a(uri, sh2Var, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        float fLongValue = ((Number) obj).longValue();
        return new ylc(mxl.a((long) (oc9.u(f, 0.0f, 1.0f) * fLongValue)), mxl.a((long) (oc9.u(f2, 0.0f, 1.0f) * fLongValue)));
    }
}
