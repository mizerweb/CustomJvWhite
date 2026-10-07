package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kb2 {
    public sgg A;
    public sgg B;
    public sgg C;
    public final gu4 a;
    public final zqh b;
    public final se2 c;
    public final yp7 d;
    public final ach e;
    public final sb2 f;
    public final vm2 g;
    public final g85 h;
    public final txd i;
    public final fi2 j;
    public final lc2 k;
    public final jgh l;
    public final xe2 m;
    public final ya2 n;
    public final i4h o;
    public zh2 s;
    public ne2 t;
    public ith u;
    public sgg v;
    public iaj x;
    public zm2 y;
    public Map z;
    public final Object p = new Object();
    public boolean q = true;
    public vil r = ge2.f;
    public final i64 w = new i64();

    public kb2(gu4 gu4Var, zqh zqhVar, d5h d5hVar, se2 se2Var, yp7 yp7Var, ach achVar, sb2 sb2Var, vm2 vm2Var, g85 g85Var, txd txdVar, fi2 fi2Var, lc2 lc2Var, jgh jghVar, xe2 xe2Var, ya2 ya2Var, i4h i4hVar, q94 q94Var) {
        this.a = gu4Var;
        this.b = zqhVar;
        this.c = se2Var;
        this.d = yp7Var;
        this.e = achVar;
        this.f = sb2Var;
        this.g = vm2Var;
        this.h = g85Var;
        this.i = txdVar;
        this.j = fi2Var;
        this.k = lc2Var;
        this.l = jghVar;
        this.m = xe2Var;
        this.n = ya2Var;
        this.o = i4hVar;
        this.s = new xh2(se2Var.a);
        lq4 lq4Var = null;
        this.B = yab.i0(gu4Var, null, 0, new ib2(this, lq4Var, 0), 3);
        this.C = yab.i0(gu4Var, null, 0, new ib2(this, lq4Var, 1), 3);
    }

    public static final void a(kb2 kb2Var, zh2 zh2Var) {
        Log.d("CXCP", kb2Var + " (" + ((Object) ef2.b(kb2Var.c.a)) + ") camera status changed: " + zh2Var);
        synchronized (kb2Var.p) {
            try {
                if (kb2Var.e()) {
                    return;
                }
                if ((zh2Var instanceof vh2) || (zh2Var instanceof xh2)) {
                    kb2Var.s = zh2Var;
                } else if (zh2Var instanceof wh2) {
                    kb2Var.l.getClass();
                    kb2Var.u = new ith(SystemClock.elapsedRealtimeNanos());
                }
                kb2Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void b(kb2 kb2Var) {
        if (kb2Var.e()) {
            Log.w("CXCP", "Ignoring stop(): " + kb2Var + " is already closed");
            return;
        }
        vil vilVar = kb2Var.r;
        ge2 ge2Var = ge2.g;
        if (vilVar.equals(ge2Var) || kb2Var.r.equals(ge2.f)) {
            Log.w("CXCP", "Ignoring stop(): " + kb2Var + " already stopping or stopped");
            return;
        }
        iaj iajVar = kb2Var.x;
        zm2 zm2Var = kb2Var.y;
        kb2Var.x = null;
        kb2Var.y = null;
        kb2Var.r = ge2Var;
        Log.d("CXCP", "Stopping " + kb2Var);
        kb2Var.d(zm2Var, iajVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(nq4 nq4Var) {
        jb2 jb2Var;
        if (nq4Var instanceof jb2) {
            jb2Var = (jb2) nq4Var;
            int i = jb2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jb2Var.f = i - Integer.MIN_VALUE;
            } else {
                jb2Var = new jb2(this, nq4Var);
            }
        } else {
            jb2Var = new jb2(this, nq4Var);
        }
        Object obj = jb2Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = jb2Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            Log.d("CXCP", this + "#awaitClosed");
            synchronized (this.p) {
                if (this.r.equals(ge2.a)) {
                    Log.d("CXCP", this + "#awaitClosed: Controller is already closed.");
                    return Boolean.TRUE;
                }
                if (!this.r.equals(ge2.b)) {
                    Log.w("CXCP", this + "#awaitClosed: Controller isn't closing!");
                    return Boolean.FALSE;
                }
                i64 i64Var = this.w;
                jb2Var.f = 1;
                if (i64Var.p(jb2Var) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return Boolean.TRUE;
    }

    public final void d(zm2 zm2Var, iaj iajVar) {
        in1 in1Var = new in1(zm2Var, iajVar, null, 8);
        int i = 0;
        sgg sggVarI0 = yab.i0(this.a, null, 0, in1Var, 3);
        if (this.r.equals(ge2.b)) {
            sggVarI0.Y(new gb2(this, i));
        }
    }

    public final boolean e() {
        return this.r.equals(ge2.b) || this.r.equals(ge2.a);
    }

    public final void f() throws IllegalAccessException, InvocationTargetException {
        if (e()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        vil vilVar = this.r;
        ge2 ge2Var = ge2.e;
        if (vilVar.equals(ge2Var)) {
            Log.w("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        lq4 lq4Var = null;
        this.t = null;
        se2 se2Var = this.c;
        String str = se2Var.a;
        List listT1 = ww3.T1(lof.X(Collections.singleton(new ef2(str)), new ef2(str)));
        gb2 gb2Var = new gb2(this, 1);
        txd txdVar = this.i;
        gu4 gu4Var = txdVar.d;
        yp7 yp7Var = this.d;
        iaj iajVar = new iaj(str, yp7Var, gu4Var);
        if (((p41) txdVar.e.f).c(new lme(iajVar, listT1, yp7Var, gb2Var)) instanceof cs2) {
            Log.e("CXCP", "Camera open request failed for " + ((Object) ef2.b(str)) + '!');
            yp7Var.a(new cq7(12, false));
            iajVar = null;
        }
        if (iajVar == null) {
            Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
            return;
        }
        if (this.x != null) {
            ore.k("Check failed.");
            return;
        }
        if (this.y != null) {
            ore.k("Check failed.");
            return;
        }
        this.x = iajVar;
        zm2 zm2Var = new zm2(yp7Var, this.g, this.h, this.j, this.l, se2Var.o, null, this.o, this.b, this.a);
        this.y = zm2Var;
        Map map = this.z;
        if (map != null) {
            zm2Var.k(map);
        }
        this.r = ge2Var;
        Log.d("CXCP", "Started " + this);
        sgg sggVar = this.A;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.A = yab.i0(this.a, null, 0, new ib2(this, lq4Var, 2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (r3.a != 8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb2.g():void");
    }

    public final String toString() {
        return "Camera2CameraController(" + this.m + ')';
    }
}
