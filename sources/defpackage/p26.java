package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class p26 extends a8j {
    public static final /* synthetic */ zv8[] W1 = {new z8b(p26.class, "mediaStateHidingJob", "getMediaStateHidingJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, p26.class, "videoFetchJob", "getVideoFetchJob()Lkotlinx/coroutines/Job;"), new z8b(p26.class, "onLoadMediaJob", "getOnLoadMediaJob()Lkotlinx/coroutines/Job;"), new z8b(p26.class, "cropActionClickJob", "getCropActionClickJob()Lkotlinx/coroutines/Job;"), new z8b(p26.class, "playerUpdateJob", "getPlayerUpdateJob()Lkotlinx/coroutines/Job;"), new z8b(p26.class, "onMuteClickJob", "getOnMuteClickJob()Lkotlinx/coroutines/Job;"), new z8b(p26.class, "photoActionClickJob", "getPhotoActionClickJob()Lkotlinx/coroutines/Job;")};
    public final p3c A;
    public final ifh A1;
    public final p3c B;
    public final ifh B1;
    public final float C;
    public final r8e C1;
    public final float D;
    public final ic6 D1;
    public final ifh E;
    public final ic6 E1;
    public final mjg F;
    public final ic6 F1;
    public final r8e G;
    public final mjg G1;
    public final mjg H;
    public final r8e H1;
    public final r8e I;
    public boolean I1;
    public final ifh J;
    public final r8e J1;
    public final mjg K;
    public final r8e K1;
    public final r8e L1;
    public final mjg M1;
    public final r8e N1;
    public final r8e O1;
    public final r8e P1;
    public final mjg Q1;
    public final r8e R1;
    public final ifh S1;
    public long T1;
    public boolean U1;
    public int V1;
    public final r8e X;
    public final AtomicLong Y;
    public sgg Z;
    public final Long c;
    public final int d;
    public final t3f e;
    public final String f;
    public final e5d g;
    public final z26 h;
    public final xk2 i;
    public final String j = p26.class.getName();
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final AtomicReference n1;
    public final ny8 o;
    public sgg o1;
    public final ny8 p;
    public long p1;
    public final ny8 q;
    public sgg q1;
    public final ny8 r;
    public final mjg r1;
    public final oyg s;
    public final r8e s1;
    public final mjg t;
    public final ifh t1;
    public final r8e u;
    public final r8e u1;
    public final p3c v;
    public final uik v1;
    public final p3c w;
    public final mjg w1;
    public final p3c x;
    public final r8e x1;
    public final p3c y;
    public final mjg y1;
    public final p3c z;
    public final r8e z1;

    public p26(Long l, int i, t3f t3fVar, String str, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, rb8 rb8Var, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, e5d e5dVar, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, z26 z26Var, xk2 xk2Var) {
        this.c = l;
        this.d = i;
        this.e = t3fVar;
        this.f = str;
        this.g = e5dVar;
        this.h = z26Var;
        this.i = xk2Var;
        this.k = ny8Var;
        this.l = ny8Var3;
        this.m = ny8Var2;
        this.n = ny8Var4;
        this.o = ny8Var5;
        this.p = ny8Var6;
        this.q = ny8Var7;
        this.r = ny8Var9;
        oyg oygVar = new oyg(xk2Var);
        this.s = oygVar;
        mjg mjgVarA = p90.a(new o6a(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f));
        this.t = mjgVarA;
        this.u = new r8e(mjgVarA);
        this.v = qyj.S();
        this.w = qyj.S();
        this.x = qyj.S();
        this.y = qyj.S();
        this.z = qyj.S();
        this.A = qyj.S();
        this.B = qyj.S();
        float f = yl5.d().getDisplayMetrics().density * 24.0f;
        this.C = f;
        this.D = yl5.d().getDisplayMetrics().density * 44.0f;
        final int i2 = 0;
        ifh ifhVar = new ifh(new af7(this) { // from class: n06
            public final /* synthetic */ p26 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                lq4 lq4Var = null;
                lw5 lw5Var = lw5.SECONDS;
                p26 p26Var = this.b;
                switch (i3) {
                    case 0:
                        Drawable drawable = p26Var.G().getDrawable(R.drawable.avd_download);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.k("avd_download not found");
                        return null;
                    case 1:
                        j3 j3VarC = e9i.C(p26Var.r1, p26Var.X, p26Var.s.h, new s11(4, lq4Var, 2));
                        Boolean bool = Boolean.FALSE;
                        return e9i.G0(j3VarC, p26Var.b, j0g.a, bool);
                    case 2:
                        ghb ghbVar = ew5.b;
                        return Long.valueOf(ew5.g(qe7.O(((vqg) p26Var.g.r().i()).a, lw5Var)));
                    case 3:
                        ghb ghbVar2 = ew5.b;
                        return Long.valueOf(ew5.s(qe7.O(((vqg) p26Var.g.r().i()).b, lw5Var), lw5.MINUTES));
                    default:
                        Boolean bool2 = (Boolean) p26Var.g.U4.a(e5d.S6[308]).i();
                        bool2.getClass();
                        return bool2;
                }
            }
        });
        this.E = ifhVar;
        mjg mjgVarA2 = p90.a(Boolean.valueOf((l == null && str == null) || i == 0));
        this.F = mjgVarA2;
        r8e r8eVar = new r8e(mjgVarA2);
        this.G = r8eVar;
        Boolean bool = Boolean.FALSE;
        mjg mjgVarA3 = p90.a(bool);
        this.H = mjgVarA3;
        mjg mjgVarB = z26Var.b(l);
        e26 e26Var = new e26(null);
        r8e r8eVar2 = oygVar.e;
        r8e r8eVar3 = oygVar.h;
        j3 j3VarA = e9i.A(r8eVar, r8eVar2, r8eVar3, mjgVarA3, mjgVarB, e26Var);
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        this.I = e9i.G0(j3VarA, dq4Var, a8gVar, bool);
        this.J = new ifh(new wre(this, ny8Var8, ny8Var, 17));
        mjg mjgVarA4 = p90.a(d16.a);
        this.K = mjgVarA4;
        r8e r8eVar4 = new r8e(mjgVarA4);
        this.X = r8eVar4;
        this.Y = new AtomicLong();
        this.n1 = new AtomicReference(null);
        mjg mjgVarA5 = p90.a(j16.a);
        this.r1 = mjgVarA5;
        lq4 lq4Var = null;
        this.s1 = e9i.G0(e9i.T(new o24(mjgVarA5, 5, this), ((n0c) ((xhh) ny8Var.getValue())).a()), this.b, a8gVar, new acc(null, new jcc(R.drawable.avd_download, (Drawable) ifhVar.getValue(), null, "M5.295 9.68a1 1 0 1 1 1.41-1.419l4.308 4.279V3a1 1 0 1 1 2 0v9.532l4.28-4.27a1 1 0 0 1 1.413 1.417L12.72 15.65a1 1 0 0 1-1.411 0.002z M2.074 14.037A0.974 0.974 0 0 1 3.056 13c0.538 0 0.978 0.425 1.018 0.962 0.066 0.89 0.17 1.715 0.289 2.446a3.855 3.855 0 0 0 3.221 3.223A28 28 0 0 0 11.994 20c1.644 0 3.17-0.166 4.422-0.371a3.85 3.85 0 0 0 3.215-3.209c0.12-0.734 0.227-1.563 0.294-2.459A1.03 1.03 0 0 1 20.943 13a0.974 0.974 0 0 1 0.982 1.037 31 31 0 0 1-0.32 2.705 5.85 5.85 0 0 1-4.866 4.86C15.404 21.821 13.769 22 11.994 22c-1.769 0-3.4-0.178-4.731-0.395a5.855 5.855 0 0 1-4.875-4.88 31 31 0 0 1-0.314-2.688", f, new m06(this, 2), 56), null));
        final int i3 = 1;
        this.t1 = new ifh(new af7(this) { // from class: n06
            public final /* synthetic */ p26 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                lq4 lq4Var2 = null;
                lw5 lw5Var = lw5.SECONDS;
                p26 p26Var = this.b;
                switch (i4) {
                    case 0:
                        Drawable drawable = p26Var.G().getDrawable(R.drawable.avd_download);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.k("avd_download not found");
                        return null;
                    case 1:
                        j3 j3VarC = e9i.C(p26Var.r1, p26Var.X, p26Var.s.h, new s11(4, lq4Var2, 2));
                        Boolean bool2 = Boolean.FALSE;
                        return e9i.G0(j3VarC, p26Var.b, j0g.a, bool2);
                    case 2:
                        ghb ghbVar = ew5.b;
                        return Long.valueOf(ew5.g(qe7.O(((vqg) p26Var.g.r().i()).a, lw5Var)));
                    case 3:
                        ghb ghbVar2 = ew5.b;
                        return Long.valueOf(ew5.s(qe7.O(((vqg) p26Var.g.r().i()).b, lw5Var), lw5.MINUTES));
                    default:
                        Boolean bool3 = (Boolean) p26Var.g.U4.a(e5d.S6[308]).i();
                        bool3.getClass();
                        return bool3;
                }
            }
        });
        hz1 hz1Var = new hz1(r8eVar4, 5);
        Boolean bool2 = Boolean.TRUE;
        this.u1 = e9i.G0(hz1Var, this.b, a8gVar, bool2);
        this.q1 = a8j.t(this, null, new qc5(this, rb8Var, lq4Var, 8), 3);
        int i4 = 11;
        if (((Boolean) mjgVarA2.getValue()).booleanValue()) {
            eoh eohVarN = N();
            nm0 nm0Var = eohVarN.a;
            gu4 gu4Var = eohVarN.c;
            nm0Var.b();
            eohVarN.m.B(eohVarN, eoh.n[0], yab.h0(gu4Var, ((n0c) eohVarN.b).a(), 2, new hpf(eohVarN, lq4Var, i4)));
            yab.i0(gu4Var, null, 0, new fpf(eohVarN, lq4Var, 9), 3);
        }
        this.v1 = new uik(11, this);
        mjg mjgVarA6 = p90.a(Float.valueOf(0.0f));
        this.w1 = mjgVarA6;
        r8e r8eVar5 = new r8e(mjgVarA6);
        this.x1 = r8eVar5;
        mjg mjgVarA7 = p90.a(Float.valueOf(1.0f));
        this.y1 = mjgVarA7;
        r8e r8eVar6 = new r8e(mjgVarA7);
        this.z1 = r8eVar6;
        final int i5 = 2;
        this.A1 = new ifh(new af7(this) { // from class: n06
            public final /* synthetic */ p26 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                lq4 lq4Var2 = null;
                lw5 lw5Var = lw5.SECONDS;
                p26 p26Var = this.b;
                switch (i6) {
                    case 0:
                        Drawable drawable = p26Var.G().getDrawable(R.drawable.avd_download);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.k("avd_download not found");
                        return null;
                    case 1:
                        j3 j3VarC = e9i.C(p26Var.r1, p26Var.X, p26Var.s.h, new s11(4, lq4Var2, 2));
                        Boolean bool3 = Boolean.FALSE;
                        return e9i.G0(j3VarC, p26Var.b, j0g.a, bool3);
                    case 2:
                        ghb ghbVar = ew5.b;
                        return Long.valueOf(ew5.g(qe7.O(((vqg) p26Var.g.r().i()).a, lw5Var)));
                    case 3:
                        ghb ghbVar2 = ew5.b;
                        return Long.valueOf(ew5.s(qe7.O(((vqg) p26Var.g.r().i()).b, lw5Var), lw5.MINUTES));
                    default:
                        Boolean bool4 = (Boolean) p26Var.g.U4.a(e5d.S6[308]).i();
                        bool4.getClass();
                        return bool4;
                }
            }
        });
        final int i6 = 3;
        this.B1 = new ifh(new af7(this) { // from class: n06
            public final /* synthetic */ p26 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                lq4 lq4Var2 = null;
                lw5 lw5Var = lw5.SECONDS;
                p26 p26Var = this.b;
                switch (i7) {
                    case 0:
                        Drawable drawable = p26Var.G().getDrawable(R.drawable.avd_download);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.k("avd_download not found");
                        return null;
                    case 1:
                        j3 j3VarC = e9i.C(p26Var.r1, p26Var.X, p26Var.s.h, new s11(4, lq4Var2, 2));
                        Boolean bool3 = Boolean.FALSE;
                        return e9i.G0(j3VarC, p26Var.b, j0g.a, bool3);
                    case 2:
                        ghb ghbVar = ew5.b;
                        return Long.valueOf(ew5.g(qe7.O(((vqg) p26Var.g.r().i()).a, lw5Var)));
                    case 3:
                        ghb ghbVar2 = ew5.b;
                        return Long.valueOf(ew5.s(qe7.O(((vqg) p26Var.g.r().i()).b, lw5Var), lw5.MINUTES));
                    default:
                        Boolean bool4 = (Boolean) p26Var.g.U4.a(e5d.S6[308]).i();
                        bool4.getClass();
                        return bool4;
                }
            }
        });
        this.C1 = e9i.G0(e9i.B(r8eVar5, r8eVar6, mjgVarA5, r8eVar4, new o26(this, null)), this.b, a8gVar, o16.a);
        this.D1 = new ic6(null);
        this.E1 = new ic6(null);
        this.F1 = new ic6(null);
        mjg mjgVarA8 = p90.a(new y16((kb9) null, 3));
        this.G1 = mjgVarA8;
        r8e r8eVar7 = new r8e(mjgVarA8);
        this.H1 = r8eVar7;
        int i7 = 5;
        r8e r8eVarG0 = e9i.G0(e9i.B(r8eVar7, mjgVarA5, r8eVar4, r8eVar3, new fz1(i7, lq4Var, 2)), this.b, a8gVar, r16.a);
        this.J1 = r8eVarG0;
        this.K1 = e9i.G0(e9i.B(r8eVar4, mjgVarA5, r8eVar3, r8eVar, new a26(i7, lq4Var)), this.b, a8gVar, bool);
        final int i8 = 4;
        tre.m0(new fz6(new hz1(r8eVarG0, i8), new o06(this, lq4Var, 0), 3), this.b);
        if (!cqk.d(xk2Var.a, l)) {
            xk2Var.a = l;
            xk2Var.e();
            mjg mjgVar = xk2Var.d;
            List list = xk2Var.b;
            mjgVar.getClass();
            mjgVar.j(null, list);
        }
        tre.m0(new fz6(z26Var.b(l), new w8(2, xk2Var, xk2.class, "setDrawing", "setDrawing(Lone/me/photoeditor/state/EditorState;)V", 4, 14), 3), this.b);
        this.L1 = new r8e(p90.a(nic.c));
        mjg mjgVarA9 = p90.a(wr4.c);
        this.M1 = mjgVarA9;
        this.N1 = new r8e(mjgVarA9);
        r8e r8eVar8 = N().k;
        f26 f26Var = new f26(null);
        r8e r8eVar9 = oygVar.f;
        this.O1 = e9i.G0(e9i.A(mjgVarA2, r8eVar8, r8eVar9, r8eVar3, mjgVarA3, f26Var), this.b, a8gVar, bool);
        this.P1 = e9i.G0(e9i.C(mjgVarA2, r8eVar9, oygVar.j, new g26(i8, lq4Var, 0)), this.b, a8gVar, bool2);
        mjg mjgVarA10 = p90.a(null);
        this.Q1 = mjgVarA10;
        this.R1 = new r8e(mjgVarA10);
        this.S1 = new ifh(new af7(this) { // from class: n06
            public final /* synthetic */ p26 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                lq4 lq4Var2 = null;
                lw5 lw5Var = lw5.SECONDS;
                p26 p26Var = this.b;
                switch (i9) {
                    case 0:
                        Drawable drawable = p26Var.G().getDrawable(R.drawable.avd_download);
                        if (drawable != null) {
                            return drawable;
                        }
                        ore.k("avd_download not found");
                        return null;
                    case 1:
                        j3 j3VarC = e9i.C(p26Var.r1, p26Var.X, p26Var.s.h, new s11(4, lq4Var2, 2));
                        Boolean bool3 = Boolean.FALSE;
                        return e9i.G0(j3VarC, p26Var.b, j0g.a, bool3);
                    case 2:
                        ghb ghbVar = ew5.b;
                        return Long.valueOf(ew5.g(qe7.O(((vqg) p26Var.g.r().i()).a, lw5Var)));
                    case 3:
                        ghb ghbVar2 = ew5.b;
                        return Long.valueOf(ew5.s(qe7.O(((vqg) p26Var.g.r().i()).b, lw5Var), lw5.MINUTES));
                    default:
                        Boolean bool4 = (Boolean) p26Var.g.U4.a(e5d.S6[308]).i();
                        bool4.getClass();
                        return bool4;
                }
            }
        });
        this.V1 = 1;
        this.U1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object B(p26 p26Var, nq4 nq4Var) {
        b26 b26Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof b26) {
            b26Var = (b26) nq4Var;
            int i = b26Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                b26Var.f = i - Integer.MIN_VALUE;
            } else {
                b26Var = new b26(p26Var, nq4Var);
            }
        } else {
            b26Var = new b26(p26Var, nq4Var);
        }
        Object objY = b26Var.d;
        Object obj = hu4.a;
        int i2 = b26Var.f;
        if (i2 == 0) {
            ch3.d0(objY);
            b26Var.f = 1;
            objY = p26Var.Y(b26Var);
            if (objY != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objY);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objY);
        File file = (File) objY;
        if (file != null) {
            Uri uriFromFile = Uri.fromFile(file);
            b26Var.f = 2;
            return p26Var.a0(uriFromFile, b26Var) == obj ? obj : sbiVar;
        }
        String str = p26Var.j;
        o1h o1hVar = new o1h("renderStoryBackground failed", null);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "renderStoryBackground failed", o1hVar);
            }
        }
        a8j.x(p26Var.F1, new z06(new tnh(R.string.common_error), null, null, 14));
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object C(p26 p26Var, kb9 kb9Var, nq4 nq4Var) {
        c26 c26Var;
        fvi fviVar;
        if (nq4Var instanceof c26) {
            c26Var = (c26) nq4Var;
            int i = c26Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26Var.f = i - Integer.MIN_VALUE;
            } else {
                c26Var = new c26(p26Var, nq4Var);
            }
        } else {
            c26Var = new c26(p26Var, nq4Var);
        }
        Object objA = c26Var.d;
        Object obj = hu4.a;
        int i2 = c26Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objA);
                String str = p26Var.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "downloadVideo story started", null);
                    }
                }
                Object value = p26Var.X.a.getValue();
                e16 e16Var = value instanceof e16 ? (e16) value : null;
                Uri uri = kb9Var.b;
                Long l = kb9Var.g;
                long jLongValue = l != null ? l.longValue() : 0L;
                float fFloatValue = ((Number) p26Var.x1.a.getValue()).floatValue();
                float fFloatValue2 = ((Number) p26Var.z1.a.getValue()).floatValue();
                boolean z = (e16Var == null || (fviVar = e16Var.b) == null) ? false : fviVar.e;
                List list = (List) p26Var.i.e.a.getValue();
                oyg oygVar = p26Var.s;
                d3h d3hVar = new d3h(uri, jLongValue, fFloatValue, fFloatValue2, z, list, oygVar.c, oygVar.d, csk.c((o6a) p26Var.t.getValue()));
                mjg mjgVar = p26Var.Q1;
                Float f = new Float(0.0f);
                mjgVar.getClass();
                mjgVar.j(null, f);
                a8j.x(p26Var.F1, u06.a);
                lfd lfdVar = (lfd) p26Var.p.getValue();
                f3h f3hVar = f3h.a;
                m06 m06Var = new m06(p26Var, 0);
                c26Var.f = 1;
                objA = lfdVar.a(d3hVar, f3hVar, m06Var, c26Var);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objA);
            }
            if (((Uri) objA) != null) {
                a8j.x(p26Var.F1, new z06(new tnh(R.string.saved_to_gallery), new Integer(R.drawable.icon_check_round_fill), null, 12));
            } else {
                String str2 = p26Var.j;
                o1h o1hVar = new o1h("downloadVideo saved uri is null", null);
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "downloadVideo failed cause saved uri is null", o1hVar);
                    }
                }
                a8j.x(p26Var.F1, new z06(new tnh(R.string.common_error), null, null, 14));
            }
            p26Var.Q1.setValue(null);
            a8j.x(p26Var.F1, new v06(p26Var.T1, p26Var.U1));
            p26Var.T1 = 0L;
            p26Var.U1 = true;
            return sbi.a;
        } catch (Throwable th) {
            p26Var.Q1.setValue(null);
            a8j.x(p26Var.F1, new v06(p26Var.T1, p26Var.U1));
            p26Var.T1 = 0L;
            p26Var.U1 = true;
            throw th;
        }
    }

    public static final kb9 D(p26 p26Var, String str, int i) {
        try {
            Uri uri = Uri.parse(str);
            jb9 jb9Var = i == 3 ? jb9.d : jb9.b;
            String type = p26Var.G().getContentResolver().getType(uri);
            if (type == null) {
                type = z16.$EnumSwitchMapping$1[jb9Var.ordinal()] == 1 ? "video/mp4" : "image/jpeg";
            }
            return new kb9(System.currentTimeMillis(), uri, type, -1, System.currentTimeMillis(), null, null, 0, 0, 0L, uri);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str2 = p26Var.j;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return null;
            }
            je9 je9Var = je9.f;
            if (!a4cVar.b(je9Var)) {
                return null;
            }
            a4cVar.c(je9Var, str2, "loadMediaFromShareUri: failed", th);
            return null;
        }
    }

    public static final void E(p26 p26Var, kb9 kb9Var) {
        Object value;
        lq4 lq4Var;
        Object value2;
        if (kb9Var.l == jb9.d) {
            mjg mjgVar = p26Var.r1;
            do {
                value2 = mjgVar.getValue();
            } while (!mjgVar.h(value2, k16.a));
        }
        mjg mjgVar2 = p26Var.K;
        do {
            value = mjgVar2.getValue();
            lq4Var = null;
        } while (!mjgVar2.h(value, new e16(kb9Var, null, null)));
        p26Var.x.B(p26Var, W1[2], yab.h0(p26Var.b, ((n0c) p26Var.H()).a(), 2, new o06(p26Var, lq4Var, 2)));
    }

    public static int W(int i) {
        int i2 = z16.$EnumSwitchMapping$2[qt4.D(i)];
        if (i2 == 1) {
            return R.drawable.icon_play;
        }
        if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            return R.drawable.icon_pause;
        }
        ore.o();
        return 0;
    }

    public final void F() {
        zv8[] zv8VarArr = W1;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.v;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }

    public final Context G() {
        return (Context) this.m.getValue();
    }

    public final xhh H() {
        return (xhh) this.k.getValue();
    }

    public final hb9 I() {
        kb9 kb9VarJ = J();
        if (kb9VarJ != null) {
            return h1h.b(kb9VarJ);
        }
        return null;
    }

    public final kb9 J() {
        Object value = this.X.a.getValue();
        e16 e16Var = value instanceof e16 ? (e16) value : null;
        if (e16Var != null) {
            return e16Var.a;
        }
        return null;
    }

    public final long K() {
        return ((Number) this.A1.getValue()).longValue();
    }

    public final long L() {
        return ((Number) this.B1.getValue()).longValue();
    }

    public final Uri M(hb9 hb9Var) {
        Object value = this.X.a.getValue();
        e16 e16Var = value instanceof e16 ? (e16) value : null;
        rvc rvcVar = e16Var != null ? e16Var.c : null;
        if (rvcVar != null) {
            Uri uriA = rvc.a(hb9Var, rvcVar);
            return uriA == null ? hb9Var.d() : uriA;
        }
        String strA = hb9Var.a();
        if (strA != null) {
            return Uri.parse(strA);
        }
        return null;
    }

    public final eoh N() {
        return (eoh) this.J.getValue();
    }

    public final void O() {
        if (((Boolean) ((gjg) this.t1.getValue()).getValue()).booleanValue()) {
            return;
        }
        sgg sggVarI0 = yab.i0(this.b, null, 2, new d26(this, (lq4) null, 0), 1);
        this.v.B(this, W1[0], sggVarI0);
    }

    public final void P(i16 i16Var) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) H()).b(), 2, new tm(this, i16Var, null));
        this.B.B(this, W1[6], sggVarH0);
    }

    public final void Q() {
        oyg oygVar = this.s;
        if (oygVar.j.a.getValue() instanceof kyg) {
            oygVar.c(1);
            return;
        }
        n16 n16Var = (n16) this.r1.getValue();
        boolean z = this.C1.a.getValue() instanceof o16;
        if (oygVar.h.a.getValue() instanceof nmh) {
            oygVar.a();
            Z();
            return;
        }
        if (oygVar.f.a.getValue() != null) {
            oygVar.b();
            return;
        }
        if ((n16Var instanceof k16) && z) {
            V();
        } else if (this.f == null && ((Collection) this.i.e.a.getValue()).isEmpty()) {
            a8j.x(this.E1, rt3.b);
        } else {
            a8j.x(this.F1, y06.a);
        }
    }

    public final void R() {
        hb9 hb9VarI = I();
        if (hb9VarI != null) {
            long j = hb9VarI.b;
            Long l = this.c;
            if (l != null && j == l.longValue()) {
                a8j.x(this.F1, new r06(4, false));
                return;
            }
        }
        String str = this.j;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onPhotoLoadStart: " + this.c + ", currentItemId: " + (hb9VarI != null ? Long.valueOf(hb9VarI.b) : null), null);
        }
    }

    public final void S() {
        hb9 hb9VarI = I();
        if (hb9VarI != null) {
            long j = hb9VarI.b;
            Long l = this.c;
            if (l != null && j == l.longValue()) {
                a8j.x(this.F1, new r06(1, false));
                return;
            }
        }
        String str = this.j;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onPhotoLoadSuccess: " + this.c + ", currentItemId: " + (hb9VarI != null ? Long.valueOf(hb9VarI.b) : null), null);
        }
    }

    public final void T(int i) {
        this.V1 = i;
        sgg sggVarH0 = yab.h0(this.b, ((n0c) H()).a(), 2, new d26(this, i, (lq4) null));
        this.z.B(this, W1[4], sggVarH0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[EDGE_INSN: B:13:0x0037->B:14:0x0038 BREAK  A[LOOP:0: B:8:0x0024->B:20:?]] */
    public final void U() {
        mjg mjgVar;
        Object value;
        oyg oygVar = this.s;
        xk2 xk2Var = oygVar.a;
        Long l = (Long) xk2Var.g.a.getValue();
        if (l == null) {
            l = null;
            break;
        }
        long jLongValue = l.longValue();
        ArrayList arrayListC = xk2Var.c();
        if (!arrayListC.isEmpty()) {
            Iterator it = arrayListC.iterator();
            do {
                if (!it.hasNext()) {
                    l = null;
                    break;
                }
            } while (((umh) it.next()).a != jLongValue);
        } else {
            l = null;
            break;
        }
        oygVar.d(l);
        do {
            mjgVar = this.r1;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, k16.a));
    }

    public final void V() {
        mjg mjgVar;
        Object value;
        boolean zBooleanValue = ((Boolean) this.u1.a.getValue()).booleanValue();
        boolean z = this.V1 == 2;
        if (z) {
            a8j.x(this.F1, a16.a);
        }
        do {
            mjgVar = this.r1;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new m16(W(z ? 3 : this.V1), zBooleanValue ? R.drawable.icon_sound_crossed : R.drawable.icon_sound)));
    }

    public final void X() throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.o1;
        if (sggVar != null) {
            sggVar.b(null);
        }
        Bitmap bitmap = (Bitmap) this.n1.getAndSet(null);
        if (bitmap != null) {
            rel.b(bitmap);
        }
    }

    public final Object Y(nq4 nq4Var) {
        je9 je9Var = je9.f;
        String str = (String) N().h.a.getValue();
        if (str == null) {
            String str2 = this.j;
            o1h o1hVar = new o1h("selectedBackgroundId is null", null);
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "selectedBackgroundId is null", o1hVar);
                return null;
            }
        } else {
            aoh aohVarB = N().b(str);
            if (aohVarB != null) {
                if (aohVarB instanceof pph) {
                    return ((kje) this.r.getValue()).b(((pph) aohVarB).a, nq4Var);
                }
                if (aohVarB instanceof jp7) {
                    jp7 jp7Var = (jp7) aohVarB;
                    return ((kje) this.r.getValue()).c(jp7Var.a, jp7Var.c, nq4Var);
                }
                ore.o();
                return null;
            }
            String str3 = this.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, c0a.o("no background with such name: ", str, ", returning null"), null);
            }
        }
        return null;
    }

    public final void Z() {
        mjg mjgVar;
        Object value;
        Object m16Var;
        Object value2 = this.X.a.getValue();
        e16 e16Var = value2 instanceof e16 ? (e16) value2 : null;
        kb9 kb9Var = e16Var != null ? e16Var.a : null;
        do {
            mjgVar = this.r1;
            value = mjgVar.getValue();
            jb9 jb9Var = kb9Var != null ? kb9Var.l : null;
            int i = jb9Var == null ? -1 : z16.$EnumSwitchMapping$1[jb9Var.ordinal()];
            if (i != 1) {
                m16Var = i != 2 ? j16.a : l16.a;
            } else {
                m16Var = new m16(W(this.V1), ((Boolean) this.u1.a.getValue()).booleanValue() ? R.drawable.icon_sound_crossed : R.drawable.icon_sound);
            }
        } while (!mjgVar.h(value, m16Var));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a0(Uri uri, nq4 nq4Var) throws Throwable {
        k26 k26Var;
        if (nq4Var instanceof k26) {
            k26Var = (k26) nq4Var;
            int i = k26Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                k26Var.f = i - Integer.MIN_VALUE;
            } else {
                k26Var = new k26(this, nq4Var);
            }
        } else {
            k26Var = new k26(this, nq4Var);
        }
        k26 k26Var2 = k26Var;
        Object objA = k26Var2.d;
        hu4 hu4Var = hu4.a;
        int i2 = k26Var2.f;
        if (i2 == 0) {
            ch3.d0(objA);
            jfd jfdVar = (jfd) this.o.getValue();
            List list = (List) this.i.e.a.getValue();
            oyg oygVar = this.s;
            int i3 = oygVar.c;
            int i4 = oygVar.d;
            i6a i6aVarC = csk.c((o6a) this.t.getValue());
            k26Var2.f = 1;
            objA = jfdVar.a(uri, list, i3, i4, i6aVarC, k26Var2);
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objA);
        }
        if (((Uri) objA) != null) {
            a8j.x(this.F1, s06.a);
            a8j.x(this.F1, new z06(new tnh(R.string.saved_to_gallery), new Integer(R.drawable.icon_check_round_fill), null, 12));
        } else {
            String str = this.j;
            o1h o1hVar = new o1h("saveImageToGallery failed, saved uri is null", null);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "saveImageToGallery failed, saved uri is null", o1hVar);
                }
            }
            a8j.x(this.F1, new z06(new tnh(R.string.common_error), null, null, 14));
        }
        return sbi.a;
    }

    @Override // defpackage.a8j
    public final void y() throws IllegalAccessException, InvocationTargetException {
        X();
    }
}
