package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jd1 extends a8j {
    public final svj c;
    public final h02 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final xx6 k;
    public final xx6 l;
    public final p5 m;
    public final xx6 n;
    public final mjg o;
    public final r8e p;

    public jd1(svj svjVar, h02 h02Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.c = svjVar;
        this.d = h02Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var7;
        xx6 xx6VarI = e9i.I(new r07(h02Var.B, h02Var.C, new ad1(3, null, 0), 0));
        this.k = e9i.T(e9i.I(e9i.C((lzf) ((w82) ny8Var2.getValue()).y.getValue(), xx6VarI, ((ya1) ((w82) ny8Var2.getValue()).h).v, new bd1(4, null, 0))), ((n0c) ((xhh) ny8Var6.getValue())).a());
        this.l = e9i.T(e9i.B(e9i.I(new p5(((w82) ny8Var2.getValue()).r, 5)), xx6VarI, e9i.I(new p5(((w82) ny8Var2.getValue()).r, 6)), new p5(((n42) ((k42) ny8Var3.getValue())).f, 7), new cd1(5, null)), ((n0c) ((xhh) ny8Var6.getValue())).a());
        r8e r8eVar = h02Var.u;
        this.m = new p5(r8eVar, 8);
        this.n = e9i.T(new ie(new bye(new h31(100L, null, 1)), this, 4), ((n0c) ((xhh) ny8Var6.getValue())).a());
        mjg mjgVarA = p90.a(B((a80) ((gjg) E().w.getValue()).getValue(), (ao1) r8eVar.a.getValue(), ((l9) E().r.a.getValue()).c.a.a.f(), ((f62) ((n42) D()).f.a.getValue()).j, ((Boolean) E().u.a.getValue()).booleanValue()));
        this.o = mjgVarA;
        this.p = new r8e(mjgVarA);
        e9i.j0(e9i.T(e9i.B((gjg) ((w82) ny8Var2.getValue()).w.getValue(), r8eVar, e9i.I(new p5(((w82) ny8Var2.getValue()).r, 9)), ((w82) ny8Var2.getValue()).u, new zc1(this, null)), ((n0c) ((xhh) ny8Var6.getValue())).a()), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    public final l11 B(a80 a80Var, ao1 ao1Var, boolean z, boolean z2, boolean z3) {
        yp9 yp9Var;
        yp9 yp9Var2 = ao1Var.t;
        yp9 yp9Var3 = ao1Var.s;
        boolean z4 = ao1Var.h;
        yp9 yp9Var4 = yp9.a;
        yp9 yp9Var5 = yp9.b;
        yp9 yp9Var6 = yp9.d;
        if (!z4 || (ao1Var.f instanceof oi6)) {
            yp9Var = yp9Var6;
        } else {
            yp9Var = z ? yp9Var5 : yp9Var4;
        }
        if (((Boolean) ((e5d) this.j.getValue()).y().i()).booleanValue()) {
            xb9 xb9Var = (xb9) ((et3) this.i.getValue());
            if (!((Boolean) xb9Var.H0.m(xb9Var, xb9.g1[24])).booleanValue()) {
                yp9Var4 = yp9Var6;
            } else if (z3) {
                yp9Var4 = yp9Var5;
            }
        } else {
            yp9Var4 = yp9Var6;
        }
        return new l11(yp9Var2, yp9Var3, yp9Var, yp9Var4, kpk.b(a80Var), z2);
    }

    public final ArrayList C() {
        Set availableAudioDevices;
        rb0 rb0Var = (rb0) ((ac1) E().b).h.get();
        if (rb0Var == null || (availableAudioDevices = rb0Var.getAvailableAudioDevices()) == null) {
            availableAudioDevices = c76.a;
        }
        ArrayList arrayList = new ArrayList(yw3.W0(availableAudioDevices, 10));
        Iterator it = availableAudioDevices.iterator();
        while (it.hasNext()) {
            arrayList.add(kpk.b((a80) it.next()));
        }
        return arrayList;
    }

    public final k42 D() {
        return (k42) this.f.getValue();
    }

    public final w82 E() {
        return (w82) this.e.getValue();
    }

    public final void F(yp9 yp9Var) {
        if (yp9Var == yp9.c) {
            if (!((gc) ((ya1) E().h).v.getValue()).c) {
                a8j.x(this.d.G, ry1.b);
            }
            gm0.Y(jd1.class.getName(), "Early return in microphoneEnable cuz of !isMicAvailableInCall");
            return;
        }
        ny8 ny8Var = this.g;
        if (!((wsc) ny8Var.getValue()).c(wsc.i)) {
            ((wsc) ny8Var.getValue()).k(this.c, R.string.call_ask_permission_description);
            gm0.Y(jd1.class.getName(), "Early return in microphoneEnable cuz of shouldAskMicrophonePermission()");
            return;
        }
        sa2 sa2Var = (sa2) this.h.getValue();
        String strA = ns4.a(((f62) ((n42) D()).f.a.getValue()).i);
        yp9 yp9Var2 = yp9.b;
        long j = yp9Var == yp9Var2 ? 1L : 0L;
        boolean z = ((f62) ((n42) D()).f.a.getValue()).j;
        sa2Var.getClass();
        sa2.c(sa2Var, "AUDIO_ENABLED", strA, null, Long.valueOf(j), null, null, z, Boolean.FALSE, 116);
        E().d(yp9Var == yp9Var2);
    }

    public final void G(yp9 yp9Var) {
        if (yp9Var == yp9.c) {
            if (!((gc) ((ya1) E().h).v.getValue()).b) {
                a8j.x(this.d.G, ry1.c);
            }
            gm0.Y(jd1.class.getName(), "Early return in videoEnable cuz of !isCameraAvailableInCall");
            return;
        }
        ny8 ny8Var = this.g;
        boolean zC = ((wsc) ny8Var.getValue()).c(wsc.n);
        ny8 ny8Var2 = this.h;
        if (!zC) {
            ((sa2) ny8Var2.getValue()).e(ns4.a(((f62) ((n42) D()).f.a.getValue()).i), "DURING_CALL", ((f62) ((n42) D()).f.a.getValue()).j);
            ((wsc) ny8Var.getValue()).p(this.c);
            gm0.Y(jd1.class.getName(), "Early return in videoEnable cuz of shouldAskVideoPermission()");
        } else {
            if (E().e.c()) {
                gm0.Y(jd1.class.getName(), "Early return in videoEnable cuz of callsController.isScreenSharingEnabled()");
                return;
            }
            sa2 sa2Var = (sa2) ny8Var2.getValue();
            String strA = ns4.a(((f62) ((n42) D()).f.a.getValue()).i);
            yp9 yp9Var2 = yp9.b;
            long j = yp9Var == yp9Var2 ? 1L : 0L;
            boolean z = ((f62) ((n42) D()).f.a.getValue()).j;
            sa2Var.getClass();
            sa2.c(sa2Var, "VIDEO_ENABLED", strA, null, Long.valueOf(j), null, null, z, null, 372);
            E().e(yp9Var == yp9Var2);
        }
    }
}
