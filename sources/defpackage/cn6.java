package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cn6 {
    public final ki3 a;
    public final String b = cn6.class.getName();
    public final ny8 c;
    public final ifh d;

    public cn6(ki3 ki3Var, ny8 ny8Var, ifh ifhVar) {
        this.a = ki3Var;
        this.c = ny8Var;
        this.d = ifhVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(nq4 nq4Var) {
        bn6 bn6Var;
        xvc xvcVar;
        a83 a83Var;
        Object objB;
        if (nq4Var instanceof bn6) {
            bn6Var = (bn6) nq4Var;
            int i = bn6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bn6Var.h = i - Integer.MIN_VALUE;
            } else {
                bn6Var = new bn6(this, nq4Var);
            }
        } else {
            bn6Var = new bn6(this, nq4Var);
        }
        Object objN = bn6Var.f;
        int i2 = bn6Var.h;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objN);
            xvcVar = ni3.b;
            bn6Var.d = xvcVar;
            bn6Var.h = 1;
            ki3 ki3Var = this.a;
            sy4 sy4Var = (sy4) ki3Var.b;
            String str = (String) ki3Var.a;
            sy4Var.getClass();
            objN = e9i.N(new jz(sy4Var.j(str), 13), bn6Var);
            if (objN != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            xvcVar = bn6Var.d;
            ch3.d0(objN);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objN);
                return objN;
            }
            a83Var = bn6Var.e;
            ch3.d0(objN);
        }
        bn6Var.d = null;
        bn6Var.e = null;
        bn6Var.h = 3;
        objB = a83Var.b((List) objN, true, bn6Var);
        if (objB != hu4Var) {
            return hu4Var;
        }
        return objB;
        r17 r17Var = (r17) objN;
        xvcVar.getClass();
        LinkedHashSet linkedHashSet = r17Var.j;
        ni3 li3Var = r17Var.a() ? new li3(linkedHashSet) : new mi3(r17Var.a, r17Var.e, r17Var.d, r17Var.p, r17Var.q, r17Var.g, new zc6(linkedHashSet));
        gm0.n(this.b, "load favourites, folderId: " + li3Var.b());
        a83 a83Var2 = (a83) this.d.getValue();
        uy2 uy2Var = (uy2) this.c.getValue();
        bn6Var.d = null;
        bn6Var.e = a83Var2;
        bn6Var.h = 2;
        objN = uy2Var.e(li3Var, bn6Var);
        if (objN != hu4Var) {
            a83Var = a83Var2;
            bn6Var.d = null;
            bn6Var.e = null;
            bn6Var.h = 3;
            objB = a83Var.b((List) objN, true, bn6Var);
            if (objB != hu4Var) {
                return objB;
            }
        }
        return hu4Var;
    }
}
