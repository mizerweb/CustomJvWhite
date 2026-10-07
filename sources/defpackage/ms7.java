package defpackage;

import one.me.sdk.upload.messages.UploadConversionException;

/* JADX INFO: loaded from: classes3.dex */
public final class ms7 extends mdh implements tf7 {
    public int e;
    public /* synthetic */ yx6 f;
    public /* synthetic */ Throwable g;
    public final /* synthetic */ gka h;
    public final /* synthetic */ ns7 i;
    public final /* synthetic */ xui j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms7(gka gkaVar, ns7 ns7Var, xui xuiVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.h = gkaVar;
        this.i = ns7Var;
        this.j = xuiVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        ns7 ns7Var = this.i;
        xui xuiVar = this.j;
        ms7 ms7Var = new ms7(this.h, ns7Var, xuiVar, (lq4) obj3);
        ms7Var.f = (yx6) obj;
        ms7Var.g = (Throwable) obj2;
        return ms7Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ns7 ns7Var = this.i;
        ny8 ny8Var = ns7Var.b;
        yx6 yx6Var = this.f;
        Throwable th = this.g;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            if (th instanceof UploadConversionException) {
                throw th;
            }
            gka gkaVar = this.h;
            if (!o1m.a(gkaVar)) {
                qrc.m((mii) ny8Var.getValue(), lii.ERROR_DURING_CONVERT, gkaVar.a.c, th.getClass().getName(), 20);
                throw th;
            }
            vii viiVar = new vii(v0m.a(o1m.c(gkaVar, ns7Var.a, (mii) ny8Var.getValue(), new UploadConversionException(th.getMessage(), th), this.j)), null);
            this.f = null;
            this.g = null;
            this.e = 1;
            Object objEmit = yx6Var.emit(viiVar, this);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }
}
