package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qki {
    public final ny8 a;
    public final ifh b = new ifh(new yfi(8));
    public final String c = qki.class.getName();

    public qki(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final List a() {
        jji jjiVar = jji.UPLOADING;
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "blockingGetUploadsWithStatus " + jjiVar, null);
            }
        }
        try {
            return e().a();
        } catch (Throwable th) {
            String str2 = this.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "blockingGetUploadsWithStatus fail " + jjiVar, th);
                }
            }
            return r66.a;
        }
    }

    public final void b(long j) {
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "blockingRemoveUploadWithAttachId "), null);
            }
        }
        vb8 vb8VarF = f();
        vb8VarF.getClass();
        vb8VarF.a.entrySet().removeIf(new u6(8, new nv4(18, new cp4(j, 1))));
        ch3.G(((nki) e()).a, false, true, new jqh(j, 1));
    }

    public final void c(String str) {
        String str2 = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "blockingRemoveUploadWithToken ".concat(str), null);
            }
        }
        vb8 vb8VarF = f();
        vb8VarF.getClass();
        vb8VarF.a.entrySet().removeIf(new u6(8, new nv4(18, new ub8(str, 0))));
        ch3.G(((nki) e()).a, false, true, new qo1(str, 16));
    }

    public final Object d(nq4 nq4Var) {
        gm0.n(this.c, "clear");
        f().a.clear();
        Object objI = ch3.I(nq4Var, ((nki) e()).a, false, true, new u8h(19));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final kki e() {
        return (kki) this.a.getValue();
    }

    public final vb8 f() {
        return (vb8) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ahi ahiVar, nq4 nq4Var) {
        pki pkiVar;
        if (nq4Var instanceof pki) {
            pkiVar = (pki) nq4Var;
            int i = pkiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pkiVar.f = i - Integer.MIN_VALUE;
            } else {
                pkiVar = new pki(this, nq4Var);
            }
        } else {
            pkiVar = new pki(this, nq4Var);
        }
        Object objB = pkiVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = pkiVar.f;
        if (i2 == 0) {
            ch3.d0(objB);
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "getUpload " + ahiVar, null);
                }
            }
            vfi vfiVar = (vfi) f().a.get(ahiVar);
            if (vfiVar != null) {
                return vfiVar;
            }
            kki kkiVarE = e();
            pkiVar.f = 1;
            kkiVarE.getClass();
            objB = kki.b(kkiVarE, ahiVar, pkiVar);
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objB);
        }
        vfi vfiVar2 = (vfi) objB;
        if (vfiVar2 == null) {
            return null;
        }
        f().a.put(vfiVar2.a, vfiVar2);
        return vfiVar2;
    }
}
