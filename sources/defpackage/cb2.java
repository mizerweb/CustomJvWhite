package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class cb2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ i64 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb2(i64 i64Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = i64Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        i64 i64Var = this.g;
        switch (i) {
            case 0:
                return new cb2(i64Var, lq4Var, 0);
            case 1:
                return new cb2(i64Var, lq4Var, 1);
            default:
                return new cb2(i64Var, lq4Var, 2);
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
            case 1:
                break;
        }
        return ((cb2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        i64 i64Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return i64Var.p(this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (rx8.t(5000L, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "triggerFocusTimeout: completing with focus result unsuccessful after 5000 ms");
                }
                i64Var.Q(new p17(false));
                return sbiVar;
            default:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return (jge) obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                if (i64Var != null) {
                    this.f = 1;
                    obj = i64Var.p(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    return (jge) obj;
                }
                return null;
        }
    }
}
