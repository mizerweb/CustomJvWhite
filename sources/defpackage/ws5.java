package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ws5 extends wm5 {
    public final q36 h;
    public final Context i;
    public final tw5 j;
    public final tm5 k;
    public final j71 l;
    public final Executor m;
    public final Handler n;
    public final due o;
    public final Executor p;
    public final ry9 q;
    public volatile gs5 r;
    public volatile ys5 s;
    public volatile vs5 t;
    public final s63 u;
    public final ks6 v;
    public final ifh w;
    public final g85 x;

    public ws5(String str, q36 q36Var, Context context, tw5 tw5Var, tm5 tm5Var, j71 j71Var, Executor executor, Handler handler, due dueVar) {
        hy9 hy9Var;
        String str2;
        jy9 jy9Var;
        Executor of5Var = executor;
        this.h = q36Var;
        this.i = context;
        this.j = tw5Var;
        this.k = tm5Var;
        this.l = j71Var;
        this.m = of5Var;
        this.n = handler;
        this.o = dueVar;
        if ((of5Var instanceof ThreadPoolExecutor) && ((ThreadPoolExecutor) of5Var).getCorePoolSize() == 1) {
            of5Var = new of5(1);
        }
        this.p = of5Var;
        by9 by9Var = new by9();
        fy9 fy9Var = new fy9();
        List list = Collections.EMPTY_LIST;
        ghe gheVar = ghe.e;
        hy9 hy9Var2 = new hy9();
        ly9 ly9Var = ly9.d;
        String str3 = tm5Var.a.d;
        str3.getClass();
        Uri uri = tm5Var.a.b;
        final boolean z = false;
        lvb.b0(fy9Var.b == null || fy9Var.a != null);
        if (uri != null) {
            gy9 gy9Var = fy9Var.a != null ? new gy9(fy9Var) : null;
            hy9Var = hy9Var2;
            str2 = str3;
            jy9Var = new jy9(uri, str, gy9Var, null, list, null, gheVar, -9223372036854775807L);
        } else {
            hy9Var = hy9Var2;
            str2 = str3;
            jy9Var = null;
        }
        this.q = new ry9(str2, new dy9(by9Var), jy9Var, new iy9(hy9Var), b0a.K, ly9Var);
        this.t = new vs5(0L, 0L);
        this.u = new s63(19, this);
        af7 af7Var = new af7(this) { // from class: ts5
            public final /* synthetic */ ws5 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i = z;
                ws5 ws5Var = this.b;
                switch (i) {
                    case 0:
                        Object obj = ws5Var.h.d;
                        return pa.d;
                    default:
                        q36 q36Var2 = ws5Var.h;
                        Object obj2 = q36Var2.d;
                        myh myhVar = myh.c;
                        ku6 ku6Var = ku6.m;
                        Context context2 = ws5Var.i;
                        int iF = (int) (ku6Var.r(context2).a.f() * 0.7f);
                        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                        int iMax = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
                        pe5 pe5VarG = new qec(context2, ws5Var.v, ((xvi) q36Var2.d).a).g();
                        pe5VarG.getClass();
                        oe5 oe5Var = new oe5(pe5VarG);
                        oe5Var.d = iF;
                        oe5Var.u = iF;
                        oe5Var.a = iMax;
                        oe5Var.b = iMax;
                        oe5Var.G = true;
                        return new pe5(oe5Var);
                }
            }
        };
        boolean z2 = nec.a;
        this.v = new ks6(myh.c, af7Var, new i94(12));
        final int i = 1;
        this.w = new ifh(new af7(this) { // from class: ts5
            public final /* synthetic */ ws5 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ws5 ws5Var = this.b;
                switch (i2) {
                    case 0:
                        Object obj = ws5Var.h.d;
                        return pa.d;
                    default:
                        q36 q36Var2 = ws5Var.h;
                        Object obj2 = q36Var2.d;
                        myh myhVar = myh.c;
                        ku6 ku6Var = ku6.m;
                        Context context2 = ws5Var.i;
                        int iF = (int) (ku6Var.r(context2).a.f() * 0.7f);
                        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                        int iMax = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
                        pe5 pe5VarG = new qec(context2, ws5Var.v, ((xvi) q36Var2.d).a).g();
                        pe5VarG.getClass();
                        oe5 oe5Var = new oe5(pe5VarG);
                        oe5Var.d = iF;
                        oe5Var.u = iF;
                        oe5Var.a = iMax;
                        oe5Var.b = iMax;
                        oe5Var.G = true;
                        return new pe5(oe5Var);
                }
            }
        });
        s25 s25Var = (s25) q36Var.c;
        zn3 zn3Var = new zn3(29);
        g85 g85Var = new g85();
        g85Var.a = s25Var;
        g85Var.b = tw5Var;
        g85Var.c = zn3Var;
        this.x = g85Var;
    }

    public static final void g(ws5 ws5Var, gs5 gs5Var) {
        due dueVar = gs5Var.e;
        x71 x71Var = ws5Var.k.b;
        int i = 0;
        if (gs5Var.d() > 0) {
            gs5Var.c();
            fzh fzhVarB = oyl.b(gs5Var.m[0], gs5Var.o[0]);
            i(fzhVarB, 2, new w83(28));
            i(fzhVarB, 1, new w83(29));
            i(fzhVarB, 3, new us5(i));
        }
        pe5 pe5Var = (pe5) ws5Var.w.getValue();
        pe5Var.getClass();
        oe5 oe5Var = new oe5(pe5Var);
        if (gs5Var.d() > 0) {
            gs5Var.c();
            om9 om9Var = gs5Var.m[0];
            ArrayList arrayList = new ArrayList();
            int i2 = om9Var.a;
            for (int i3 = 0; i3 < i2; i3++) {
                if (om9Var.b[i3] == 3) {
                    iyh iyhVar = om9Var.c[i3];
                    int i4 = iyhVar.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        hyh hyhVarA = iyhVar.a(i5);
                        int i6 = hyhVarA.a;
                        for (int i7 = 0; i7 < i6; i7++) {
                            arrayList.add(hyhVarA.d[i7]);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((b87) it.next()).d);
            }
        }
        int iD = gs5Var.d();
        for (int i8 = 0; i8 < iD; i8++) {
            gs5Var.c();
            for (int i9 = 0; i9 < dueVar.E(); i9++) {
                gs5Var.n[i8][i9].clear();
            }
            pe5 pe5Var2 = new pe5(oe5Var);
            try {
                gs5Var.c();
                gs5Var.b(i8, pe5Var2);
            } catch (ExoPlaybackException e) {
                qr7.w(e);
                return;
            }
        }
    }

    public static final ss5 h(ws5 ws5Var, gs5 gs5Var) {
        long jX;
        byte[] bArr;
        tm5 tm5Var = ws5Var.k;
        x71 x71Var = tm5Var.b;
        String str = tm5Var.a.d;
        long jX2 = vqi.X(0L);
        long j = x71Var.a;
        jy9 jy9Var = gs5Var.a;
        uii uiiVar = new uii(jy9Var.a, str);
        uiiVar.c = uya.n(jy9Var.b);
        gy9 gy9Var = jy9Var.c;
        byte[] bArrCopyOf = null;
        if (gy9Var != null && (bArr = gy9Var.h) != null) {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        uiiVar.e = bArrCopyOf;
        uiiVar.g = jy9Var.f;
        if (gs5Var.c == 2) {
            gs5Var.c();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = gs5Var.n.length;
            for (int i = 0; i < length; i++) {
                arrayList2.clear();
                int length2 = gs5Var.n[i].length;
                for (int i2 = 0; i2 < length2; i2++) {
                    arrayList2.addAll(gs5Var.n[i][i2]);
                }
                arrayList.addAll(gs5Var.k.j[i].j(arrayList2));
            }
            uiiVar.d = arrayList;
        }
        int i3 = gs5Var.c;
        lvb.b0(i3 != 0);
        lvb.b0(gs5Var.h);
        if (i3 == 1) {
            lvb.b0(i3 == 1);
            lvb.b0(gs5Var.h);
            ush ushVar = gs5Var.k.h;
            tsh tshVar = new tsh();
            rsh rshVar = new rsh();
            long jLongValue = ((Long) ushVar.i(tshVar, rshVar, 0, jX2).second).longValue();
            if (j != -9223372036854775807L) {
                jX = vqi.X(j) + jLongValue;
                long j2 = rshVar.d;
                if (j2 != -9223372036854775807L) {
                    jX = Math.min(jX, j2 - 1);
                }
            } else {
                jX = -9223372036854775807L;
            }
            xbf xbfVar = gs5Var.k.i;
            if (xbfVar.f()) {
                long j3 = xbfVar.d(jLongValue).a.b;
                long j4 = -1;
                if (jX != -9223372036854775807L) {
                    long j5 = xbfVar.d(jX).b.b;
                    if (jLongValue == jX || j3 != j5) {
                        j4 = j5 - j3;
                    }
                }
                uiiVar.h = new qs5(j3, j4);
            } else {
                lvb.G0("DownloadHelper", "Cannot set download byte range for progressive stream that is unseekable");
            }
        } else if (i3 == 2) {
            gs5Var.c();
            long j6 = gs5Var.k.h.m(0, new tsh(), 0L).l;
            long jX3 = j == -9223372036854775807L ? j6 : vqi.X(j);
            if (j6 != -9223372036854775807L) {
                jX2 = Math.min(jX2, j6);
                jX3 = Math.min(jX3, j6 - jX2);
            }
            uiiVar.i = new rs5(jX2, jX3);
        }
        String str2 = (String) uiiVar.f;
        Uri uri = (Uri) uiiVar.b;
        String str3 = (String) uiiVar.c;
        List list = (ArrayList) uiiVar.d;
        if (list == null) {
            a98 a98Var = c98.b;
            list = ghe.e;
        }
        return new ss5(str2, uri, str3, list, (byte[]) uiiVar.e, (String) uiiVar.g, null, (qs5) uiiVar.h, (rs5) uiiVar.i);
    }

    public static void i(fzh fzhVar, int i, cf7 cf7Var) {
        c98 c98Var = fzhVar.a;
        ArrayList<ezh> arrayList = new ArrayList();
        for (Object obj : c98Var) {
            if (((ezh) obj).b.c == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ezh ezhVar : arrayList) {
            hyh hyhVar = ezhVar.b;
            hj8 hj8VarF0 = oc9.f0(0, hyhVar.a);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = hj8VarF0.iterator();
            while (true) {
                gj8 gj8Var = (gj8) it;
                if (!gj8Var.c) {
                    break;
                }
                Object next = gj8Var.next();
                if (ezhVar.h(((Number) next).intValue())) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(yw3.W0(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new ou7(23));
            }
            cx3.Z0(arrayList4, arrayList2);
        }
    }

    public static void l(ws5 ws5Var, ss5 ss5Var, int i, int i2) {
        ss5 ss5Var2;
        int i3 = (i2 & 4) != 0 ? 0 : 1;
        l81 l81VarO = ws5Var.j.o(ws5Var.f());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = l81VarO != null ? l81VarO.c : jCurrentTimeMillis;
        long jMax = Math.max(ws5Var.t.a, l81VarO != null ? l81VarO.a : 0L);
        long j2 = l81VarO != null ? l81VarO.b : -1L;
        if (ws5Var.t.b > 0) {
            j2 = ws5Var.t.b;
        } else if (j2 <= 0) {
            j2 = -1;
        }
        ps5 ps5Var = new ps5();
        ps5Var.a = jMax;
        ps5Var.b = -1.0f;
        ss5 ss5VarA = (l81VarO == null || (ss5Var2 = l81VarO.d) == null) ? null : ss5Var2.a(ss5Var);
        ws5Var.j.x(new rp5(ss5VarA == null ? ss5Var : ss5VarA, i, j, jCurrentTimeMillis, j2, 0, i3, ps5Var));
    }

    public static void m(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicBoolean atomicBoolean) throws Exception {
        try {
            if (!countDownLatch.await(20000L, TimeUnit.MILLISECONDS) && atomicReference.get() == null && atomicReference2.get() == null) {
                atomicBoolean.set(true);
                throw new TimeoutException("Download request timed out");
            }
            Exception exc = (Exception) atomicReference2.get();
            if (exc != null) {
                throw exc;
            }
        } catch (InterruptedException e) {
            throw new IOException("Interrupted while preparing download request", e);
        }
    }

    @Override // defpackage.exe
    public final void d() {
        this.n.post(new jj2(26, this));
        ys5 ys5Var = this.s;
        if (ys5Var != null) {
            ys5Var.cancel();
        }
        l81 l81VarO = this.j.o(f());
        if (this.t.a == 0 && l81VarO != null && l81VarO.a == 0) {
            tw5 tw5Var = this.j;
            String strF = f();
            y95 y95Var = (y95) tw5Var.e;
            if (y95Var == null) {
                return;
            }
            synchronized (tw5Var.g) {
                try {
                    y95Var.k(strF);
                } catch (Exception e) {
                    Log.e("DiskCache", "Failed to update index.", e);
                }
            }
        }
    }

    @Override // defpackage.exe
    public final Object e() throws InterruptedException {
        ss5 ss5VarJ;
        due dueVar;
        ym5 ym5Var = this.k.a;
        if (ym5Var.a == uui.c) {
            tw5 tw5Var = this.j;
            String str = ym5Var.d;
            y95 y95Var = (y95) tw5Var.e;
            if (y95Var != null) {
                try {
                    if (y95Var.d(str) != null) {
                        try {
                            this.x.O(this.k.a.b);
                            g85 g85Var = this.x;
                            g85Var.A();
                            g85Var.z();
                        } catch (Throwable th) {
                            g85 g85Var2 = this.x;
                            g85Var2.A();
                            g85Var2.z();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    Log.e("DiskCache", "Failed to read download index.", e);
                }
            }
        }
        Exception exc = null;
        int i = 5;
        Exception e2 = null;
        int i2 = 5;
        while (true) {
            if (this.g || i2 <= 0) {
                ss5VarJ = null;
                break;
            }
            try {
                ss5VarJ = j();
                e2 = null;
                break;
            } catch (Exception e3) {
                e2 = e3;
                Log.e("DownloadTask", e2.getMessage(), e2);
                i2--;
                Thread.sleep(Math.min((4 - i2) * 1000, 5000));
            }
        }
        if (ss5VarJ == null && !this.g) {
            due dueVar2 = this.o;
            if (dueVar2 != null) {
                ym5 ym5Var2 = this.k.a;
                if (e2 == null) {
                    e2 = new IOException("Failed to create download request");
                }
                dfd dfdVar = (dfd) dueVar2.a;
                dfdVar.b.K(new cfd(dfdVar, ym5Var2, e2));
            }
        } else if (ss5VarJ != null) {
            this.s = new zs5(this.l, this.p, this.k.b).r(ss5VarJ);
            Exception e4 = null;
            while (true) {
                if (this.g || i <= 0) {
                    exc = e4;
                    break;
                }
                try {
                    l(this, ss5VarJ, 2, 12);
                    ys5 ys5Var = this.s;
                    if (ys5Var == null) {
                        break;
                    }
                    ys5Var.a(this.u);
                    break;
                } catch (Exception e5) {
                    e4 = e5;
                    Log.e("DownloadTask", e4.getMessage(), e4);
                    i--;
                    Thread.sleep(Math.min((4 - i) * 1000, 5000));
                }
            }
            int i3 = 1;
            boolean z = false;
            boolean z2 = exc == null && !this.g;
            if (!z2 && ((exc instanceof CancellationException) || (exc instanceof InterruptedException) || (exc instanceof ClosedByInterruptException) || this.g)) {
                z = true;
            }
            if (z2) {
                l(this, ss5VarJ, 3, 12);
                due dueVar3 = this.o;
                if (dueVar3 != null) {
                    ym5 ym5Var3 = this.k.a;
                    dfd dfdVar2 = (dfd) dueVar3.a;
                    dfdVar2.b.K(new k9d(dfdVar2, i3, ym5Var3));
                }
            } else if (z) {
                l(this, ss5VarJ, 1, 12);
            } else {
                l(this, ss5VarJ, 4, 8);
                if (!this.g && exc != null && (dueVar = this.o) != null) {
                    ym5 ym5Var4 = this.k.a;
                    dfd dfdVar3 = (dfd) dueVar.a;
                    dfdVar3.b.K(new cfd(dfdVar3, ym5Var4, exc));
                }
            }
        }
        return sbi.a;
    }

    @Override // defpackage.wm5
    public final String f() {
        return this.k.a.d;
    }

    public final ss5 j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        h82 h82Var = new h82(this, countDownLatch, atomicReference, atomicReference2, atomicBoolean, 4);
        Handler handler = this.n;
        handler.post(h82Var);
        int i = 26;
        try {
            m(countDownLatch, atomicReference, atomicReference2, atomicBoolean);
            ss5 ss5Var = (ss5) atomicReference.get();
            if (ss5Var == null) {
                throw new IOException("Failed to create download request");
            }
            handler.post(new jj2(i, this));
            return ss5Var;
        } catch (Throwable th) {
            handler.post(new jj2(i, this));
            throw th;
        }
    }

    public final gs5 k() {
        ur0 ur0VarA;
        pe5 pe5Var = gs5.p;
        ArrayList arrayList = new ArrayList();
        yxb yxbVar = new yxb(13);
        jec jecVar = new jec(this.i, arrayList);
        boolean z = true;
        jecVar.c = true;
        jecVar.d = new t3a(yxbVar);
        pe5 pe5Var2 = (pe5) this.w.getValue();
        ry9 ry9Var = this.q;
        jy9 jy9Var = ry9Var.b;
        jy9Var.getClass();
        boolean z2 = vqi.N(jy9Var.a, jy9Var.b) == 4;
        j71 j71Var = this.l;
        if (!z2 && j71Var == null) {
            z = false;
        }
        lvb.R(z);
        if (z2 && j71Var == null) {
            ur0VarA = null;
        } else {
            jy9 jy9Var2 = ry9Var.b;
            jy9Var2.getClass();
            ur0VarA = (vqi.N(jy9Var2.a, jy9Var2.b) == 4 ? new xvd(j71Var) : new jc5(j71Var, nj6.a)).a(ry9Var);
        }
        int i = 23;
        ks0[] ks0VarArrA = jecVar.a(vqi.q(null), new zpe(i), new so2(i), new o75(6), new o75(7));
        due dueVar = new due();
        dueVar.a = (ks0[]) Arrays.copyOf(ks0VarArrA, ks0VarArrA.length);
        for (int i2 = 0; i2 < ks0VarArrA.length; i2++) {
            ks0 ks0Var = ((ks0[]) dueVar.a)[i2];
            z3d z3dVar = z3d.c;
            ks0Var.e = i2;
            ks0Var.f = z3dVar;
            ks0Var.g = qt3.a;
        }
        return new gs5(ry9Var, ur0VarA, pe5Var2, dueVar);
    }
}
