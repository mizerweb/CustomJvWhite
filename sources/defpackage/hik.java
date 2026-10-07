package defpackage;

import com.vk.push.common.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class hik {
    public final kr6 a;
    public final g7k b;
    public final lb5 c;
    public final Logger d;

    public hik(kr6 kr6Var, g7k g7kVar, Logger logger) {
        ao5 ao5Var = ao5.a;
        lb5 lb5Var = lb5.c;
        this.a = kr6Var;
        this.b = g7kVar;
        this.c = lb5Var;
        this.d = logger.createLogger("TopicRepo");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, nq4 nq4Var) {
        zhk zhkVar;
        if (nq4Var instanceof zhk) {
            zhkVar = (zhk) nq4Var;
            int i = zhkVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zhkVar.f = i - Integer.MIN_VALUE;
            } else {
                zhkVar = new zhk(this, nq4Var);
            }
        } else {
            zhkVar = new zhk(this, nq4Var);
        }
        Object objK0 = zhkVar.d;
        int i2 = zhkVar.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            aik aikVar = new aik(this, str, lq4Var, 0);
            zhkVar.f = 1;
            objK0 = yab.K0(this.c, aikVar, zhkVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, nq4 nq4Var) {
        bik bikVar;
        if (nq4Var instanceof bik) {
            bikVar = (bik) nq4Var;
            int i = bikVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bikVar.f = i - Integer.MIN_VALUE;
            } else {
                bikVar = new bik(this, nq4Var);
            }
        } else {
            bikVar = new bik(this, nq4Var);
        }
        Object objK0 = bikVar.d;
        int i2 = bikVar.f;
        lq4 lq4Var = null;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(objK0);
            aik aikVar = new aik(this, str, lq4Var, i3);
            bikVar.f = 1;
            objK0 = yab.K0(this.c, aikVar, bikVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }
}
