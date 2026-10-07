package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes4.dex */
public final class zm2 implements id2 {
    public final yp7 a;
    public final vm2 b;
    public final g85 c;
    public final fi2 d;
    public final jgh e;
    public final ue2 f;
    public final i4h g;
    public final zqh h;
    public final gu4 i;
    public final int j;
    public final Object k;
    public final i40 l;
    public final Map m;
    public final Map n;
    public ith o;
    public final zo7 p;
    public le2 q;
    public wm2 r;
    public Map s;
    public LinkedHashMap t;
    public final CountDownLatch u;
    public boolean v;
    public final CountDownLatch w;
    public Map x;
    public final LinkedHashMap y;
    public int z;

    public zm2(yp7 yp7Var, vm2 vm2Var, g85 g85Var, fi2 fi2Var, jgh jghVar, ue2 ue2Var, fol folVar, i4h i4hVar, zqh zqhVar, gu4 gu4Var) {
        this.a = yp7Var;
        this.b = vm2Var;
        this.c = g85Var;
        this.d = fi2Var;
        this.e = jghVar;
        this.f = ue2Var;
        this.g = i4hVar;
        this.h = zqhVar;
        this.i = gu4Var;
        g40 g40Var = an2.a;
        g40Var.getClass();
        this.j = g40.b.incrementAndGet(g40Var);
        this.k = new Object();
        this.l = gvk.c(Boolean.FALSE);
        this.m = Collections.synchronizedMap(new HashMap());
        this.n = Collections.synchronizedMap(new HashMap());
        this.p = null;
        this.z = 1;
        this.u = new CountDownLatch(1);
        this.w = new CountDownLatch(1);
        this.y = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129 A[Catch: all -> 0x01b3, TryCatch #1 {all -> 0x01b3, blocks: (B:55:0x011d, B:61:0x0129, B:63:0x0149, B:65:0x0184, B:66:0x0191, B:68:0x0197, B:70:0x01a7, B:75:0x01b8, B:77:0x01c2, B:81:0x01cb, B:82:0x01dc, B:83:0x01dd), top: B:97:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0149 A[Catch: all -> 0x01b3, TryCatch #1 {all -> 0x01b3, blocks: (B:55:0x011d, B:61:0x0129, B:63:0x0149, B:65:0x0184, B:66:0x0191, B:68:0x0197, B:70:0x01a7, B:75:0x01b8, B:77:0x01c2, B:81:0x01cb, B:82:0x01dc, B:83:0x01dd), top: B:97:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0184 A[Catch: all -> 0x01b3, TryCatch #1 {all -> 0x01b3, blocks: (B:55:0x011d, B:61:0x0129, B:63:0x0149, B:65:0x0184, B:66:0x0191, B:68:0x0197, B:70:0x01a7, B:75:0x01b8, B:77:0x01c2, B:81:0x01cb, B:82:0x01dc, B:83:0x01dd), top: B:97:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0197 A[Catch: all -> 0x01b3, TryCatch #1 {all -> 0x01b3, blocks: (B:55:0x011d, B:61:0x0129, B:63:0x0149, B:65:0x0184, B:66:0x0191, B:68:0x0197, B:70:0x01a7, B:75:0x01b8, B:77:0x01c2, B:81:0x01cb, B:82:0x01dc, B:83:0x01dd), top: B:97:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cb A[Catch: all -> 0x01b3, TRY_ENTER, TryCatch #1 {all -> 0x01b3, blocks: (B:55:0x011d, B:61:0x0129, B:63:0x0149, B:65:0x0184, B:66:0x0191, B:68:0x0197, B:70:0x01a7, B:75:0x01b8, B:77:0x01c2, B:81:0x01cb, B:82:0x01dc, B:83:0x01dd), top: B:97:0x011d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00ff, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0149, please report this as an issue */
    public static final Object i(zm2 zm2Var, nq4 nq4Var) {
        ym2 ym2Var;
        wfe wfeVarP;
        wfe wfeVar;
        wfe wfeVar2;
        wfe wfeVar3;
        le2 le2Var;
        String strY;
        String strB;
        le2 le2Var2;
        String strY2;
        um2 um2VarA;
        int i;
        Map map;
        Map map2;
        LinkedHashMap linkedHashMap;
        zm2Var.getClass();
        if (nq4Var instanceof ym2) {
            ym2Var = (ym2) nq4Var;
            int i2 = ym2Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ym2Var.h = i2 - Integer.MIN_VALUE;
            } else {
                ym2Var = new ym2(zm2Var, nq4Var);
            }
        } else {
            ym2Var = new ym2(zm2Var, nq4Var);
        }
        Object obj = ym2Var.f;
        hu4 hu4Var = hu4.a;
        int i3 = ym2Var.h;
        try {
            if (i3 == 0) {
                wfeVarP = nbh.p(obj);
                wfeVar = new wfe();
                synchronized (zm2Var.k) {
                    if (zm2Var.z != 1) {
                        return sbi.a;
                    }
                    wfeVarP.a = zm2Var.x;
                    le2 le2Var3 = zm2Var.q;
                    wfeVar.a = le2Var3;
                    if (wfeVarP.a != null && le2Var3 != null) {
                        zm2Var.z = 2;
                        zm2Var.v = true;
                        zm2Var.e.getClass();
                        zm2Var.o = new ith(SystemClock.elapsedRealtimeNanos());
                        zo7 zo7Var = zm2Var.p;
                        if (zo7Var != null) {
                            Log.d("CXCP", "Awaiting session lock");
                            ym2Var.d = wfeVarP;
                            ym2Var.e = wfeVar;
                            ym2Var.h = 1;
                            if (zo7Var.e(ym2Var) == hu4Var) {
                                return hu4Var;
                            }
                            wfeVar2 = wfeVarP;
                            wfeVar3 = wfeVar;
                        }
                        StringBuilder sb = new StringBuilder("Creating CameraCaptureSession from ");
                        le2Var = (le2) wfeVar.a;
                        if (le2Var != null) {
                            strY = le2Var.Y();
                        } else {
                            strY = null;
                        }
                        if (strY == null) {
                            strB = "null";
                        } else {
                            strB = ef2.b(strY);
                        }
                        sb.append((Object) strB);
                        sb.append(" using ");
                        sb.append(zm2Var);
                        sb.append(" with ");
                        sb.append(wfeVarP.a);
                        Log.i("CXCP", sb.toString());
                        StringBuilder sb2 = new StringBuilder("CameraDevice-");
                        le2Var2 = (le2) wfeVar.a;
                        if (le2Var2 != null) {
                            strY2 = le2Var2.Y();
                        } else {
                            strY2 = null;
                        }
                        Trace.beginSection(zo5.w(sb2, strY2, "#createCaptureSession"));
                        um2VarA = zm2Var.b.a((le2) wfeVar.a, (Map) wfeVarP.a, zm2Var);
                        Trace.endSection();
                        if (!(um2VarA instanceof tm2)) {
                            Log.e("CXCP", "Failed to create capture session for " + zm2Var + '!');
                            return sbi.a;
                        }
                        synchronized (zm2Var.k) {
                            try {
                                i = zm2Var.z;
                                if (i != 4 && i != 5) {
                                    if (i == 2) {
                                        throw new IllegalStateException("Unexpected state: ".concat(bc1.s(i)).toString());
                                    }
                                    zm2Var.z = 3;
                                    zm2Var.m.putAll((Map) wfeVarP.a);
                                    zm2Var.n.putAll(((tm2) um2VarA).b);
                                    map = ((tm2) um2VarA).a;
                                    if (!map.isEmpty()) {
                                        Log.i("CXCP", "Created " + zm2Var + " with " + ww3.T1(((Map) wfeVarP.a).keySet()) + ". Waiting to finalize " + ww3.T1(map.keySet()));
                                        zm2Var.s = map;
                                        map2 = zm2Var.x;
                                        if (map2 != null) {
                                            linkedHashMap = new LinkedHashMap();
                                            for (Map.Entry entry : map2.entrySet()) {
                                                if (map.containsKey(entry.getKey())) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                        } else {
                                            linkedHashMap = null;
                                        }
                                        if (linkedHashMap != null && linkedHashMap.size() == map.size()) {
                                            zm2Var.t = linkedHashMap;
                                        }
                                    }
                                    zm2Var.j(null);
                                    return sbi.a;
                                }
                                Log.i("CXCP", "Warning: " + zm2Var + " was " + bc1.s(zm2Var.z) + " while configuration was in progress.");
                                return sbi.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return sbi.a;
                }
            }
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wfeVar3 = ym2Var.e;
            wfeVar2 = ym2Var.d;
            ch3.d0(obj);
            Trace.beginSection(zo5.w(sb2, strY2, "#createCaptureSession"));
            um2VarA = zm2Var.b.a((le2) wfeVar.a, (Map) wfeVarP.a, zm2Var);
            Trace.endSection();
            if (!(um2VarA instanceof tm2)) {
                Log.e("CXCP", "Failed to create capture session for " + zm2Var + '!');
                return sbi.a;
            }
            synchronized (zm2Var.k) {
                i = zm2Var.z;
                if (i != 4) {
                    if (i == 2) {
                        throw new IllegalStateException("Unexpected state: ".concat(bc1.s(i)).toString());
                    }
                    zm2Var.z = 3;
                    zm2Var.m.putAll((Map) wfeVarP.a);
                    zm2Var.n.putAll(((tm2) um2VarA).b);
                    map = ((tm2) um2VarA).a;
                    if (!map.isEmpty()) {
                        Log.i("CXCP", "Created " + zm2Var + " with " + ww3.T1(((Map) wfeVarP.a).keySet()) + ". Waiting to finalize " + ww3.T1(map.keySet()));
                        zm2Var.s = map;
                        map2 = zm2Var.x;
                        if (map2 != null) {
                            linkedHashMap = new LinkedHashMap();
                            while (r14.hasNext()) {
                                if (map.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            zm2Var.t = linkedHashMap;
                        }
                    }
                    zm2Var.j(null);
                    return sbi.a;
                }
                Log.i("CXCP", "Warning: " + zm2Var + " was " + bc1.s(zm2Var.z) + " while configuration was in progress.");
                return sbi.a;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        wfeVarP = wfeVar2;
        wfeVar = wfeVar3;
        StringBuilder sb3 = new StringBuilder("Creating CameraCaptureSession from ");
        le2Var = (le2) wfeVar.a;
        if (le2Var != null) {
            strY = le2Var.Y();
        } else {
            strY = null;
        }
        if (strY == null) {
            strB = "null";
        } else {
            strB = ef2.b(strY);
        }
        sb3.append((Object) strB);
        sb3.append(" using ");
        sb3.append(zm2Var);
        sb3.append(" with ");
        sb3.append(wfeVarP.a);
        Log.i("CXCP", sb3.toString());
        StringBuilder sb4 = new StringBuilder("CameraDevice-");
        le2Var2 = (le2) wfeVar.a;
        if (le2Var2 != null) {
            strY2 = le2Var2.Y();
        } else {
            strY2 = null;
        }
    }

    @Override // defpackage.id2
    public final void a() {
        Log.d("CXCP", this + " Ready");
    }

    @Override // defpackage.mnf
    public final void b() throws Exception {
        if (this.l.a(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            o();
            n(0L);
            Trace.endSection();
        }
    }

    @Override // defpackage.id2
    public final void c() {
        Log.w("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.a.a(new cq7(9, false));
        o();
        this.w.countDown();
        zo7 zo7Var = this.p;
        if (zo7Var != null) {
            zo7Var.q();
        }
        Trace.endSection();
    }

    @Override // defpackage.mnf
    public final void d() {
        Log.d("CXCP", this + " session disconnecting");
        Trace.beginSection(this + "#onSessionDisconnected");
        l();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.u.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.id2
    public final void e() {
        Log.d("CXCP", this + " Active");
    }

    @Override // defpackage.id2
    public final void f() {
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        o();
        this.w.countDown();
        zo7 zo7Var = this.p;
        if (zo7Var != null) {
            zo7Var.q();
        }
        Trace.endSection();
    }

    @Override // defpackage.id2
    public final void g() {
        Log.d("CXCP", this + " CaptureQueueEmpty");
    }

    @Override // defpackage.id2
    public final void h(jd2 jd2Var) {
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        j(jd2Var);
        this.w.countDown();
        zo7 zo7Var = this.p;
        if (zo7Var != null) {
            zo7Var.q();
        }
        Trace.endSection();
    }

    public final void j(jd2 jd2Var) {
        synchronized (this.k) {
            try {
                wm2 wm2Var = this.r;
                if (wm2Var == null && jd2Var != null) {
                    wb2 wb2VarB = this.c.B(jd2Var, this.m, this.n);
                    wm2 wm2Var2 = new wm2(jd2Var, new j28(wb2VarB), wb2VarB);
                    this.r = wm2Var2;
                    wm2Var = wm2Var2;
                }
                if (this.z == 3 && wm2Var != null) {
                    boolean z = (this.s == null || this.t == null) ? false : true;
                    if (z) {
                        m(false);
                    }
                    synchronized (this.k) {
                        this.e.getClass();
                        Log.i("CXCP", "Configured " + this + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - this.o.a) / 1000000.0d)}, 1)));
                        this.a.b(wm2Var.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Map map) {
        synchronized (this.k) {
            try {
                int i = this.z;
                if (i != 4 && i != 5) {
                    Map map2 = this.x;
                    if (map2 == null) {
                        map2 = s66.a;
                    }
                    p(map2, map);
                    this.x = map;
                    Map map3 = this.s;
                    if (map3 != null && this.t == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (map3.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map3.size()) {
                            this.t = linkedHashMap;
                            yab.i0(this.i, null, 0, new jhc(this, null, 15), 3);
                        }
                    }
                    yab.i0(this.i, null, 0, new xm2(this, null, 1), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.k) {
            try {
                int i = this.z;
                if (i != 4 && i != 5) {
                    this.z = 4;
                    wm2 wm2Var = this.r;
                    boolean z = false;
                    if (wm2Var != null) {
                        this.r = null;
                    } else {
                        if (this.f.d && this.v) {
                            z = true;
                        }
                        wm2Var = null;
                    }
                    zo7 zo7Var = this.p;
                    if (zo7Var != null) {
                        zo7Var.q();
                    }
                    if (z) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((sbi) this.h.b(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, new sh2(this, null, 1))) == null) {
                            Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.k) {
                            wm2Var = this.r;
                            this.r = null;
                        }
                    }
                    Trace.beginSection(this.a + "#onGraphStopping");
                    yp7 yp7Var = this.a;
                    Log.d("CXCP", yp7Var + " onGraphStopping");
                    mjg mjgVar = yp7Var.e;
                    fq7 fq7Var = fq7.b;
                    mjgVar.getClass();
                    mjgVar.j(null, fq7Var);
                    yp7Var.c.Y(null);
                    for (iq7 iq7Var : yp7Var.d) {
                        lh2 lh2Var = iq7Var.a;
                        ze2 ze2Var = iq7Var.b;
                        if (ze2Var == null) {
                            ze2Var = null;
                        }
                        lh2Var.b(ze2Var, fq7Var);
                    }
                    Trace.endSection();
                    if (wm2Var != null) {
                        j28 j28Var = wm2Var.b;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.f.a && ((sbi) this.h.b(2000L, new ec2(this, j28Var, null, 2))) == null) {
                            Log.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        wm2Var.c.c();
                        Trace.endSection();
                        if (this.f.d && ((sbi) this.h.b(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, new ec2(this, wm2Var, null, 1))) == null) {
                            Log.e("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.a + "#onGraphStopped");
                        this.a.c();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.a + "#onGraphStopped");
                        this.a.c();
                        Trace.endSection();
                    }
                    this.u.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(boolean z) {
        wm2 wm2Var;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.k) {
            wm2Var = this.r;
            map = this.s;
            linkedHashMap = this.t;
        }
        if (wm2Var == null || map == null || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            int i = ((j4h) entry.getKey()).a;
            kh khVar = (kh) entry.getValue();
            Object obj = linkedHashMap.get(new j4h(i));
            if (obj == null) {
                ore.k("Required value was null.");
                return;
            }
            khVar.a.addSurface((Surface) obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((kh) ((Map.Entry) it.next()).getValue());
        }
        wm2Var.a.Q(ww3.T1(linkedHashSet));
        synchronized (this.k) {
            try {
                if (this.z == 3) {
                    this.m.putAll(linkedHashMap);
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (true) {
                        z2 = true;
                        if (!it2.hasNext()) {
                            this.e.getClass();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Finalized ");
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                arrayList.add(new j4h(((j4h) ((Map.Entry) it3.next()).getKey()).a));
                            }
                            sb.append(arrayList);
                            sb.append(" for ");
                            sb.append(this);
                            sb.append(" in ");
                            sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)));
                            Log.i("CXCP", sb.toString());
                            break;
                        }
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int i2 = ((j4h) entry2.getKey()).a;
                        Surface surface = (Surface) entry2.getValue();
                        bi2 bi2VarB = this.g.b(i2);
                        if (bi2VarB == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (bi2VarB.b.size() != 1) {
                            throw new IllegalStateException("Cannot finalize a multi-output stream!");
                        }
                        this.n.put(new ojc(((h4h) ww3.K1(bi2VarB.b)).a), surface);
                    }
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && z) {
            yp7 yp7Var = this.a;
            Log.d("CXCP", yp7Var + " onGraphModified");
            yp7Var.c.g.V(kp7.b);
        }
        Trace.endSection();
    }

    public final void n(long j) throws Exception {
        List<AutoCloseable> listT1;
        boolean zIsTerminated;
        if (j != 0) {
            yab.i0(this.i, null, 0, new vq(j, this, (lq4) null, 8), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.k) {
            listT1 = ww3.T1(this.y.values());
            this.y.clear();
        }
        for (AutoCloseable autoCloseable : listT1) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    ore.a();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0026  */
    public final void o() {
        long j;
        boolean z;
        int i;
        l();
        synchronized (this.k) {
            try {
                j = 0;
                if (this.z != 5) {
                    z = true;
                    if (this.q != null && this.v && (i = this.f.c) != 1) {
                        if (i == 2) {
                            j = 2000;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                this.q = null;
                this.z = 5;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            n(j);
        }
    }

    public final void p(Map map, Map map2) throws Exception {
        Surface surface;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Set setX1 = ww3.X1(map.values());
        Set setX2 = ww3.X1(map2.values());
        Iterator it = lof.Y(setX1, setX2).iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.y;
            if (!zHasNext) {
                for (Surface surface2 : lof.Y(setX2, setX1)) {
                    linkedHashMap.put(surface2, this.d.a(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    ore.a();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        } while (autoCloseable != null);
        c.p(surface, " doesn't have a matching surface token!", "Surface ");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.j;
    }
}
