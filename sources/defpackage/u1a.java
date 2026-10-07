package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class u1a extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ b2a f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ mg5 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1a(b2a b2aVar, long j, long j2, boolean z, mg5 mg5Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = b2aVar;
        this.g = j;
        this.h = j2;
        this.i = z;
        this.j = mg5Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new u1a(this.f, this.g, this.h, this.i, this.j, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((u1a) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objF;
        Object value;
        Object value2;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            b2a b2aVar = this.f;
            zv8[] zv8VarArr = b2a.z;
            sua suaVar = (sua) b2aVar.h.getValue();
            long j = this.g;
            this.e = 1;
            objF = suaVar.f(j, this);
            if (objF == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            objF = obj;
        }
        sfa sfaVar = (sfa) objF;
        b2a b2aVar2 = this.f;
        if (sfaVar == null) {
            String str = b2aVar2.b;
            long j2 = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(j2, "Can't create playlist because we can't find message by id: "), null);
                }
            }
            this.f.n = null;
            mjg mjgVar = this.f.o;
            do {
                value2 = mjgVar.getValue();
            } while (!mjgVar.h(value2, new t1a(0L, (LinkedHashSet) null, 7)));
            p20 p20Var = this.f.p;
            if (p20Var != null) {
                p20Var.c();
            }
            this.f.p = null;
            return sbiVar;
        }
        b2aVar2.n = new s1a(this.g, this.h, this.i);
        mjg mjgVar2 = this.f.o;
        long j3 = this.g;
        do {
            value = mjgVar2.getValue();
        } while (!mjgVar2.h(value, new t1a(j3, lof.W(new Long(j3)), 4)));
        b2a b2aVar3 = this.f;
        long j4 = this.h;
        long j5 = sfaVar.b;
        b2aVar3.getClass();
        Set set = b2a.A;
        wz9 wz9Var = new wz9(j5, j5, set, j4);
        b2aVar3.r.updateAndGet(new l43(b2aVar3, (wz9) ((xn3) b2aVar3.g.getValue()).p(j4).a.getValue(), wz9Var, 2));
        sgg sggVar = b2aVar3.t;
        if (sggVar != null) {
            sggVar.b(null);
        }
        int i2 = 3;
        b2aVar3.t = e9i.j0(new fz6(new o24(((xn3) b2aVar3.g.getValue()).p(j4), 15, b2aVar3), new y1a(b2aVar3, null, 0), i2), b2aVar3.m);
        b2a b2aVar4 = this.f;
        long j6 = this.h;
        mg5 mg5Var = this.j;
        p20 p20Var2 = b2aVar4.p;
        if (p20Var2 != null) {
            p20Var2.c();
        }
        p20 p20VarA = o13.a((o13) b2aVar4.j.getValue(), j6, mg5Var, sfaVar.a, sfaVar.c, set, new gw2(b2aVar4, j6, i2), b2aVar4.m, "MediaPlaylistLoader", null, np0.o);
        sgg sggVar2 = b2aVar4.s;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
        b2aVar4.s = e9i.j0(e9i.T(new fz6(p20VarA.L, new y1a(b2aVar4, null, 2), i2), ((n0c) ((xhh) b2aVar4.k.getValue())).b()), b2aVar4.m);
        p20VarA.m(sfaVar.c);
        b2aVar4.p = p20VarA;
        return sbiVar;
    }
}
