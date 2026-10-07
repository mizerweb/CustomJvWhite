package defpackage;

import android.app.Service;
import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class o02 implements skg {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public o02(ExecutorService executorService, boolean z, owi owiVar) {
        this.c = executorService;
        this.d = executorService.submit(new qt7(1));
        this.a = z;
        this.e = owiVar;
        this.f = new Object();
        this.g = new ArrayDeque();
    }

    public static long h(Number... numberArr) {
        long jLongValue = 0;
        if (numberArr.length == 1) {
            Number number = numberArr[0];
            if (number == null) {
                return 0L;
            }
            return number.longValue();
        }
        for (Number number2 : numberArr) {
            if (number2 != null) {
                jLongValue = number2.longValue() + jLongValue;
            }
        }
        return jLongValue;
    }

    public static void t(o02 o02Var) {
        if (np4.d((Context) o02Var.e, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        xb0 xb0Var = ((o5a) dee.o(((dee) o02Var.c).F)).b;
        o02Var.a = true;
    }

    @Override // defpackage.skg
    public void a(du1 du1Var) {
        if (du1Var != null) {
            ((Hashtable) this.c).remove(du1Var);
        }
    }

    @Override // defpackage.skg
    public void b(ru1 ru1Var, boolean z, int i, List list, boolean z2) {
        HashMap map;
        CidLogger cidLogger = (CidLogger) this.f;
        xt1 xt1Var = (xt1) this.e;
        p5a p5aVar = (p5a) this.d;
        long j = 1000;
        if (qt4.e(i, 2)) {
            map = new HashMap();
            long jA = p5aVar.a();
            long j2 = xt1Var.b.a;
            if (j2 <= 1000) {
                j2 = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
            }
            boolean z3 = jA < j2;
            if (this.b != z3) {
                cidLogger.log("StatsReportHandler", "audio-mix track isConnected " + z3 + " timeout ms " + p5aVar.a());
            }
            this.b = z3;
            if (z3) {
                for (du1 du1Var : ru1Var.j()) {
                    map.put(du1Var, Boolean.valueOf(du1Var.c()));
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        du1 du1VarL = ru1Var.l((yt1) it.next());
                        if (du1VarL != null) {
                            map.put(du1VarL, Boolean.FALSE);
                        }
                    }
                }
                if (z2) {
                    for (Map.Entry entry : map.entrySet()) {
                        du1 du1Var2 = (du1) entry.getKey();
                        map.put(du1Var2, Boolean.valueOf(((Boolean) entry.getValue()).booleanValue() && du1Var2.g.a.booleanValue()));
                    }
                }
            } else {
                Iterator it2 = ru1Var.j().iterator();
                while (it2.hasNext()) {
                    map.put((du1) it2.next(), Boolean.FALSE);
                }
            }
        } else {
            Iterator it3 = ((Hashtable) this.c).entrySet().iterator();
            map = new HashMap();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                du1 du1Var3 = (du1) entry2.getKey();
                p5a p5aVar2 = (p5a) entry2.getValue();
                if (ru1Var.m(du1Var3) || du1Var3.equals((du1) this.g)) {
                    long jA2 = p5aVar2.a();
                    long j3 = j;
                    long j4 = xt1Var.b.a;
                    if (j4 <= j3) {
                        j4 = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
                    }
                    map.put(du1Var3, Boolean.valueOf(jA2 < j4));
                    if (!this.a && z) {
                        SystemClock.elapsedRealtime();
                        this.a = true;
                    }
                    j = j3;
                } else {
                    it3.remove();
                }
            }
        }
        ru1Var.q(map);
        for (du1 du1Var4 : ru1Var.j()) {
            if (du1Var4.h) {
                cidLogger.log("StatsReportHandler", "CONNECTED: " + du1Var4);
            } else {
                cidLogger.log("StatsReportHandler", "DISCONNECTED: " + du1Var4 + " isCallAccepted" + du1Var4.c());
            }
        }
    }

    @Override // defpackage.skg
    public p5a c(du1 du1Var) {
        if (du1Var != null) {
            return (p5a) ((Hashtable) this.c).get(du1Var);
        }
        return null;
    }

    @Override // defpackage.skg
    public Long d(int i) {
        Long lC;
        Hashtable hashtable = (Hashtable) this.c;
        if (qt4.e(i, 2)) {
            return ((p5a) this.d).c();
        }
        long jMin = Long.MAX_VALUE;
        for (du1 du1Var : hashtable.keySet()) {
            if (!du1Var.equals((du1) this.g) && (lC = ((p5a) hashtable.get(du1Var)).c()) != null) {
                jMin = Math.min(lC.longValue(), jMin);
            }
        }
        if (jMin == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return null;
        }
        return Long.valueOf(jMin);
    }

    @Override // defpackage.skg
    public void e(StatsReport[] statsReportArr, rkg[] rkgVarArr) {
        int i;
        p5a p5aVar;
        Hashtable hashtable = (Hashtable) this.c;
        CidLogger cidLogger = (CidLogger) this.f;
        int i2 = 0;
        while (i2 < statsReportArr.length) {
            rkg rkgVar = rkgVarArr[i2];
            du1 du1Var = rkgVar.a;
            boolean z = rkgVar.b;
            if (du1Var != null || z) {
                StatsReport.Value[] valueArr = statsReportArr[i2].values;
                int length = valueArr.length;
                String str = null;
                i = i2;
                long j = Long.MIN_VALUE;
                long j2 = Long.MIN_VALUE;
                long j3 = Long.MIN_VALUE;
                int i3 = 0;
                long j4 = Long.MIN_VALUE;
                long j5 = Long.MIN_VALUE;
                long j6 = Long.MIN_VALUE;
                while (i3 < length) {
                    StatsReport.Value value = valueArr[i3];
                    int i4 = length;
                    if ("bytesSent".equals(value.name)) {
                        try {
                            j2 = Long.parseLong(value.value);
                        } catch (Exception unused) {
                        }
                    } else if ("bytesReceived".equals(value.name)) {
                        j3 = Long.parseLong(value.value);
                    } else if ("audioOutputLevel".equals(value.name)) {
                        j = Long.parseLong(value.value);
                    } else if ("mediaType".equals(value.name)) {
                        str = value.value;
                    } else if (!"ssrc".equalsIgnoreCase(value.name) && !"googCodecName".equals(value.name) && !"codecImplementationName".equals(value.name)) {
                        if ("packetsLost".equals(value.name)) {
                            j4 = Long.parseLong(value.value);
                        } else if ("googRtt".equals(value.name)) {
                            j6 = Long.parseLong(value.value);
                        } else if ("packetsSent".equals(value.name)) {
                            j5 = Long.parseLong(value.value);
                        }
                    }
                    i3++;
                    length = i4;
                }
                if (z) {
                    p5aVar = (p5a) this.d;
                } else {
                    du1 du1Var2 = rkgVar.a;
                    p5a p5aVar2 = (p5a) hashtable.get(du1Var2);
                    if (p5aVar2 == null) {
                        p5aVar2 = new p5a();
                        hashtable.put(du1Var2, p5aVar2);
                    }
                    p5aVar = p5aVar2;
                }
                ao0 ao0Var = ((xt1) this.e).u.d;
                if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(str)) {
                    if (j != Long.MIN_VALUE) {
                        p5aVar.b(j);
                    }
                    if (j3 != Long.MIN_VALUE) {
                        ao0Var.c(cidLogger, "StatsReportHandler", zo5.j(j3, "setAudioBytesReceived: "));
                        ((q36) p5aVar.c.b).a(j3);
                    }
                    if (j2 != Long.MIN_VALUE) {
                        ao0Var.c(cidLogger, "StatsReportHandler", zo5.j(j2, "setAudioBytesSent: "));
                        ((q36) p5aVar.b.b).a(j2);
                    }
                    long j7 = j4;
                    if (j7 != Long.MIN_VALUE) {
                        ao0Var.c(cidLogger, "StatsReportHandler", zo5.j(j7, "setAudioPacketsLost: "));
                        p5aVar.e = j7;
                    }
                    long j8 = j5;
                    if (j8 != Long.MIN_VALUE) {
                        ao0Var.c(cidLogger, "StatsReportHandler", zo5.j(j8, "setAudioPacketsSent: "));
                        p5aVar.g = j8;
                    }
                    p5aVar.getClass();
                    p5aVar.i = j6;
                } else {
                    long j9 = j4;
                    long j10 = j5;
                    long j11 = j6;
                    if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(str)) {
                        if (j3 != Long.MIN_VALUE) {
                            ao0Var.c(cidLogger, "StatsReportHandler", zo5.j(j3, "setVideoBytesReceived: "));
                            ((q36) p5aVar.c.c).a(j3);
                        }
                        if (j2 != Long.MIN_VALUE) {
                            ao0Var.c(cidLogger, "StatsReportHandler", zo5.j(j2, "setVideoBytesSent: "));
                            ((q36) p5aVar.b.c).a(j2);
                        }
                        if (j9 != Long.MIN_VALUE) {
                            ao0Var.c(cidLogger, "StatsReportHandler", zo5.j(j9, "setVideoPacketsLost: "));
                            p5aVar.d = j9;
                        }
                        if (j10 != Long.MIN_VALUE) {
                            ao0Var.c(cidLogger, "StatsReportHandler", zo5.j(j10, "setVideoPacketsSent: "));
                            p5aVar.f = j10;
                        }
                        p5aVar.getClass();
                        p5aVar.h = j11;
                    }
                }
            } else {
                cidLogger.log("StatsReportHandler", "incorrect mapping skipped " + statsReportArr[i2].id);
                i = i2;
            }
            i2 = i + 1;
        }
    }

    @Override // defpackage.skg
    public void f(a4e a4eVar, fgg[] fggVarArr, sh6[] sh6VarArr) {
        p5a p5aVar;
        Double d;
        Hashtable hashtable = (Hashtable) this.c;
        for (int i = 0; i < fggVarArr.length; i++) {
            sh6 sh6Var = sh6VarArr[i];
            du1 du1Var = sh6Var.a;
            boolean z = sh6Var.b;
            if (du1Var != null || z) {
                if (z) {
                    p5aVar = (p5a) this.d;
                } else {
                    p5aVar = (p5a) hashtable.get(du1Var);
                    if (p5aVar == null) {
                        p5aVar = new p5a();
                        hashtable.put(du1Var, p5aVar);
                    }
                }
                ((xt1) this.e).u.getClass();
                fgg fggVar = fggVarArr[i];
                dc9 dc9Var = fggVar.f;
                int i2 = fggVar.a;
                if (dc9Var != null) {
                    if (i2 == 1) {
                        p5aVar.getClass();
                    } else {
                        p5aVar.getClass();
                    }
                }
                pk2 pk2VarC = a4eVar.c();
                long jLongValue = Long.MIN_VALUE;
                if (pk2VarC != null && (d = pk2VarC.h) != null) {
                    jLongValue = d.longValue();
                }
                if (i2 == 1) {
                    String.valueOf(fggVarArr[i].c);
                    p5aVar.getClass();
                    p5aVar.h = jLongValue;
                } else {
                    String.valueOf(fggVarArr[i].c);
                    p5aVar.getClass();
                    p5aVar.i = jLongValue;
                }
                fgg fggVar2 = fggVarArr[i];
                if (fggVar2 instanceof agg) {
                    agg aggVar = (agg) fggVar2;
                    ((q36) p5aVar.b.b).a(h(aggVar.j, aggVar.k));
                    p5aVar.b(h(Integer.valueOf(aggVar.o)));
                    p5aVar.e = h(aggVar.i);
                    p5aVar.g = h(aggVar.h);
                } else if (fggVar2 instanceof zfg) {
                    zfg zfgVar = (zfg) fggVar2;
                    ((q36) p5aVar.c.b).a(h(zfgVar.j));
                    p5aVar.e = h(zfgVar.i);
                } else if (fggVar2 instanceof egg) {
                    egg eggVar = (egg) fggVar2;
                    ((q36) p5aVar.b.c).a(h(eggVar.j, eggVar.k));
                    p5aVar.f = h(eggVar.h);
                    p5aVar.d = h(eggVar.i);
                } else if (fggVar2 instanceof dgg) {
                    dgg dggVar = (dgg) fggVar2;
                    ((q36) p5aVar.c.c).a(h(dggVar.j));
                    p5aVar.d = h(dggVar.i);
                }
            } else {
                ((CidLogger) this.f).log("StatsReportHandler", "incorrect mapping skipped " + fggVarArr[i].e + ":" + fggVarArr[i].d + ":" + pye.k(fggVarArr[i].a) + ":" + pye.j(fggVarArr[i].b));
            }
        }
    }

    @Override // defpackage.skg
    public void g(ru1 ru1Var, Map map) {
        du1 du1VarL;
        Hashtable hashtable = (Hashtable) this.c;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            e5f e5fVar = (e5f) entry.getValue();
            yt1 yt1Var = (yt1) entry.getKey();
            if (e5fVar != null && yt1Var != null && (du1VarL = ru1Var.l(yt1Var)) != null && ((p5a) hashtable.get(du1VarL)) == null) {
                hashtable.put(du1VarL, new p5a());
            }
        }
    }

    public void i() {
        if (((PowerManager.WakeLock) this.g) == null) {
            Object systemService = ((Service) this.c).getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager != null ? powerManager.newWakeLock(1, "max:calls_prx") : null;
            this.g = wakeLockNewWakeLock;
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.acquire();
            }
        }
    }

    public void j() {
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.g;
        if (wakeLock != null && wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLock2 = (PowerManager.WakeLock) this.g;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
            gm0.n((String) this.d, "cpu wake lock stop");
        }
        this.g = null;
        if (((ha9) this.f).a == -1) {
            return;
        }
        ((c95) ((ny8) this.e).getValue()).b();
        this.a = false;
        this.b = false;
    }

    public void k() {
        synchronized (this.f) {
            this.b = true;
            ((ArrayDeque) this.g).clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((ExecutorService) this.c).submit(new jm((Object) this, false, (Object) new zo2(this, 6, countDownLatch), 6));
        countDownLatch.await();
    }

    public void l(Exception exc) {
        synchronized (this.f) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                ((owi) this.e).a(VideoFrameProcessingException.a(-9223372036854775807L, exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(pwi pwiVar) {
        if (n()) {
            try {
                pwiVar.run();
                return;
            } catch (Exception e) {
                l(e);
                return;
            }
        }
        try {
            ((ExecutorService) this.c).submit(new ewg(this, 19, pwiVar)).get(500L, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            l(e2);
        }
    }

    public boolean n() throws InterruptedException {
        try {
            return Thread.currentThread() == ((Thread) ((Future) this.d).get(500L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            l(e2);
            return false;
        }
    }

    public void o(pwi pwiVar) {
        lvb.b0(!n());
        synchronized (this.f) {
            this.b = true;
            ((ArrayDeque) this.g).clear();
        }
        ((ExecutorService) this.c).submit(new jm((Object) this, false, (Object) pwiVar, 6));
        if (this.a) {
            ((ExecutorService) this.c).shutdown();
            if (((ExecutorService) this.c).awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            ((owi) this.e).a(new VideoFrameProcessingException("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    public fee p(Executor executor, ug4 ug4Var) {
        long j;
        int i;
        IOException iOException;
        qi0 qi0Var;
        this.g = executor;
        this.f = ug4Var;
        final dee deeVar = (dee) this.c;
        synchronized (deeVar.j) {
            try {
                long j2 = deeVar.r + 1;
                deeVar.r = j2;
                final int i2 = 0;
                switch (deeVar.m.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        cee ceeVar = deeVar.m;
                        cee ceeVar2 = cee.d;
                        final int i3 = 1;
                        if (ceeVar == ceeVar2) {
                            qyj.l("Expected recorder to be idle but a recording is either pending or in progress.", deeVar.p == null && deeVar.q == null);
                        }
                        try {
                            j = j2;
                            try {
                                qi0 qi0Var2 = new qi0((xr6) this.d, (Executor) this.g, (ug4) this.f, this.a, this.b, j);
                                qi0Var2.f.set(false);
                                qi0Var2.l((Context) this.e, deeVar.h);
                                deeVar.q = qi0Var2;
                                cee ceeVar3 = deeVar.m;
                                if (ceeVar3 == ceeVar2) {
                                    deeVar.H(cee.b);
                                    deeVar.e.execute(new Runnable() { // from class: wde
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qi0 qi0VarU;
                                            RuntimeException runtimeException;
                                            qi0 qi0Var3;
                                            int i4 = i2;
                                            boolean z = false;
                                            int i5 = 0;
                                            dee deeVar2 = deeVar;
                                            switch (i4) {
                                                case 0:
                                                    synchronized (deeVar2.j) {
                                                        try {
                                                            tvj.a("Recorder", "tryServicePendingRecording on state: " + deeVar2.m);
                                                            int iOrdinal = deeVar2.m.ordinal();
                                                            boolean z2 = true;
                                                            qi0VarU = null;
                                                            if (iOrdinal != 1) {
                                                                if (iOrdinal != 2) {
                                                                }
                                                                qi0Var3 = null;
                                                                runtimeException = null;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (deeVar2.n0 == 3) {
                                                                qi0Var3 = deeVar2.q;
                                                                deeVar2.q = null;
                                                                deeVar2.C();
                                                                i5 = 4;
                                                                boolean z3 = z2;
                                                                runtimeException = dee.t0;
                                                                z = z3;
                                                            } else {
                                                                if (deeVar2.p != null || deeVar2.c0) {
                                                                    tvj.g("Recorder", "PendingRecording is not handled, active recording = " + deeVar2.p + ", need reset flag = " + deeVar2.c0);
                                                                } else if (deeVar2.H != null) {
                                                                    i5 = 0;
                                                                    z = z2;
                                                                    runtimeException = null;
                                                                    qi0VarU = deeVar2.u(deeVar2.m);
                                                                    qi0Var3 = null;
                                                                }
                                                                z = z2;
                                                                qi0Var3 = null;
                                                                runtimeException = null;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                    if (qi0VarU != null) {
                                                        deeVar2.L(qi0VarU, z);
                                                        return;
                                                    } else {
                                                        if (qi0Var3 != null) {
                                                            deeVar2.l(qi0Var3, i5, runtimeException);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                default:
                                                    ich ichVar = deeVar2.A;
                                                    if (ichVar != null) {
                                                        deeVar2.j(ichVar, deeVar2.B, false);
                                                        return;
                                                    } else {
                                                        c.e("surface request is required to retry initialization.");
                                                        return;
                                                    }
                                            }
                                        }
                                    });
                                } else if (ceeVar3 == cee.i) {
                                    deeVar.H(cee.b);
                                    deeVar.e.execute(new Runnable() { // from class: wde
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qi0 qi0VarU;
                                            RuntimeException runtimeException;
                                            qi0 qi0Var3;
                                            int i4 = i3;
                                            boolean z = false;
                                            int i5 = 0;
                                            dee deeVar2 = deeVar;
                                            switch (i4) {
                                                case 0:
                                                    synchronized (deeVar2.j) {
                                                        try {
                                                            tvj.a("Recorder", "tryServicePendingRecording on state: " + deeVar2.m);
                                                            int iOrdinal = deeVar2.m.ordinal();
                                                            boolean z2 = true;
                                                            qi0VarU = null;
                                                            if (iOrdinal != 1) {
                                                                if (iOrdinal != 2) {
                                                                }
                                                                qi0Var3 = null;
                                                                runtimeException = null;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (deeVar2.n0 == 3) {
                                                                qi0Var3 = deeVar2.q;
                                                                deeVar2.q = null;
                                                                deeVar2.C();
                                                                i5 = 4;
                                                                boolean z3 = z2;
                                                                runtimeException = dee.t0;
                                                                z = z3;
                                                            } else {
                                                                if (deeVar2.p != null || deeVar2.c0) {
                                                                    tvj.g("Recorder", "PendingRecording is not handled, active recording = " + deeVar2.p + ", need reset flag = " + deeVar2.c0);
                                                                } else if (deeVar2.H != null) {
                                                                    i5 = 0;
                                                                    z = z2;
                                                                    runtimeException = null;
                                                                    qi0VarU = deeVar2.u(deeVar2.m);
                                                                    qi0Var3 = null;
                                                                }
                                                                z = z2;
                                                                qi0Var3 = null;
                                                                runtimeException = null;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                    if (qi0VarU != null) {
                                                        deeVar2.L(qi0VarU, z);
                                                        return;
                                                    } else {
                                                        if (qi0Var3 != null) {
                                                            deeVar2.l(qi0Var3, i5, runtimeException);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                default:
                                                    ich ichVar = deeVar2.A;
                                                    if (ichVar != null) {
                                                        deeVar2.j(ichVar, deeVar2.B, false);
                                                        return;
                                                    } else {
                                                        c.e("surface request is required to retry initialization.");
                                                        return;
                                                    }
                                            }
                                        }
                                    });
                                } else {
                                    deeVar.H(cee.b);
                                }
                                qi0Var = null;
                                iOException = null;
                                i = 0;
                            } catch (IOException e) {
                                e = e;
                                i = 5;
                                iOException = e;
                                qi0Var = null;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            j = j2;
                        }
                        break;
                    case 1:
                    case 2:
                        qi0Var = deeVar.q;
                        qi0Var.getClass();
                        iOException = null;
                        i = 0;
                        j = j2;
                        break;
                    case 4:
                    case 5:
                        qi0Var = deeVar.p;
                        iOException = null;
                        i = 0;
                        j = j2;
                        break;
                    default:
                        j = j2;
                        qi0Var = null;
                        iOException = null;
                        i = 0;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qi0Var != null) {
            ore.k("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
            return null;
        }
        if (i == 0) {
            return new fee((dee) this.c, j, (xr6) this.d, false);
        }
        tvj.c("Recorder", "Recording was started when the Recorder had encountered error " + iOException);
        qi0 qi0Var3 = new qi0((xr6) this.d, (Executor) this.g, (ug4) this.f, this.a, this.b, j);
        qi0Var3.f.set(false);
        deeVar.l(qi0Var3, i, iOException);
        return new fee((dee) this.c, j, (xr6) this.d, true);
    }

    public void q(pwi pwiVar, boolean z) {
        synchronized (this.f) {
            if (this.b && z) {
                return;
            }
            try {
                ((ExecutorService) this.c).submit(new jm(this, z, pwiVar, 6));
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                l(e);
            }
        }
    }

    public void r(pwi pwiVar) {
        synchronized (this.f) {
            try {
                if (this.b) {
                    return;
                }
                ((ArrayDeque) this.g).add(pwiVar);
                q(new nwi(), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        try {
            lvb.b0(n());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            l(e);
        }
    }

    public o02(Service service, ny8 ny8Var) {
        this.c = service;
        this.d = o02.class.getName();
        this.e = ny8Var;
        this.f = new ha9(-1);
    }

    public o02(Context context, dee deeVar, xr6 xr6Var) {
        this.c = deeVar;
        this.d = xr6Var;
        this.e = jq4.a(context);
    }

    public o02(xt1 xt1Var, CidLogger cidLogger, du1 du1Var) {
        this.c = new Hashtable();
        this.d = new p5a();
        this.e = xt1Var;
        this.f = cidLogger;
        this.g = du1Var;
    }
}
