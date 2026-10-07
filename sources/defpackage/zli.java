package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class zli {
    public final hmi a;
    public final plh b;
    public i64 d;
    public boolean g;
    public pme l;
    public oe m;
    public pe n;
    public ql0 o;
    public final Object c = new Object();
    public final g40 e = gvk.b(0);
    public final zv f = new zv();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashSet j = new LinkedHashSet();
    public final LinkedHashSet k = new LinkedHashSet();
    public final vli p = new vli(this);
    public final g40 q = gvk.b(0);

    public zli(hmi hmiVar, plh plhVar) {
        this.a = hmiVar;
        this.b = plhVar;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b A[Catch: all -> 0x0154, TRY_LEAVE, TryCatch #2 {, blocks: (B:69:0x0147, B:71:0x014b), top: B:86:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0131, please report this as an issue */
    public final Object a(nq4 nq4Var) {
        xli xliVar;
        wfe wfeVar;
        i64 i64Var;
        fle fleVar;
        i64 i64Var2;
        int iIncrementAndGet;
        if (nq4Var instanceof xli) {
            xliVar = (xli) nq4Var;
            int i = xliVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xliVar.g = i - Integer.MIN_VALUE;
            } else {
                xliVar = new xli(this, nq4Var);
            }
        } else {
            xliVar = new xli(this, nq4Var);
        }
        Object objG = xliVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = xliVar.g;
        if (i2 == 0) {
            wfe wfeVarP = nbh.p(objG);
            try {
                ze2 ze2VarA = this.a.a();
                xliVar.d = wfeVarP;
                xliVar.g = 1;
                objG = ze2VarA.g(xliVar);
                if (objG == hu4Var) {
                    return hu4Var;
                }
                wfeVar = wfeVarP;
            } catch (CancellationException e) {
                e = e;
                wfeVar = wfeVarP;
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Cannot acquire session at " + this, e);
                }
                synchronized (this.c) {
                    if (this.g) {
                        this.g = false;
                        wfeVar.a = this.d;
                        this.d = null;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wfeVar = xliVar.d;
            try {
                ch3.d0(objG);
            } catch (CancellationException e2) {
                e = e2;
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Cannot acquire session at " + this, e);
                }
                synchronized (this.c) {
                    if (this.g) {
                        this.g = false;
                        wfeVar.a = this.d;
                        this.d = null;
                    }
                }
                i64Var = (i64) wfeVar.a;
                if (i64Var != null) {
                    i64Var.Q(sbi.a);
                }
                return sbi.a;
            }
        }
        AutoCloseable autoCloseable = (AutoCloseable) objG;
        try {
            cf2 cf2Var = (cf2) autoCloseable;
            synchronized (this.c) {
                if (this.j.isEmpty()) {
                    fleVar = null;
                } else {
                    pme pmeVar = this.l;
                    List listT1 = ww3.T1(this.j);
                    LinkedHashMap linkedHashMapT0 = wm9.T0(this.b.b(this.l), wm9.X0(this.h));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(this.i);
                    kwa kwaVar = ihh.b;
                    g40 g40Var = this.e;
                    g40Var.getClass();
                    linkedHashMap.put(kwaVar, new Integer(g40.b.incrementAndGet(g40Var)));
                    ArrayList arrayList = new ArrayList(this.k);
                    arrayList.add(this.p);
                    fleVar = new fle(listT1, linkedHashMapT0, linkedHashMap, arrayList, pmeVar, 32);
                }
                i64Var2 = this.d;
                this.g = false;
                this.d = null;
            }
            if (fleVar == null) {
                cf2Var.A();
                wfeVar.a = i64Var2;
            } else {
                if (i64Var2 != null) {
                    synchronized (this.c) {
                        this.f.addLast(new wli(this.e.a, i64Var2));
                        g40 g40Var2 = this.q;
                        g40Var2.getClass();
                        iIncrementAndGet = g40.b.incrementAndGet(g40Var2);
                    }
                    new Integer(iIncrementAndGet);
                }
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Update RepeatingRequest: " + fleVar);
                }
                if (cf2Var.a.a()) {
                    c.p(cf2Var, " after close.", "Cannot call startRepeating on ");
                } else {
                    cf2Var.b.d(fleVar);
                }
                b(cf2Var, fleVar.b);
            }
            p90.f(autoCloseable, null);
            i64Var = (i64) wfeVar.a;
            if (i64Var != null) {
                i64Var.Q(sbi.a);
            }
            return sbi.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(autoCloseable, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(cf2 cf2Var, Map map) {
        oe oeVarC;
        pe peVar;
        Object next;
        Object obj = null;
        Object obj2 = map != null ? map.get(CaptureRequest.CONTROL_AE_MODE) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            List list = oe.b;
            oeVarC = trk.c(iIntValue);
        } else {
            oeVarC = null;
        }
        Object obj3 = map != null ? map.get(CaptureRequest.CONTROL_AF_MODE) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Iterator it = pe.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((pe) next).a != iIntValue2);
            peVar = (pe) next;
        } else {
            peVar = null;
        }
        Object obj4 = map != null ? map.get(CaptureRequest.CONTROL_AWB_MODE) : null;
        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (Object obj5 : ql0.b) {
                if (((ql0) obj5).a == iIntValue3) {
                    obj = obj5;
                    break;
                }
            }
            obj = (ql0) obj;
        }
        ql0 ql0Var = obj;
        boolean z = false;
        boolean z2 = (oeVarC == null || oeVarC.equals(this.m)) ? false : true;
        boolean z3 = (peVar == null || peVar.equals(this.n)) ? false : true;
        if (ql0Var != 0 && !ql0Var.equals(this.o)) {
            z = true;
        }
        if (z2 || z3 || z) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + oeVarC + ", changed=" + z2 + "), AF(" + peVar + ", changed=" + z3 + "), AWB(" + ql0Var + ", changed=" + z + ')');
            }
            ie2.b(cf2Var, oeVarC, peVar, ql0Var, null, null, null, 56);
            if (oeVarC != null) {
                this.m = oeVarC;
            }
            if (peVar != null) {
                this.n = peVar;
            }
            if (ql0Var != 0) {
                this.o = ql0Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(LinkedHashMap linkedHashMap, Map map, Set set, pme pmeVar, Set set2, nq4 nq4Var) {
        yli yliVar;
        wfe wfeVar;
        if (nq4Var instanceof yli) {
            yliVar = (yli) nq4Var;
            int i = yliVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                yliVar.g = i - Integer.MIN_VALUE;
            } else {
                yliVar = new yli(this, nq4Var);
            }
        } else {
            yliVar = new yli(this, nq4Var);
        }
        Object obj = yliVar.e;
        Object obj2 = hu4.a;
        int i2 = yliVar.g;
        if (i2 == 0) {
            wfe wfeVarP = nbh.p(obj);
            synchronized (this.c) {
                try {
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "UseCaseCameraState#updateState: parameters = " + linkedHashMap + ", internalParameters = " + map + ", streams = " + set + ", template = " + pmeVar);
                    }
                    if (linkedHashMap != null) {
                        this.h.clear();
                        this.h.putAll(linkedHashMap);
                    }
                    if (map != null) {
                        this.i.clear();
                        this.i.putAll(map);
                    }
                    if (set != null) {
                        this.j.clear();
                        this.j.addAll(set);
                    }
                    if (pmeVar != null) {
                        this.l = pmeVar;
                    }
                    if (set2 != null) {
                        this.k.clear();
                        this.k.addAll(set2);
                    }
                    if (this.d == null) {
                        this.d = new i64();
                    }
                    if (this.g) {
                        return this.d;
                    }
                    this.g = true;
                    wfeVarP.a = this.d;
                    yliVar.d = wfeVarP;
                    yliVar.g = 1;
                    if (a(yliVar) == obj2) {
                        return obj2;
                    }
                    wfeVar = wfeVarP;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wfeVar = yliVar.d;
            ch3.d0(obj);
        }
        return wfeVar.a;
    }
}
