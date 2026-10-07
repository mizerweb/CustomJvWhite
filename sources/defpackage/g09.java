package defpackage;

import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class g09 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ i09 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g09(i09 i09Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = i09Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new g09(this.g, lq4Var, 0);
            default:
                return new g09(this.g, lq4Var, 1);
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
        return ((g09) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object obj2 = sbi.a;
        i09 i09Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        mkg mkgVar = (mkg) i09Var.g.getValue();
                        this.f = 1;
                        Object objI = ch3.I(this, ((kkg) ((vse) mkgVar).a.getValue()).a, false, true, new chf(15));
                        if (objI != hu4Var) {
                            objI = obj2;
                        }
                        if (objI != hu4Var) {
                            objI = obj2;
                        }
                        if (objI == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (Throwable th) {
                    gm0.r("LibraryUpgradeHelper", "fail to migrate 4", new IssueKeyException(th) { // from class: one.me.android.LibraryUpgradeHelper$FailToClearStatException
                    });
                    return obj2;
                }
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return i09.a(i09Var, this) == hu4Var ? hu4Var : obj2;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return obj2;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
