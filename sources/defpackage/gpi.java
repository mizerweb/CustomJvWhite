package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gpi extends a8j {
    public static final long D1;
    public static final long E1;
    public final mjg A;
    public final fpi A1;
    public final mjg B;
    public final yo0 C;
    public final r8e D;
    public final r8e E;
    public final r8e F;
    public final r8e G;
    public final r8e H;
    public final mjg I;
    public final r8e J;
    public final xx6 K;
    public volatile int X;
    public final p3c Y;
    public final p3c Z;
    public final azg c;
    public final Long d;
    public final ha9 e;
    public final xhh f;
    public final aj5 g;
    public final et3 h;
    public final e5d i;
    public final vzg j;
    public final wmi k;
    public final t3h l;
    public final r29 m;
    public final w69 n;
    public final p3c n1;
    public final dcj o;
    public volatile int o1;
    public final String p = gpi.class.getName();
    public eoi p1;
    public final ny8 q;
    public final l95 q1;
    public final ny8 r;
    public final ic6 r1;
    public final ny8 s;
    public final ic6 s1;
    public final ny8 t;
    public final r8e t1;
    public final ny8 u;
    public final mjg u1;
    public final ny8 v;
    public final r8e v1;
    public final ny8 w;
    public final r8e w1;
    public final ny8 x;
    public long x1;
    public final mjg y;
    public final ConcurrentHashMap y1;
    public final r8e z;
    public final ve0 z1;
    public static final /* synthetic */ zv8[] C1 = {new z8b(gpi.class, "videoReconnectRetryJob", "getVideoReconnectRetryJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, gpi.class, "photoReconnectRetryJob", "getPhotoReconnectRetryJob()Lkotlinx/coroutines/Job;"), new z8b(gpi.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;")};
    public static final px8 B1 = new px8();

    static {
        ghb ghbVar = ew5.b;
        D1 = qe7.O(1, lw5.SECONDS);
        E1 = qe7.O(500, lw5.MILLISECONDS);
    }

    public gpi(azg azgVar, rni rniVar, Long l, ha9 ha9Var, xhh xhhVar, aj5 aj5Var, et3 et3Var, e5d e5dVar, vzg vzgVar, wmi wmiVar, t3h t3hVar, r29 r29Var, w69 w69Var, dcj dcjVar, Context context, ny8 ny8Var, ny8 ny8Var2, p4c p4cVar, no4 no4Var, ij4 ij4Var, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10) {
        lq4 lq4Var;
        xx6 tzVar;
        int i;
        xx6 fz6Var;
        this.c = azgVar;
        this.d = l;
        this.e = ha9Var;
        this.f = xhhVar;
        this.g = aj5Var;
        this.h = et3Var;
        this.i = e5dVar;
        this.j = vzgVar;
        this.k = wmiVar;
        this.l = t3hVar;
        this.m = r29Var;
        this.n = w69Var;
        this.o = dcjVar;
        this.q = ny8Var4;
        this.r = ny8Var7;
        this.s = ny8Var6;
        this.t = ny8Var;
        this.u = ny8Var2;
        this.v = ny8Var8;
        this.w = ny8Var5;
        this.x = ny8Var10;
        mjg mjgVarA = p90.a(new toc(32));
        this.y = mjgVarA;
        yo0 yo0Var = new yo0(mjgVarA, 10);
        Boolean bool = Boolean.TRUE;
        a8g a8gVar = j0g.a;
        r8e r8eVarG0 = e9i.G0(yo0Var, this.b, a8gVar, bool);
        this.z = r8eVarG0;
        mjg mjgVarA2 = p90.a(r66.a);
        this.A = mjgVarA2;
        mjg mjgVarA3 = p90.a(new b8b(0, 0.0f));
        this.B = mjgVarA3;
        this.C = new yo0(mjgVarA3, 11);
        r8e r8eVarG1 = e9i.G0(new yo0(mjgVarA3, 12), this.b, a8gVar, 0);
        this.D = r8eVarG1;
        r8e r8eVar = ((q7g) ny8Var3.getValue()).a().j;
        this.E = r8eVar;
        r8e r8eVarG2 = e9i.G0(new fz6(new r07(mjgVarA2, r8eVarG1, new ooi(3, null), 0), new coi(this, null, 4), 3), this.b, a8gVar, null);
        this.F = r8eVarG2;
        this.G = e9i.G0(new hz1(r8eVarG2, 13), this.b, a8gVar, null);
        this.H = e9i.G0(new koi(new jz(r8eVarG2, 13), this, 1), this.b, a8gVar, D() ? kug.b : kug.a);
        mjg mjgVarA4 = p90.a(null);
        this.I = mjgVarA4;
        this.J = new r8e(mjgVarA4);
        this.K = e9i.I(new r07(new uoi(vzgVar.j, this, 1), new yo0(mjgVarA2, 13), new qoi(this, null), 0));
        ghb ghbVar = ew5.b;
        long jG = ew5.g(qe7.O(((Number) rniVar.invoke()).intValue(), lw5.SECONDS));
        this.X = -1;
        this.Y = qyj.S();
        this.Z = qyj.S();
        this.n1 = qyj.S();
        this.q1 = new l95(this.b, jG, new aoi(this, 0), new vbi(5, this));
        this.r1 = new ic6(null);
        this.s1 = new ic6(null);
        r8e r8eVarG3 = e9i.G0(new zhi(r8eVarG2, 2, this), this.b, a8gVar, ipi.a);
        this.t1 = r8eVarG3;
        Boolean bool2 = Boolean.FALSE;
        mjg mjgVarA5 = p90.a(bool2);
        this.u1 = mjgVarA5;
        this.v1 = e9i.G0(new r07(r8eVarG3, mjgVarA5, new rx1(3, null, 4), 0), this.b, a8gVar, bool2);
        if ((azgVar instanceof xyg) || (azgVar instanceof yyg)) {
            lq4Var = null;
            tzVar = new tz(7, null);
        } else {
            if (!(azgVar instanceof zyg)) {
                ore.o();
                throw null;
            }
            lq4Var = null;
            tzVar = new r07(new jz(no4Var.j(((zyg) azgVar).a), 13), r8eVarG2, new om8(this, p4cVar, context, null, 1), 0);
        }
        n0c n0cVar = (n0c) xhhVar;
        this.w1 = e9i.G0(e9i.T(tzVar, n0cVar.a()), this.b, a8gVar, lq4Var);
        this.y1 = new ConcurrentHashMap();
        this.z1 = new ve0(this.b, xhhVar, azgVar, aj5Var, new aoi(this, 1), new boi(this, lq4Var, 2));
        e9i.j0(e9i.T(new fz6(new uc3(new l50(new q8e(ij4Var.c), azgVar.a(), 1), 1), new boi(this, lq4Var, 0), 3), n0cVar.a()), this.b);
        e9i.j0(e9i.T(new fz6(r8eVarG1, new boi(this, lq4Var, 1), 3), n0cVar.a()), this.b);
        e9i.j0(new fz6(r8eVarG3, new coi(this, lq4Var, 0), 3), this.b);
        e9i.j0(new fz6(new cu2(new jz(r8eVarG2, 13), 11), new doi(this, lq4Var, 0), 3), this.b);
        if (l != null) {
            q7g q7gVar = (q7g) ny8Var3.getValue();
            long[] jArr = {l.longValue()};
            q7gVar.getClass();
            fz6Var = new bye(new xra(q7gVar, azgVar, jArr, lq4Var, 17));
            i = 0;
        } else {
            q7g q7gVar2 = (q7g) ny8Var3.getValue();
            i = 0;
            fz6Var = new fz6(new r07(e9i.I(new q0d(q7gVar2.a().d, azgVar, 23)), ((erg) q7gVar2.c.getValue()).f, new vc3(q7gVar2, azgVar, lq4Var, 8), 0), new p7g(q7gVar2, azgVar, lq4Var, 0));
        }
        e9i.j0(e9i.T(new j3(new j3(new fz6(new koi(new jz(fz6Var, 13), this, i), new coi(this, lq4Var, 2), 3), 15, new moi(this, lq4Var)), 14, new noi(this, lq4Var, i)), n0cVar.a()), this.b);
        e9i.j0(e9i.T(new fz6(r8eVar, new coi(this, lq4Var, 3), 3), n0cVar.a()), this.b);
        e9i.j0(new fz6(r8eVarG0, new doi(this, lq4Var, 1), 3), this.b);
        if (!D()) {
            e9i.j0(e9i.T(new fz6(new uoi(((a64) ny8Var9.getValue()).b, this, 0), new coi(this, lq4Var, 1), 3), n0cVar.a()), this.b);
        }
        this.A1 = new fpi(0, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (defpackage.rx8.u(r5, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.gpi r11, defpackage.nq4 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.goi
            if (r0 == 0) goto L13
            r0 = r12
            goi r0 = (defpackage.goi) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            goi r0 = new goi
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.d
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.ch3.d0(r12)
            goto L63
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            r11 = 0
            return r11
        L31:
            defpackage.ch3.d0(r12)
            goto L4f
        L35:
            defpackage.ch3.d0(r12)
            ny8 r12 = r11.w
            java.lang.Object r12 = r12.getValue()
            onf r12 = (defpackage.onf) r12
            rnf r12 = (defpackage.rnf) r12
            r8e r12 = r12.s
            hoi r2 = defpackage.hoi.h
            r0.f = r4
            java.lang.Object r12 = defpackage.e9i.O(r12, r2, r0)
            if (r12 != r1) goto L4f
            goto L62
        L4f:
            int r5 = r11.o1
            long r7 = defpackage.gpi.E1
            r9 = 0
            r6 = 4
            long r5 = defpackage.sn0.b(r5, r6, r7, r9)
            r0.f = r3
            java.lang.Object r12 = defpackage.rx8.u(r5, r0)
            if (r12 != r1) goto L63
        L62:
            return r1
        L63:
            int r12 = r11.o1
            int r12 = r12 + r4
            r11.o1 = r12
            sbi r11 = defpackage.sbi.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpi.B(gpi, nq4):java.lang.Object");
    }

    public static int Q(int i) {
        int i2 = i == 0 ? -1 : foi.$EnumSwitchMapping$0[qt4.D(i)];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    return 4;
                }
            }
        }
        return i3;
    }

    public final void C() {
        je9 je9Var = je9.f;
        lsg lsgVar = (lsg) this.F.a.getValue();
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar.b(je9Var2)) {
                a4cVar.c(je9Var2, str, "deleteCurrentStory. Local story=" + (lsgVar != null ? Boolean.valueOf(lsgVar.e()) : null), null);
            }
        }
        if (lsgVar == null) {
            String str2 = this.p;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "deleteCurrentStory: no current story", null);
                return;
            }
            return;
        }
        if (!lsgVar.e()) {
            ve0 ve0Var = this.z1;
            ve0Var.h.B(ve0Var, ve0.i[0], yab.h0(ve0Var.a, ((n0c) ve0Var.b).a(), 2, new ue0(ve0Var, lsgVar.c(), (lq4) null)));
            return;
        }
        Long lG = lsgVar.g();
        if (lG != null) {
            yab.i0(this.b, null, 0, new aug(this, lG.longValue(), null, 4), 3);
            return;
        }
        String str3 = this.p;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str3, nbh.s(lsgVar.c(), "We cannot delete local story #", ", don't have draft id"), null);
        }
    }

    public final boolean D() {
        return ((s7f) this.h).t() == this.c.a();
    }

    public final boolean E() {
        return !D() && ((Boolean) this.i.Y4.a(e5d.S6[312]).i()).booleanValue();
    }

    public final boolean F() {
        s7f s7fVar = (s7f) this.h;
        return ((Boolean) s7fVar.i0.m(s7fVar, s7f.j0[58])).booleanValue();
    }

    public final void G() {
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "markCurrentStoryAsViewed", null);
            }
        }
        int iIntValue = ((Number) this.D.a.getValue()).intValue();
        if (iIntValue <= this.X) {
            return;
        }
        lsg lsgVar = (lsg) ww3.u1(iIntValue, (List) this.A.getValue());
        if (lsgVar != null) {
            this.X = iIntValue;
            a8j.t(this, ((n0c) this.f).a(), new poi(this, lsgVar, (lq4) null), 2);
            return;
        }
        String str2 = this.p;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, str2, c0a.k(iIntValue, "markCurrentStoryAsViewed error cuz item with index=", " is null"), null);
        }
    }

    public final void H(ryg rygVar) {
        e29 e29Var;
        String strA = rygVar.a();
        if (strA == null) {
            return;
        }
        if (rygVar instanceof pyg) {
            e29Var = new e29(((pyg) rygVar).c);
        } else {
            e29Var = rygVar instanceof qyg ? new e29(((qyg) rygVar).c) : null;
        }
        if (e29Var != null) {
            byte b = e29Var.a;
            if (this.n.d(strA)) {
                this.n1.B(this, C1[2], yab.i0(this.b, null, 2, new oli(this, strA, null, 3), 1));
            } else if ((b & 1) != 0) {
                P(strA, true);
            } else if ((b & 2) != 0) {
                a8j.x(this.r1, new wpi(strA));
            } else {
                P(strA, false);
            }
        }
    }

    public final void I() {
        eoi eoiVar = this.p1;
        if (eoiVar != null) {
            this.p1 = null;
            this.o.a(1, eoiVar.b ? 2 : 1, 2);
            return;
        }
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onLinkWarningDismissed: no pending link warning", null);
        }
    }

    public final void J() {
        if (this.t1.a.getValue() instanceof kpi) {
            G();
        }
    }

    public final void K(int i) {
        int i2 = ((toc) this.y.getValue()).a;
        mjg mjgVar = this.y;
        mjgVar.j(null, new toc(((toc) mjgVar.getValue()).a | iic.j(i)));
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "pause(" + iic.r(i) + "): " + toc.a(i2) + " -> " + toc.a(((toc) this.y.getValue()).a), null);
        }
    }

    public final void L() {
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "pause player", null);
            }
        }
        mpi mpiVar = (mpi) this.t1.a.getValue();
        if (cqk.d(mpiVar, ipi.a)) {
            return;
        }
        if (mpiVar instanceof lpi) {
            this.q1.g();
            return;
        }
        if (mpiVar instanceof jpi) {
            this.q1.g();
        } else if (mpiVar instanceof kpi) {
            a8j.x(this.r1, zpi.a);
        } else {
            ore.o();
        }
    }

    public final void M() {
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "playNext", null);
            }
        }
        if (this.d != null) {
            K(6);
            a8j.x(this.r1, ppi.a);
            return;
        }
        int iB = ((b8b) this.B.getValue()).b() + 1;
        lsg lsgVar = (lsg) ww3.u1(iB, (List) this.A.getValue());
        if (lsgVar == null) {
            a8j.x(this.r1, kqi.a);
            return;
        }
        if (lsgVar instanceof hsg) {
            K(6);
        } else {
            O(6);
        }
        L();
        mjg mjgVar = this.B;
        ((b8b) mjgVar.getValue()).getClass();
        b8b b8bVar = new b8b(iB, 0.0f);
        mjgVar.getClass();
        mjgVar.j(null, b8bVar);
    }

    public final void N() throws IllegalAccessException, InvocationTargetException {
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "repeatCurrent", null);
            }
        }
        mpi mpiVar = (mpi) this.t1.a.getValue();
        if (cqk.d(mpiVar, ipi.a)) {
            return;
        }
        if (mpiVar instanceof lpi) {
            l95 l95Var = this.q1;
            sgg sggVar = (sgg) l95Var.f;
            if (sggVar != null) {
                sggVar.b(null);
            }
            l95Var.f = null;
            l95Var.b = 0L;
            l95Var.f = yab.i0((gu4) l95Var.c, null, 0, new i20(l95Var, null, 29), 3);
            O(6);
            if (((Boolean) this.z.a.getValue()).booleanValue()) {
                return;
            }
            this.q1.g();
            return;
        }
        if (!(mpiVar instanceof jpi)) {
            if (!(mpiVar instanceof kpi)) {
                ore.o();
                return;
            } else {
                O(6);
                a8j.x(this.r1, new bqi(((kpi) mpiVar).c, ((Boolean) this.z.a.getValue()).booleanValue()));
                return;
            }
        }
        l95 l95Var2 = this.q1;
        sgg sggVar2 = (sgg) l95Var2.f;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
        l95Var2.f = null;
        l95Var2.b = 0L;
        l95Var2.f = yab.i0((gu4) l95Var2.c, null, 0, new i20(l95Var2, null, 29), 3);
        if ((((toc) this.y.getValue()).a & 32) != 0) {
            O(6);
        }
        if (((Boolean) this.z.a.getValue()).booleanValue()) {
            return;
        }
        this.q1.g();
    }

    public final void O(int i) {
        int i2 = ((toc) this.y.getValue()).a;
        mjg mjgVar = this.y;
        mjgVar.j(null, new toc(((toc) mjgVar.getValue()).a & (~iic.j(i))));
        String str = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "resume(" + iic.r(i) + "): " + toc.a(i2) + " -> " + toc.a(((toc) this.y.getValue()).a), null);
        }
    }

    public final void P(String str, boolean z) {
        this.p1 = new eoi(str, z);
        a8j.x(this.r1, new iqi(z, z ? new tnh(R.string.link_interceptor_warning_blocked_title) : new tnh(R.string.link_interceptor_warning_open_title), z ? new vnh(R.string.link_interceptor_warning_blocked_description, a.n1(Arrays.copyOf(new Object[]{str}, 1))) : new vnh(R.string.link_interceptor_warning_open_description, a.n1(Arrays.copyOf(new Object[]{str}, 1))), z ? Collections.singletonList(new kc4(7, new tnh(R.string.its_clear), 3, 32)) : xw3.P0(new kc4(7, new tnh(R.string.link_interceptor_warning_cancel), 3, 32), new kc4(6, new tnh(R.string.link_interceptor_warning_accept), 2, 32))));
    }
}
