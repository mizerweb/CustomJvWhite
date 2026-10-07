package defpackage;

import android.content.Intent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class jl8 {
    public final rre a;
    public final String[] b;
    public final nub c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final j68 f;
    public final j68 g;
    public final qg7 h;
    public Intent i;
    public i5b j;
    public final Object k;

    public jl8(rre rreVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = rreVar;
        this.b = strArr;
        nub nubVar = new nub(rreVar, linkedHashMap, linkedHashMap2, strArr, rreVar.k, new oo3(1, this, jl8.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 4));
        this.c = nubVar;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new j68(this, 2);
        this.g = new j68(this, 3);
        this.h = new qg7(rreVar);
        this.k = new Object();
        nubVar.k = new d2(27, this);
    }

    public final boolean a(hl8 hl8Var) {
        LinkedHashMap linkedHashMap = this.d;
        String[] strArrA = hl8Var.a();
        nub nubVar = this.c;
        ylc ylcVarL = nubVar.l(strArrA);
        String[] strArr = (String[]) ylcVarL.a;
        int[] iArr = (int[]) ylcVarL.b;
        vrb vrbVar = new vrb(hl8Var, iArr, strArr);
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            vrb vrbVar2 = linkedHashMap.containsKey(hl8Var) ? (vrb) wm9.N0(linkedHashMap, hl8Var) : (vrb) linkedHashMap.put(hl8Var, vrbVar);
            reentrantLock.unlock();
            return vrbVar2 == null && ((prb) nubVar.h).a(iArr);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(hl8 hl8Var) {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            vrb vrbVar = (vrb) this.d.remove(hl8Var);
            reentrantLock.unlock();
            if (vrbVar != null) {
                if (((prb) this.c.h).b(vrbVar.a())) {
                    lvb.z0(new il8(this, null, 1));
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Object c(mdh mdhVar) throws Throwable {
        Object objK = this.c.k(mdhVar);
        return objK == hu4.a ? objK : sbi.a;
    }
}
