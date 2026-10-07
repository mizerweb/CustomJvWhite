package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class wed {
    public final gu4 a;
    public final ConcurrentHashMap.KeySetView b;
    public final AtomicLong c;
    public final AtomicInteger d;
    public final ConcurrentHashMap.KeySetView e;
    public final p41 f;
    public final String g;
    public final boolean h;
    public final ConcurrentHashMap.KeySetView i;

    public wed(gu4 gu4Var, String str, int i, int i2) {
        this.a = gu4Var;
        this.b = ConcurrentHashMap.newKeySet();
        this.c = new AtomicLong(0L);
        this.d = new AtomicInteger();
        this.e = ConcurrentHashMap.newKeySet();
        p41 p41VarA = yab.a(i, i2, new g3(25, this));
        this.f = p41VarA;
        this.g = str.length() == 0 ? getClass().getName() : zo5.p(getClass().getName(), "-", str);
        ghb ghbVar = ew5.b;
        lw5 lw5Var = lw5.SECONDS;
        qe7.O(1, lw5Var);
        qe7.O(3, lw5Var);
        this.h = true;
        e9i.j0(e9i.p(new fz6(tre.N(new dab(new dab(new dab(new tz(12, e9i.E(p41VarA)), this, 5), this, 6), this, 7), qe7.O(1, lw5Var), new z00(3, this)), new h2c(this, null, 2), 3)), gu4Var);
        this.i = ConcurrentHashMap.newKeySet();
    }

    public final void d(Object obj) {
        this.e.add(obj);
        p(obj);
    }

    public final Object e(Object obj, LinkedHashSet linkedHashSet, nq4 nq4Var) {
        sbi sbiVar = sbi.a;
        linkedHashSet.removeAll(this.b);
        boolean zIsEmpty = linkedHashSet.isEmpty();
        String str = this.g;
        if (zIsEmpty) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, c0a.n(obj, "fetchImmediately fail, values are empty "), null);
                    return sbiVar;
                }
            }
        } else {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str, "fetchImmediately for " + obj + "|" + linkedHashSet, null);
                }
            }
            Object objS = s(obj, linkedHashSet, nq4Var);
            if (objS == hu4.a) {
                return objS;
            }
        }
        return sbiVar;
    }

    public void f(LinkedHashSet linkedHashSet) {
    }

    public long g() {
        return System.currentTimeMillis();
    }

    public Set h() {
        return c76.a;
    }

    public int i() {
        return j();
    }

    public abstract int j();

    public boolean k() {
        return this.h;
    }

    public long l() {
        ghb ghbVar = ew5.b;
        return qe7.O(10, lw5.SECONDS);
    }

    public void m(Object obj, List list, Throwable th) {
    }

    public abstract Object n(Object obj, List list, Object obj2, qed qedVar);

    public abstract Object o(Object obj, List list, gz gzVar);

    public void p(Object obj) {
    }

    public final Object q(Long l, Object obj, nq4 nq4Var) {
        Object objR = r(l, Collections.singletonList(obj), nq4Var);
        return objR == hu4.a ? objR : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object r(Object obj, Collection collection, nq4 nq4Var) {
        oed oedVar;
        wed wedVar;
        ned nedVar;
        String str;
        a4c a4cVar;
        je9 je9Var = je9.e;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof oed) {
            oedVar = (oed) nq4Var;
            int i = oedVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                oedVar.i = i - Integer.MIN_VALUE;
            } else {
                oedVar = new oed(this, nq4Var);
            }
        } else {
            oedVar = new oed(this, nq4Var);
        }
        Object obj2 = oedVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = oedVar.i;
        if (i2 != 0) {
            if (i2 == 1) {
                ArrayList arrayList = (ArrayList) oedVar.f;
                wed wedVar2 = oedVar.e;
                Object obj3 = oedVar.d;
                ch3.d0(obj2);
                collection = arrayList;
                this = wedVar2;
                obj = obj3;
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nedVar = (ned) oedVar.f;
                wedVar = oedVar.e;
                ch3.d0(obj2);
            }
            str = wedVar.g;
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "prefetch: channel.send finished " + nedVar, null);
            }
            return sbiVar;
        }
        ch3.d0(obj2);
        while (true) {
            if (collection.isEmpty()) {
                gm0.Y(this.getClass().getName(), "prefetch: values are empty");
                return sbiVar;
            }
            if (this.e.remove(obj)) {
                gm0.x(this.g, "prefetch: removed cancelled #" + obj, null);
            }
            boolean zAdd = this.i.add(obj);
            if (!this.k() || !zAdd) {
                break;
            }
            ArrayList arrayList2 = new ArrayList(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.i());
            while (!arrayList2.isEmpty() && linkedHashSet.size() < this.i()) {
                linkedHashSet.add(arrayList2.remove(0));
            }
            oedVar.d = obj;
            oedVar.e = this;
            oedVar.f = arrayList2;
            oedVar.i = 1;
            if (this.e(obj, linkedHashSet, oedVar) != hu4Var) {
                collection = arrayList2;
            }
            return hu4Var;
        }
        ned nedVar2 = new ned(obj, collection);
        String str2 = this.g;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "prefetch: channel.send " + nedVar2, null);
        }
        p41 p41Var = this.f;
        oedVar.d = null;
        oedVar.e = this;
        oedVar.f = nedVar2;
        oedVar.i = 2;
        if (p41Var.a(oedVar, nedVar2) != hu4Var) {
            wedVar = this;
            nedVar = nedVar2;
            str = wedVar.g;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var, str, "prefetch: channel.send finished " + nedVar, null);
            }
            return sbiVar;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0130 A[Catch: all -> 0x017e, TryCatch #2 {all -> 0x017e, blocks: (B:57:0x012a, B:59:0x0130, B:62:0x014d, B:64:0x0153), top: B:95:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:13:0x0048, B:75:0x01aa, B:77:0x01b2, B:83:0x01e5, B:80:0x01b9, B:82:0x01bf, B:55:0x0123), top: B:91:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:13:0x0048, B:75:0x01aa, B:77:0x01b2, B:83:0x01e5, B:80:0x01b9, B:82:0x01bf, B:55:0x0123), top: B:91:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01a4 -> B:75:0x01aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object s(java.lang.Object r20, java.util.Set r21, defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wed.s(java.lang.Object, java.util.Set, nq4):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16001. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object t(int r34, java.lang.Object r35, java.util.List r36, defpackage.nq4 r37) {
        /*
            Method dump skipped, instruction units count: 1600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wed.t(int, java.lang.Object, java.util.List, nq4):java.lang.Object");
    }

    public /* synthetic */ wed(gu4 gu4Var, String str, int i) {
        this(gu4Var, (i & 2) != 0 ? "" : str, 0, 1);
    }
}
