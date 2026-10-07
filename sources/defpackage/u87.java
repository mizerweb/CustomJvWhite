package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class u87 implements dzc {
    public boolean A;
    public final Set a;
    public final o97 b;
    public final xde c;
    public final Long d;
    public final boolean e;
    public final Context f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final mjg p;
    public final r8e q;
    public List r;
    public final pzf s;
    public final q8e t;
    public final o56 u;
    public final mjg v;
    public final r8e w;
    public final ny8 x;
    public final ny8 y;
    public gu4 z;

    public u87(Set set, o97 o97Var, xde xdeVar, Long l, boolean z, Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.a = set;
        this.b = o97Var;
        this.c = xdeVar;
        this.d = l;
        this.e = z;
        this.f = context;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var5;
        this.l = ny8Var6;
        this.m = ny8Var7;
        this.n = ny8Var8;
        this.o = ny8Var9;
        mjg mjgVarA = p90.a(null);
        this.p = mjgVarA;
        this.q = new r8e(mjgVarA);
        this.r = r66.a;
        final int i = 0;
        final int i2 = 1;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 1);
        this.s = pzfVarB;
        this.t = new q8e(pzfVarB);
        this.u = new o56();
        mjg mjgVarA2 = p90.a(Boolean.TRUE);
        this.v = mjgVarA2;
        this.w = new r8e(mjgVarA2);
        this.x = rx8.P(3, new af7(this) { // from class: s87
            public final /* synthetic */ u87 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                u87 u87Var = this.b;
                switch (i3) {
                    case 0:
                        return wk8.p(u87Var.f, R.drawable.icon_user);
                    default:
                        return wk8.p(u87Var.f, R.drawable.icon_user_crossed);
                }
            }
        });
        this.y = rx8.P(3, new af7(this) { // from class: s87
            public final /* synthetic */ u87 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                u87 u87Var = this.b;
                switch (i3) {
                    case 0:
                        return wk8.p(u87Var.f, R.drawable.icon_user);
                    default:
                        return wk8.p(u87Var.f, R.drawable.icon_user_crossed);
                }
            }
        });
        if (set.isEmpty()) {
            ore.k("You must specify messages to forward!");
            throw null;
        }
    }

    @Override // defpackage.dzc
    public final void a(dq4 dq4Var) {
        this.z = dq4Var;
        yab.i0(dq4Var, ((n0c) ((xhh) this.g.getValue())).b(), 0, new wz6(this, null, 5), 2);
    }

    @Override // defpackage.dzc
    public final void b() {
        this.z = null;
    }

    @Override // defpackage.dzc
    public final void c(xyc xycVar) {
        this.c.L(xycVar);
    }

    @Override // defpackage.dzc
    public final void d() {
        ((AtomicReference) this.c.e).updateAndGet(new g23(8));
    }

    @Override // defpackage.dzc
    public final void e(long j) {
        this.c.H(j);
    }

    public final void f() {
        ny8 ny8Var = this.l;
        xb9 xb9Var = (xb9) ((et3) ny8Var.getValue());
        gvb gvbVar = xb9Var.E0;
        zv8[] zv8VarArr = xb9.g1;
        if (((Boolean) gvbVar.m(xb9Var, zv8VarArr[21])).booleanValue()) {
            return;
        }
        this.s.a(y87.a);
        xb9 xb9Var2 = (xb9) ((et3) ny8Var.getValue());
        xb9Var2.E0.B(xb9Var2, zv8VarArr[21], Boolean.TRUE);
    }

    public final Drawable g() {
        return ((Boolean) this.v.getValue()).booleanValue() ? (Drawable) this.x.getValue() : (Drawable) this.y.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0115 A[LOOP:0: B:10:0x001e->B:64:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x011d A[EDGE_INSN: B:68:0x011d->B:65:0x011d BREAK  A[LOOP:0: B:10:0x001e->B:64:0x0115], SYNTHETIC] */
    public final void h(CharSequence charSequence, m8b m8bVar, boolean z, boolean z2) {
        boolean z3;
        Object next;
        u87 u87Var = this;
        m8b m8bVar2 = m8bVar;
        if (m8bVar2.i() || u87Var.A) {
            return;
        }
        u87Var.A = true;
        long[] jArr = m8bVar2.b;
        long[] jArr2 = m8bVar2.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((255 & j) < 128) {
                            Long lValueOf = Long.valueOf(jArr[(i << 3) + i3]);
                            Object obj = null;
                            if (m8bVar2.d != 1) {
                                lValueOf = null;
                            }
                            ny8 ny8Var = u87Var.g;
                            if (lValueOf != null && !z) {
                                gu4 gu4Var = u87Var.z;
                                if (gu4Var != null) {
                                    yab.i0(gu4Var, ((n0c) ((xhh) ny8Var.getValue())).a(), 0, new qy3(u87Var, null, 21), 2);
                                    return;
                                }
                                return;
                            }
                            g4b g4bVarJ = ((h4b) u87Var.m.getValue()).J(3);
                            if (lValueOf != null) {
                                xde xdeVar = u87Var.c;
                                Iterator it = xdeVar.r().iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((xyc) next).a != lValueOf.longValue());
                                xyc xycVar = (xyc) next;
                                if ((xycVar != null ? xycVar.c : 0) != 1) {
                                    for (Object obj2 : xdeVar.r()) {
                                        if (((xyc) obj2).a == lValueOf.longValue()) {
                                            obj = obj2;
                                            break;
                                        }
                                    }
                                    xyc xycVar2 = (xyc) obj;
                                    if ((xycVar2 != null ? xycVar2.c : 0) == 2 || u87Var.d != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                } else {
                                    z3 = true;
                                }
                            } else {
                                z3 = true;
                            }
                            gu4 gu4Var2 = u87Var.z;
                            if (gu4Var2 != null) {
                                yab.h0(gu4Var2, lvb.x0(zhb.b, ((n0c) ((xhh) ny8Var.getValue())).a()), 3, new t87(u87Var, z2, charSequence, m8bVar2, g4bVarJ, z3, lValueOf, null));
                                return;
                            }
                            return;
                        }
                        j >>= 8;
                        i3++;
                        u87Var = this;
                        m8bVar2 = m8bVar;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                    u87Var = this;
                    m8bVar2 = m8bVar;
                } else if (i != length) {
                    break;
                    break;
                } else {
                    i++;
                    u87Var = this;
                    m8bVar2 = m8bVar;
                }
            }
        }
        ore.f("The LongSet is empty");
    }
}
