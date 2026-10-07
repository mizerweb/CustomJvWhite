package defpackage;

import android.util.Log;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class nmi {
    public final omi a;
    public final lg2 b;
    public final xb8 c;
    public final nmf d;
    public yf5 f;
    public LinkedHashMap h;
    public i64 i;
    public final Object e = new Object();
    public final LinkedHashMap g = new LinkedHashMap();

    public nmi(omi omiVar, lg2 lg2Var, xb8 xb8Var, nmf nmfVar) {
        this.a = omiVar;
        this.b = lg2Var;
        this.c = xb8Var;
        this.d = nmfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(nmi nmiVar, List list, long j, nq4 nq4Var) {
        mmi mmiVar;
        if (nq4Var instanceof mmi) {
            mmiVar = (mmi) nq4Var;
            int i = mmiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mmiVar.f = i - Integer.MIN_VALUE;
            } else {
                mmiVar = new mmi(nmiVar, nq4Var);
            }
        } else {
            mmiVar = new mmi(nmiVar, nq4Var);
        }
        Object objL0 = mmiVar.d;
        int i2 = mmiVar.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objL0);
            fpf fpfVar = new fpf(list, lq4Var, 16);
            mmiVar.f = 1;
            objL0 = lvb.L0(j, fpfVar, mmiVar);
            hu4 hu4Var = hu4.a;
            if (objL0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objL0);
        }
        List list2 = (List) objL0;
        return list2 == null ? r66.a : list2;
    }

    public static final void b(nmi nmiVar) {
        Set setKeySet;
        fi2 fi2VarA = nmiVar.b.a();
        synchronized (fi2VarA.a) {
            try {
                fi2VarA.c.add(nmiVar);
                LinkedHashMap linkedHashMap = fi2VarA.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap2.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            nmiVar.d((Surface) it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(nmi nmiVar, nq4 nq4Var) throws Throwable {
        lmi lmiVar;
        if (nq4Var instanceof lmi) {
            lmiVar = (lmi) nq4Var;
            int i = lmiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmiVar.f = i - Integer.MIN_VALUE;
            } else {
                lmiVar = new lmi(nmiVar, nq4Var);
            }
        } else {
            lmiVar = new lmi(nmiVar, nq4Var);
        }
        Object obj = lmiVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = lmiVar.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            synchronized (nmiVar.e) {
                yf5 yf5Var = nmiVar.f;
                if (yf5Var == null || nmiVar.i != null) {
                    return Boolean.FALSE;
                }
                lmiVar.f = 1;
                Object objP = yf5Var.p(lmiVar);
                return objP == hu4Var ? hu4Var : objP;
            }
        } catch (CancellationException unused) {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "Surface setup was cancelled");
            }
            return Boolean.FALSE;
        }
    }

    public final void d(Surface surface) {
        wf5 wf5Var;
        synchronized (this.e) {
            try {
                LinkedHashMap linkedHashMap = this.h;
                if (linkedHashMap != null && (wf5Var = (wf5) linkedHashMap.get(surface)) != null && !this.g.containsKey(surface)) {
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "SurfaceActive " + wf5Var + " in " + this);
                    }
                    this.g.put(surface, wf5Var);
                    try {
                        wf5Var.d();
                    } catch (DeferrableSurface$SurfaceClosedException e) {
                        if (tvj.f(5, "CXCP")) {
                            Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e);
                        }
                        this.d.a(e.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.e) {
            try {
                if (this.g.isEmpty() && this.h == null) {
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    fi2 fi2VarA = this.b.a();
                    synchronized (fi2VarA.a) {
                        fi2VarA.c.remove(this);
                    }
                    i64 i64Var = this.i;
                    if (i64Var != null) {
                        i64Var.Q(sbi.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
