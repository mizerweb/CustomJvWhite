package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.entity.ContentLengthStrategy;

/* JADX INFO: loaded from: classes.dex */
public final class yb5 implements s99 {
    public static final ghe s = c98.w("file", "content", "data", "android.resource", "rawresource", "asset");
    public final tsh a;
    public final rsh b;
    public final y65 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final g98 p;
    public final ConcurrentHashMap q;
    public long r;

    public yb5(y65 y65Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, Map map) {
        m("bufferForPlaybackMs", i5, 0, "0");
        m("bufferForPlaybackForLocalPlaybackMs", i6, 0, "0");
        m("bufferForPlaybackAfterRebufferMs", i7, 0, "0");
        m("bufferForPlaybackAfterRebufferForLocalPlaybackMs", i8, 0, "0");
        m("minBufferMs", i, i5, "bufferForPlaybackMs");
        m("minBufferForLocalPlaybackMs", i2, i6, "bufferForPlaybackForLocalPlaybackMs");
        m("minBufferMs", i, i7, "bufferForPlaybackAfterRebufferMs");
        m("minBufferForLocalPlaybackMs", i2, i8, "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        m("maxBufferMs", i3, i, "minBufferMs");
        m("maxBufferForLocalPlaybackMs", i4, i2, "minBufferForLocalPlaybackMs");
        m("backBufferDurationMs", 0, 0, "0");
        this.a = new tsh();
        this.b = new rsh();
        this.c = y65Var;
        this.d = vqi.X(i);
        this.e = vqi.X(i2);
        this.f = vqi.X(i3);
        this.g = vqi.X(i4);
        this.h = vqi.X(i5);
        this.i = vqi.X(i6);
        this.j = vqi.X(i7);
        this.k = vqi.X(i8);
        this.l = i9;
        this.m = z;
        this.n = z2;
        this.o = vqi.X(0L);
        this.q = new ConcurrentHashMap();
        this.p = g98.a(map);
        this.r = -1L;
    }

    public static void m(String str, int i, int i2, String str2) {
        lvb.T(i >= i2, "%s cannot be less than %s", str, str2);
    }

    @Override // defpackage.s99
    public final boolean a() {
        return false;
    }

    @Override // defpackage.s99
    public final long d() {
        return this.o;
    }

    @Override // defpackage.s99
    public final qf e(z3d z3dVar) {
        return new dc9(this, z3dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.s99
    public final void f(r99 r99Var, rg6[] rg6VarArr) {
        z3d z3dVar = r99Var.a;
        Integer num = (Integer) this.p.get(z3dVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        xb5 xb5Var = (xb5) this.q.get(z3dVar);
        xb5Var.getClass();
        if (iIntValue == -1) {
            boolean zN = n(r99Var);
            int length = rg6VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    rg6 rg6Var = rg6VarArr[i];
                    if (rg6Var != null) {
                        switch (rg6Var.m().c) {
                            case ContentLengthStrategy.CHUNKED /* -2 */:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = zN ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                ore.a();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iIntValue = vqi.j(i2, 13107200, 210239488);
                }
            }
        }
        xb5Var.c = iIntValue;
        o();
    }

    @Override // defpackage.s99
    public final boolean g() {
        Iterator it = this.q.values().iterator();
        while (it.hasNext()) {
            if (((xb5) it.next()).b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.s99
    public final void h(z3d z3dVar) {
        ConcurrentHashMap concurrentHashMap = this.q;
        xb5 xb5Var = (xb5) concurrentHashMap.get(z3dVar);
        if (xb5Var != null) {
            int i = xb5Var.a - 1;
            xb5Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(z3dVar);
                o();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.r = -1L;
        }
    }

    @Override // defpackage.s99
    public final void i(z3d z3dVar) {
        ConcurrentHashMap concurrentHashMap = this.q;
        xb5 xb5Var = (xb5) concurrentHashMap.get(z3dVar);
        if (xb5Var != null) {
            int i = xb5Var.a - 1;
            xb5Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(z3dVar);
                o();
            }
        }
    }

    @Override // defpackage.s99
    public final void j(z3d z3dVar) {
        long id = Thread.currentThread().getId();
        long j = this.r;
        lvb.Z("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.r = id;
        ConcurrentHashMap concurrentHashMap = this.q;
        xb5 xb5Var = (xb5) concurrentHashMap.get(z3dVar);
        if (xb5Var == null) {
            concurrentHashMap.put(z3dVar, new xb5());
        } else {
            xb5Var.a++;
        }
        xb5 xb5Var2 = (xb5) concurrentHashMap.get(z3dVar);
        xb5Var2.getClass();
        Integer num = (Integer) this.p.get(z3dVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        xb5Var2.c = iIntValue;
        xb5Var2.b = false;
    }

    @Override // defpackage.s99
    public final boolean k(r99 r99Var) {
        z3d z3dVar = r99Var.a;
        long j = r99Var.d;
        ConcurrentHashMap concurrentHashMap = this.q;
        xb5 xb5Var = (xb5) concurrentHashMap.get(z3dVar);
        xb5Var.getClass();
        xb5 xb5Var2 = (xb5) concurrentHashMap.get(z3dVar);
        xb5Var2.getClass();
        int iA = xb5Var2.a() * this.c.b;
        xb5 xb5Var3 = (xb5) concurrentHashMap.get(z3dVar);
        xb5Var3.getClass();
        boolean z = iA >= xb5Var3.c;
        if (z3dVar == z3d.d) {
            return !z;
        }
        boolean zN = n(r99Var);
        long jMin = zN ? this.e : this.d;
        long j2 = zN ? this.g : this.f;
        float f = r99Var.e;
        if (f > 1.0f) {
            jMin = Math.min(vqi.F(f, jMin), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            boolean z2 = (zN ? this.n : this.m) || !z;
            xb5Var.b = z2;
            if (!z2 && j < 500000) {
                lvb.G0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z) {
            xb5Var.b = false;
        }
        return xb5Var.b;
    }

    @Override // defpackage.s99
    public final boolean l(r99 r99Var) {
        long jMin;
        boolean zN = n(r99Var);
        z3d z3dVar = r99Var.a;
        long jI = vqi.I(r99Var.e, r99Var.d);
        if (r99Var.f) {
            jMin = zN ? this.k : this.j;
        } else {
            jMin = zN ? this.i : this.h;
        }
        long j = r99Var.g;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jI >= jMin) {
            return true;
        }
        if (zN ? this.n : this.m) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.q;
        xb5 xb5Var = (xb5) concurrentHashMap.get(z3dVar);
        xb5Var.getClass();
        int iA = xb5Var.a() * this.c.b;
        xb5 xb5Var2 = (xb5) concurrentHashMap.get(z3dVar);
        xb5Var2.getClass();
        return iA >= xb5Var2.c;
    }

    public final boolean n(r99 r99Var) {
        ush ushVar = r99Var.b;
        jy9 jy9Var = ushVar.m(ushVar.g(r99Var.c.a, this.b).c, this.a, 0L).b.b;
        if (jy9Var == null) {
            return false;
        }
        String scheme = jy9Var.a.getScheme();
        return TextUtils.isEmpty(scheme) || s.contains(scheme);
    }

    public final void o() {
        ConcurrentHashMap concurrentHashMap = this.q;
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        y65 y65Var = this.c;
        if (zIsEmpty) {
            y65Var.a();
            return;
        }
        Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((xb5) it.next()).c;
        }
        y65Var.b(i);
    }
}
