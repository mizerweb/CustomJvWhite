package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class bii extends mdh implements tf7 {
    public int e;
    public /* synthetic */ yx6 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ cii h;
    public final /* synthetic */ AtomicBoolean i;
    public final /* synthetic */ long j;
    public final /* synthetic */ String k;
    public final /* synthetic */ oji l;
    public final /* synthetic */ whi m;
    public final /* synthetic */ AtomicReference n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bii(lq4 lq4Var, cii ciiVar, AtomicBoolean atomicBoolean, long j, String str, oji ojiVar, whi whiVar, AtomicReference atomicReference) {
        super(3, lq4Var);
        this.h = ciiVar;
        this.i = atomicBoolean;
        this.j = j;
        this.k = str;
        this.l = ojiVar;
        this.m = whiVar;
        this.n = atomicReference;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        bii biiVar = new bii((lq4) obj3, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        biiVar.f = (yx6) obj;
        biiVar.g = obj2;
        return biiVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        xx6 ra1Var;
        hu4 hu4Var = hu4.a;
        int i = this.e;
        lq4 lq4Var = null;
        if (i == 0) {
            ch3.d0(obj);
            yx6 yx6Var = this.f;
            cvi cviVar = (cvi) this.g;
            String str = this.h.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "prepared video conversion strategy: " + cviVar, null);
                }
            }
            if (cviVar instanceof avi) {
                boolean z = this.i.get();
                cii ciiVar = this.h;
                if (z) {
                    avi aviVar = (avi) cviVar;
                    ((i50) ciiVar.o.getValue()).a(new o5e(this.j, aviVar.c.e.e, 0.0f, this.k, this.l));
                    ra1Var = new bye(new p7g(aviVar.c, aviVar.a, lq4Var, 18));
                } else {
                    mvi mviVar = (mvi) ciiVar.h.getValue();
                    avi aviVar2 = (avi) cviVar;
                    wui wuiVar = aviVar2.b;
                    d1e d1eVar = aviVar2.c.e;
                    f4c f4cVar = new f4c(1, this.n);
                    mviVar.getClass();
                    ra1Var = e9i.M0(e9i.r(new b2f(7, null, mviVar, wuiVar, d1eVar, f4cVar)), new k7(lq4Var, this.h, cviVar, 4));
                }
            } else {
                if (!(cviVar instanceof bvi)) {
                    ore.o();
                    return null;
                }
                this.m.a(100.0f);
                cii ciiVar2 = this.h;
                bvi bviVar = (bvi) cviVar;
                wui wuiVar2 = bviVar.b;
                gka gkaVar = bviVar.a;
                pcd pcdVar = (pcd) ciiVar2.k.getValue();
                pcdVar.getClass();
                ra1Var = new ra1(21, new ocd(new tz(7, wuiVar2), wuiVar2, gkaVar, pcdVar, wuiVar2.a));
            }
            this.f = null;
            this.g = null;
            this.e = 1;
            if (e9i.L(yx6Var, ra1Var, this) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }
}
