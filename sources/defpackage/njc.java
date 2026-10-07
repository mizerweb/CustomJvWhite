package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class njc implements AutoCloseable {
    public final du3 a;
    public final qjc b;
    public boolean d;
    public final Object c = new Object();
    public long e = 1;
    public long f = Long.MIN_VALUE;
    public long g = Long.MIN_VALUE;
    public long h = Long.MIN_VALUE;
    public long i = Long.MIN_VALUE;
    public final ArrayList j = new ArrayList();
    public final LinkedHashMap k = new LinkedHashMap();

    public njc(du3 du3Var, qjc qjcVar) {
        this.a = du3Var;
        this.b = qjcVar;
    }

    public final void b(long j) {
        synchronized (this.c) {
            try {
                if (this.d) {
                    return;
                }
                this.h = j;
                Iterator it = this.j.iterator();
                mjc mjcVar = null;
                boolean z = false;
                Object obj = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (z) {
                            break;
                        }
                    } else {
                        Object next = it.next();
                        if (((mjc) next).b == j) {
                            if (!z) {
                                obj = next;
                                z = true;
                            }
                        }
                    }
                    obj = null;
                    break;
                }
                mjc mjcVar2 = (mjc) obj;
                if (mjcVar2 != null) {
                    this.i = mjcVar2.e;
                    this.j.remove(mjcVar2);
                    mjcVar = mjcVar2;
                }
                if (mjcVar != null) {
                    mjcVar.a(-1L, new tjc(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.d = true;
            ArrayList arrayList = new ArrayList(this.k.values());
            this.k.clear();
            ArrayList<mjc> arrayList2 = new ArrayList(this.j);
            this.j.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj = ((rjc) it.next()).a;
                du3 du3Var = this.a;
                if (!rjc.a(obj)) {
                    obj = null;
                }
                du3Var.a(obj);
            }
            for (mjc mjcVar : arrayList2) {
                mjcVar.getClass();
                mjcVar.a(-1L, new tjc(11));
            }
        }
    }

    public final void g(long j, Object obj) throws Exception {
        njc njcVar;
        Object rjcVar;
        ArrayList<mjc> arrayList;
        Object next;
        synchronized (this.c) {
            try {
                if (this.d || this.b.a(this.i, j)) {
                    njcVar = this;
                    rjcVar = new rjc(obj);
                } else {
                    Iterator it = this.j.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!this.b.a(((mjc) next).e, j));
                    mjc mjcVar = (mjc) next;
                    if (mjcVar != null) {
                        njcVar = this;
                        ArrayList arrayListY = njcVar.y(mjcVar.d, mjcVar.e, mjcVar.a);
                        mjcVar.a(j, obj);
                        njcVar.j.remove(mjcVar);
                        arrayList = arrayListY;
                        rjcVar = null;
                    } else {
                        njcVar = this;
                        njcVar.k.put(Long.valueOf(j), new rjc(obj));
                        if (njcVar.k.size() > 3) {
                            rjcVar = njcVar.k.remove(Long.valueOf(((Number) ww3.q1(njcVar.k.keySet())).longValue()));
                        } else {
                            rjcVar = null;
                            arrayList = null;
                        }
                    }
                }
                arrayList = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        rjc rjcVar2 = (rjc) rjcVar;
        if (rjcVar2 != null) {
            Object obj2 = rjcVar2.a;
            Object obj3 = rjc.a(obj2) ? obj2 : null;
            if (obj3 != null) {
                njcVar.a.a(obj3);
            }
        }
        if (arrayList != null) {
            for (mjc mjcVar2 : arrayList) {
                mjcVar2.getClass();
                mjcVar2.a(-1L, new tjc(12));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167 A[LOOP:2: B:79:0x0161->B:81:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:86:0x0189  */
    /* JADX WARN: Code duplicated, block: B:88:0x018c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0195  */
    /* JADX WARN: Code duplicated, block: B:93:0x019f  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    public final void l(long j, long j2, long j3, ljc ljcVar) throws Exception {
        Object next;
        Object obj;
        njc njcVar;
        Object next2;
        rjc rjcVar;
        ArrayList<mjc> arrayListY;
        Object objRemove;
        boolean z;
        rjc rjcVar2;
        Object tjcVar;
        Object obj2;
        Object obj3;
        Object next3;
        Object obj4 = this.c;
        synchronized (obj4) {
            try {
                Iterator it = this.j.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((mjc) next).b == j));
                mjc mjcVar = (mjc) next;
                if (mjcVar != null) {
                    Log.w("CXCP", "onOutputStarted was invoked multiple times with a previously started output!onOutputStarted with " + ((Object) tc7.a(j)) + ", " + ((Object) ("CameraTimestamp(value=" + j2 + ')')) + ", " + j3 + ". Previously started output: " + mjcVar + ". Ignoring.");
                    return;
                }
                boolean z2 = this.d;
                long j4 = this.e;
                this.e = j4 + 1;
                try {
                    if (!z2 && this.h != j && this.i != j3) {
                        boolean z3 = j < this.g;
                        if (!z3) {
                            this.g = j;
                        }
                        boolean z4 = j3 < this.f;
                        if (!z4) {
                            this.f = j3;
                        }
                        boolean z5 = z3 || z4;
                        Iterator it2 = this.k.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = obj4;
                                next3 = null;
                                break;
                            } else {
                                next3 = it2.next();
                                obj = obj4;
                                if (this.b.a(j3, ((Number) next3).longValue())) {
                                    break;
                                } else {
                                    obj4 = obj;
                                }
                            }
                        }
                        Long l = (Long) next3;
                        if (l != null) {
                            objRemove = this.k.remove(l);
                            arrayListY = y(j4, j3, z5);
                            njcVar = this;
                            rjcVar = null;
                        } else {
                            njcVar = this;
                            njcVar.j.add(new mjc(z5, j, j2, j4, j3, ljcVar));
                            z = false;
                            rjcVar = null;
                            arrayListY = null;
                            objRemove = null;
                        }
                        if (arrayListY != null) {
                            for (mjc mjcVar2 : arrayListY) {
                                mjcVar2.getClass();
                                mjcVar2.a(-1L, new tjc(12));
                            }
                        }
                        if (rjcVar != null) {
                            obj2 = rjcVar.a;
                            if (rjc.a(obj2)) {
                                obj3 = obj2;
                            } else {
                                obj3 = null;
                            }
                            if (obj3 != null) {
                                njcVar.a.a(obj3);
                            }
                        }
                        if (z) {
                            if (z2) {
                                tjcVar = new tjc(11);
                            } else {
                                rjcVar2 = (rjc) objRemove;
                                if (rjcVar2 != null) {
                                    tjcVar = rjcVar2.a;
                                } else {
                                    tjcVar = new tjc(10);
                                }
                            }
                            ljcVar.d(tjcVar);
                        }
                    }
                    obj = obj4;
                    njcVar = this;
                    Iterator it3 = njcVar.k.keySet().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!njcVar.b.a(j3, ((Number) next2).longValue()));
                    Long l2 = (Long) next2;
                    rjcVar = l2 != null ? (rjc) njcVar.k.remove(l2) : null;
                    arrayListY = null;
                    objRemove = null;
                    z = true;
                    if (arrayListY != null) {
                        while (r1.hasNext()) {
                            mjcVar2.getClass();
                            mjcVar2.a(-1L, new tjc(12));
                        }
                    }
                    if (rjcVar != null) {
                        obj2 = rjcVar.a;
                        if (rjc.a(obj2)) {
                            obj3 = obj2;
                        } else {
                            obj3 = null;
                        }
                        if (obj3 != null) {
                            njcVar.a.a(obj3);
                        }
                    }
                    if (z) {
                        if (z2) {
                            tjcVar = new tjc(11);
                        } else {
                            rjcVar2 = (rjc) objRemove;
                            if (rjcVar2 != null) {
                                tjcVar = rjcVar2.a;
                            } else {
                                tjcVar = new tjc(10);
                            }
                        }
                        ljcVar.d(tjcVar);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final ArrayList y(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j;
        for (Object obj : arrayList2) {
            mjc mjcVar = (mjc) obj;
            if (mjcVar.a == z && mjcVar.d < j && mjcVar.e < j2) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
