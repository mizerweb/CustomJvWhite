package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xl2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public r72 f;
    public int g;
    public final /* synthetic */ r72 h;
    public final /* synthetic */ pm2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl2(r72 r72Var, lq4 lq4Var, pm2 pm2Var, int i, int i2, int i3) {
        super(2, lq4Var);
        this.e = i3;
        this.h = r72Var;
        this.i = pm2Var;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new xl2(this.h, lq4Var, this.i, this.j, this.k, 0);
            default:
                return new xl2(this.h, lq4Var, this.i, this.j, this.k, 1);
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
        return ((xl2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        r72 r72Var;
        Object objJ2;
        r72 r72Var2;
        int i = this.e;
        sbi sbiVar = sbi.a;
        r72 r72Var3 = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    List listSingletonList = Collections.singletonList(sl2.c);
                    this.f = r72Var3;
                    this.g = 1;
                    objJ = this.i.j(listSingletonList, this.j, this.k, 1, null, this);
                    if (objJ != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 == 1) {
                    r72Var3 = this.f;
                    ch3.d0(obj);
                    objJ = obj;
                } else {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r72Var = this.f;
                    ch3.d0(obj);
                }
                r72Var.b(null);
                return sbiVar;
                this.f = r72Var3;
                this.g = 2;
                if (ch3.u((Collection) objJ, this) != hu4Var) {
                    r72Var = r72Var3;
                    r72Var.b(null);
                    return sbiVar;
                }
                return hu4Var;
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    List listSingletonList2 = Collections.singletonList(sl2.a);
                    this.f = r72Var3;
                    this.g = 1;
                    objJ2 = this.i.j(listSingletonList2, this.j, this.k, 1, null, this);
                    if (objJ2 != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i3 == 1) {
                    r72Var3 = this.f;
                    ch3.d0(obj);
                    objJ2 = obj;
                } else {
                    if (i3 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r72Var2 = this.f;
                    ch3.d0(obj);
                }
                r72Var2.b(null);
                return sbiVar;
                this.f = r72Var3;
                this.g = 2;
                if (ch3.u((Collection) objJ2, this) != hu4Var) {
                    r72Var2 = r72Var3;
                    r72Var2.b(null);
                    return sbiVar;
                }
                return hu4Var;
        }
    }
}
