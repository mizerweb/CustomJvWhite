package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xp7 implements Closeable {
    public final xe2 a;
    public final Map b;
    public final Map c;
    public final List d;
    public final gu4 e;
    public final dq4 f;
    public final g85 g;
    public final Object h;
    public volatile boolean i;
    public j28 j;
    public fle k;
    public final Map l;
    public final b40 m;
    public fle n;
    public Map o;
    public Map p;
    public Map q;
    public final List r;
    public j28 s;

    public xp7(xe2 xe2Var, Map map, Map map2, ArrayList arrayList, List list, gu4 gu4Var, xt4 xt4Var) {
        this.a = xe2Var;
        this.b = map;
        this.c = map2;
        this.d = list;
        this.e = gu4Var;
        dq4 dq4VarA = cqk.a(lvb.x0(xt4Var, new du4("CXCP-GraphLoop")));
        this.f = dq4VarA;
        int i = 0;
        n61 n61Var = new n61(1, this, xp7.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", i, 29);
        m20 m20Var = new m20(2, this, xp7.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, 22);
        g85 g85Var = new g85();
        g85Var.a = n61Var;
        g85Var.b = m20Var;
        g85Var.c = gvk.a(false);
        g85Var.d = yab.b(Integer.MAX_VALUE, 0, new p7d(4, g85Var), 2);
        g85Var.e = new zv();
        lq4 lq4Var = null;
        if (!((b40) g85Var.c).a()) {
            ore.k("ProcessingQueue cannot be re-started!");
            throw null;
        }
        if (yab.i0(dq4VarA, null, 0, new ur8(g85Var, lq4Var, 19), 3).isCancelled()) {
            g85Var.Q(null);
        }
        this.g = g85Var;
        this.h = new Object();
        s66 s66Var = s66.a;
        this.l = s66Var;
        this.m = gvk.a(true);
        this.o = s66Var;
        this.p = s66Var;
        this.q = map2;
        this.r = arrayList;
    }

    public final void A(List list, int i, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 >= i3) {
                if (!z || (i2 = i + 1) >= list.size()) {
                    return;
                }
                rp7 rp7Var = (rp7) list.get(i2);
                if (rp7Var instanceof lp7) {
                    y(list, i2, (lp7) rp7Var, false);
                    return;
                } else {
                    if (rp7Var instanceof qp7) {
                        K(list, i2, (qp7) rp7Var);
                        return;
                    }
                    return;
                }
            }
            rp7 rp7Var2 = (rp7) list.get(i3);
            if (rp7Var2 instanceof op7) {
                fle fleVar = ((op7) rp7Var2).a;
                if (g(true, Collections.singletonList(fleVar), s66.a)) {
                    this.n = fleVar;
                    list.remove(i3);
                    while (i4 < i3) {
                        if (((rp7) list.get(i4)) instanceof op7) {
                            list.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
            }
            i3--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ee -> B:36:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f6 -> B:37:0x00f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0102 -> B:41:0x0104). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object E(java.util.List r18, int r19, defpackage.pp7 r20, defpackage.lq4 r21) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp7.E(java.util.List, int, pp7, lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4 A[PHI: r3 r9 r13
  0x00e4: PHI (r3v5 int) = (r3v3 int), (r3v8 int) binds: [B:32:0x00a6, B:47:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r9v10 java.util.List) = (r9v9 java.util.List), (r9v11 java.util.List) binds: [B:32:0x00a6, B:47:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r13v6 int) = (r13v5 int), (r13v7 int) binds: [B:32:0x00a6, B:47:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:48:0x00e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cd -> B:47:0x00e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00df -> B:47:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object I(java.util.List r13, defpackage.lq4 r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp7.I(java.util.List, lq4):java.lang.Object");
    }

    public final void K(List list, int i, qp7 qp7Var) {
        fle fleVar = this.n;
        if (fleVar == null && i == 0) {
            list.remove(i);
            return;
        }
        if (this.m.b() && fleVar != null && g(false, Collections.singletonList(fleVar), qp7Var.a)) {
            list.remove(i);
            return;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (((rp7) list.get(i2)) instanceof op7) {
                A(list, i2, false);
            } else {
                ore.k("Check failed.");
            }
        }
    }

    public final boolean P() {
        Boolean boolValueOf;
        j28 j28Var = this.s;
        if (j28Var == null) {
            return false;
        }
        fle fleVar = this.n;
        if (fleVar != null) {
            boolValueOf = Boolean.valueOf(j28Var.C(true, Collections.singletonList(fleVar), this.b, this.o, this.q, this.r));
        } else {
            boolValueOf = null;
        }
        return cqk.d(boolValueOf, Boolean.TRUE);
    }

    public final void W(boolean z) {
        this.m.a = z ? 1 : 0;
        if (z) {
            this.g.V(kp7.b);
        }
    }

    public final void Y(j28 j28Var) {
        synchronized (this.h) {
            j28 j28Var2 = this.j;
            this.j = j28Var;
            if (this.i) {
                lq4 lq4Var = null;
                this.j = null;
                if (j28Var != null) {
                    yab.i0(this.e, null, 0, new up7(j28Var, lq4Var, 1), 3);
                }
                return;
            }
            if (j28Var2 != j28Var) {
                this.g.V(new pp7(j28Var2, j28Var));
            }
            if (j28Var == null) {
                int size = this.d.size();
                for (int i = 0; i < size; i++) {
                    ((tp7) this.d.get(i)).c();
                }
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fle fleVar = (fle) arrayList.get(i);
            List list = this.r;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((cle) list.get(i2)).o0(fleVar);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            fle fleVar2 = (fle) arrayList.get(i3);
            int size4 = fleVar2.d.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((cle) fleVar2.d.get(i4)).o0(fleVar2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            try {
                if (this.i) {
                    return;
                }
                this.i = true;
                j28 j28Var = this.j;
                int i = 0;
                lq4 lq4Var = null;
                if (j28Var != null) {
                    yab.i0(this.e, null, 0, new up7(j28Var, lq4Var, i), 3);
                }
                this.j = null;
                this.g.V(kp7.c);
                int size = this.d.size();
                while (i < size) {
                    ((tp7) this.d.get(i)).d();
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(boolean z, List list, Map map) throws Exception {
        Map mapB;
        j28 j28Var = this.s;
        if (j28Var == null) {
            return false;
        }
        Map map2 = this.o;
        if (map.isEmpty()) {
            mapB = this.q;
        } else {
            ul9 ul9Var = new ul9();
            ul9Var.putAll(this.p);
            ul9Var.putAll(map);
            ul9Var.putAll(this.c);
            mapB = ul9Var.b();
        }
        boolean zC = j28Var.C(z, list, this.b, map2, mapB, this.r);
        if (!zC) {
            if (z) {
                Log.w("CXCP", "Failed to repeat with " + ww3.K1(list));
                return zC;
            }
            if (map.isEmpty()) {
                Log.w("CXCP", "Failed to submit capture with " + list);
                return zC;
            }
            Log.w("CXCP", "Failed to trigger with " + ww3.K1(list) + " and " + map);
        }
        return zC;
    }

    public final fle l() {
        fle fleVar;
        synchronized (this.h) {
            fleVar = this.k;
        }
        return fleVar;
    }

    public final String toString() {
        return "GraphLoop(" + this.a + ')';
    }

    public final void y(List list, int i, lp7 lp7Var, boolean z) {
        if (this.m.b() && g(false, lp7Var.a, s66.a)) {
            list.remove(i);
            return;
        }
        if (!z || i <= 0) {
            return;
        }
        int i2 = i - 1;
        if (((rp7) list.get(i2)) instanceof op7) {
            A(list, i2, false);
        } else {
            ore.k("Check failed.");
        }
    }
}
