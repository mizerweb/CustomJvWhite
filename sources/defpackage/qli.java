package defpackage;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class qli extends mdh implements cf7 {
    public Object e;
    public List f;
    public List g;
    public jd9 h;
    public oe i;
    public long j;
    public int k;
    public final /* synthetic */ uli l;
    public final /* synthetic */ List m;
    public final /* synthetic */ List n;
    public final /* synthetic */ List o;
    public final /* synthetic */ jd9 p;
    public final /* synthetic */ oe q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qli(uli uliVar, List list, List list2, List list3, jd9 jd9Var, oe oeVar, long j, lq4 lq4Var) {
        super(1, lq4Var);
        this.l = uliVar;
        this.m = list;
        this.n = list2;
        this.o = list3;
        this.p = jd9Var;
        this.q = oeVar;
        this.r = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new qli(this.l, this.m, this.n, this.o, this.p, this.q, this.r, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((qli) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        String str2;
        List list;
        oe oeVar;
        Object objG;
        jd9 jd9Var;
        List list2;
        List list3;
        long j;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        Throwable th;
        AutoCloseable autoCloseable3;
        cf2 cf2Var;
        Object objG2;
        AutoCloseable autoCloseable4;
        Throwable th2;
        int i2 = this.k;
        hu4 hu4Var = hu4.a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "UseCaseCameraRequestControlImpl#startFocusAndMeteringAsync");
                        }
                        uli uliVar = this.l;
                        List list4 = this.m;
                        List list5 = this.n;
                        list = this.o;
                        jd9 jd9Var2 = this.p;
                        oeVar = this.q;
                        long j2 = this.r;
                        try {
                            ze2 ze2VarA = uliVar.c.a();
                            this.e = list4;
                            this.f = list5;
                            this.g = list;
                            this.h = jd9Var2;
                            this.i = oeVar;
                            this.j = j2;
                            this.k = 1;
                            objG = ze2VarA.g(this);
                            if (objG == hu4Var) {
                                return hu4Var;
                            }
                            jd9Var = jd9Var2;
                            list2 = list5;
                            list3 = list4;
                            j = j2;
                        } catch (CancellationException e) {
                            e = e;
                            str2 = "CXCP";
                            str = str2;
                            i = 3;
                            if (tvj.f(i, str)) {
                                Log.d(str, "Cannot acquire the CameraGraph.Session", e);
                            }
                            return uli.l;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            autoCloseable4 = (AutoCloseable) this.e;
                            try {
                                ch3.d0(obj);
                                objG2 = obj;
                                str2 = "CXCP";
                                try {
                                    xf5 xf5Var = (xf5) objG2;
                                    p90.f(autoCloseable4, null);
                                    return xf5Var;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    autoCloseable3 = autoCloseable4;
                                    th = th2;
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        p90.f(autoCloseable3, th);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                autoCloseable3 = autoCloseable4;
                                str2 = "CXCP";
                                th = th2;
                                throw th;
                            }
                        }
                        long j3 = this.j;
                        oe oeVar2 = this.i;
                        jd9Var = this.h;
                        list = this.g;
                        List list6 = this.f;
                        List list7 = (List) this.e;
                        try {
                            ch3.d0(obj);
                            list3 = list7;
                            objG = obj;
                            oeVar = oeVar2;
                            list2 = list6;
                            j = j3;
                        } catch (CancellationException e2) {
                            e = e2;
                            str = "CXCP";
                            i = 3;
                            if (tvj.f(i, str)) {
                                Log.d(str, "Cannot acquire the CameraGraph.Session", e);
                            }
                            return uli.l;
                        }
                    }
                    objG2 = cf2.g(cf2Var, list3, list2, list, null, jd9Var, null, oeVar, null, j, j, this, 7175);
                    if (objG2 == hu4Var) {
                        return hu4Var;
                    }
                    autoCloseable4 = autoCloseable2;
                    xf5 xf5Var2 = (xf5) objG2;
                    p90.f(autoCloseable4, null);
                    return xf5Var2;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    autoCloseable3 = autoCloseable2;
                    throw th;
                }
                cf2Var = (cf2) autoCloseable;
                this.e = autoCloseable;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.k = 2;
                autoCloseable2 = autoCloseable;
                str2 = "CXCP";
            } catch (Throwable th7) {
                th = th7;
                str2 = "CXCP";
                autoCloseable2 = autoCloseable;
            }
            autoCloseable = (AutoCloseable) objG;
        } catch (CancellationException e3) {
            e = e3;
            str = str2;
            i = 3;
            if (tvj.f(i, str)) {
                Log.d(str, "Cannot acquire the CameraGraph.Session", e);
            }
            return uli.l;
        }
    }
}
