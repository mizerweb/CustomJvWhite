package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ca extends mdh implements qf7 {
    public v2a e;
    public Iterator f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ v2a j;
    public final /* synthetic */ List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(v2a v2aVar, List list, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = v2aVar;
        this.k = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        ca caVar = new ca(this.j, this.k, lq4Var);
        caVar.i = obj;
        return caVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ca) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator l2iVar;
        v2a v2aVar;
        Object poeVar;
        gu4 gu4Var = (gu4) this.i;
        hu4 hu4Var = hu4.a;
        int i2 = this.h;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = (String) this.j.c;
            List list = this.k;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "invoke for ".concat(ww3.z1(list, ",", "[", "]", ba.b, 24)), null);
                }
            }
            pq3 pq3VarE = pq3.j.e((Context) this.j.b);
            m2i m2iVar = new m2i(yhf.n0(yhf.t0(yhf.s0(new sw(1, this.k), new c6(6)), new g3(1, pq3VarE)), new c6(7)), new c6(8));
            kbc kbcVarM = pq3VarE.m();
            i = 0;
            m2i m2iVarT0 = yhf.t0(new kx6(m2iVar, new ol(new c6(4), 24, new z9(0, kbcVarM)), cif.a), new z9(1, kbcVarM));
            v2a v2aVar2 = this.j;
            l2iVar = new l2i(m2iVarT0);
            v2aVar = v2aVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.g;
            l2iVar = this.f;
            v2aVar = this.e;
            ch3.d0(obj);
            i = i3;
        }
        while (l2iVar.hasNext()) {
            View view = (View) l2iVar.next();
            String str2 = (String) v2aVar.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    try {
                        poeVar = ((Context) v2aVar.b).getResources().getResourceName(view.getId());
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    if (poeVar instanceof poe) {
                        poeVar = null;
                    }
                    a4cVar2.c(je9Var2, str2, qv1.l("colorized ", (String) poeVar, "/", view.getClass().getSimpleName()), null);
                }
            }
            this.i = gu4Var;
            this.e = v2aVar;
            this.f = l2iVar;
            this.g = i;
            this.h = 1;
            if (tre.J0(this) == hu4Var) {
                return hu4Var;
            }
        }
        return sbi.a;
    }
}
