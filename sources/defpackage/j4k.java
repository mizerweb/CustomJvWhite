package defpackage;

import com.vk.push.common.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class j4k {
    public final g9i a;
    public final ewe b;
    public final Logger c;

    public j4k(g9i g9iVar, ewe eweVar, Logger logger) {
        this.a = g9iVar;
        this.b = eweVar;
        this.c = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        o2k o2kVar;
        if (nq4Var instanceof o2k) {
            o2kVar = (o2k) nq4Var;
            int i = o2kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                o2kVar.g = i - Integer.MIN_VALUE;
            } else {
                o2kVar = new o2k(this, nq4Var);
            }
        } else {
            o2kVar = new o2k(this, nq4Var);
        }
        Object objA = o2kVar.e;
        int i2 = o2kVar.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objA);
            o2kVar.d = this;
            o2kVar.g = 1;
            objA = ((wek) this.a.a).a.a(o2kVar);
            if (objA != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objA);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = o2kVar.d;
        ch3.d0(objA);
        if (((Boolean) objA).booleanValue()) {
            Logger.DefaultImpls.info$default(this.c, "client sdk mode changed", null, 2, null);
            ewe eweVar = this.b;
            o2kVar.d = null;
            o2kVar.g = 2;
            if (eweVar.b(false, o2kVar) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }
}
