package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$NoAvailableCameraException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jce extends a8j {
    public static final /* synthetic */ zv8[] D = {new z8b(jce.class, "longClickJob", "getLongClickJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, jce.class, "startRecordJob", "getStartRecordJob()Lkotlinx/coroutines/Job;")};
    public final p3c A;
    public final String B;
    public final n80 C;
    public final fbe c;
    public final qbe d;
    public final lce e;
    public final gjg f;
    public final t73 g;
    public final zb1 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ifh l;
    public final ifh m;
    public final ifh n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final mjg r;
    public final r8e s;
    public final r8e t;
    public final xx6 u;
    public final ic6 v;
    public final ic6 w;
    public final ifh x;
    public volatile AudioFocusRequest y;
    public final p3c z;

    public jce(fbe fbeVar, qbe qbeVar, ny8 ny8Var, ifh ifhVar, ifh ifhVar2, ifh ifhVar3, lce lceVar, gjg gjgVar, t73 t73Var, zb1 zb1Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = fbeVar;
        this.d = qbeVar;
        this.e = lceVar;
        this.f = gjgVar;
        this.g = t73Var;
        this.h = zb1Var;
        this.i = ny8Var2;
        this.j = ny8Var3;
        this.k = ny8Var;
        this.l = ifhVar;
        this.m = ifhVar2;
        this.n = ifhVar3;
        this.o = ny8Var4;
        this.p = ny8Var5;
        this.q = ny8Var6;
        mjg mjgVarA = p90.a(null);
        this.r = mjgVarA;
        r8e r8eVar = new r8e(mjgVarA);
        this.s = r8eVar;
        this.t = ((vc0) ifhVar2.getValue()).i;
        this.u = ((d89) ifhVar.getValue()).d();
        this.v = new ic6(null);
        this.w = new ic6(null);
        this.x = new ifh(new a8d(23, this));
        this.z = qyj.S();
        this.A = qyj.S();
        this.B = jce.class.getName();
        this.C = new n80(2, this);
        e9i.j0(e9i.T(new fz6(new jz(r8eVar, 13), new dtd(this, (lq4) null, 7), 3), ((n0c) ((xhh) ny8Var2.getValue())).a()), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object B(jce jceVar, fbe fbeVar, long j, byte[] bArr, g4b g4bVar, boolean z, nq4 nq4Var) {
        fce fceVar;
        yce xceVar;
        jceVar.getClass();
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof fce) {
            fceVar = (fce) nq4Var;
            int i = fceVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                fceVar.i = i - Integer.MIN_VALUE;
            } else {
                fceVar = new fce(jceVar, nq4Var);
            }
        } else {
            fceVar = new fce(jceVar, nq4Var);
        }
        Object objC = fceVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = fceVar.i;
        try {
            if (i2 == 0) {
                ch3.d0(objC);
                int iOrdinal = fbeVar.ordinal();
                if (iOrdinal == 0) {
                    xceVar = new xce(j, bArr);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xceVar = new wce(j, bArr);
                }
                zce zceVarK = jceVar.K();
                fceVar.d = fbeVar;
                fceVar.e = g4bVar;
                fceVar.f = z;
                fceVar.i = 1;
                objC = zceVarK.c(xceVar, fceVar);
                if (objC == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = fceVar.f;
                g4bVar = fceVar.e;
                fbeVar = fceVar.d;
                ch3.d0(objC);
            }
            t2 t2Var = (t2) objC;
            if (t2Var != null) {
                a8j.x(jceVar.d.e, new lbe(t2Var, g4bVar, z));
                return sbiVar;
            }
            ((h4b) jceVar.o.getValue()).B(f4b.FAIL_TO_PREPARE_MEDIA, g4bVar);
            String str = jceVar.B;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Media for " + fbeVar.name() + " wasn't prepared, we cannot send message", null);
                }
            }
            return sbiVar;
        } catch (Throwable th) {
            xbe xbeVar = new xbe("We couldn't send record", th);
            gm0.V(jceVar.B, xbeVar.getMessage(), xbeVar);
            return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object C(jce jceVar, long j, nq4 nq4Var) {
        hce hceVar;
        jz0 jz0Var;
        je9 je9Var = je9.d;
        if (nq4Var instanceof hce) {
            hceVar = (hce) nq4Var;
            int i = hceVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hceVar.f = i - Integer.MIN_VALUE;
            } else {
                hceVar = new hce(jceVar, nq4Var);
            }
        } else {
            hceVar = new hce(jceVar, nq4Var);
        }
        hce hceVar2 = hceVar;
        Object obj = hceVar2.d;
        hu4 hu4Var = hu4.a;
        int i2 = hceVar2.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                vo8 vo8VarL = jceVar.L();
                if (vo8VarL != null && vo8VarL.isCancelled()) {
                    return Boolean.FALSE;
                }
                if (jceVar.K().a()) {
                    String str = jceVar.B;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, qv1.k("finalizeRecording before start recording of ", jceVar.c.name()), null);
                    }
                    jceVar.D();
                }
                jceVar.U();
                String str2 = jceVar.B;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "Start recording of " + jceVar.c.name() + " ", null);
                }
                mjg mjgVar = jceVar.r;
                bce bceVar = new bce(false, false);
                mjgVar.getClass();
                mjgVar.j(null, bceVar);
                jceVar.K().i(jceVar);
                xt4 xt4VarB = ((n0c) ((xhh) jceVar.i.getValue())).b();
                jz0Var = null;
                i20 i20Var = new i20(jceVar, j, (lq4) null, 24);
                hceVar2.f = 1;
                if (yab.K0(xt4VarB, i20Var, hceVar2) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                jz0Var = null;
            }
            vc0 vc0VarH = jceVar.H();
            if (vc0VarH.o == null) {
                vc0VarH.o = yab.i0(vc0VarH.g, jz0Var, 0, new m5(vc0VarH, jz0Var, 7), 3);
            }
            ((ac1) jceVar.h).d(false);
            vo8 vo8VarL2 = jceVar.L();
            if (vo8VarL2 == null || !vo8VarL2.isCancelled()) {
                return Boolean.TRUE;
            }
            W(jceVar, 2);
            return Boolean.FALSE;
        } catch (IOException e) {
            jceVar.G().h(cbe.a);
            jceVar.D();
            xbe xbeVar = new xbe("Recoding was failed", e);
            gm0.V(jceVar.B, xbeVar.getMessage(), xbeVar);
            return Boolean.FALSE;
        } catch (CancellationException e2) {
            jceVar.D();
            gm0.n(jceVar.B, "Start record was cancelled");
            throw e2;
        } catch (Throwable th) {
            jceVar.G().h(bbe.a);
            jceVar.D();
            xbe xbeVar2 = new xbe("Recoding was failed", th);
            gm0.V(jceVar.B, xbeVar2.getMessage(), xbeVar2);
            return Boolean.FALSE;
        }
    }

    public static void W(jce jceVar, int i) {
        byte[] bArr;
        byte[] bArrC;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) == 0;
        mjg mjgVar = jceVar.r;
        r8e r8eVar = jceVar.s;
        gjg gjgVar = r8eVar.a;
        gjg gjgVar2 = r8eVar.a;
        if (!(gjgVar.getValue() instanceof bce) && !(gjgVar2.getValue() instanceof zbe) && !(gjgVar2.getValue() instanceof ace)) {
            gm0.Y(jce.class.getName(), "Early return in stopRecord cuz of state");
            return;
        }
        jceVar.J().a();
        long jLongValue = ((Number) ((mjg) jceVar.I()).getValue()).longValue();
        if (!z) {
            jceVar.D();
            cce cceVar = new cce(false, false);
            mjgVar.getClass();
            mjgVar.j(null, cceVar);
            gm0.Y(jce.class.getName(), "Early return in stopRecord cuz of !sendMessageAfterStop");
            return;
        }
        if (jLongValue < 1000) {
            gm0.Y(jceVar.B, "Stop recording, duration lower MIN");
            a8j.x(jceVar.d.e, new obe(jceVar.c, new tnh(R.string.audio_record_hold_to_start)));
            jceVar.G().d();
            jceVar.D();
            cce cceVar2 = new cce(jceVar.N(), false);
            mjgVar.getClass();
            mjgVar.j(null, cceVar2);
            return;
        }
        g4b g4bVarJ = ((h4b) jceVar.o.getValue()).J(z2 ? 7 : 2);
        vc0 vc0VarH = jceVar.H();
        int iIntValue = ((Number) ((f5d) ((wo6) jceVar.p.getValue())).a.C4.a(e5d.S6[290]).i()).intValue();
        float fE = jceVar.K().e();
        float fM = jceVar.K().m();
        byte[] bArr2 = vc0VarH.b;
        if (bArr2 == null || bArr2.length == 0) {
            String strConcat = "Wave is ".concat(bArr2 == null ? "null" : "empty");
            qhb qhbVar = new qhb(strConcat);
            String name = vc0.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, strConcat, qhbVar);
                }
            }
            bArr = null;
        } else {
            if (yab.A(fE, 0.0f) && yab.A(fM, 1.0f)) {
                bArrC = vc0VarH.c(iIntValue, bArr2);
            } else {
                int iV = oc9.v(gm0.K((bArr2.length - 1) * fE), 0, bArr2.length - 1);
                hj8 hj8Var = new hj8(iV, oc9.v(gm0.K((bArr2.length - 1) * fM), 0, bArr2.length - 1), 1);
                bArrC = vc0VarH.c(iIntValue, hj8Var.isEmpty() ? new byte[0] : a.T0(iV, bArr2, hj8Var.b + 1));
            }
            bArr = bArrC;
        }
        jceVar.D();
        ybe ybeVar = new ybe(jceVar.N());
        mjgVar.getClass();
        mjgVar.j(null, ybeVar);
        yab.i0(jceVar.b, zhb.b, 0, new ice(jceVar, jLongValue, bArr, g4bVarJ, z2, null), 2);
    }

    public final void D() {
        a8j.x(this.d.e, new mbe(this.c, false));
        K().d();
        K().i(null);
        J().b(null);
        J().c();
        vc0 vc0VarH = H();
        yab.i0(vc0VarH.g, null, 0, new tc0(vc0VarH, null, 0), 3);
        G().clear();
        AudioFocusRequest audioFocusRequest = this.y;
        if (audioFocusRequest != null) {
            ((AudioManager) this.x.getValue()).abandonAudioFocusRequest(audioFocusRequest);
            this.y = null;
        }
    }

    public final void E() {
        mjg mjgVar = this.r;
        dce dceVar = (dce) mjgVar.getValue();
        boolean z = dceVar instanceof bce;
        if (z) {
            try {
                K().f();
                vc0 vc0VarH = H();
                yab.i0(vc0VarH.g, null, 0, new tc0(vc0VarH, null, 1), 3);
            } catch (RuntimeException unused) {
                D();
                cce cceVar = new cce(false, 3);
                mjgVar.getClass();
                mjgVar.j(null, cceVar);
                gm0.Y(jce.class.getName(), "Early return in forcePause cuz of RuntimeException");
                return;
            }
        }
        if (z || (dceVar instanceof zbe)) {
            if (((Boolean) this.e.invoke()).booleanValue() && this.c == fbe.a) {
                ace aceVar = new ace(N(), true);
                mjgVar.getClass();
                mjgVar.j(null, aceVar);
            } else {
                zbe zbeVar = new zbe(true);
                mjgVar.getClass();
                mjgVar.j(null, zbeVar);
            }
        }
    }

    public final tnh F() {
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            return new tnh(R.string.video_record_active_call_error_snackbar_title);
        }
        if (iOrdinal == 1) {
            return new tnh(R.string.audio_record_active_call_error_snackbar_title);
        }
        ore.o();
        return null;
    }

    public final zae G() {
        return (zae) this.n.getValue();
    }

    public final vc0 H() {
        return (vc0) this.m.getValue();
    }

    public final gjg I() {
        return K().k();
    }

    public final d89 J() {
        return (d89) this.l.getValue();
    }

    public final zce K() {
        return (zce) this.k.getValue();
    }

    public final vo8 L() {
        return (vo8) this.A.m(this, D[1]);
    }

    public final void M(ynh ynhVar, boolean z) {
        int i;
        if (z) {
            int iOrdinal = this.c.ordinal();
            if (iOrdinal == 0) {
                i = R.string.video_message_record_error_common;
            } else {
                if (iOrdinal != 1) {
                    ore.o();
                    return;
                }
                i = R.string.audio_record_error_common;
            }
            tnh tnhVar = new tnh(i);
            if (ynhVar == null) {
                ynhVar = tnhVar;
            }
            this.d.C(ynhVar, false);
        }
        D();
        cce cceVar = new cce(false, 3);
        mjg mjgVar = this.r;
        mjgVar.getClass();
        mjgVar.j(null, cceVar);
    }

    public final boolean N() {
        dce dceVar = (dce) this.r.getValue();
        if (dceVar instanceof bce) {
            return ((bce) dceVar).b;
        }
        if (dceVar instanceof ybe) {
            return ((ybe) dceVar).a;
        }
        return (dceVar instanceof zbe) || (dceVar instanceof ace);
    }

    public final boolean O() {
        rt2 rt2Var = (rt2) this.f.getValue();
        return rt2Var != null && pll.d(rt2Var, (e5d) this.q.getValue(), this.g.h(), null);
    }

    public final void P() {
        zae zaeVarG = G();
        mjg mjgVar = this.r;
        zaeVarG.b(mjgVar.getValue() instanceof zbe);
        D();
        cce cceVar = new cce(N(), 2);
        mjgVar.getClass();
        mjgVar.j(null, cceVar);
    }

    public final void Q(Throwable th) {
        if (th instanceof VideoMessageRecordDelegate$NoAvailableCameraException) {
            M(((VideoMessageRecordDelegate$NoAvailableCameraException) th).a, true);
            G().h(abe.a);
            return;
        }
        M(null, true);
        if (th instanceof IOException) {
            G().h(cbe.a);
        } else {
            G().h(bbe.a);
        }
    }

    public final void R() {
        int iOrdinal = this.c.ordinal();
        mjg mjgVar = this.r;
        if (iOrdinal == 0) {
            ace aceVar = new ace(N(), false);
            mjgVar.getClass();
            mjgVar.j(null, aceVar);
            K().f();
            vc0 vc0VarH = H();
            yab.i0(vc0VarH.g, null, 0, new tc0(vc0VarH, null, 1), 3);
            return;
        }
        if (iOrdinal != 1) {
            ore.o();
            return;
        }
        this.d.C(new tnh(R.string.audio_record_error_limit), false);
        cce cceVar = new cce(false, 3);
        mjgVar.getClass();
        mjgVar.j(null, cceVar);
        D();
    }

    public final void S() {
        mjg mjgVar = this.r;
        dce dceVar = (dce) mjgVar.getValue();
        if (!(dceVar instanceof bce)) {
            gm0.Y(jce.class.getName(), "Early return in onLockRecording cuz of currentState !is RecordState.Recording");
            return;
        }
        bce bceVar = new bce(((bce) dceVar).a, true);
        mjgVar.getClass();
        mjgVar.j(null, bceVar);
        G().c();
    }

    public final void T() {
        mjg mjgVar = this.r;
        if (((dce) mjgVar.getValue()) instanceof bce) {
            try {
                K().f();
                vc0 vc0VarH = H();
                yab.i0(vc0VarH.g, null, 0, new tc0(vc0VarH, null, 1), 3);
                zbe zbeVar = new zbe(false);
                mjgVar.getClass();
                mjgVar.j(null, zbeVar);
            } catch (RuntimeException unused) {
                D();
                cce cceVar = new cce(false, 3);
                mjgVar.getClass();
                mjgVar.j(null, cceVar);
            }
        }
    }

    public final void U() {
        int i;
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(4);
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setUsage(2);
        int i2 = ece.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i2 == 1) {
            i = 3;
        } else {
            if (i2 != 2) {
                ore.o();
                return;
            }
            i = 1;
        }
        AudioFocusRequest audioFocusRequestBuild = builder.setAudioAttributes(usage.setContentType(i).build()).setOnAudioFocusChangeListener(this.C).build();
        if (((AudioManager) this.x.getValue()).requestAudioFocus(audioFocusRequestBuild) == 1) {
            this.y = audioFocusRequestBuild;
        }
    }

    public final void V() {
        dce dceVar = (dce) this.r.getValue();
        if (!(dceVar instanceof zbe) && !(dceVar instanceof ace)) {
            gm0.Y(jce.class.getName(), "Early return in showSendConfirmation cuz of state is not Pause or PauseWithoutResume");
            return;
        }
        rt2 rt2Var = (rt2) this.f.getValue();
        String strF = rt2Var != null ? rt2Var.F() : null;
        if (strF == null) {
            strF = "";
        }
        a8j.x(this.v, new ube(new tnh(R.string.oneme_confirm_send_message_title), new vnh(R.string.oneme_confirm_send_message_description, a.n1(Arrays.copyOf(new Object[]{strF}, 1))), xw3.P0(new kc4(R.id.writebar_confirm_send_message_positive, new tnh(R.string.oneme_confirm_send_message_positive), 3, 32), new kc4(R.id.writebar_confirm_send_message_negative, new tnh(R.string.oneme_confirm_send_message_negative), 2, 32))));
    }

    @Override // defpackage.a8j
    public final void y() {
        J().release();
        D();
    }
}
