package defpackage;

import android.database.SQLException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x4i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ nub h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4i(nub nubVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = nubVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        nub nubVar = this.h;
        switch (i) {
            case 0:
                x4i x4iVar = new x4i(nubVar, lq4Var, 0);
                x4iVar.g = obj;
                return x4iVar;
            default:
                x4i x4iVar2 = new x4i(nubVar, lq4Var, 1);
                x4iVar2.g = obj;
                return x4iVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((x4i) create((nzh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((x4i) create((pzh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        pzh pzhVar;
        int i = this.e;
        nub nubVar = this.h;
        hu4 hu4Var = hu4.a;
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
                nzh nzhVar = (nzh) this.g;
                this.f = 1;
                Object objA = nub.a(nubVar, nzhVar, this);
                return objA == hu4Var ? hu4Var : objA;
            default:
                int i3 = this.f;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            pzhVar = (pzh) this.g;
                            ch3.d0(obj);
                        } else {
                            if (i3 != 2) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ch3.d0(obj);
                        }
                        return (Set) obj;
                    }
                    ch3.d0(obj);
                    pzhVar = (pzh) this.g;
                    this.g = pzhVar;
                    this.f = 1;
                    obj = pzhVar.b(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        ozh ozhVar = ozh.b;
                        x4i x4iVar = new x4i(nubVar, lq4Var, 0);
                        this.g = null;
                        this.f = 2;
                        obj = pzhVar.d(ozhVar, x4iVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return c76.a;
        }
    }
}
