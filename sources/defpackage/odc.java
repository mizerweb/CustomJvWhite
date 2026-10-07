package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import org.apache.http.entity.ContentLengthStrategy;

/* JADX INFO: loaded from: classes.dex */
public final class odc implements s99 {
    public static final ghe n = c98.w("file", "content", "data", "android.resource", "rawresource", "asset");
    public final tsh a;
    public final rsh b;
    public final y65 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final boolean i;
    public final g98 j;
    public final ConcurrentHashMap k;
    public long l;
    public final Supplier m;

    public odc(y65 y65Var, int i, int i2, int i3, int i4, int i5, boolean z, HashMap map, Supplier supplier) {
        m("bufferForPlaybackForLocalPlaybackMs", i3, 0, "0");
        m("bufferForPlaybackAfterRebufferForLocalPlaybackMs", i4, 0, "0");
        m("minBufferForLocalPlaybackMs", i, i3, "bufferForPlaybackForLocalPlaybackMs");
        m("minBufferForLocalPlaybackMs", i, i4, "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        m("maxBufferForLocalPlaybackMs", i2, i, "minBufferForLocalPlaybackMs");
        m("backBufferDurationMs", ((pdc) supplier.get()).c, 0, "0");
        this.a = new tsh();
        this.b = new rsh();
        this.c = y65Var;
        this.d = vqi.X(i);
        this.e = vqi.X(i2);
        this.f = vqi.X(i3);
        this.g = vqi.X(i4);
        this.h = i5;
        this.i = z;
        this.k = new ConcurrentHashMap();
        this.j = g98.a(map);
        this.l = -1L;
        this.m = supplier;
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
        return vqi.X(((pdc) this.m.get()).f);
    }

    @Override // defpackage.s99
    public final qf e(z3d z3dVar) {
        return new kr6(this, z3dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.s99
    public final void f(r99 r99Var, rg6[] rg6VarArr) {
        z3d z3dVar = r99Var.a;
        Integer num = (Integer) this.j.get(z3dVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.h : num.intValue();
        ndc ndcVar = (ndc) this.k.get(z3dVar);
        ndcVar.getClass();
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
        ndcVar.c = iIntValue;
        o();
    }

    @Override // defpackage.s99
    public final boolean g() {
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            if (((ndc) it.next()).b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.s99
    public final void h(z3d z3dVar) {
        ConcurrentHashMap concurrentHashMap = this.k;
        ndc ndcVar = (ndc) concurrentHashMap.get(z3dVar);
        if (ndcVar != null) {
            int i = ndcVar.a - 1;
            ndcVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(z3dVar);
                o();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.l = -1L;
        }
    }

    @Override // defpackage.s99
    public final void i(z3d z3dVar) {
        ConcurrentHashMap concurrentHashMap = this.k;
        ndc ndcVar = (ndc) concurrentHashMap.get(z3dVar);
        if (ndcVar != null) {
            int i = ndcVar.a - 1;
            ndcVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(z3dVar);
                o();
            }
        }
    }

    @Override // defpackage.s99
    public final void j(z3d z3dVar) {
        long id = Thread.currentThread().getId();
        long j = this.l;
        lvb.Z("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.l = id;
        ConcurrentHashMap concurrentHashMap = this.k;
        ndc ndcVar = (ndc) concurrentHashMap.get(z3dVar);
        if (ndcVar == null) {
            concurrentHashMap.put(z3dVar, new ndc());
        } else {
            ndcVar.a++;
        }
        ndc ndcVar2 = (ndc) concurrentHashMap.get(z3dVar);
        ndcVar2.getClass();
        Integer num = (Integer) this.j.get(z3dVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? this.h : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        ndcVar2.c = iIntValue;
        ndcVar2.b = false;
    }

    @Override // defpackage.s99
    public final boolean k(r99 r99Var) {
        z3d z3dVar = r99Var.a;
        long j = r99Var.d;
        ConcurrentHashMap concurrentHashMap = this.k;
        ndc ndcVar = (ndc) concurrentHashMap.get(z3dVar);
        ndcVar.getClass();
        ndc ndcVar2 = (ndc) concurrentHashMap.get(z3dVar);
        ndcVar2.getClass();
        int iA = ndcVar2.a() * this.c.b;
        ndc ndcVar3 = (ndc) concurrentHashMap.get(z3dVar);
        ndcVar3.getClass();
        boolean z = iA >= ndcVar3.c;
        if (z3dVar == z3d.d) {
            return !z;
        }
        boolean zN = n(r99Var);
        Supplier supplier = this.m;
        long jX = zN ? this.d : vqi.X(((pdc) supplier.get()).a);
        long jX2 = zN ? this.e : vqi.X(((pdc) supplier.get()).b);
        float f = r99Var.e;
        if (f > 1.0f) {
            jX = Math.min(vqi.F(f, jX), jX2);
        }
        if (j < Math.max(jX, 500000L)) {
            boolean z2 = (zN ? this.i : ((pdc) supplier.get()).e) || !z;
            ndcVar.b = z2;
            if (!z2 && j < 500000) {
                lvb.G0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= jX2 || z) {
            ndcVar.b = false;
        }
        return ndcVar.b;
    }

    @Override // defpackage.s99
    public final boolean l(r99 r99Var) {
        long jX;
        boolean zN = n(r99Var);
        z3d z3dVar = r99Var.a;
        long jI = vqi.I(r99Var.e, r99Var.d);
        boolean z = r99Var.f;
        Supplier supplier = this.m;
        if (z) {
            jX = zN ? this.g : vqi.X(((pdc) supplier.get()).d);
        } else {
            jX = zN ? this.f : vqi.X(((pdc) supplier.get()).c);
        }
        long j = r99Var.g;
        if (j != -9223372036854775807L) {
            jX = Math.min(j / 2, jX);
        }
        if (jX <= 0 || jI >= jX) {
            return true;
        }
        if (zN ? this.i : ((pdc) supplier.get()).e) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        ndc ndcVar = (ndc) concurrentHashMap.get(z3dVar);
        ndcVar.getClass();
        int iA = ndcVar.a() * this.c.b;
        ndc ndcVar2 = (ndc) concurrentHashMap.get(z3dVar);
        ndcVar2.getClass();
        return iA >= ndcVar2.c;
    }

    public final boolean n(r99 r99Var) {
        ush ushVar = r99Var.b;
        jy9 jy9Var = ushVar.m(ushVar.g(r99Var.c.a, this.b).c, this.a, 0L).b.b;
        if (jy9Var == null) {
            return false;
        }
        String scheme = jy9Var.a.getScheme();
        return TextUtils.isEmpty(scheme) || n.contains(scheme);
    }

    public final void o() {
        ConcurrentHashMap concurrentHashMap = this.k;
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        y65 y65Var = this.c;
        if (zIsEmpty) {
            y65Var.a();
            return;
        }
        Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ndc) it.next()).c;
        }
        y65Var.b(i);
    }
}
