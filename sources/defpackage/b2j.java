package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b2j extends mdh implements wf7 {
    public int e;
    public /* synthetic */ wxi f;
    public /* synthetic */ vxi g;
    public /* synthetic */ boolean h;
    public /* synthetic */ boolean i;
    public final /* synthetic */ f2j j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2j(f2j f2jVar, lq4 lq4Var) {
        super(5, lq4Var);
        this.j = f2jVar;
    }

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        b2j b2jVar = new b2j(this.j, (lq4) serializable);
        b2jVar.f = (wxi) obj;
        b2jVar.g = (vxi) obj2;
        b2jVar.h = zBooleanValue;
        b2jVar.i = zBooleanValue2;
        return b2jVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        wxi wxiVar = this.f;
        vxi vxiVar = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        int i = this.e;
        lq4 lq4Var = null;
        if (i == 0) {
            ch3.d0(obj);
            boolean z3 = vxiVar instanceof sxi;
            f2j f2jVar = this.j;
            if (!z3) {
                if (cqk.d(vxiVar, txi.a)) {
                    return new z1j(r66.a, null, z2);
                }
                if (cqk.d(vxiVar, uxi.a)) {
                    nf2 nf2VarT = f2jVar.c.t();
                    return (nf2VarT == null || ((r97) nf2VarT).a.j() != 0) ? new w1j(wxiVar, z) : new x1j(z);
                }
                ore.o();
                return null;
            }
            List list = ((sxi) vxiVar).a;
            this.f = null;
            this.g = vxiVar;
            this.h = z;
            this.i = z2;
            this.e = 1;
            obj = yab.K0(((n0c) f2jVar.d).b(), new p7g(list, f2jVar, lq4Var, 24), this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return new z1j(((sxi) vxiVar).a, (rui) obj, z2);
    }
}
