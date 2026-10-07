package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class db5 implements w99 {
    public static final o75 o = new o75(5);
    public final uik a;
    public final zx7 b;
    public final l6m c;
    public ed7 f;
    public dc9 g;
    public Handler h;
    public tx7 i;
    public wx7 j;
    public Uri k;
    public sx7 l;
    public boolean m;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long n = -9223372036854775807L;

    public db5(uik uikVar, l6m l6mVar, zx7 zx7Var) {
        this.a = uikVar;
        this.b = zx7Var;
        this.c = l6mVar;
    }

    public final sx7 a(Uri uri, boolean z) {
        HashMap map = this.d;
        sx7 sx7Var = ((cb5) map.get(uri)).d;
        if (sx7Var != null && z) {
            if (!uri.equals(this.k)) {
                List list = this.j.e;
                for (int i = 0; i < list.size(); i++) {
                    if (uri.equals(((vx7) list.get(i)).a)) {
                        sx7 sx7Var2 = this.l;
                        if (sx7Var2 != null && sx7Var2.o) {
                            break;
                        }
                        this.k = uri;
                        cb5 cb5Var = (cb5) map.get(uri);
                        sx7 sx7Var3 = cb5Var.d;
                        if (sx7Var3 != null && sx7Var3.o) {
                            this.l = sx7Var3;
                            this.i.x(sx7Var3);
                            break;
                        }
                        cb5Var.f(b(uri));
                        break;
                    }
                }
            }
            cb5 cb5Var2 = (cb5) map.get(uri);
            sx7 sx7Var4 = cb5Var2.d;
            if (!cb5Var2.k) {
                cb5Var2.k = true;
                if (sx7Var4 != null && !sx7Var4.o) {
                    cb5Var2.c(true);
                }
            }
        }
        return sx7Var;
    }

    public final Uri b(Uri uri) {
        ox7 ox7Var;
        sx7 sx7Var = this.l;
        if (sx7Var == null || !sx7Var.v.e || (ox7Var = (ox7) sx7Var.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ox7Var.b));
        int i = ox7Var.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i;
        cb5 cb5Var = (cb5) this.d.get(uri);
        if (cb5Var.d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, vqi.p0(cb5Var.d.u));
        sx7 sx7Var = cb5Var.d;
        return sx7Var.o || (i = sx7Var.d) == 2 || i == 1 || cb5Var.e + jMax > jElapsedRealtime;
    }

    @Override // defpackage.w99
    public final void d(y99 y99Var, long j, long j2, boolean z) {
        rmc rmcVar = (rmc) y99Var;
        long j3 = rmcVar.a;
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.c.getClass();
        this.f.N(t99Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.w99
    public final void h(y99 y99Var, long j, long j2) {
        wx7 wx7Var;
        rmc rmcVar = (rmc) y99Var;
        xx7 xx7Var = (xx7) rmcVar.f;
        boolean z = xx7Var instanceof sx7;
        if (z) {
            String str = xx7Var.a;
            wx7 wx7Var2 = wx7.l;
            Uri uri = Uri.parse(str);
            a87 a87Var = new a87();
            a87Var.a = "0";
            a87Var.l = uya.n("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new vx7(uri, new b87(a87Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            wx7Var = new wx7("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            wx7Var = (wx7) xx7Var;
        }
        this.j = wx7Var;
        this.k = ((vx7) wx7Var.e.get(0)).a;
        this.e.add(new bb5(this));
        List list2 = wx7Var.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list2.get(i);
            this.d.put(uri2, new cb5(this, uri2));
        }
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        cb5 cb5Var = (cb5) this.d.get(this.k);
        if (z) {
            cb5Var.g((sx7) xx7Var, t99Var);
        } else {
            cb5Var.c(false);
        }
        this.c.getClass();
        this.f.O(t99Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.w99
    public final void p(y99 y99Var, long j, long j2, int i) {
        t99 t99Var;
        rmc rmcVar = (rmc) y99Var;
        if (i == 0) {
            long j3 = rmcVar.a;
            t99Var = new t99(j, rmcVar.b);
        } else {
            long j4 = rmcVar.a;
            a35 a35Var = rmcVar.b;
            lkg lkgVar = rmcVar.d;
            t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        }
        this.f.R(t99Var, rmcVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.w99
    public final dc1 x(y99 y99Var, long j, long j2, IOException iOException, int i) {
        rmc rmcVar = (rmc) y99Var;
        long j3 = rmcVar.a;
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        int i2 = rmcVar.c;
        long jQ = this.c.q(new mf(iOException, i, 7));
        boolean z = jQ == -9223372036854775807L;
        this.f.Q(t99Var, i2, iOException, z);
        return z ? dc9.g : new dc1(0, jQ, false);
    }
}
