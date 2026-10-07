package defpackage;

import java.util.Collections;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ak3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ fk3 g;
    public final /* synthetic */ sn7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak3(fk3 fk3Var, sn7 sn7Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = fk3Var;
        this.h = sn7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        sn7 sn7Var = this.h;
        fk3 fk3Var = this.g;
        switch (i) {
            case 0:
                return new ak3(fk3Var, sn7Var, lq4Var, 0);
            default:
                return new ak3(fk3Var, sn7Var, lq4Var, 1);
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
        return ((ak3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        rt2 rt2VarO;
        i65 i65VarX;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        fk3 fk3Var = this.g;
        sn7 sn7Var = this.h;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                no4 no4Var = (no4) fk3Var.l.getValue();
                List listSingletonList = Collections.singletonList(sn7Var.j);
                this.f = 1;
                Object objM = no4Var.m(listSingletonList, ji4.b, this);
                return objM == hu4Var ? hu4Var : objM;
            default:
                int i3 = this.f;
                sbi sbiVar = sbi.a;
                if (i3 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr = fk3.y1;
                    if (((s7f) ((et3) fk3Var.i.getValue())).t() == sn7Var.c) {
                        a8j.x(fk3Var.K, new r3g(new tnh(R.string.self_profile_click), null, null, 6));
                    } else {
                        xt4 xt4VarB = ((n0c) fk3Var.g).b();
                        ak3 ak3Var = new ak3(fk3Var, sn7Var, lq4Var, 0);
                        this.f = 1;
                        if (yab.K0(xt4VarB, ak3Var, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                    return sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                } else {
                    if (i3 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                rt2VarO = (rt2) obj;
                if (rt2VarO != null) {
                    i65VarX = zm3.k(zm3.b, rt2VarO.a, d93.SEARCH, null, 10);
                } else {
                    i65VarX = zm3.b.x(sn7Var.c);
                }
                fk3Var.H(sn7Var);
                a8j.x(fk3Var.J, i65VarX);
                return sbiVar;
                pj4 pj4Var = sn7Var.j;
                long j = sn7Var.c;
                if (pj4Var.s.h()) {
                    zv8[] zv8VarArr2 = fk3.y1;
                    xn3 xn3VarE = fk3Var.E();
                    this.f = 2;
                    obj = xn3VarE.r(j, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    rt2VarO = (rt2) obj;
                } else {
                    zv8[] zv8VarArr3 = fk3.y1;
                    rt2VarO = fk3Var.E().o(j);
                }
                if (rt2VarO != null) {
                    i65VarX = zm3.k(zm3.b, rt2VarO.a, d93.SEARCH, null, 10);
                } else {
                    i65VarX = zm3.b.x(sn7Var.c);
                }
                fk3Var.H(sn7Var);
                a8j.x(fk3Var.J, i65VarX);
                return sbiVar;
        }
    }
}
