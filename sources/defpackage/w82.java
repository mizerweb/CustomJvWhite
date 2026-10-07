package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* JADX INFO: loaded from: classes4.dex */
public final class w82 {
    public static final /* synthetic */ zv8[] E;
    public final ifh A;
    public final p3c B;
    public final fz6 C;
    public final ifh D;
    public final b95 a;
    public final zb1 b;
    public final rd1 c;
    public final fa2 d;
    public final z3f e;
    public final bxd f;
    public final y82 g;
    public final da1 h;
    public final to1 i;
    public final wd4 j;
    public final ny8 k;
    public final ny8 l;
    public final mjg m;
    public final pzf n;
    public final q8e o;
    public final ConcurrentHashMap p;
    public final mjg q;
    public final r8e r;
    public final r8e s;
    public final r8e t;
    public final r8e u;
    public final ifh v;
    public final ifh w;
    public final ifh x;
    public final ifh y;
    public sgg z;

    static {
        z8b z8bVar = new z8b(w82.class, "vpnStatusJob", "getVpnStatusJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        E = new zv8[]{z8bVar};
    }

    public w82(b95 b95Var, zb1 zb1Var, rd1 rd1Var, fa2 fa2Var, z3f z3fVar, bxd bxdVar, y82 y82Var, da1 da1Var, to1 to1Var, wd4 wd4Var, ny8 ny8Var, xhh xhhVar, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = b95Var;
        this.b = zb1Var;
        this.c = rd1Var;
        this.d = fa2Var;
        this.e = z3fVar;
        this.f = bxdVar;
        this.g = y82Var;
        this.h = da1Var;
        this.i = to1Var;
        this.j = wd4Var;
        this.k = ny8Var;
        this.l = ny8Var2;
        r8e r8eVar = b95Var.i;
        mjg mjgVarA = p90.a(r8eVar.a.getValue());
        this.m = mjgVarA;
        final int i = 0;
        final int i2 = 1;
        pzf pzfVarB = e9i.b(0, 1, 1);
        this.n = pzfVarB;
        this.o = new q8e(pzfVarB);
        this.p = new ConcurrentHashMap();
        this.q = p90.a(k52.k);
        ur2 ur2VarM0 = e9i.M0(mjgVarA, new rgi((lq4) null, this, 1));
        x02 x02Var = (x02) mjgVarA.getValue();
        l9 l9Var = new l9(x02Var.s(), (dz4) x02Var.z().getValue(), (enc) x02Var.getParticipants().a().getValue(), (be1) x02Var.b().getValue(), (k52) n(x02Var.s()).getValue());
        a8g a8gVar = j0g.a;
        r8e r8eVarG0 = e9i.G0(ur2VarM0, y82Var, a8gVar, l9Var);
        this.r = r8eVarG0;
        final int i3 = 3;
        this.s = e9i.G0(e9i.M0(mjgVarA, new sh1(3, null, 5)), y82Var, a8gVar, ((x02) mjgVarA.getValue()).A().a().getValue());
        this.t = e9i.G0(e9i.M0(mjgVarA, new sh1(3, null, 6)), y82Var, a8gVar, ((x02) mjgVarA.getValue()).u().j().getValue());
        this.u = e9i.G0(e9i.M0(mjgVarA, new sh1(3, null, 7)), y82Var, a8gVar, Boolean.FALSE);
        this.v = new ifh(new af7(this) { // from class: j82
            public final /* synthetic */ w82 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i;
                w82 w82Var = this.b;
                switch (i4) {
                    case 0:
                        return p90.a(((ac1) w82Var.b).a());
                    case 1:
                        return (f9b) w82Var.v.getValue();
                    case 2:
                        return (d9b) w82Var.x.getValue();
                    case 3:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new c3(25, w82Var));
                    default:
                        return new p82(w82Var);
                }
            }
        });
        this.w = new ifh(new af7(this) { // from class: j82
            public final /* synthetic */ w82 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i2;
                w82 w82Var = this.b;
                switch (i4) {
                    case 0:
                        return p90.a(((ac1) w82Var.b).a());
                    case 1:
                        return (f9b) w82Var.v.getValue();
                    case 2:
                        return (d9b) w82Var.x.getValue();
                    case 3:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new c3(25, w82Var));
                    default:
                        return new p82(w82Var);
                }
            }
        });
        this.x = new ifh(new k82(0));
        final int i4 = 2;
        this.y = new ifh(new af7(this) { // from class: j82
            public final /* synthetic */ w82 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                w82 w82Var = this.b;
                switch (i5) {
                    case 0:
                        return p90.a(((ac1) w82Var.b).a());
                    case 1:
                        return (f9b) w82Var.v.getValue();
                    case 2:
                        return (d9b) w82Var.x.getValue();
                    case 3:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new c3(25, w82Var));
                    default:
                        return new p82(w82Var);
                }
            }
        });
        this.A = new ifh(new af7(this) { // from class: j82
            public final /* synthetic */ w82 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i3;
                w82 w82Var = this.b;
                switch (i5) {
                    case 0:
                        return p90.a(((ac1) w82Var.b).a());
                    case 1:
                        return (f9b) w82Var.v.getValue();
                    case 2:
                        return (d9b) w82Var.x.getValue();
                    case 3:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new c3(25, w82Var));
                    default:
                        return new p82(w82Var);
                }
            }
        });
        this.B = qyj.S();
        this.C = new fz6(e9i.I(e9i.o(new qt1(this, null, 7))), new m82(this, null, 1), 3);
        final int i5 = 4;
        this.D = new ifh(new af7(this) { // from class: j82
            public final /* synthetic */ w82 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                w82 w82Var = this.b;
                switch (i6) {
                    case 0:
                        return p90.a(((ac1) w82Var.b).a());
                    case 1:
                        return (f9b) w82Var.v.getValue();
                    case 2:
                        return (d9b) w82Var.x.getValue();
                    case 3:
                        return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new c3(25, w82Var));
                    default:
                        return new p82(w82Var);
                }
            }
        });
        e9i.j0(new fz6(new ie(r8eVar, this, 11), new m82(this, null, 0), 3), y82Var);
        b95Var.c(new n82(this));
        e9i.j0(e9i.T(new fz6(e9i.I(new hz1(r8eVarG0, 2)), new fze(this, ny8Var3, (lq4) null, 9), 3), ((n0c) xhhVar).a()), y82Var);
    }

    public final void a(x7j x7jVar) {
        f9b f9bVarI = i();
        while (true) {
            Object value = f9bVarI.getValue();
            x7j x7jVar2 = x7jVar;
            if (f9bVarI.h(value, k52.a((k52) value, null, 0, null, null, x7jVar2, null, 0L, 991))) {
                return;
            } else {
                x7jVar = x7jVar2;
            }
        }
    }

    public final tmc b() {
        return ((x02) this.m.getValue()).getParticipants().getMe();
    }

    public final n4f c() {
        return ((x02) this.m.getValue()).u();
    }

    public final void d(boolean z) {
        da1 da1Var = this.h;
        da1Var.getClass();
        ya1 ya1Var = (ya1) da1Var;
        boolean z2 = ((gc) ya1Var.v.getValue()).a || ya1Var.l();
        boolean z3 = z && z2;
        ((ac1) this.b).d(z && z2);
        if (z3) {
            ((d9b) this.x.getValue()).a(Boolean.FALSE);
        }
    }

    public final void e(boolean z) {
        rb0 rb0Var;
        if (this.e.c()) {
            return;
        }
        ya1 ya1Var = (ya1) this.h;
        boolean z2 = false;
        boolean z3 = ya1Var.m() || ya1Var.k();
        if (z && z3) {
            z2 = true;
        }
        rd1 rd1Var = this.c;
        boolean zC = rd1Var.c();
        rd1Var.d(z2);
        if (!z2 || zC || (rb0Var = (rb0) ((ac1) this.b).h.get()) == null) {
            return;
        }
        rb0Var.d(true);
    }

    public final void f(long j) {
        f9b f9bVarI = i();
        while (true) {
            Object value = f9bVarI.getValue();
            long j2 = j;
            if (f9bVarI.h(value, k52.a((k52) value, null, 0, null, null, null, null, j2, 767))) {
                return;
            } else {
                j = j2;
            }
        }
    }

    public final void g(fu1 fu1Var, boolean z) {
        Object value;
        k52 k52Var;
        fu1 fu1Var2;
        int i;
        f9b f9bVarI = i();
        do {
            value = f9bVarI.getValue();
            k52Var = (k52) value;
            fu1Var2 = (!z && cqk.d(k52Var.a, fu1Var)) ? null : fu1Var;
            if (fu1Var2 == null) {
                i = 1;
            } else {
                i = z ? 3 : 2;
            }
        } while (!f9bVarI.h(value, k52.a(k52Var, fu1Var2, i, null, null, fu1Var2 != null ? x7j.a : k52Var.f, null, 0L, 988)));
    }

    public final void h(fu1 fu1Var) {
        f9b f9bVarI = i();
        while (true) {
            Object value = f9bVarI.getValue();
            fu1 fu1Var2 = fu1Var;
            if (f9bVarI.h(value, k52.a((k52) value, null, 0, fu1Var2, null, null, null, 0L, 1019))) {
                return;
            } else {
                fu1Var = fu1Var2;
            }
        }
    }

    public final f9b i() {
        return n(((x02) this.a.i.a.getValue()).s());
    }

    public final void j(a80 a80Var) {
        String str;
        sa2 sa2Var = (sa2) this.k.getValue();
        mjg mjgVar = this.m;
        String strA = ns4.a(((dz4) ((x02) mjgVar.getValue()).z().getValue()).c);
        int iD = qt4.D(a80Var.a);
        if (iD != 0) {
            str = iD != 1 ? "HEADPHONES" : "DYNAMIC";
        } else {
            str = "PHONE";
        }
        String str2 = str;
        boolean z = ((dz4) ((x02) mjgVar.getValue()).z().getValue()).i;
        sa2Var.getClass();
        sa2.c(sa2Var, "SPEAKER_MODE_CHANGED", strA, str2, null, null, null, z, null, 376);
        rb0 rb0Var = (rb0) ((ac1) this.b).h.get();
        if (rb0Var != null) {
            rb0Var.b(a80Var);
        }
    }

    public final void k() {
        Object value;
        ac1 ac1Var;
        a80 a80VarA;
        rb0 rb0Var;
        f9b f9bVar = (f9b) this.v.getValue();
        do {
            value = f9bVar.getValue();
            a80 a80Var = (a80) value;
            ac1Var = (ac1) this.b;
            a80VarA = ac1Var.a();
            if (((Boolean) ((f5d) ((wo6) this.l.getValue())).a.U2.a(e5d.S6[204]).i()).booleanValue() && (rb0Var = (rb0) ac1Var.h.get()) != null) {
                rb0Var.b(a80Var);
            }
        } while (!f9bVar.h(value, a80VarA));
        l82 l82Var = new l82(this);
        ac1Var.i.set(l82Var);
        rb0 rb0Var2 = (rb0) ac1Var.h.get();
        if (rb0Var2 != null) {
            rb0Var2.c(l82Var);
        }
    }

    public final void l() {
        zb1 zb1Var = this.b;
        AudioLevelListener audioLevelListener = (AudioLevelListener) this.A.getValue();
        ac1 ac1Var = (ac1) zb1Var;
        ac1Var.getClass();
        try {
            MicrophoneManager microphoneManagerB = ac1Var.b();
            if (microphoneManagerB != null) {
                microphoneManagerB.registerAudioSampleCallback(250L, audioLevelListener);
            }
        } catch (Exception e) {
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAudioController", qv1.k("CallAudioController can't register mic audio listener due to: ", e.getMessage()), e);
            }
        }
    }

    public final void m(vmi vmiVar) {
        if (((k52) i().getValue()).h == vmi.c && vmiVar != vmi.d) {
            return;
        }
        f9b f9bVarI = i();
        while (true) {
            Object value = f9bVarI.getValue();
            vmi vmiVar2 = vmiVar;
            if (f9bVarI.h(value, k52.a((k52) value, null, 0, null, null, null, vmiVar2, 0L, 895))) {
                return;
            } else {
                vmiVar = vmiVar2;
            }
        }
    }

    public final f9b n(String str) {
        if (r5h.X0(str)) {
            return this.q;
        }
        return (f9b) this.p.computeIfAbsent(new z02(str), new am(3, new ol0(5, this)));
    }
}
