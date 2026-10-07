package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ay6 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ hr2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ njd i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay6(hr2 hr2Var, int i, njd njdVar, lq4 lq4Var, int i2) {
        super(1, lq4Var);
        this.e = i2;
        this.g = hr2Var;
        this.h = i;
        this.i = njdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new ay6(this.g, this.h, this.i, lq4Var, 0);
            default:
                return new ay6(this.g, this.h, this.i, lq4Var, 1);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((ay6) create(lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        njd njdVar = this.i;
        int i2 = this.h;
        hr2 hr2Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    List listR = tre.R(hr2Var, i2);
                    if (!listR.isEmpty()) {
                        this.f = 1;
                        if (njdVar.f.a(this, listR) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return Boolean.FALSE;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    List listR2 = tre.R(hr2Var, i2);
                    if (!listR2.isEmpty()) {
                        this.f = 1;
                        if (njdVar.f.a(this, listR2) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return Boolean.TRUE;
        }
    }
}
