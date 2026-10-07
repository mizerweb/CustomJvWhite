package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vh3 implements hw7 {
    public static final List f = Collections.singletonList(new uh3());
    public final ifh b;
    public final ifh c;
    public final vv2 d;
    public final vv2 e;

    public vh3(final ki3 ki3Var, final ny8 ny8Var) {
        final int i = 0;
        this.b = new ifh(new af7(ki3Var, ny8Var, this, i) { // from class: th3
            public final /* synthetic */ int a;
            public final /* synthetic */ ki3 b;
            public final /* synthetic */ ny8 c;

            {
                this.a = i;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Long lValueOf;
                Object next;
                int i2 = this.a;
                ny8 ny8Var2 = this.c;
                ki3 ki3Var2 = this.b;
                switch (i2) {
                    case 0:
                        r17 r17VarE = ki3Var2.e();
                        LinkedHashSet linkedHashSet = r17VarE.j;
                        ni3 li3Var = r17VarE.a() ? new li3(linkedHashSet) : new mi3(r17VarE.a, r17VarE.e, r17VarE.d, r17VarE.p, r17VarE.q, r17VarE.g, new zc6(linkedHashSet));
                        uy2 uy2Var = (uy2) ny8Var2.getValue();
                        uy2Var.getClass();
                        rt2 rt2Var = (rt2) yhf.p0(uy2Var.a(uy2Var.b(new sw(1, uy2Var.d(li3Var.a())), li3Var), li3Var));
                        lValueOf = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
                    default:
                        r17 r17VarE2 = ki3Var2.e();
                        LinkedHashSet linkedHashSet2 = r17VarE2.j;
                        ni3 li3Var2 = r17VarE2.a() ? new li3(linkedHashSet2) : new mi3(r17VarE2.a, r17VarE2.e, r17VarE2.d, r17VarE2.p, r17VarE2.q, r17VarE2.g, new zc6(linkedHashSet2));
                        uy2 uy2Var2 = (uy2) ny8Var2.getValue();
                        uy2Var2.getClass();
                        Iterator it = uy2Var2.a(uy2Var2.b(new sw(1, uy2Var2.d(li3Var2.a())), li3Var2), li3Var2).iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                        } else {
                            next = null;
                        }
                        rt2 rt2Var2 = (rt2) next;
                        lValueOf = rt2Var2 != null ? Long.valueOf(rt2Var2.a) : null;
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
                }
            }
        });
        final int i2 = 1;
        this.c = new ifh(new af7(ki3Var, ny8Var, this, i2) { // from class: th3
            public final /* synthetic */ int a;
            public final /* synthetic */ ki3 b;
            public final /* synthetic */ ny8 c;

            {
                this.a = i2;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Long lValueOf;
                Object next;
                int i3 = this.a;
                ny8 ny8Var2 = this.c;
                ki3 ki3Var2 = this.b;
                switch (i3) {
                    case 0:
                        r17 r17VarE = ki3Var2.e();
                        LinkedHashSet linkedHashSet = r17VarE.j;
                        ni3 li3Var = r17VarE.a() ? new li3(linkedHashSet) : new mi3(r17VarE.a, r17VarE.e, r17VarE.d, r17VarE.p, r17VarE.q, r17VarE.g, new zc6(linkedHashSet));
                        uy2 uy2Var = (uy2) ny8Var2.getValue();
                        uy2Var.getClass();
                        rt2 rt2Var = (rt2) yhf.p0(uy2Var.a(uy2Var.b(new sw(1, uy2Var.d(li3Var.a())), li3Var), li3Var));
                        lValueOf = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
                    default:
                        r17 r17VarE2 = ki3Var2.e();
                        LinkedHashSet linkedHashSet2 = r17VarE2.j;
                        ni3 li3Var2 = r17VarE2.a() ? new li3(linkedHashSet2) : new mi3(r17VarE2.a, r17VarE2.e, r17VarE2.d, r17VarE2.p, r17VarE2.q, r17VarE2.g, new zc6(linkedHashSet2));
                        uy2 uy2Var2 = (uy2) ny8Var2.getValue();
                        uy2Var2.getClass();
                        Iterator it = uy2Var2.a(uy2Var2.b(new sw(1, uy2Var2.d(li3Var2.a())), li3Var2), li3Var2).iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                        } else {
                            next = null;
                        }
                        rt2 rt2Var2 = (rt2) next;
                        lValueOf = rt2Var2 != null ? Long.valueOf(rt2Var2.a) : null;
                        return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
                }
            }
        });
        hw7.a.getClass();
        this.d = fw7.d;
        this.e = fw7.e;
    }

    @Override // defpackage.hw7
    public final boolean b() {
        return false;
    }

    @Override // defpackage.hw7
    public final Comparator c() {
        return this.d;
    }

    @Override // defpackage.hw7
    public final long d() {
        return ((Number) this.b.getValue()).longValue();
    }

    @Override // defpackage.hw7
    public final Comparator h() {
        return this.e;
    }

    @Override // defpackage.hw7
    public final long k() {
        return ((Number) this.c.getValue()).longValue();
    }

    @Override // defpackage.hw7
    public final List l() {
        return f;
    }
}
