package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i99 {
    public final gu4 a;
    public final ite b;
    public final xhh c;
    public final gjg d;
    public final String e = i99.class.getName();
    public final mjg f;
    public final r8e g;
    public final pzf h;
    public final q8e i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ifh m;

    public i99(dq4 dq4Var, ite iteVar, xhh xhhVar, gjg gjgVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = dq4Var;
        this.b = iteVar;
        this.c = xhhVar;
        this.d = gjgVar;
        mjg mjgVarA = p90.a(l99.a);
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.h = pzfVarB;
        this.i = new q8e(pzfVarB);
        this.j = ny8Var;
        this.k = ny8Var2;
        this.l = ny8Var3;
        this.m = new ifh(new q38(26));
        e9i.j0(new j3(e9i.T(new fz6(new jz(gjgVar, 13), new m20(2, this, i99.class, "handleChat", "handleChat(Lru/ok/tamtam/chats/Chat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 27), 3), ((n0c) xhhVar).b()), 14, new ud9(this, (lq4) null, 25)), dq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(i99 i99Var, rt2 rt2Var, lq4 lq4Var) {
        g99 g99Var;
        mjg mjgVar;
        mjg mjgVar2;
        i99Var.getClass();
        Object obj = l99.a;
        je9 je9Var = je9.d;
        if (lq4Var instanceof g99) {
            g99Var = (g99) lq4Var;
            int i = g99Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                g99Var.g = i - Integer.MIN_VALUE;
            } else {
                g99Var = new g99(i99Var, lq4Var);
            }
        } else {
            g99Var = new g99(i99Var, lq4Var);
        }
        Object obj2 = g99Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = g99Var.g;
        if (i2 == 0) {
            ch3.d0(obj2);
            o99 o99Var = o99.c;
            nx2 nx2Var = rt2Var.b;
            long j = nx2Var.t0;
            gj2 gj2Var = nx2Var.u0;
            long j2 = gj2Var != null ? gj2Var.b : 0L;
            if (j != 0) {
                if (j > j2) {
                    o99Var = o99.a;
                } else if (j <= j2) {
                    o99Var = o99.b;
                }
            }
            String str = i99Var.e;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "chat updated: liveStream=" + o99Var, null);
            }
            mjgVar = i99Var.f;
            int iOrdinal = o99Var.ordinal();
            if (iOrdinal == 0) {
                String str2 = i99Var.e;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, zo5.j(rt2Var.b.a, "prefetch live stream info: "), null);
                }
                i13 i13Var = (i13) i99Var.j.getValue();
                Long l = new Long(((l7f) i99Var.k.getValue()).a());
                Long l2 = new Long(rt2Var.b.a);
                g99Var.d = mjgVar;
                g99Var.g = 1;
                if (i13Var.q(l, l2, g99Var) == hu4Var) {
                    return hu4Var;
                }
                mjgVar2 = mjgVar;
            } else if (iOrdinal == 1) {
                obj = k99.a;
            } else if (iOrdinal != 2) {
                ore.o();
                return null;
            }
            mjgVar.setValue(obj);
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mjgVar2 = g99Var.d;
        ch3.d0(obj2);
        mjgVar = mjgVar2;
        mjgVar.setValue(obj);
        return sbi.a;
    }

    public final q8e b() {
        return this.i;
    }

    public final r8e c() {
        return this.g;
    }
}
