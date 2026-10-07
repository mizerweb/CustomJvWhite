package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nr8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public sr8 f;
    public ic6 g;
    public int h;
    public final /* synthetic */ sr8 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr8(sr8 sr8Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = sr8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        sr8 sr8Var = this.i;
        switch (i) {
            case 0:
                return new nr8(sr8Var, lq4Var, 0);
            default:
                return new nr8(sr8Var, lq4Var, 1);
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
        return ((nr8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ic6 ic6Var;
        sr8 sr8Var;
        ic6 ic6Var2;
        sr8 sr8Var2;
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.h;
                if (i2 == 0) {
                    ch3.d0(obj);
                    sr8 sr8Var3 = this.i;
                    ic6Var = sr8Var3.r;
                    Integer num = new Integer(R.string.join_requests_confirm_approve_all_description);
                    this.f = sr8Var3;
                    this.g = ic6Var;
                    this.h = 1;
                    obj = sr8Var3.B(R.string.join_requests_confirm_approve_all_title, num, R.string.join_requests_confirm_approve_all_button, false, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    sr8Var = sr8Var3;
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ic6Var = this.g;
                    sr8Var = this.f;
                    ch3.d0(obj);
                }
                sr8Var.getClass();
                a8j.x(ic6Var, obj);
                return sbiVar;
            default:
                int i3 = this.h;
                if (i3 == 0) {
                    ch3.d0(obj);
                    sr8 sr8Var4 = this.i;
                    ic6 ic6Var3 = sr8Var4.r;
                    Integer num2 = new Integer(R.string.join_requests_confirm_reject_all_description);
                    this.f = sr8Var4;
                    this.g = ic6Var3;
                    this.h = 1;
                    Object objB = sr8Var4.B(R.string.join_requests_confirm_reject_all_title, num2, R.string.join_requests_confirm_reject_all_button, true, this);
                    if (objB == hu4Var) {
                        return hu4Var;
                    }
                    ic6Var2 = ic6Var3;
                    obj = objB;
                    sr8Var2 = sr8Var4;
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ic6Var2 = this.g;
                    sr8Var2 = this.f;
                    ch3.d0(obj);
                }
                sr8Var2.getClass();
                a8j.x(ic6Var2, obj);
                return sbiVar;
        }
    }
}
