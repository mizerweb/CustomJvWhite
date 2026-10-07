package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class av0 extends mdh implements qf7 {
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ cv0 h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(cv0 cv0Var, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = cv0Var;
        this.i = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new av0(this.h, this.i, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((av0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:6:0x0011). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean zB;
        int i;
        int i2;
        int i3 = this.g;
        cv0 cv0Var = this.h;
        if (i3 == 0) {
            ch3.d0(obj);
            zB = ((wsc) cv0Var.a.getValue()).b();
            i = 0;
            if (this.i || i >= 4) {
                return Boolean.valueOf(zB);
            }
            boolean zB2 = ((wsc) cv0Var.a.getValue()).b();
            if (zB != zB2) {
                return Boolean.valueOf(zB2);
            }
            i2 = i + 1;
            this.e = i2;
            this.f = zB;
            this.g = 1;
            Object objT = rx8.t(((long) i2) * 200, this);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z = this.f;
            i2 = this.e;
            ch3.d0(obj);
            zB = z;
        }
        i = i2;
        if (this.i) {
        }
        return Boolean.valueOf(zB);
    }
}
