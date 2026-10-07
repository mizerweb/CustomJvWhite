package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class pm2 implements pl2 {
    public final jl2 a;
    public final ix6 b;
    public final iwh c;
    public final p5j d;
    public final omi e;
    public final zx3 f;
    public final rmi g;
    public final Provider h;
    public final hmi i;
    public final ifh j;
    public xg m;
    public final ifh k = new ifh(new yk1(18, this));
    public int l = 1;
    public final wl2 n = new wl2();

    public pm2(jl2 jl2Var, ix6 ix6Var, iwh iwhVar, p5j p5jVar, omi omiVar, zx3 zx3Var, rmi rmiVar, kg2 kg2Var, Provider provider, hmi hmiVar) {
        this.a = jl2Var;
        this.b = ix6Var;
        this.c = iwhVar;
        this.d = p5jVar;
        this.e = omiVar;
        this.f = zx3Var;
        this.g = rmiVar;
        this.h = provider;
        this.i = hmiVar;
        this.j = new ifh(new ql2(kg2Var, 0));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.AutoCloseable, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final Object d(pm2 pm2Var, long j, boolean z, nq4 nq4Var) {
        gm2 gm2Var;
        long j2;
        boolean z2;
        long j3;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        ?? r2;
        hu4 hu4Var;
        gm2 gm2Var2;
        Throwable th;
        Object objZ0;
        if (nq4Var instanceof gm2) {
            gm2Var = (gm2) nq4Var;
            int i = gm2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                gm2Var.i = i - Integer.MIN_VALUE;
            } else {
                gm2Var = new gm2(pm2Var, nq4Var);
            }
        } else {
            gm2Var = new gm2(pm2Var, nq4Var);
        }
        Object objG = gm2Var.g;
        int i2 = gm2Var.i;
        hu4 hu4Var2 = hu4.a;
        try {
            if (i2 == 0) {
                ch3.d0(objG);
                ze2 ze2VarA = pm2Var.i.a();
                j2 = j;
                gm2Var.d = j2;
                z2 = z;
                gm2Var.e = z2;
                gm2Var.i = 1;
                objG = ze2VarA.g(gm2Var);
                if (objG == hu4Var2) {
                    return hu4Var2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ch3.d0(objG);
                            return objG;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    autoCloseable2 = gm2Var.f;
                    try {
                        ch3.d0(objG);
                        gm2Var2 = gm2Var;
                        r2 = 0;
                        hu4Var = hu4Var2;
                        xf5 xf5Var = (xf5) objG;
                        p90.f(autoCloseable2, r2);
                        gm2Var2.f = r2;
                        gm2Var2.i = 3;
                        objZ0 = xf5Var.z0(gm2Var2);
                        if (objZ0 == hu4Var) {
                            return hu4Var;
                        }
                        return objZ0;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            p90.f(autoCloseable2, th);
                            throw th3;
                        }
                    }
                }
                z2 = gm2Var.e;
                j2 = gm2Var.d;
                ch3.d0(objG);
            }
            jd9 jd9Var = new jd9(2);
            b52 b52Var = new b52(pm2Var, z2, 1);
            gm2Var.f = autoCloseable;
            gm2Var.i = 2;
            gm2 gm2Var3 = gm2Var;
            r2 = 0;
            hu4Var = hu4Var2;
            Object objG2 = cf2.g((cf2) autoCloseable, null, null, null, null, jd9Var, null, null, b52Var, j3, 1000000000L, gm2Var3, 6719);
            gm2Var2 = gm2Var3;
            if (objG2 == hu4Var) {
                return hu4Var;
            }
            autoCloseable2 = autoCloseable;
            objG = objG2;
            xf5 xf5Var2 = (xf5) objG;
            p90.f(autoCloseable2, r2);
            gm2Var2.f = r2;
            gm2Var2.i = 3;
            objZ0 = xf5Var2.z0(gm2Var2);
            if (objZ0 == hu4Var) {
                return hu4Var;
            }
            return objZ0;
        } catch (Throwable th4) {
            th = th4;
            autoCloseable2 = autoCloseable;
            th = th;
            throw th;
        }
        j3 = j2;
        autoCloseable = (AutoCloseable) objG;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [pm2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final Object e(pm2 pm2Var, long j, nq4 nq4Var) {
        nm2 nm2Var;
        Object objZ0;
        if (nq4Var instanceof nm2) {
            nm2Var = (nm2) nq4Var;
            int i = nm2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm2Var.h = i - Integer.MIN_VALUE;
            } else {
                nm2Var = new nm2(pm2Var, nq4Var);
            }
        } else {
            nm2Var = new nm2(pm2Var, nq4Var);
        }
        Object objG = nm2Var.f;
        int i2 = nm2Var.h;
        hu4 hu4Var = hu4.a;
        try {
            if (i2 == 0) {
                ch3.d0(objG);
                ze2 ze2VarA = pm2Var.i.a();
                nm2Var.d = j;
                nm2Var.h = 1;
                objG = ze2VarA.g(nm2Var);
                if (objG != hu4Var) {
                }
                return hu4Var;
            }
            if (i2 == 1) {
                j = nm2Var.d;
                ch3.d0(objG);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ch3.d0(objG);
                        return objG;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AutoCloseable autoCloseable = nm2Var.e;
                ch3.d0(objG);
                pm2Var = autoCloseable;
            }
            xf5 xf5Var = (xf5) objG;
            p90.f(pm2Var, null);
            nm2Var.e = null;
            nm2Var.h = 3;
            objZ0 = xf5Var.z0(nm2Var);
            if (objZ0 != hu4Var) {
                return hu4Var;
            }
            return objZ0;
            AutoCloseable autoCloseable2 = (AutoCloseable) objG;
            nm2Var.e = autoCloseable2;
            nm2Var.h = 2;
            objG = cf2.I((cf2) autoCloseable2, j, 29);
            pm2Var = autoCloseable2;
            if (objG != hu4Var) {
                xf5 xf5Var2 = (xf5) objG;
                p90.f(pm2Var, null);
                nm2Var.e = null;
                nm2Var.h = 3;
                objZ0 = xf5Var2.z0(nm2Var);
                if (objZ0 != hu4Var) {
                    return objZ0;
                }
            }
            return hu4Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(pm2Var, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.pl2
    public final am2 a(int i, int i2) {
        return new am2(this, i, i2);
    }

    @Override // defpackage.pl2
    public final void b(int i) {
        this.l = i;
    }

    @Override // defpackage.pl2
    public final Object c(List list, int i, t94 t94Var, int i2, int i3, int i4, nq4 nq4Var) {
        return j(xw3.P0(sl2.a, sl2.b, sl2.c), i2, i4, i3, new rl2(list, i, t94Var), nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:14:0x003e, B:62:0x0132, B:64:0x0138, B:21:0x005a, B:58:0x0116), top: B:93:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x0164  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0172  */
    /* JADX WARN: Code duplicated, block: B:82:0x017c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0184  */
    /* JADX WARN: Code duplicated, block: B:86:0x018b  */
    /* JADX WARN: Code duplicated, block: B:89:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [lq4, vt4] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object f(rl2 rl2Var, long j, int i, List list, nq4 nq4Var) {
        tl2 tl2Var;
        Throwable th;
        ?? r4;
        rl2 rl2Var2;
        int i2;
        pm2 pm2Var;
        rl2 rl2Var3;
        long j2;
        int i3;
        pm2 pm2Var2;
        AutoCloseable autoCloseable;
        List list2;
        rl2 rl2Var4;
        int i4;
        pm2 pm2Var3;
        AutoCloseable autoCloseable2;
        int i5;
        ?? r2;
        List listSingletonList;
        List list3 = list;
        if (nq4Var instanceof tl2) {
            tl2Var = (tl2) nq4Var;
            int i6 = tl2Var.l;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                tl2Var.l = i6 - Integer.MIN_VALUE;
            } else {
                tl2Var = new tl2(this, nq4Var);
            }
        } else {
            tl2Var = new tl2(this, nq4Var);
        }
        Object objG = tl2Var.j;
        ?? r5 = tl2Var.l;
        hu4 hu4Var = hu4.a;
        try {
            try {
                if (r5 == 0) {
                    ch3.d0(objG);
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture");
                    }
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list3);
                    }
                    if (list3.contains(sl2.a)) {
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                        }
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for locking 3A");
                        }
                        ze2 ze2VarA = this.i.a();
                        tl2Var.f = this;
                        tl2Var.g = list3;
                        rl2Var3 = rl2Var;
                        tl2Var.h = rl2Var3;
                        j2 = j;
                        tl2Var.d = j2;
                        i3 = i;
                        tl2Var.e = i3;
                        tl2Var.l = 1;
                        objG = ze2VarA.g(tl2Var);
                        if (objG != hu4Var) {
                            pm2Var2 = this;
                        }
                        return hu4Var;
                    }
                    rl2Var2 = rl2Var;
                    i2 = i;
                    pm2Var = this;
                    if (list3.contains(sl2.b)) {
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rl2Var2 == null) {
                            ore.k("Required value was null.");
                            return null;
                        }
                        ArrayList arrayListO = pm2Var.o(rl2Var2);
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                        listSingletonList = arrayListO;
                        r2 = 0;
                    } else {
                        r2 = 0;
                        listSingletonList = Collections.singletonList(qyj.a(null));
                    }
                    if (list3.contains(sl2.c)) {
                        yab.i0(pm2Var.e.f, r2, 0, new wd9(listSingletonList, (lq4) r2, this, i2), 3);
                    }
                    return listSingletonList;
                }
                if (r5 == 1) {
                    int i7 = tl2Var.e;
                    j2 = tl2Var.d;
                    rl2Var3 = tl2Var.h;
                    List list4 = tl2Var.g;
                    pm2Var2 = tl2Var.f;
                    ch3.d0(objG);
                    i3 = i7;
                    list3 = list4;
                } else {
                    if (r5 == 2) {
                        i4 = tl2Var.e;
                        AutoCloseable autoCloseable3 = tl2Var.i;
                        rl2Var4 = tl2Var.h;
                        list2 = tl2Var.g;
                        pm2Var3 = tl2Var.f;
                        ch3.d0(objG);
                        autoCloseable2 = autoCloseable3;
                        tl2Var.f = pm2Var3;
                        tl2Var.g = list2;
                        tl2Var.h = rl2Var4;
                        tl2Var.i = autoCloseable2;
                        tl2Var.e = i4;
                        i5 = 3;
                        tl2Var.l = 3;
                        if (((up8) ((xf5) objG)).g(tl2Var) != hu4Var) {
                            pm2Var = pm2Var3;
                            r5 = autoCloseable2;
                        }
                        return hu4Var;
                    }
                    if (r5 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = tl2Var.e;
                    AutoCloseable autoCloseable4 = tl2Var.i;
                    rl2Var4 = tl2Var.h;
                    list2 = tl2Var.g;
                    pm2Var = tl2Var.f;
                    ch3.d0(objG);
                    i5 = 3;
                    r5 = autoCloseable4;
                }
                if (tvj.f(i5, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done");
                }
                p90.f(r5, null);
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                }
                i2 = i4;
                rl2Var2 = rl2Var4;
                list3 = list2;
                if (list3.contains(sl2.b)) {
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                    }
                    if (rl2Var2 == null) {
                        ore.k("Required value was null.");
                        return null;
                    }
                    ArrayList arrayListO2 = pm2Var.o(rl2Var2);
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                    }
                    listSingletonList = arrayListO2;
                    r2 = 0;
                } else {
                    r2 = 0;
                    listSingletonList = Collections.singletonList(qyj.a(null));
                }
                if (list3.contains(sl2.c)) {
                    yab.i0(pm2Var.e.f, r2, 0, new wd9(listSingletonList, (lq4) r2, this, i2), 3);
                }
                return listSingletonList;
                cf2 cf2Var = (cf2) autoCloseable;
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture");
                }
                boolean z = i3 == 0;
                boolean z2 = i3 == 0;
                tl2Var.f = pm2Var2;
                tl2Var.g = list3;
                tl2Var.h = rl2Var3;
                tl2Var.i = autoCloseable;
                tl2Var.e = i3;
                tl2Var.l = 2;
                i64 i64VarL = cf2.l(cf2Var, z, z2, j2);
                if (i64VarL != hu4Var) {
                    list2 = list3;
                    rl2Var4 = rl2Var3;
                    i4 = i3;
                    pm2Var3 = pm2Var2;
                    autoCloseable2 = autoCloseable;
                    objG = i64VarL;
                    tl2Var.f = pm2Var3;
                    tl2Var.g = list2;
                    tl2Var.h = rl2Var4;
                    tl2Var.i = autoCloseable2;
                    tl2Var.e = i4;
                    i5 = 3;
                    tl2Var.l = 3;
                    if (((up8) ((xf5) objG)).g(tl2Var) != hu4Var) {
                        pm2Var = pm2Var3;
                        r5 = autoCloseable2;
                        if (tvj.f(i5, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done");
                        }
                        p90.f(r5, null);
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                        }
                        i2 = i4;
                        rl2Var2 = rl2Var4;
                        list3 = list2;
                        if (list3.contains(sl2.b)) {
                            if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (rl2Var2 == null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                            ArrayList arrayListO3 = pm2Var.o(rl2Var2);
                            if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                            listSingletonList = arrayListO3;
                            r2 = 0;
                        } else {
                            r2 = 0;
                            listSingletonList = Collections.singletonList(qyj.a(null));
                        }
                        if (list3.contains(sl2.c)) {
                            yab.i0(pm2Var.e.f, r2, 0, new wd9(listSingletonList, (lq4) r2, this, i2), 3);
                        }
                        return listSingletonList;
                    }
                }
                return hu4Var;
            } catch (Throwable th2) {
                th = th2;
                r4 = autoCloseable;
                try {
                    throw th;
                } catch (Throwable th3) {
                    p90.f(r4, th);
                    throw th3;
                }
            }
            autoCloseable = (AutoCloseable) objG;
        } catch (Throwable th4) {
            th = th4;
            r4 = r5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(rl2 rl2Var, int i, int i2, List list, nq4 nq4Var) {
        ul2 ul2Var;
        if (nq4Var instanceof ul2) {
            ul2Var = (ul2) nq4Var;
            int i3 = ul2Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ul2Var.i = i3 - Integer.MIN_VALUE;
            } else {
                ul2Var = new ul2(this, nq4Var);
            }
        } else {
            ul2Var = new ul2(this, nq4Var);
        }
        ul2 ul2Var2 = ul2Var;
        Object objM = ul2Var2.g;
        int i4 = ul2Var2.i;
        Object obj = hu4.a;
        if (i4 == 0) {
            ch3.d0(objM);
            if (((Boolean) this.j.getValue()).booleanValue()) {
                ul2Var2.d = rl2Var;
                ul2Var2.e = list;
                ul2Var2.f = i;
                ul2Var2.i = 1;
                objM = m(i2, ul2Var2);
                if (objM != obj) {
                }
            } else {
                ul2Var2.i = 4;
                Object objH = h(rl2Var, i, list, ul2Var2);
                if (objH != obj) {
                    return objH;
                }
            }
            return obj;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ch3.d0(objM);
                return objM;
            }
            if (i4 == 3) {
                ch3.d0(objM);
                return objM;
            }
            if (i4 == 4) {
                ch3.d0(objM);
                return objM;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = ul2Var2.f;
        list = ul2Var2.e;
        rl2Var = ul2Var2.d;
        ch3.d0(objM);
        List list2 = list;
        boolean zBooleanValue = ((Boolean) objM).booleanValue();
        long j = zBooleanValue ? 5000000000L : 1000000000L;
        if (zBooleanValue || i == 0) {
            ul2Var2.d = null;
            ul2Var2.e = null;
            ul2Var2.i = 2;
            Object objF = f(rl2Var, j, i, list2, ul2Var2);
            if (objF != obj) {
                return objF;
            }
        } else {
            ul2Var2.d = null;
            ul2Var2.e = null;
            ul2Var2.i = 3;
            Object objH2 = h(rl2Var, i, list2, ul2Var2);
            if (objH2 != obj) {
                return objH2;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(rl2 rl2Var, int i, List list, nq4 nq4Var) {
        vl2 vl2Var;
        int i2;
        pm2 pm2Var;
        rl2 rl2Var2;
        List list2;
        Object objSingletonList;
        if (nq4Var instanceof vl2) {
            vl2Var = (vl2) nq4Var;
            int i3 = vl2Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vl2Var.j = i3 - Integer.MIN_VALUE;
            } else {
                vl2Var = new vl2(this, nq4Var);
            }
        } else {
            vl2Var = new vl2(this, nq4Var);
        }
        Object obj = vl2Var.h;
        int i4 = vl2Var.j;
        if (i4 == 0) {
            ch3.d0(obj);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture");
            }
            i2 = i == 0 ? 1 : 0;
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
            }
            if (list.contains(sl2.a)) {
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                }
                if (i2 != 0) {
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Locking 3A");
                    }
                    vl2Var.e = this;
                    vl2Var.f = list;
                    vl2Var.g = rl2Var;
                    vl2Var.d = i2;
                    vl2Var.j = 1;
                    Object objD = d(this, 1000000000L, false, vl2Var);
                    hu4 hu4Var = hu4.a;
                    if (objD == hu4Var) {
                        return hu4Var;
                    }
                    pm2Var = this;
                    rl2Var2 = rl2Var;
                    list2 = list;
                } else {
                    pm2Var = this;
                    rl2Var2 = rl2Var;
                    list2 = list;
                }
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                }
            } else {
                pm2Var = this;
                rl2Var2 = rl2Var;
                list2 = list;
            }
            if (list2.contains(sl2.b)) {
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                }
                if (rl2Var2 != null) {
                    ore.k("Required value was null.");
                    return null;
                }
                objSingletonList = pm2Var.o(rl2Var2);
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                }
            } else {
                objSingletonList = Collections.singletonList(qyj.a(null));
            }
            if (list2.contains(sl2.c)) {
                return objSingletonList;
            }
            dq4 dq4Var = pm2Var.e.f;
            boolean z = i2 != 0;
            Object obj2 = objSingletonList;
            yab.i0(dq4Var, null, 0, new qi4(obj2, (lq4) null, z, this, 3), 3);
            return obj2;
        }
        if (i4 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i5 = vl2Var.d;
        rl2Var2 = vl2Var.g;
        List list3 = vl2Var.f;
        pm2Var = vl2Var.e;
        ch3.d0(obj);
        i2 = i5;
        list2 = list3;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Locking 3A done");
        }
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
        }
        if (list2.contains(sl2.b)) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
            }
            if (rl2Var2 != null) {
                ore.k("Required value was null.");
                return null;
            }
            objSingletonList = pm2Var.o(rl2Var2);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
            }
        } else {
            objSingletonList = Collections.singletonList(qyj.a(null));
        }
        if (list2.contains(sl2.c)) {
            return objSingletonList;
        }
        dq4 dq4Var2 = pm2Var.e.f;
        if (i2 != 0) {
        }
        Object obj3 = objSingletonList;
        yab.i0(dq4Var2, null, 0, new qi4(obj3, (lq4) null, z, this, 3), 3);
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x006b, please report this as an issue */
    public final Object i(nq4 nq4Var) {
        bm2 bm2Var;
        pm2 pm2Var;
        if (nq4Var instanceof bm2) {
            bm2Var = (bm2) nq4Var;
            int i = bm2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bm2Var.g = i - Integer.MIN_VALUE;
            } else {
                bm2Var = new bm2(this, nq4Var);
            }
        } else {
            bm2Var = new bm2(this, nq4Var);
        }
        Object objR = bm2Var.e;
        int i2 = bm2Var.g;
        if (i2 == 0) {
            ch3.d0(objR);
            if (this.m == null) {
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "getFrameMetadata: waiting for result");
                }
                bm2Var.d = this;
                bm2Var.g = 1;
                objR = r(1000000000L, new xk1(15), bm2Var);
                hu4 hu4Var = hu4.a;
                if (objR == hu4Var) {
                    return hu4Var;
                }
                pm2Var = this;
            }
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "getFrameMetadata: frameMetadata = " + this.m);
            }
            return this.m;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pm2Var = bm2Var.d;
        ch3.d0(objR);
        pc7 pc7Var = (pc7) objR;
        pm2Var.m = pc7Var != null ? pc7Var.getMetadata() : null;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "getFrameMetadata: frameMetadata = " + this.m);
        }
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(List list, int i, int i2, int i3, rl2 rl2Var, nq4 nq4Var) {
        cm2 cm2Var;
        Object objU;
        if (nq4Var instanceof cm2) {
            cm2Var = (cm2) nq4Var;
            int i4 = cm2Var.j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cm2Var.j = i4 - Integer.MIN_VALUE;
            } else {
                cm2Var = new cm2(this, nq4Var);
            }
        } else {
            cm2Var = new cm2(this, nq4Var);
        }
        Object obj = cm2Var.h;
        int i5 = cm2Var.j;
        Object obj2 = hu4.a;
        if (i5 == 0) {
            ch3.d0(obj);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#invokeCaptureTasks: tasks = " + list + ", captureMode = " + i + ", flashMode = " + i2 + ", flashType = " + i3);
            }
            this.m = null;
            if (list.contains(sl2.b) && rl2Var == null) {
                ore.k("Must not be null for PipelineType.MAIN_CAPTURE");
                return null;
            }
            if (i2 == 3) {
                cm2Var.j = 1;
                Object objN = n(rl2Var, i, list, cm2Var);
                if (objN != obj2) {
                    return objN;
                }
            } else {
                cm2Var.d = list;
                cm2Var.e = rl2Var;
                cm2Var.f = i;
                cm2Var.g = i2;
                cm2Var.j = 2;
                if (this.l == 3 || i3 == 1) {
                    objU = Boolean.TRUE;
                } else {
                    objU = this.g.u(new m25(this, null, 2), cm2Var);
                }
                obj = objU;
                if (obj != obj2) {
                }
            }
            return obj2;
        }
        if (i5 == 1) {
            ch3.d0(obj);
            return obj;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                ch3.d0(obj);
                return obj;
            }
            if (i5 == 4) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = cm2Var.g;
        i = cm2Var.f;
        rl2Var = cm2Var.e;
        list = cm2Var.d;
        ch3.d0(obj);
        List list2 = list;
        rl2 rl2Var2 = rl2Var;
        if (((Boolean) obj).booleanValue()) {
            cm2Var.d = null;
            cm2Var.e = null;
            cm2Var.j = 3;
            Object objQ = q(rl2Var2, i, i2, list2, cm2Var);
            if (objQ != obj2) {
                return objQ;
            }
        } else {
            cm2 cm2Var2 = cm2Var;
            cm2Var2.d = null;
            cm2Var2.e = null;
            cm2Var2.j = 4;
            Object objG = g(rl2Var2, i, i2, list2, cm2Var2);
            if (objG != obj2) {
                return objG;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:33:0x0078, B:35:0x0081, B:41:0x0090), top: B:56:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002e, B:45:0x009c, B:47:0x00a2), top: B:54:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(int i, nq4 nq4Var) {
        dm2 dm2Var;
        int i2;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        cf2 cf2Var;
        if (nq4Var instanceof dm2) {
            dm2Var = (dm2) nq4Var;
            int i3 = dm2Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dm2Var.h = i3 - Integer.MIN_VALUE;
            } else {
                dm2Var = new dm2(this, nq4Var);
            }
        } else {
            dm2Var = new dm2(this, nq4Var);
        }
        Object objG = dm2Var.f;
        int i4 = dm2Var.h;
        boolean z = true;
        hu4 hu4Var = hu4.a;
        if (i4 == 0) {
            ch3.d0(objG);
            dm2Var.d = i;
            dm2Var.h = 1;
            if (this.b.f(dm2Var) != hu4Var) {
            }
            return hu4Var;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                autoCloseable2 = dm2Var.e;
                try {
                    ch3.d0(objG);
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                    }
                    p90.f(autoCloseable2, null);
                    return sbi.a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        p90.f(autoCloseable2, th);
                        throw th3;
                    }
                }
            }
            i2 = dm2Var.d;
            ch3.d0(objG);
            autoCloseable = (AutoCloseable) objG;
            try {
                cf2Var = (cf2) autoCloseable;
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A");
                }
                if (i2 == 0) {
                    z = false;
                }
                dm2Var.e = autoCloseable;
                dm2Var.h = 3;
                if (cf2Var.K(z) != hu4Var) {
                    autoCloseable2 = autoCloseable;
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                    }
                    p90.f(autoCloseable2, null);
                    return sbi.a;
                }
                return hu4Var;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable2 = autoCloseable;
                throw th;
            }
        }
        i = dm2Var.d;
        ch3.d0(objG);
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "screenFlashPostCapture: Acquiring session for unlocking 3A");
        }
        ze2 ze2VarA = this.i.a();
        dm2Var.d = i;
        dm2Var.h = 2;
        objG = ze2VarA.g(dm2Var);
        if (objG != hu4Var) {
            i2 = i;
            autoCloseable = (AutoCloseable) objG;
            cf2Var = (cf2) autoCloseable;
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A");
            }
            if (i2 == 0) {
                z = false;
            }
            dm2Var.e = autoCloseable;
            dm2Var.h = 3;
            if (cf2Var.K(z) != hu4Var) {
                autoCloseable2 = autoCloseable;
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                }
                p90.f(autoCloseable2, null);
                return sbi.a;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:34:0x0078, B:36:0x0081, B:42:0x0091), top: B:58:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        if (r15 == r9) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [pm2] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(int r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pm2.l(int, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(int i, nq4 nq4Var) {
        fm2 fm2Var;
        if (nq4Var instanceof fm2) {
            fm2Var = (fm2) nq4Var;
            int i2 = fm2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fm2Var.f = i2 - Integer.MIN_VALUE;
            } else {
                fm2Var = new fm2(this, nq4Var);
            }
        } else {
            fm2Var = new fm2(this, nq4Var);
        }
        Object objI = fm2Var.d;
        int i3 = fm2Var.f;
        boolean z = false;
        if (i3 == 0) {
            ch3.d0(objI);
            if (i == 0) {
                fm2Var.f = 1;
                objI = i(fm2Var);
                Object obj = hu4.a;
                if (objI == obj) {
                    return obj;
                }
            } else if (i == 1) {
                z = true;
            } else if (i != 2 && i != 3) {
                throw new AssertionError(i);
            }
            return Boolean.valueOf(z);
        }
        if (i3 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objI);
        xg xgVar = (xg) objI;
        if (xgVar != null) {
            Integer num = (Integer) xgVar.a.get(CaptureResult.CONTROL_AE_STATE);
            if (num != null && num.intValue() == 4) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(rl2 rl2Var, int i, List list, nq4 nq4Var) {
        hm2 hm2Var;
        pm2 pm2Var;
        List listSingletonList;
        if (nq4Var instanceof hm2) {
            hm2Var = (hm2) nq4Var;
            int i2 = hm2Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hm2Var.j = i2 - Integer.MIN_VALUE;
            } else {
                hm2Var = new hm2(this, nq4Var);
            }
        } else {
            hm2Var = new hm2(this, nq4Var);
        }
        Object obj = hm2Var.h;
        int i3 = hm2Var.j;
        if (i3 == 0) {
            ch3.d0(obj);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#screenFlashCapture");
            }
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
            }
            if (list.contains(sl2.a)) {
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                }
                hm2Var.e = this;
                hm2Var.f = list;
                hm2Var.g = rl2Var;
                hm2Var.d = i;
                hm2Var.j = 1;
                Object objL = l(i, hm2Var);
                hu4 hu4Var = hu4.a;
                if (objL == hu4Var) {
                    return hu4Var;
                }
                pm2Var = this;
            } else {
                pm2Var = this;
            }
            if (list.contains(sl2.b)) {
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                }
                if (rl2Var != null) {
                    ore.k("Required value was null.");
                    return null;
                }
                listSingletonList = pm2Var.o(rl2Var);
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                }
            } else {
                listSingletonList = Collections.singletonList(qyj.a(null));
            }
            if (list.contains(sl2.c)) {
                yab.i0(pm2Var.e.f, null, 0, new ht1(listSingletonList, (lq4) null, this, i), 3);
            }
            return listSingletonList;
        }
        if (i3 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = hm2Var.d;
        rl2Var = hm2Var.g;
        list = hm2Var.f;
        pm2Var = hm2Var.e;
        ch3.d0(obj);
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
        }
        if (list.contains(sl2.b)) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
            }
            if (rl2Var != null) {
                ore.k("Required value was null.");
                return null;
            }
            listSingletonList = pm2Var.o(rl2Var);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
            }
        } else {
            listSingletonList = Collections.singletonList(qyj.a(null));
        }
        if (list.contains(sl2.c)) {
            yab.i0(pm2Var.e.f, null, 0, new ht1(listSingletonList, (lq4) null, this, i), 3);
        }
        return listSingletonList;
    }

    public final ArrayList o(rl2 rl2Var) {
        List list = rl2Var.a;
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#submitRequestInternal; Submitting " + list + " with CameraPipe");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            fle fleVarA = null;
            if (!it.hasNext()) {
                break;
            }
            hl2 hl2Var = (hl2) it.next();
            i64 i64Var = new i64();
            arrayList.add(i64Var);
            try {
                fleVarA = this.a.a(hl2Var, rl2Var.b, rl2Var.c, Collections.singletonList(new im2(i64Var)));
            } catch (IllegalStateException e) {
                if (tvj.f(4, "CXCP")) {
                    Log.i("CXCP", "CapturePipeline#submitRequestInternal: configAdapter.mapToRequest failed!", e);
                }
                i64Var.j0(new ImageCaptureException(2, "Capture request failed with reason " + e.getMessage(), e));
            }
            if (fleVarA != null) {
                arrayList2.add(fleVarA);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        yab.i0(this.e.f, null, 0, new f00((lq4) null, this, arrayList, arrayList2), 3);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x025b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0268  */
    /* JADX WARN: Code duplicated, block: B:108:0x0270  */
    /* JADX WARN: Code duplicated, block: B:110:0x0278  */
    /* JADX WARN: Code duplicated, block: B:114:0x029d  */
    /* JADX WARN: Code duplicated, block: B:117:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:129:0x02de  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:139:0x030f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0319  */
    /* JADX WARN: Code duplicated, block: B:142:0x031b  */
    /* JADX WARN: Code duplicated, block: B:144:0x031e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0320  */
    /* JADX WARN: Code duplicated, block: B:148:0x032c  */
    /* JADX WARN: Code duplicated, block: B:57:0x015b  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x019c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x01af  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x020f  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0233  */
    /* JADX WARN: Code duplicated, block: B:99:0x023a  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x020f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    public final Object p(rl2 rl2Var, int i, long j, List list, boolean z, nq4 nq4Var) {
        lm2 lm2Var;
        Throwable th;
        ?? r7;
        int i2;
        rl2 rl2Var2;
        int i3;
        int i4;
        List list2;
        pm2 pm2Var;
        int i5;
        boolean z2;
        rl2 rl2Var3;
        long j2;
        List list3;
        int i6;
        int i7;
        rl2 rl2Var4;
        ol0 ol0Var;
        pm2 pm2Var2;
        pm2 pm2Var3;
        Object objG;
        pm2 pm2Var4;
        int i8;
        long j3;
        rl2 rl2Var5;
        List list4;
        AutoCloseable autoCloseable;
        boolean z3;
        List list5;
        boolean z4;
        pm2 pm2Var5;
        i64 i64VarL;
        List list6;
        AutoCloseable autoCloseable2;
        pm2 pm2Var6;
        pm2 pm2Var7;
        rl2 rl2Var6;
        List list7;
        toe toeVar;
        List listSingletonList;
        int i9;
        boolean z5;
        boolean z6;
        int i10 = i;
        if (nq4Var instanceof lm2) {
            lm2Var = (lm2) nq4Var;
            int i11 = lm2Var.o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lm2Var.o = i11 - Integer.MIN_VALUE;
            } else {
                lm2Var = new lm2(this, nq4Var);
            }
        } else {
            lm2Var = new lm2(this, nq4Var);
        }
        Object objZ0 = lm2Var.m;
        int i12 = lm2Var.o;
        ?? r8 = 2;
        int i13 = 3;
        hu4 hu4Var = hu4.a;
        try {
            switch (i12) {
                case 0:
                    ch3.d0(objZ0);
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture");
                    }
                    iwh iwhVar = this.c;
                    Integer num = (Integer) iwhVar.e.d();
                    int i14 = (num != null && num.intValue() == 0) ? 1 : 0;
                    i2 = (i14 != 0 || i10 == 0) ? 1 : 0;
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
                    }
                    if (list.contains(sl2.a)) {
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                        }
                        if (i14 != 0) {
                            if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch");
                            }
                            i64 i64VarC = iwhVar.c(2, true, (6 & 4) == 0);
                            lm2Var.i = this;
                            lm2Var.j = list;
                            rl2Var3 = rl2Var;
                            lm2Var.k = rl2Var3;
                            lm2Var.d = i10;
                            j2 = j;
                            lm2Var.g = j2;
                            lm2Var.h = z;
                            lm2Var.e = i14;
                            lm2Var.f = i2;
                            lm2Var.o = 1;
                            if (i64VarC.g(lm2Var) != hu4Var) {
                                list3 = list;
                                i5 = i14;
                                z2 = z;
                                pm2Var = this;
                                if (tvj.f(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch done");
                                }
                                if (!z2) {
                                    if (tvj.f(3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                                    }
                                    ze2 ze2VarA = this.i.a();
                                    lm2Var.i = pm2Var;
                                    lm2Var.j = list3;
                                    lm2Var.k = rl2Var3;
                                    lm2Var.d = i10;
                                    lm2Var.g = j2;
                                    lm2Var.h = z2;
                                    lm2Var.e = i5;
                                    lm2Var.f = i2;
                                    lm2Var.o = 2;
                                    objG = ze2VarA.g(lm2Var);
                                    if (objG != hu4Var) {
                                        pm2Var4 = pm2Var;
                                        objZ0 = objG;
                                        rl2 rl2Var7 = rl2Var3;
                                        i8 = i10;
                                        i7 = i2;
                                        j3 = j2;
                                        rl2Var5 = rl2Var7;
                                        list4 = list3;
                                        autoCloseable = (AutoCloseable) objZ0;
                                        try {
                                            cf2 cf2Var = (cf2) autoCloseable;
                                            if (i8 == 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            list5 = list4;
                                            if (i8 == 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            lm2Var.i = pm2Var4;
                                            pm2Var5 = pm2Var4;
                                            lm2Var.j = list5;
                                            lm2Var.k = rl2Var5;
                                            lm2Var.l = autoCloseable;
                                            lm2Var.d = i8;
                                            lm2Var.h = z2;
                                            lm2Var.e = i5;
                                            lm2Var.f = i7;
                                            lm2Var.o = 3;
                                            i64VarL = cf2.l(cf2Var, z3, z4, j3);
                                            if (i64VarL != hu4Var) {
                                                list6 = list5;
                                                autoCloseable2 = autoCloseable;
                                                objZ0 = i64VarL;
                                                i6 = i8;
                                                pm2Var6 = pm2Var5;
                                                lm2Var.i = pm2Var6;
                                                lm2Var.j = list6;
                                                lm2Var.k = rl2Var5;
                                                lm2Var.l = autoCloseable2;
                                                lm2Var.d = i6;
                                                lm2Var.h = z2;
                                                lm2Var.e = i5;
                                                lm2Var.f = i7;
                                                lm2Var.o = 4;
                                                objZ0 = ((xf5) objZ0).z0(lm2Var);
                                                if (objZ0 == hu4Var) {
                                                    pm2Var7 = pm2Var6;
                                                    rl2Var6 = rl2Var5;
                                                    list7 = list6;
                                                    r8 = autoCloseable2;
                                                    toeVar = (toe) objZ0;
                                                    p90.f(r8, null);
                                                    if (tvj.f(3, "CXCP")) {
                                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + toeVar);
                                                    }
                                                    pm2Var = pm2Var7;
                                                    rl2Var4 = rl2Var6;
                                                    list2 = list7;
                                                    i3 = 3;
                                                    if (tvj.f(i3, "CXCP")) {
                                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                                    }
                                                    rl2Var2 = rl2Var4;
                                                    i4 = i6;
                                                    i2 = i7;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r7 = autoCloseable;
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                p90.f(r7, th);
                                                throw th3;
                                            }
                                        }
                                    }
                                } else {
                                    if (i2 == 0) {
                                        i3 = 3;
                                        int i15 = i2;
                                        i6 = i10;
                                        i7 = i15;
                                        rl2Var4 = rl2Var3;
                                        list2 = list3;
                                    } else if (i10 == 0) {
                                        if (tvj.f(3, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                                        }
                                        lm2Var.i = pm2Var;
                                        lm2Var.j = list3;
                                        lm2Var.k = rl2Var3;
                                        lm2Var.d = i10;
                                        lm2Var.h = z2;
                                        lm2Var.e = i5;
                                        lm2Var.f = i2;
                                        lm2Var.o = 5;
                                        if (d(this, j2, true, lm2Var) != hu4Var) {
                                            int i16 = i2;
                                            i6 = i10;
                                            i7 = i16;
                                            pm2Var3 = pm2Var;
                                            rl2Var4 = rl2Var3;
                                            list2 = list3;
                                            i13 = 3;
                                            if (tvj.f(i13, "CXCP")) {
                                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                            }
                                            pm2Var = pm2Var3;
                                            i3 = i13;
                                        }
                                    } else {
                                        if (tvj.f(3, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                                        }
                                        ol0Var = new ol0(6, this);
                                        lm2Var.i = pm2Var;
                                        lm2Var.j = list3;
                                        lm2Var.k = rl2Var3;
                                        lm2Var.d = i10;
                                        lm2Var.h = z2;
                                        lm2Var.e = i5;
                                        lm2Var.f = i2;
                                        lm2Var.o = 6;
                                        if (r(j2, ol0Var, lm2Var) != hu4Var) {
                                            int i17 = i2;
                                            i6 = i10;
                                            i7 = i17;
                                            pm2Var2 = pm2Var;
                                            rl2Var4 = rl2Var3;
                                            list2 = list3;
                                            i3 = 3;
                                            if (tvj.f(i3, "CXCP")) {
                                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                            }
                                            pm2Var = pm2Var2;
                                        }
                                    }
                                    if (tvj.f(i3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                    }
                                    rl2Var2 = rl2Var4;
                                    i4 = i6;
                                    i2 = i7;
                                }
                            }
                        } else {
                            rl2Var3 = rl2Var;
                            j2 = j;
                            list3 = list;
                            i5 = i14;
                            z2 = z;
                            pm2Var = this;
                            if (!z2) {
                                if (tvj.f(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                                }
                                ze2 ze2VarA2 = this.i.a();
                                lm2Var.i = pm2Var;
                                lm2Var.j = list3;
                                lm2Var.k = rl2Var3;
                                lm2Var.d = i10;
                                lm2Var.g = j2;
                                lm2Var.h = z2;
                                lm2Var.e = i5;
                                lm2Var.f = i2;
                                lm2Var.o = 2;
                                objG = ze2VarA2.g(lm2Var);
                                if (objG != hu4Var) {
                                    pm2Var4 = pm2Var;
                                    objZ0 = objG;
                                    rl2 rl2Var8 = rl2Var3;
                                    i8 = i10;
                                    i7 = i2;
                                    j3 = j2;
                                    rl2Var5 = rl2Var8;
                                    list4 = list3;
                                    autoCloseable = (AutoCloseable) objZ0;
                                    cf2 cf2Var2 = (cf2) autoCloseable;
                                    if (i8 == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    list5 = list4;
                                    if (i8 == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    lm2Var.i = pm2Var4;
                                    pm2Var5 = pm2Var4;
                                    lm2Var.j = list5;
                                    lm2Var.k = rl2Var5;
                                    lm2Var.l = autoCloseable;
                                    lm2Var.d = i8;
                                    lm2Var.h = z2;
                                    lm2Var.e = i5;
                                    lm2Var.f = i7;
                                    lm2Var.o = 3;
                                    i64VarL = cf2.l(cf2Var2, z3, z4, j3);
                                    if (i64VarL != hu4Var) {
                                        list6 = list5;
                                        autoCloseable2 = autoCloseable;
                                        objZ0 = i64VarL;
                                        i6 = i8;
                                        pm2Var6 = pm2Var5;
                                        lm2Var.i = pm2Var6;
                                        lm2Var.j = list6;
                                        lm2Var.k = rl2Var5;
                                        lm2Var.l = autoCloseable2;
                                        lm2Var.d = i6;
                                        lm2Var.h = z2;
                                        lm2Var.e = i5;
                                        lm2Var.f = i7;
                                        lm2Var.o = 4;
                                        objZ0 = ((xf5) objZ0).z0(lm2Var);
                                        if (objZ0 == hu4Var) {
                                            pm2Var7 = pm2Var6;
                                            rl2Var6 = rl2Var5;
                                            list7 = list6;
                                            r8 = autoCloseable2;
                                            toeVar = (toe) objZ0;
                                            p90.f(r8, null);
                                            if (tvj.f(3, "CXCP")) {
                                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + toeVar);
                                            }
                                            pm2Var = pm2Var7;
                                            rl2Var4 = rl2Var6;
                                            list2 = list7;
                                            i3 = 3;
                                            if (tvj.f(i3, "CXCP")) {
                                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                            }
                                            rl2Var2 = rl2Var4;
                                            i4 = i6;
                                            i2 = i7;
                                        }
                                    }
                                }
                            } else {
                                if (i2 == 0) {
                                    i3 = 3;
                                    int i18 = i2;
                                    i6 = i10;
                                    i7 = i18;
                                    rl2Var4 = rl2Var3;
                                    list2 = list3;
                                } else if (i10 == 0) {
                                    if (tvj.f(3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                                    }
                                    lm2Var.i = pm2Var;
                                    lm2Var.j = list3;
                                    lm2Var.k = rl2Var3;
                                    lm2Var.d = i10;
                                    lm2Var.h = z2;
                                    lm2Var.e = i5;
                                    lm2Var.f = i2;
                                    lm2Var.o = 5;
                                    if (d(this, j2, true, lm2Var) != hu4Var) {
                                        int i19 = i2;
                                        i6 = i10;
                                        i7 = i19;
                                        pm2Var3 = pm2Var;
                                        rl2Var4 = rl2Var3;
                                        list2 = list3;
                                        i13 = 3;
                                        if (tvj.f(i13, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                        }
                                        pm2Var = pm2Var3;
                                        i3 = i13;
                                    }
                                } else {
                                    if (tvj.f(3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                                    }
                                    ol0Var = new ol0(6, this);
                                    lm2Var.i = pm2Var;
                                    lm2Var.j = list3;
                                    lm2Var.k = rl2Var3;
                                    lm2Var.d = i10;
                                    lm2Var.h = z2;
                                    lm2Var.e = i5;
                                    lm2Var.f = i2;
                                    lm2Var.o = 6;
                                    if (r(j2, ol0Var, lm2Var) != hu4Var) {
                                        int i110 = i2;
                                        i6 = i10;
                                        i7 = i110;
                                        pm2Var2 = pm2Var;
                                        rl2Var4 = rl2Var3;
                                        list2 = list3;
                                        i3 = 3;
                                        if (tvj.f(i3, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                        }
                                        pm2Var = pm2Var2;
                                    }
                                }
                                if (tvj.f(i3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                }
                                rl2Var2 = rl2Var4;
                                i4 = i6;
                                i2 = i7;
                            }
                        }
                        return hu4Var;
                    }
                    rl2Var2 = rl2Var;
                    i3 = 3;
                    i4 = i10;
                    list2 = list;
                    pm2Var = this;
                    i5 = i14;
                    z2 = z;
                    if (list2.contains(sl2.b)) {
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rl2Var2 != null) {
                            ore.k("Required value was null.");
                            return null;
                        }
                        listSingletonList = pm2Var.o(rl2Var2);
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listSingletonList = Collections.singletonList(qyj.a(null));
                    }
                    if (list2.contains(sl2.c)) {
                        return listSingletonList;
                    }
                    dq4 dq4Var = pm2Var.e.f;
                    i9 = i5;
                    List list8 = listSingletonList;
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i2 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    yab.i0(dq4Var, null, 0, new km2(list8, null, z5, this, z2, z6, i4), 3);
                    return list8;
                case 1:
                    int i20 = lm2Var.f;
                    i5 = lm2Var.e;
                    z2 = lm2Var.h;
                    j2 = lm2Var.g;
                    int i21 = lm2Var.d;
                    rl2 rl2Var9 = lm2Var.k;
                    list3 = lm2Var.j;
                    pm2 pm2Var8 = lm2Var.i;
                    ch3.d0(objZ0);
                    pm2Var = pm2Var8;
                    i2 = i20;
                    i10 = i21;
                    rl2Var3 = rl2Var9;
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch done");
                    }
                    if (!z2) {
                        if (i2 == 0) {
                            i3 = 3;
                            int i111 = i2;
                            i6 = i10;
                            i7 = i111;
                            rl2Var4 = rl2Var3;
                            list2 = list3;
                        } else if (i10 == 0) {
                            if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                            }
                            lm2Var.i = pm2Var;
                            lm2Var.j = list3;
                            lm2Var.k = rl2Var3;
                            lm2Var.d = i10;
                            lm2Var.h = z2;
                            lm2Var.e = i5;
                            lm2Var.f = i2;
                            lm2Var.o = 5;
                            if (d(this, j2, true, lm2Var) != hu4Var) {
                                int i112 = i2;
                                i6 = i10;
                                i7 = i112;
                                pm2Var3 = pm2Var;
                                rl2Var4 = rl2Var3;
                                list2 = list3;
                                i13 = 3;
                                if (tvj.f(i13, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                }
                                pm2Var = pm2Var3;
                                i3 = i13;
                            }
                        } else {
                            if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                            }
                            ol0Var = new ol0(6, this);
                            lm2Var.i = pm2Var;
                            lm2Var.j = list3;
                            lm2Var.k = rl2Var3;
                            lm2Var.d = i10;
                            lm2Var.h = z2;
                            lm2Var.e = i5;
                            lm2Var.f = i2;
                            lm2Var.o = 6;
                            if (r(j2, ol0Var, lm2Var) != hu4Var) {
                                int i113 = i2;
                                i6 = i10;
                                i7 = i113;
                                pm2Var2 = pm2Var;
                                rl2Var4 = rl2Var3;
                                list2 = list3;
                                i3 = 3;
                                if (tvj.f(i3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                }
                                pm2Var = pm2Var2;
                            }
                        }
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                        }
                        rl2Var2 = rl2Var4;
                        i4 = i6;
                        i2 = i7;
                        if (list2.contains(sl2.b)) {
                            if (tvj.f(i3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (rl2Var2 != null) {
                                ore.k("Required value was null.");
                                return null;
                            }
                            listSingletonList = pm2Var.o(rl2Var2);
                            if (tvj.f(i3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                        } else {
                            listSingletonList = Collections.singletonList(qyj.a(null));
                        }
                        if (list2.contains(sl2.c)) {
                            return listSingletonList;
                        }
                        dq4 dq4Var2 = pm2Var.e.f;
                        i9 = i5;
                        List list9 = listSingletonList;
                        if (i9 != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i2 != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        yab.i0(dq4Var2, null, 0, new km2(list9, null, z5, this, z2, z6, i4), 3);
                        return list9;
                    }
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                    }
                    ze2 ze2VarA3 = this.i.a();
                    lm2Var.i = pm2Var;
                    lm2Var.j = list3;
                    lm2Var.k = rl2Var3;
                    lm2Var.d = i10;
                    lm2Var.g = j2;
                    lm2Var.h = z2;
                    lm2Var.e = i5;
                    lm2Var.f = i2;
                    lm2Var.o = 2;
                    objG = ze2VarA3.g(lm2Var);
                    if (objG != hu4Var) {
                        pm2Var4 = pm2Var;
                        objZ0 = objG;
                        rl2 rl2Var10 = rl2Var3;
                        i8 = i10;
                        i7 = i2;
                        j3 = j2;
                        rl2Var5 = rl2Var10;
                        list4 = list3;
                        autoCloseable = (AutoCloseable) objZ0;
                        cf2 cf2Var3 = (cf2) autoCloseable;
                        if (i8 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        list5 = list4;
                        if (i8 == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        lm2Var.i = pm2Var4;
                        pm2Var5 = pm2Var4;
                        lm2Var.j = list5;
                        lm2Var.k = rl2Var5;
                        lm2Var.l = autoCloseable;
                        lm2Var.d = i8;
                        lm2Var.h = z2;
                        lm2Var.e = i5;
                        lm2Var.f = i7;
                        lm2Var.o = 3;
                        i64VarL = cf2.l(cf2Var3, z3, z4, j3);
                        if (i64VarL != hu4Var) {
                            list6 = list5;
                            autoCloseable2 = autoCloseable;
                            objZ0 = i64VarL;
                            i6 = i8;
                            pm2Var6 = pm2Var5;
                            lm2Var.i = pm2Var6;
                            lm2Var.j = list6;
                            lm2Var.k = rl2Var5;
                            lm2Var.l = autoCloseable2;
                            lm2Var.d = i6;
                            lm2Var.h = z2;
                            lm2Var.e = i5;
                            lm2Var.f = i7;
                            lm2Var.o = 4;
                            objZ0 = ((xf5) objZ0).z0(lm2Var);
                            if (objZ0 == hu4Var) {
                                pm2Var7 = pm2Var6;
                                rl2Var6 = rl2Var5;
                                list7 = list6;
                                r8 = autoCloseable2;
                                toeVar = (toe) objZ0;
                                p90.f(r8, null);
                                if (tvj.f(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + toeVar);
                                }
                                pm2Var = pm2Var7;
                                rl2Var4 = rl2Var6;
                                list2 = list7;
                                i3 = 3;
                                if (tvj.f(i3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                }
                                rl2Var2 = rl2Var4;
                                i4 = i6;
                                i2 = i7;
                                if (list2.contains(sl2.b)) {
                                    if (tvj.f(i3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                                    }
                                    if (rl2Var2 != null) {
                                        ore.k("Required value was null.");
                                        return null;
                                    }
                                    listSingletonList = pm2Var.o(rl2Var2);
                                    if (tvj.f(i3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                                    }
                                } else {
                                    listSingletonList = Collections.singletonList(qyj.a(null));
                                }
                                if (list2.contains(sl2.c)) {
                                    return listSingletonList;
                                }
                                dq4 dq4Var3 = pm2Var.e.f;
                                i9 = i5;
                                List list10 = listSingletonList;
                                if (i9 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i2 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                yab.i0(dq4Var3, null, 0, new km2(list10, null, z5, this, z2, z6, i4), 3);
                                return list10;
                            }
                        }
                    }
                    return hu4Var;
                case 2:
                    i7 = lm2Var.f;
                    i5 = lm2Var.e;
                    z2 = lm2Var.h;
                    j3 = lm2Var.g;
                    i8 = lm2Var.d;
                    rl2Var5 = lm2Var.k;
                    list4 = lm2Var.j;
                    pm2Var4 = lm2Var.i;
                    ch3.d0(objZ0);
                    autoCloseable = (AutoCloseable) objZ0;
                    cf2 cf2Var4 = (cf2) autoCloseable;
                    if (i8 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    list5 = list4;
                    if (i8 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    lm2Var.i = pm2Var4;
                    pm2Var5 = pm2Var4;
                    lm2Var.j = list5;
                    lm2Var.k = rl2Var5;
                    lm2Var.l = autoCloseable;
                    lm2Var.d = i8;
                    lm2Var.h = z2;
                    lm2Var.e = i5;
                    lm2Var.f = i7;
                    lm2Var.o = 3;
                    i64VarL = cf2.l(cf2Var4, z3, z4, j3);
                    if (i64VarL != hu4Var) {
                        list6 = list5;
                        autoCloseable2 = autoCloseable;
                        objZ0 = i64VarL;
                        i6 = i8;
                        pm2Var6 = pm2Var5;
                        lm2Var.i = pm2Var6;
                        lm2Var.j = list6;
                        lm2Var.k = rl2Var5;
                        lm2Var.l = autoCloseable2;
                        lm2Var.d = i6;
                        lm2Var.h = z2;
                        lm2Var.e = i5;
                        lm2Var.f = i7;
                        lm2Var.o = 4;
                        objZ0 = ((xf5) objZ0).z0(lm2Var);
                        if (objZ0 == hu4Var) {
                            pm2Var7 = pm2Var6;
                            rl2Var6 = rl2Var5;
                            list7 = list6;
                            r8 = autoCloseable2;
                            toeVar = (toe) objZ0;
                            p90.f(r8, null);
                            if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + toeVar);
                            }
                            pm2Var = pm2Var7;
                            rl2Var4 = rl2Var6;
                            list2 = list7;
                            i3 = 3;
                            if (tvj.f(i3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                            }
                            rl2Var2 = rl2Var4;
                            i4 = i6;
                            i2 = i7;
                            if (list2.contains(sl2.b)) {
                                if (tvj.f(i3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                                }
                                if (rl2Var2 != null) {
                                    ore.k("Required value was null.");
                                    return null;
                                }
                                listSingletonList = pm2Var.o(rl2Var2);
                                if (tvj.f(i3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                                }
                            } else {
                                listSingletonList = Collections.singletonList(qyj.a(null));
                            }
                            if (list2.contains(sl2.c)) {
                                return listSingletonList;
                            }
                            dq4 dq4Var4 = pm2Var.e.f;
                            i9 = i5;
                            List list11 = listSingletonList;
                            if (i9 != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i2 != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            yab.i0(dq4Var4, null, 0, new km2(list11, null, z5, this, z2, z6, i4), 3);
                            return list11;
                        }
                    }
                    return hu4Var;
                case 3:
                    i7 = lm2Var.f;
                    i5 = lm2Var.e;
                    z2 = lm2Var.h;
                    i6 = lm2Var.d;
                    AutoCloseable autoCloseable3 = lm2Var.l;
                    rl2Var5 = lm2Var.k;
                    list6 = lm2Var.j;
                    pm2Var6 = lm2Var.i;
                    ch3.d0(objZ0);
                    autoCloseable2 = autoCloseable3;
                    lm2Var.i = pm2Var6;
                    lm2Var.j = list6;
                    lm2Var.k = rl2Var5;
                    lm2Var.l = autoCloseable2;
                    lm2Var.d = i6;
                    lm2Var.h = z2;
                    lm2Var.e = i5;
                    lm2Var.f = i7;
                    lm2Var.o = 4;
                    objZ0 = ((xf5) objZ0).z0(lm2Var);
                    if (objZ0 == hu4Var) {
                        return hu4Var;
                    }
                    pm2Var7 = pm2Var6;
                    rl2Var6 = rl2Var5;
                    list7 = list6;
                    r8 = autoCloseable2;
                    toeVar = (toe) objZ0;
                    p90.f(r8, null);
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + toeVar);
                    }
                    pm2Var = pm2Var7;
                    rl2Var4 = rl2Var6;
                    list2 = list7;
                    i3 = 3;
                    if (tvj.f(i3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    rl2Var2 = rl2Var4;
                    i4 = i6;
                    i2 = i7;
                    if (list2.contains(sl2.b)) {
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rl2Var2 != null) {
                            ore.k("Required value was null.");
                            return null;
                        }
                        listSingletonList = pm2Var.o(rl2Var2);
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listSingletonList = Collections.singletonList(qyj.a(null));
                    }
                    if (list2.contains(sl2.c)) {
                        return listSingletonList;
                    }
                    dq4 dq4Var5 = pm2Var.e.f;
                    i9 = i5;
                    List list12 = listSingletonList;
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i2 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    yab.i0(dq4Var5, null, 0, new km2(list12, null, z5, this, z2, z6, i4), 3);
                    return list12;
                case 4:
                    i7 = lm2Var.f;
                    i5 = lm2Var.e;
                    z2 = lm2Var.h;
                    i6 = lm2Var.d;
                    AutoCloseable autoCloseable4 = lm2Var.l;
                    rl2Var6 = lm2Var.k;
                    list7 = lm2Var.j;
                    pm2Var7 = lm2Var.i;
                    ch3.d0(objZ0);
                    r8 = autoCloseable4;
                    toeVar = (toe) objZ0;
                    p90.f(r8, null);
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + toeVar);
                    }
                    pm2Var = pm2Var7;
                    rl2Var4 = rl2Var6;
                    list2 = list7;
                    i3 = 3;
                    if (tvj.f(i3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    rl2Var2 = rl2Var4;
                    i4 = i6;
                    i2 = i7;
                    if (list2.contains(sl2.b)) {
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rl2Var2 != null) {
                            ore.k("Required value was null.");
                            return null;
                        }
                        listSingletonList = pm2Var.o(rl2Var2);
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listSingletonList = Collections.singletonList(qyj.a(null));
                    }
                    if (list2.contains(sl2.c)) {
                        return listSingletonList;
                    }
                    dq4 dq4Var6 = pm2Var.e.f;
                    i9 = i5;
                    List list13 = listSingletonList;
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i2 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    yab.i0(dq4Var6, null, 0, new km2(list13, null, z5, this, z2, z6, i4), 3);
                    return list13;
                case 5:
                    i7 = lm2Var.f;
                    i5 = lm2Var.e;
                    z2 = lm2Var.h;
                    i6 = lm2Var.d;
                    rl2Var4 = lm2Var.k;
                    list2 = lm2Var.j;
                    pm2Var3 = lm2Var.i;
                    ch3.d0(objZ0);
                    if (tvj.f(i13, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                    }
                    pm2Var = pm2Var3;
                    i3 = i13;
                    if (tvj.f(i3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    rl2Var2 = rl2Var4;
                    i4 = i6;
                    i2 = i7;
                    if (list2.contains(sl2.b)) {
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rl2Var2 != null) {
                            ore.k("Required value was null.");
                            return null;
                        }
                        listSingletonList = pm2Var.o(rl2Var2);
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listSingletonList = Collections.singletonList(qyj.a(null));
                    }
                    if (list2.contains(sl2.c)) {
                        return listSingletonList;
                    }
                    dq4 dq4Var7 = pm2Var.e.f;
                    i9 = i5;
                    List list14 = listSingletonList;
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i2 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    yab.i0(dq4Var7, null, 0, new km2(list14, null, z5, this, z2, z6, i4), 3);
                    return list14;
                case 6:
                    i7 = lm2Var.f;
                    i5 = lm2Var.e;
                    z2 = lm2Var.h;
                    i6 = lm2Var.d;
                    rl2Var4 = lm2Var.k;
                    list2 = lm2Var.j;
                    pm2Var2 = lm2Var.i;
                    ch3.d0(objZ0);
                    i3 = 3;
                    if (tvj.f(i3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                    }
                    pm2Var = pm2Var2;
                    if (tvj.f(i3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    rl2Var2 = rl2Var4;
                    i4 = i6;
                    i2 = i7;
                    if (list2.contains(sl2.b)) {
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rl2Var2 != null) {
                            ore.k("Required value was null.");
                            return null;
                        }
                        listSingletonList = pm2Var.o(rl2Var2);
                        if (tvj.f(i3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listSingletonList = Collections.singletonList(qyj.a(null));
                    }
                    if (list2.contains(sl2.c)) {
                        return listSingletonList;
                    }
                    dq4 dq4Var8 = pm2Var.e.f;
                    i9 = i5;
                    List list15 = listSingletonList;
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i2 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    yab.i0(dq4Var8, null, 0, new km2(list15, null, z5, this, z2, z6, i4), 3);
                    return list15;
                default:
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th4) {
            th = th4;
            r7 = r8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(rl2 rl2Var, int i, int i2, List list, nq4 nq4Var) {
        mm2 mm2Var;
        Object objH;
        boolean z;
        if (nq4Var instanceof mm2) {
            mm2Var = (mm2) nq4Var;
            int i3 = mm2Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mm2Var.i = i3 - Integer.MIN_VALUE;
            } else {
                mm2Var = new mm2(this, nq4Var);
            }
        } else {
            mm2Var = new mm2(this, nq4Var);
        }
        mm2 mm2Var2 = mm2Var;
        Object objM = mm2Var2.g;
        Object obj = hu4.a;
        int i4 = mm2Var2.i;
        if (i4 == 0) {
            ch3.d0(objM);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#torchAsFlashCapture");
            }
            if (((Boolean) this.j.getValue()).booleanValue()) {
                mm2Var2.d = rl2Var;
                mm2Var2.e = list;
                mm2Var2.f = i;
                mm2Var2.i = 1;
                objM = m(i2, mm2Var2);
                if (objM != obj) {
                }
            } else {
                mm2Var2.d = null;
                mm2Var2.e = null;
                mm2Var2.i = 3;
                objH = h(rl2Var, i, list, mm2Var2);
                if (objH == obj) {
                    return objH;
                }
            }
            return obj;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ch3.d0(objM);
                return objM;
            }
            if (i4 == 3) {
                ch3.d0(objM);
                return objM;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = mm2Var2.f;
        list = mm2Var2.e;
        rl2Var = mm2Var2.d;
        ch3.d0(objM);
        if (((Boolean) objM).booleanValue()) {
            if (!this.g.s()) {
                int i5 = this.d.a.a;
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "isInVideoUsage: videoUsage = " + i5);
                }
                z = i5 <= 0;
            }
            boolean z2 = z;
            mm2Var2.d = null;
            mm2Var2.e = null;
            mm2Var2.i = 2;
            Object objP = p(rl2Var, i, 5000000000L, list, z2, mm2Var2);
            if (objP != obj) {
                return objP;
            }
        } else {
            mm2Var2.d = null;
            mm2Var2.e = null;
            mm2Var2.i = 3;
            objH = h(rl2Var, i, list, mm2Var2);
            if (objH == obj) {
                return objH;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(long j, cf7 cf7Var, nq4 nq4Var) {
        om2 om2Var;
        woe woeVar;
        if (nq4Var instanceof om2) {
            om2Var = (om2) nq4Var;
            int i = om2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                om2Var.g = i - Integer.MIN_VALUE;
            } else {
                om2Var = new om2(this, nq4Var);
            }
        } else {
            om2Var = new om2(this, nq4Var);
        }
        Object obj = om2Var.e;
        int i2 = om2Var.g;
        zx3 zx3Var = this.f;
        if (i2 == 0) {
            ch3.d0(obj);
            woe woeVar2 = new woe(j, cf7Var);
            omi omiVar = this.e;
            zx3Var.a(woeVar2, omiVar.e);
            yab.i0(omiVar.f, null, 0, new qt1(woeVar2, this, null, 19), 3);
            m5 m5Var = new m5(woeVar2, null, 21);
            om2Var.d = woeVar2;
            om2Var.g = 1;
            Object objL0 = lvb.L0(j / 1000000, m5Var, om2Var);
            hu4 hu4Var = hu4.a;
            if (objL0 == hu4Var) {
                return hu4Var;
            }
            obj = objL0;
            woeVar = woeVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            woeVar = om2Var.d;
            ch3.d0(obj);
        }
        if (((pc7) obj) == null) {
            zx3Var.c(woeVar);
        }
        return obj;
    }
}
