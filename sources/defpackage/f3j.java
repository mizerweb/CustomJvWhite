package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class f3j implements e3j, j3d, xf, AudioManager.OnAudioFocusChangeListener, r80 {
    public final ed6 a;
    public final df6 b;
    public final gue c;
    public final dti d;
    public final wo6 e;
    public final ny8 g;
    public final bg6 h;
    public final s80 i;
    public rui k;
    public final yki n;
    public final String f = f3j.class.getName();
    public final a84 j = new a84();
    public int l = 1;
    public boolean m = true;

    public f3j(Context context, ed6 ed6Var, df6 df6Var, ny8 ny8Var, d4d d4dVar, gue gueVar, dti dtiVar, wo6 wo6Var, ny8 ny8Var2) {
        s99 s99VarA;
        this.a = ed6Var;
        this.b = df6Var;
        this.c = gueVar;
        this.d = dtiVar;
        this.e = wo6Var;
        this.g = ny8Var2;
        this.i = new s80(context, this);
        int i = d4dVar.d;
        int i2 = d4dVar.g;
        int i3 = d4dVar.f;
        int i4 = d4dVar.e;
        if (d4dVar.b) {
            int i5 = d4dVar.h;
            if (i2 < 0) {
                ore.k("The playback_buffer must be greater than or equal to 0");
                throw null;
            }
            if (i < 0) {
                ore.k("The playback_buffer_after_rebuffer must be greater than or equal to 0");
                throw null;
            }
            if (i4 < i2) {
                ore.k("The min_buffer must be greater than or equal to playback_buffer");
                throw null;
            }
            if (i4 < i) {
                ore.k("The min_buffer must be greater than or equal to playback_buffer_after_rebuffer");
                throw null;
            }
            if (i3 < i4) {
                ore.k("The max_buffer must be greater than or equal to min_buffer");
                throw null;
            }
            if (i5 <= 0) {
                ore.k("The format_max_input_size_scale_up_factor must be greater than 0");
                throw null;
            }
            q21 q21Var = new q21();
            q21Var.a = 5000;
            q21Var.b = 13000;
            q21Var.c = 500;
            q21Var.d = 3000;
            q21Var.e = 4;
            q21Var.a = i4;
            q21Var.b = i3;
            q21Var.c = i2;
            q21Var.d = i;
            q21Var.e = i5;
            s99VarA = new wya(q21Var);
        } else {
            wb5 wb5Var = new wb5();
            wb5Var.b(i4, i3, i2, i);
            wb5Var.c(d4dVar.c);
            s99VarA = wb5Var.a();
        }
        ve5 ve5Var = new ve5(context, new so2(15));
        pe5 pe5VarG = ve5Var.g();
        pe5VarG.getClass();
        oe5 oe5Var = new oe5(pe5VarG);
        String iSO3Language = ((s7f) ((et3) ny8Var.getValue())).v().getISO3Language();
        if (iSO3Language == null) {
            oe5Var.k(new String[0]);
        } else {
            oe5Var.k(new String[]{iSO3Language});
        }
        if6 if6Var = new if6(context);
        if6Var.c(ve5Var);
        if6Var.b(s99VarA);
        bg6 bg6VarA = if6Var.a();
        this.h = bg6VarA;
        bg6VarA.n.a(this);
        bg6VarA.d(this);
        this.n = new yki(this);
    }

    @Override // defpackage.e3j
    public final void H(Surface surface) {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player. Set surface " + surface, null);
            }
        }
        bg6 bg6Var = this.h;
        if (surface == null) {
            bg6Var.P();
        } else {
            bg6Var.C0(surface);
        }
    }

    @Override // defpackage.xf
    public final void L(wf wfVar, Object obj, long j) {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player. First frame rendered: output=" + obj + " renderTimeMs=" + j, null);
            }
        }
        this.j.g();
    }

    @Override // defpackage.e3j
    public final boolean P() {
        bg6 bg6Var = this.h;
        return bg6Var.getPlaybackState() == 3 && !bg6Var.z();
    }

    @Override // defpackage.xf
    public final void R(wf wfVar, t55 t55Var) {
        gm0.n(this.f, "Player. Video renderer is disabled");
    }

    @Override // defpackage.j3d
    public final void T(PlaybackException playbackException) {
        gm0.l(this.f, "Player. Error", playbackException);
        ((t1c) this.a).a(playbackException);
        this.j.o(playbackException);
    }

    @Override // defpackage.e3j
    public final long V() {
        rui ruiVar = this.k;
        if (ruiVar == null) {
            return 0L;
        }
        boolean z = ruiVar instanceof c5i;
        bg6 bg6Var = this.h;
        return z ? bg6Var.R() : bg6Var.R() - ruiVar.j();
    }

    @Override // defpackage.r80
    public final boolean W() {
        return this.c.e() || this.m;
    }

    @Override // defpackage.e3j
    public final void X(pgg pggVar) {
    }

    public final void Z0() {
        rui ruiVar = this.k;
        long j = 0;
        if (ruiVar instanceof c5i) {
            c5i c5iVar = (c5i) ruiVar;
            long j2 = c5iVar.g - c5iVar.b;
            if (j2 >= 0) {
                j = j2;
            }
        } else if (ruiVar != null && ruiVar.j() > 0 && !ruiVar.h()) {
            j = ruiVar.j();
        }
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "Player. Seek to start: "), null);
            }
        }
        this.h.v0(j);
    }

    @Override // defpackage.e3j, defpackage.r80
    public final float a() {
        bg6 bg6Var = this.h;
        bg6Var.I0();
        return bg6Var.d0;
    }

    public final void a1(boolean z) {
        if (((Boolean) ((f5d) this.e).a.e3.a(e5d.S6[214]).i()).booleanValue()) {
            this.h.A0(z);
        }
    }

    @Override // defpackage.e3j, defpackage.r80
    public final void b(float f) {
        bg6 bg6Var = this.h;
        bg6Var.I0();
        float f2 = bg6Var.d0;
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player. New volume: " + f + ", prev: " + f2, null);
            }
        }
        this.h.b(f);
        if (f2 <= 0.0f && f > 0.0f) {
            this.i.v(3, this.l, 1);
        } else if (f2 != f && f <= 0.0f) {
            this.i.u();
        }
    }

    @Override // defpackage.e3j
    public final void clear() {
        gm0.n(this.f, "Player. Clear");
        this.h.P();
        this.j.a.clear();
        this.k = null;
        this.l = 1;
    }

    @Override // defpackage.e3j, defpackage.r80
    public final boolean d() {
        bg6 bg6Var = this.h;
        int playbackState = bg6Var.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && bg6Var.z() && bg6Var.u() == 0;
    }

    @Override // defpackage.e3j
    public final long e() {
        if (this.k != null) {
            return this.h.e();
        }
        return 0L;
    }

    @Override // defpackage.e3j
    public final long getDuration() {
        rui ruiVar = this.k;
        if (ruiVar != null) {
            long duration = this.h.getDuration();
            if ((!(ruiVar instanceof w2b) && !(ruiVar instanceof v84)) || duration <= 0) {
                if (ruiVar.a() > 0) {
                    return ruiVar.a() - ruiVar.j();
                }
                if (duration > 0) {
                }
            }
            return duration;
        }
        return 0L;
    }

    @Override // defpackage.e3j
    public final boolean isIdle() {
        return this.h.getPlaybackState() == 1;
    }

    @Override // defpackage.j3d
    public final void j0(float f) {
        this.j.n(f);
    }

    @Override // defpackage.xf
    public final void k0(wf wfVar, int i) {
        gm0.n(this.f, "Player. Video frames dropped: " + i);
    }

    @Override // defpackage.e3j
    public final float l0() {
        return this.h.Z().a;
    }

    @Override // defpackage.e3j
    public final void o0(boolean z) {
        this.h.setRepeatMode(z ? 2 : 0);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(i, "Player. On audio focus change: "), null);
            }
        }
        this.i.t(i);
    }

    @Override // defpackage.e3j, defpackage.r80
    public final void pause() {
        bg6 bg6Var = this.h;
        bg6Var.I0();
        if (bg6Var.m0) {
            return;
        }
        gm0.n(this.f, "Player. Pause");
        bg6Var.n(false);
        a1(true);
        this.j.m();
    }

    @Override // defpackage.e3j, defpackage.r80
    public final void play() {
        gm0.n(this.f, "Player. Play");
        bg6 bg6Var = this.h;
        if (bg6Var.getPlaybackState() == 4) {
            Z0();
        }
        a1(false);
        bg6Var.n(true);
        this.j.c();
        this.i.v(3, this.l, 1);
    }

    @Override // defpackage.e3j
    public final void q(c3j c3jVar) {
        this.j.a.remove(c3jVar);
    }

    @Override // defpackage.e3j
    public final void q0(c3j c3jVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.j.a;
        if (copyOnWriteArraySet.contains(c3jVar)) {
            return;
        }
        copyOnWriteArraySet.add(c3jVar);
    }

    @Override // defpackage.e3j
    public final void release() {
        gm0.n(this.f, "Player. Release");
        this.j.k();
        bg6 bg6Var = this.h;
        bg6Var.I0();
        bg6Var.t.f.e(this);
        bg6Var.p0(this);
        bg6Var.P();
        bg6Var.o0();
        this.i.u();
        this.l = 1;
    }

    @Override // defpackage.e3j
    public final void seekTo(long j) {
        String str = this.f;
        gm0.n(str, "Player. Seek to: " + j);
        rui ruiVar = this.k;
        if (ruiVar == null) {
            return;
        }
        this.j.h();
        boolean z = ruiVar instanceof c5i;
        bg6 bg6Var = this.h;
        if (z) {
            bg6Var.v0(oc9.x(j, 0L, ((c5i) ruiVar).e));
            return;
        }
        if (bg6Var.getDuration() == 0 || j <= bg6Var.getDuration() - ruiVar.j()) {
            bg6Var.v0(ruiVar.j() + j);
            return;
        }
        gm0.n(str, "Player. Can't seek to: " + j + ", position greater than duration. Seek to end.");
        bg6Var.v0(bg6Var.getDuration() - ruiVar.j());
    }

    @Override // defpackage.e3j
    public final void setPlaybackSpeed(float f) {
        this.h.setPlaybackSpeed(f);
    }

    @Override // defpackage.e3j
    public final void stop() {
        bg6 bg6Var = this.h;
        bg6Var.I0();
        if (bg6Var.m0) {
            return;
        }
        gm0.n(this.f, "Player. Stop");
        bg6Var.stop();
        this.j.p();
        this.i.u();
    }

    @Override // defpackage.xf
    public final void u(wf wfVar, t99 t99Var, uz9 uz9Var, IOException iOException, boolean z) {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player. Load error, wasCanceled " + z + ", videoContent: " + this.k, iOException);
            }
        }
        this.j.o(iOException);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0374  */
    /* JADX WARN: Code duplicated, block: B:138:0x037d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0381  */
    /* JADX WARN: Code duplicated, block: B:142:0x038d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0390  */
    /* JADX WARN: Code duplicated, block: B:144:0x0392  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.e3j
    public final void x(rui ruiVar, boolean z, d3j d3jVar, int i, boolean z2, float f, boolean z3) {
        long j;
        ea5 ea5VarA;
        ev5 ev5Var;
        Object yvdVar;
        ev5 ev5VarA;
        ev5 ev5Var2;
        ea5 ea5VarA2;
        ev5 ev5Var3;
        long jMax;
        long j2;
        je9 je9Var = je9.d;
        this.l = i;
        this.m = z2;
        rui ruiVar2 = this.k;
        if (ruiVar2 != null && ruiVar2.equals(ruiVar) && !isIdle()) {
            String str = this.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player. Restart same content: " + this.k, null);
            }
            a84 a84Var = this.j;
            if (this.h.getPlaybackState() == 4) {
                gm0.n(this.f, "Player. Video ended. Seek to start");
                Z0();
            }
            if (this.h.getPlaybackState() == 3) {
                a84Var.q(z);
            }
            if (z) {
                a1(false);
            }
            this.h.n(z);
            if (!z) {
                a1(true);
            }
            if (z) {
                a84Var.c();
                this.i.v(3, this.l, 1);
                return;
            }
            return;
        }
        String str2 = this.f;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "Player. Prepare new video content: " + ruiVar, null);
        }
        dti dtiVar = this.d;
        dtiVar.l = d3jVar;
        dtiVar.m = new vbi(12, this);
        CopyOnWriteArraySet copyOnWriteArraySet = this.j.a;
        if (!copyOnWriteArraySet.contains(dtiVar)) {
            copyOnWriteArraySet.add(dtiVar);
        }
        boolean zD = cqk.d(this.k, ruiVar);
        this.k = ruiVar;
        this.j.j(ruiVar);
        if (z) {
            a1(false);
        }
        this.h.n(z);
        bg6 bg6Var = this.h;
        bg6Var.I0();
        if (bg6Var.S != z3) {
            bg6Var.S = z3;
            bg6Var.m.h.b(23, z3 ? 1 : 0, 0).b();
        }
        if (!z) {
            a1(true);
        }
        String str3 = this.f;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str3, "Player. Prepare mediaSource by content:" + ruiVar, null);
        }
        Uri uriD = ruiVar.d();
        s25 s25VarA = this.b.a(!ruiVar.h(), this.n);
        if (!(ruiVar instanceof y15)) {
            if (ruiVar instanceof iy7) {
                yvdVar = new HlsMediaSource$Factory(s25VarA).a(ry9.c(uriD));
            } else {
                int i2 = 22;
                j = 0;
                int i3 = 14;
                if (ruiVar instanceof w2b) {
                    List list = ((w2b) ruiVar).a;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i4 = 0;
                    while (i4 < size) {
                        v2b v2bVar = (v2b) list.get(i4);
                        qyb qybVar = new qyb(i3, new ra5());
                        Object obj = new Object();
                        l6m l6mVar = new l6m(i2);
                        ry9 ry9VarC = ry9.c(v2bVar.e);
                        ry9VarC.b.getClass();
                        ry9VarC.b.getClass();
                        gy9 gy9Var = ry9VarC.b.c;
                        if (gy9Var == null) {
                            ev5Var3 = ev5.a;
                        } else {
                            synchronized (obj) {
                                try {
                                    ea5VarA2 = !gy9Var.equals(null) ? kr6.A(gy9Var) : null;
                                    ea5VarA2.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            ev5Var3 = ea5VarA2;
                        }
                        s25 s25Var = s25VarA;
                        arrayList.add(new yvd(ry9VarC, s25Var, qybVar, ev5Var3, l6mVar, 1048576, null));
                        i4++;
                        s25VarA = s25Var;
                        i3 = 14;
                        i2 = 22;
                    }
                    ur0[] ur0VarArr = (ur0[]) arrayList.toArray(new ur0[0]);
                    yvdVar = new cda((ur0[]) Arrays.copyOf(ur0VarArr, ur0VarArr.length));
                } else if (ruiVar instanceof c5i) {
                    qyb qybVar2 = new qyb(14, new ra5());
                    Object obj2 = new Object();
                    l6m l6mVar2 = new l6m(22);
                    ry9 ry9VarC2 = ry9.c(uriD);
                    ry9VarC2.b.getClass();
                    ry9VarC2.b.getClass();
                    gy9 gy9Var2 = ry9VarC2.b.c;
                    if (gy9Var2 == null) {
                        ev5Var2 = ev5.a;
                    } else {
                        synchronized (obj2) {
                            try {
                                ea5VarA = gy9Var2.equals(null) ? null : kr6.A(gy9Var2);
                                ea5VarA.getClass();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        ev5Var2 = ea5VarA;
                    }
                    yvd yvdVar2 = new yvd(ry9VarC2, s25VarA, qybVar2, ev5Var2, l6mVar2, 1048576, null);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c5i c5iVar = (c5i) ruiVar;
                    long micros = timeUnit.toMicros(c5iVar.b);
                    long micros2 = timeUnit.toMicros(c5iVar.c);
                    lt3 lt3Var = new lt3(yvdVar2);
                    lt3Var.g(micros);
                    lt3Var.e(micros2);
                    yvdVar = new nt3(lt3Var);
                } else if (ruiVar instanceof v84) {
                    z88 z88VarL = c98.l();
                    List list2 = ((v84) ruiVar).a;
                    int size2 = list2.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < size2) {
                        u84 u84Var = (u84) list2.get(i5);
                        qyb qybVar3 = new qyb(14, new ra5());
                        Object obj3 = new Object();
                        l6m l6mVar3 = new l6m(22);
                        ry9 ry9VarC3 = ry9.c(u84Var.e);
                        ry9VarC3.b.getClass();
                        ry9VarC3.b.getClass();
                        gy9 gy9Var3 = ry9VarC3.b.c;
                        if (gy9Var3 == null) {
                            ev5VarA = ev5.a;
                        } else {
                            synchronized (obj3) {
                                try {
                                    ev5VarA = !gy9Var3.equals(null) ? kr6.A(gy9Var3) : null;
                                    ev5VarA.getClass();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        z88VarL.c(new d94(new yvd(ry9VarC3, s25VarA, qybVar3, ev5VarA, l6mVar3, 1048576, null), i6, vqi.X(0L)));
                        i5++;
                        i6++;
                    }
                    lvb.O("Must add at least one source to the concatenation.", i6 > 0);
                    yvdVar = new e94(ry9.c(Uri.EMPTY), z88VarL.h());
                } else {
                    qyb qybVar4 = new qyb(14, new ra5());
                    Object obj4 = new Object();
                    l6m l6mVar4 = new l6m(22);
                    ry9 ry9VarC4 = ry9.c(uriD);
                    ry9VarC4.b.getClass();
                    ry9VarC4.b.getClass();
                    gy9 gy9Var4 = ry9VarC4.b.c;
                    if (gy9Var4 == null) {
                        ev5Var = ev5.a;
                    } else {
                        synchronized (obj4) {
                            try {
                                ea5VarA = gy9Var4.equals(null) ? null : kr6.A(gy9Var4);
                                ea5VarA.getClass();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        ev5Var = ea5VarA;
                    }
                    yvdVar = new yvd(ry9VarC4, s25VarA, qybVar4, ev5Var, l6mVar4, 1048576, null);
                }
            }
            if (zD) {
                jMax = this.h.e();
            } else if (ruiVar instanceof c5i) {
                c5i c5iVar2 = (c5i) ruiVar;
                j2 = c5iVar2.g - c5iVar2.b;
                if (j2 < j) {
                    jMax = j;
                } else {
                    jMax = j2;
                }
            } else {
                jMax = Math.max(ruiVar.c(), ruiVar.j());
            }
            long j3 = jMax;
            if (!ruiVar.h() || j3 == j) {
                bg6 bg6Var2 = this.h;
                bg6Var2.I0();
                List listSingletonList = Collections.singletonList(yvdVar);
                bg6Var2.I0();
                bg6Var2.I0();
                bg6Var2.y0(listSingletonList, -1, -9223372036854775807L, true);
            } else {
                bg6 bg6Var3 = this.h;
                bg6Var3.I0();
                List listSingletonList2 = Collections.singletonList(yvdVar);
                bg6Var3.I0();
                bg6Var3.y0(listSingletonList2, 0, j3, false);
            }
            setPlaybackSpeed(f);
            this.h.prepare();
            if (z) {
                this.j.c();
                this.i.v(3, i, 1);
            }
        }
        yvdVar = new DashMediaSource$Factory(s25VarA).a(ry9.c(uriD));
        j = 0;
        if (zD) {
            jMax = this.h.e();
        } else if (ruiVar instanceof c5i) {
            c5i c5iVar3 = (c5i) ruiVar;
            j2 = c5iVar3.g - c5iVar3.b;
            if (j2 < j) {
                jMax = j;
            } else {
                jMax = j2;
            }
        } else {
            jMax = Math.max(ruiVar.c(), ruiVar.j());
        }
        long j4 = jMax;
        if (ruiVar.h()) {
            bg6 bg6Var4 = this.h;
            bg6Var4.I0();
            List listSingletonList3 = Collections.singletonList(yvdVar);
            bg6Var4.I0();
            bg6Var4.I0();
            bg6Var4.y0(listSingletonList3, -1, -9223372036854775807L, true);
        } else {
            bg6 bg6Var5 = this.h;
            bg6Var5.I0();
            List listSingletonList4 = Collections.singletonList(yvdVar);
            bg6Var5.I0();
            bg6Var5.I0();
            bg6Var5.y0(listSingletonList4, -1, -9223372036854775807L, true);
        }
        setPlaybackSpeed(f);
        this.h.prepare();
        if (z) {
            this.j.c();
            this.i.v(3, i, 1);
        }
    }

    @Override // defpackage.j3d
    public final void y0(ush ushVar, int i) {
        gm0.m(this.f, "Player. onTimelineChanged %d", Integer.valueOf(i));
    }

    @Override // defpackage.j3d
    public final void z(int i) {
        String str = this.f;
        if (i == 1) {
            gm0.n(str, "Player. State changed: ExoPlayer.STATE_IDLE");
            return;
        }
        a84 a84Var = this.j;
        if (i == 2) {
            gm0.n(str, "Player. State changed: ExoPlayer.STATE_BUFFERING");
            a84Var.f();
            return;
        }
        bg6 bg6Var = this.h;
        if (i == 3) {
            gm0.n(str, "Player. State changed: ExoPlayer.STATE_READY");
            a84Var.q(bg6Var.z());
        } else {
            if (i != 4) {
                return;
            }
            gm0.n(str, "Player. State changed: ExoPlayer.STATE_ENDED");
            bg6Var.I0();
            if (bg6Var.I != 1) {
                a84Var.i();
            } else {
                gm0.n(str, "Player. State ended, but video is looping. Restart");
                play();
            }
        }
    }
}
