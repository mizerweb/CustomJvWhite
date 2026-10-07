package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import one.me.deeplink.InvalidDeeplinkNamingException;

/* JADX INFO: loaded from: classes.dex */
public final class o65 {
    public final ny8 b;
    public boolean d;
    public final String a = o65.class.getName();
    public final ArrayList c = new ArrayList();

    public o65(ny8 ny8Var) {
        this.b = ny8Var;
    }

    public static /* synthetic */ boolean c(o65 o65Var, String str, Bundle bundle, ha9 ha9Var, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            ha9Var = null;
        }
        return o65Var.b(str, bundle, ha9Var);
    }

    public static /* synthetic */ boolean e(o65 o65Var, Uri uri, Bundle bundle, ha9 ha9Var, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            ha9Var = null;
        }
        return o65Var.d(uri, bundle, ha9Var);
    }

    public final c1c a() {
        return (c1c) this.b.getValue();
    }

    public final boolean b(String str, Bundle bundle, ha9 ha9Var) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ore.k("try to open new screen from background thread");
            return false;
        }
        if (r5h.o1(str, ':')) {
            return d(wk8.e(str), bundle, ha9Var);
        }
        String str2 = this.a;
        String strConcat = "Trying to open invalid app route=".concat(str);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, str2, strConcat, null, null, 8);
        }
        throw new InvalidDeeplinkNamingException(str);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x022c A[LOOP:1: B:67:0x0186->B:103:0x022c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:135:0x0302  */
    /* JADX WARN: Code duplicated, block: B:138:0x0309  */
    /* JADX WARN: Code duplicated, block: B:140:0x0313  */
    /* JADX WARN: Code duplicated, block: B:141:0x031e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0321  */
    /* JADX WARN: Code duplicated, block: B:146:0x0343  */
    /* JADX WARN: Code duplicated, block: B:150:0x0359 A[LOOP:6: B:144:0x033a->B:150:0x0359, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0369  */
    /* JADX WARN: Code duplicated, block: B:155:0x0393  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a1 A[LOOP:7: B:153:0x038a->B:157:0x03a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:167:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:171:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:180:0x0401  */
    /* JADX WARN: Code duplicated, block: B:213:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:214:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:288:0x060e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0630  */
    /* JADX WARN: Code duplicated, block: B:301:0x0654  */
    /* JADX WARN: Code duplicated, block: B:303:0x065c  */
    /* JADX WARN: Code duplicated, block: B:389:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x03c6 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v72 java.lang.Object, still in use, count: 2, list:
          (r5v72 java.lang.Object) from 0x02f7: PHI (r5 I:??) = (r5v59 java.lang.Object), (r5v72 java.lang.Object) binds: [B:131:0x02f6, B:398:0x02f7] A[DONT_GENERATE, DONT_INLINE]
          (r5v72 java.lang.Object) from 0x02e7: CHECK_CAST (c65) (r5v72 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final boolean d(android.net.Uri r30, android.os.Bundle r31, defpackage.ha9 r32) {
        /*
            Method dump skipped, instruction units count: 2108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o65.d(android.net.Uri, android.os.Bundle, ha9):boolean");
    }

    public final boolean f() {
        lve lveVar;
        if (a().d() <= 1) {
            return false;
        }
        c1c c1cVarA = a();
        LinkedList linkedList = c1cVarA.d;
        if (c1cVarA.c) {
            if (!linkedList.isEmpty()) {
                linkedList.remove(linkedList.size() - 1);
            }
            return true;
        }
        if (c1cVarA.d() <= 1 || (lveVar = (lve) ww3.D1(c1cVarA.c().w1().e())) == null || lveVar.a == null) {
            return false;
        }
        return c1cVarA.c().w1().D();
    }

    public final void g(af7 af7Var) {
        Object poeVar;
        this.d = true;
        ArrayList arrayList = this.c;
        arrayList.clear();
        try {
            af7Var.invoke();
            this.d = false;
            c1c c1cVarA = a();
            List listT1 = ww3.T1(arrayList);
            c1cVarA.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listT1.iterator();
            while (it.hasNext()) {
                try {
                    poeVar = c1c.a((u65) it.next(), true);
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                if (poeVar instanceof poe) {
                    poeVar = null;
                }
                lve lveVar = (lve) poeVar;
                if (lveVar != null) {
                    arrayList2.add(lveVar);
                }
            }
            c1cVarA.c().w1().R(arrayList2, new no9(0));
            arrayList.clear();
        } catch (Throwable th2) {
            this.d = false;
            throw th2;
        }
    }
}
