package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class asc implements zqc {
    public final ap9 a;
    public final krc b;
    public final int c;
    public final String d;
    public final l9b e;
    public final zv f;

    public asc(exb exbVar, gu4 gu4Var) {
        ap9 ap9Var = new ap9(16, exbVar);
        krc krcVar = new krc(gu4Var);
        this.a = ap9Var;
        this.b = krcVar;
        this.c = 200;
        this.d = asc.class.getName();
        this.e = new l9b();
        this.f = new zv(200);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object e(asc ascVar, wrc wrcVar, nq4 nq4Var) {
        yrc yrcVar;
        l9b l9bVar;
        zv zvVar = ascVar.f;
        if (nq4Var instanceof yrc) {
            yrcVar = (yrc) nq4Var;
            int i = yrcVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                yrcVar.h = i - Integer.MIN_VALUE;
            } else {
                yrcVar = new yrc(ascVar, nq4Var);
            }
        } else {
            yrcVar = new yrc(ascVar, nq4Var);
        }
        Object obj = yrcVar.f;
        int i2 = yrcVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9bVar = ascVar.e;
            yrcVar.d = wrcVar;
            yrcVar.e = l9bVar;
            yrcVar.h = 1;
            Object objB = l9bVar.b(yrcVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9b l9bVar2 = yrcVar.e;
            wrc wrcVar2 = yrcVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            wrcVar = wrcVar2;
        }
        try {
            if (zvVar.c >= ascVar.c) {
                zvVar.removeFirst();
            }
            zvVar.addLast(wrcVar);
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    @Override // defpackage.zqc
    public final void c(pxa pxaVar, int i) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) {
        xrc xrcVar;
        er3 er3Var;
        if (nq4Var instanceof xrc) {
            xrcVar = (xrc) nq4Var;
            int i = xrcVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xrcVar.g = i - Integer.MIN_VALUE;
            } else {
                xrcVar = new xrc(this, nq4Var);
            }
        } else {
            xrcVar = new xrc(this, nq4Var);
        }
        Object obj = xrcVar.e;
        int i2 = xrcVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            er3 er3Var2 = er3.e;
            xrcVar.d = er3Var2;
            xrcVar.g = 1;
            Object objG = g(xrcVar);
            Object obj2 = hu4.a;
            if (objG == obj2) {
                return obj2;
            }
            obj = objG;
            er3Var = er3Var2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            er3Var = xrcVar.d;
            ch3.d0(obj);
        }
        er3Var.getClass();
        return er3.J((List) obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(nq4 nq4Var) {
        zrc zrcVar;
        l9b l9bVar;
        if (nq4Var instanceof zrc) {
            zrcVar = (zrc) nq4Var;
            int i = zrcVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrcVar.g = i - Integer.MIN_VALUE;
            } else {
                zrcVar = new zrc(this, nq4Var);
            }
        } else {
            zrcVar = new zrc(this, nq4Var);
        }
        Object obj = zrcVar.e;
        int i2 = zrcVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.e;
            zrcVar.d = l9bVar2;
            zrcVar.g = 1;
            Object objB = l9bVar2.b(zrcVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = zrcVar.d;
            ch3.d0(obj);
        }
        try {
            return ww3.T1(this.f);
        } finally {
            l9bVar.g(null);
        }
    }
}
