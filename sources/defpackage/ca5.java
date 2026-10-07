package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class ca5 implements xu5 {
    public final List a;
    public final gf6 b;
    public final uvc c;
    public final xva d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final kt4 h;
    public final l6m i;
    public final z3d j;
    public final ae7 k;
    public final UUID l;
    public final Looper m;
    public final jf n;
    public final Object o;
    public int p;
    public int q;
    public HandlerThread r;
    public aa5 s;
    public cd7 t;
    public DrmSession$DrmSessionException u;
    public byte[] v;
    public byte[] w;
    public ef6 x;
    public ks9 y;
    public ff6 z;

    public ca5(UUID uuid, gf6 gf6Var, uvc uvcVar, xva xvaVar, List list, boolean z, boolean z2, byte[] bArr, HashMap map, ae7 ae7Var, Looper looper, l6m l6mVar, z3d z3dVar) {
        this.l = uuid;
        this.c = uvcVar;
        this.d = xvaVar;
        this.b = gf6Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = ae7Var;
        this.h = new kt4();
        this.i = l6mVar;
        this.j = z3dVar;
        this.p = 2;
        this.m = looper;
        this.n = new jf(2, looper, this);
        this.o = new Object();
    }

    @Override // defpackage.xu5
    public final UUID a() {
        o();
        return this.l;
    }

    @Override // defpackage.xu5
    public final boolean b() {
        o();
        return this.e;
    }

    @Override // defpackage.xu5
    public final DrmSession$DrmSessionException c() {
        o();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.xu5
    public final cd7 d() {
        o();
        return this.t;
    }

    @Override // defpackage.xu5
    public final void f(av5 av5Var) {
        o();
        int i = this.q;
        if (i <= 0) {
            lvb.k0("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            jf jfVar = this.n;
            String str = vqi.a;
            jfVar.removeCallbacksAndMessages(null);
            aa5 aa5Var = this.s;
            synchronized (aa5Var) {
                aa5Var.removeCallbacksAndMessages(null);
                aa5Var.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            synchronized (this.o) {
                this.y = null;
            }
            this.z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.w(bArr);
                this.v = null;
            }
        }
        if (av5Var != null) {
            kt4 kt4Var = this.h;
            synchronized (kt4Var.a) {
                try {
                    Integer num = (Integer) kt4Var.b.get(av5Var);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(kt4Var.d);
                        arrayList.remove(av5Var);
                        kt4Var.d = Collections.unmodifiableList(arrayList);
                        int iIntValue = num.intValue();
                        HashMap map = kt4Var.b;
                        if (iIntValue == 1) {
                            map.remove(av5Var);
                            HashSet hashSet = new HashSet(kt4Var.c);
                            hashSet.remove(av5Var);
                            kt4Var.c = Collections.unmodifiableSet(hashSet);
                        } else {
                            map.put(av5Var, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.h.a(av5Var) == 0) {
                av5Var.e();
            }
        }
        xva xvaVar = this.d;
        int i3 = this.q;
        ea5 ea5Var = (ea5) xvaVar.b;
        if (i3 == 1 && ea5Var.p > 0 && ea5Var.l != -9223372036854775807L) {
            ea5Var.o.add(this);
            Handler handler = ea5Var.u;
            handler.getClass();
            handler.postAtTime(new jj2(16, this), this, SystemClock.uptimeMillis() + ea5Var.l);
        } else if (i3 == 0) {
            ea5Var.m.remove(this);
            if (ea5Var.r == this) {
                ea5Var.r = null;
            }
            if (ea5Var.s == this) {
                ea5Var.s = null;
            }
            uvc uvcVar = ea5Var.i;
            HashSet hashSet2 = (HashSet) uvcVar.b;
            hashSet2.remove(this);
            if (((ca5) uvcVar.c) == this) {
                uvcVar.c = null;
                if (!hashSet2.isEmpty()) {
                    ca5 ca5Var = (ca5) hashSet2.iterator().next();
                    uvcVar.c = ca5Var;
                    ff6 ff6VarG = ca5Var.b.g();
                    ca5Var.z = ff6VarG;
                    aa5 aa5Var2 = ca5Var.s;
                    String str2 = vqi.a;
                    ff6VarG.getClass();
                    aa5Var2.getClass();
                    aa5Var2.obtainMessage(1, new ba5(t99.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), ff6VarG)).sendToTarget();
                }
            }
            if (ea5Var.l != -9223372036854775807L) {
                Handler handler2 = ea5Var.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                ea5Var.o.remove(this);
            }
        }
        ea5Var.j();
    }

    @Override // defpackage.xu5
    public final void g(av5 av5Var) {
        o();
        if (this.q < 0) {
            lvb.k0("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (av5Var != null) {
            kt4 kt4Var = this.h;
            synchronized (kt4Var.a) {
                try {
                    ArrayList arrayList = new ArrayList(kt4Var.d);
                    arrayList.add(av5Var);
                    kt4Var.d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) kt4Var.b.get(av5Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kt4Var.c);
                        hashSet.add(av5Var);
                        kt4Var.c = Collections.unmodifiableSet(hashSet);
                    }
                    kt4Var.b.put(av5Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            lvb.b0(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new aa5(this, this.r.getLooper());
            if (m()) {
                i(true);
            }
        } else if (av5Var != null && j() && this.h.a(av5Var) == 1) {
            av5Var.c(this.p);
        }
        ea5 ea5Var = (ea5) this.d.b;
        if (ea5Var.l != -9223372036854775807L) {
            ea5Var.o.remove(this);
            Handler handler = ea5Var.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.xu5
    public final int getState() {
        o();
        return this.p;
    }

    @Override // defpackage.xu5
    public final boolean h(String str) {
        o();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.t(bArr, str);
    }

    public final void i(boolean z) {
        long jMin;
        long j;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str = vqi.a;
        boolean z2 = true;
        if (this.w == null) {
            n(1, z, bArr);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.j(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                k(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (f71.d.equals(this.l)) {
            o();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map mapF = bArr2 == null ? null : this.b.f(bArr2);
            if (mapF != null) {
                long j2 = -9223372036854775807L;
                try {
                    String str2 = (String) mapF.get("LicenseDurationRemaining");
                    j = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str3 = (String) mapF.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j2 = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j2));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        if (jMin <= 60) {
            lvb.g0("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            n(2, z, bArr);
            return;
        }
        if (jMin <= 0) {
            k(2, new KeysExpiredException());
            return;
        }
        this.p = 4;
        kt4 kt4Var = this.h;
        synchronized (kt4Var.a) {
            set = kt4Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((av5) it.next()).b();
        }
    }

    public final boolean j() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final void k(int i, Throwable th) {
        int iC;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iC = vqi.C(vqi.D(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (th instanceof MediaDrmResetException) {
            iC = 6006;
        } else if ((th instanceof NotProvisionedException) || dtl.b(th)) {
            iC = 6002;
        } else if (th instanceof DeniedByServerException) {
            iC = 6007;
        } else if (th instanceof UnsupportedDrmException) {
            iC = 6001;
        } else if (th instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
            iC = 6003;
        } else if (th instanceof KeysExpiredException) {
            iC = 6008;
        } else if (i == 1) {
            iC = 6006;
        } else if (i == 2) {
            iC = 6004;
        } else {
            if (i != 3) {
                ore.a();
                return;
            }
            iC = 6002;
        }
        this.u = new DrmSession$DrmSessionException(iC, th);
        lvb.l0("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            kt4 kt4Var = this.h;
            synchronized (kt4Var.a) {
                set = kt4Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((av5) it.next()).d((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            ore.l("Unexpected Throwable subclass", th);
            return;
        } else if (!dtl.c(th) && !dtl.b(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void l(boolean z, Throwable th) {
        if ((th instanceof NotProvisionedException) || dtl.b(th)) {
            this.c.m(this);
        } else {
            k(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean m() {
        Set set;
        if (j()) {
            return true;
        }
        try {
            byte[] bArrH = this.b.h();
            this.v = bArrH;
            this.b.n(bArrH, this.j);
            this.t = this.b.r(this.v);
            this.p = 3;
            kt4 kt4Var = this.h;
            synchronized (kt4Var.a) {
                set = kt4Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((av5) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.m(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (dtl.b(e)) {
                this.c.m(this);
                return false;
            }
            k(1, e);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (dtl.b(e)) {
                this.c.m(this);
                return false;
            }
            k(1, e);
            return false;
        }
    }

    public final void n(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.o) {
                try {
                    this.y = new ks9(18);
                    List list = this.a;
                    if (list != null) {
                        c98.n(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ef6 ef6VarY = this.b.y(bArr, this.a, i, this.g);
            this.x = ef6VarY;
            aa5 aa5Var = this.s;
            String str = vqi.a;
            ef6VarY.getClass();
            aa5Var.getClass();
            aa5Var.obtainMessage(2, new ba5(t99.g.getAndIncrement(), z, SystemClock.elapsedRealtime(), ef6VarY)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            l(true, e);
        }
    }

    public final void o() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            lvb.H0("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
