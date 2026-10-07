package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y6b {
    public final l6b a;
    public final m6b b;
    public final boolean c;
    public final mte d;
    public final String e = y6b.class.getName();
    public final ifh f = new ifh(new j68(13));
    public final r8e g;
    public final r8e h;
    public final gjg i;

    public y6b(ite iteVar, l6b l6bVar, m6b m6bVar, boolean z, mte mteVar) {
        this.a = l6bVar;
        this.b = m6bVar;
        this.c = z;
        this.d = mteVar;
        fz6 fz6Var = new fz6(new jz(r7.b, 19), new o6b(this, null, 0), 3);
        a8g a8gVar = j0g.a;
        s66 s66Var = s66.a;
        r8e r8eVarG0 = e9i.G0(fz6Var, iteVar, a8gVar, s66Var);
        this.g = r8eVarG0;
        this.h = e9i.G0(new fz6(new tz(10, e9i.M0(r8eVarG0, new l42(3, null, 6))), new o6b(this, null, 1), 3), iteVar, a8gVar, s66Var);
        this.i = z ? e9i.G0(e9i.M0(r8eVarG0, new sh1(10)), iteVar, a8gVar, 0) : p90.a(0);
        yab.i0(iteVar, null, 0, new qn6(this, (lq4) null, 26), 3);
        if (z) {
            yab.i0(iteVar, null, 0, new ur8(this, null, 12), 3);
        }
    }

    public final ha9 a() {
        ha9 ha9Var;
        ha9 ha9Var2;
        Iterator it = ((Map) this.h.a.getValue()).entrySet().iterator();
        do {
            ha9Var = null;
            if (!it.hasNext()) {
                ha9Var2 = null;
                break;
            }
            ha9Var2 = (ha9) ((Map.Entry) it.next()).getKey();
        } while (ha9Var2 == null);
        if (ha9Var2 != null) {
            return ha9Var2;
        }
        Iterator it2 = ((Map) this.g.a.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            ha9 ha9Var3 = (ha9) ((Map.Entry) it2.next()).getKey();
            if (ha9Var3 != null) {
                ha9Var = ha9Var3;
                break;
            }
        }
        return ha9Var == null ? ha9.b : ha9Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[Catch: all -> 0x0043, CancellationException -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00ea, all -> 0x0043, blocks: (B:13:0x003e, B:37:0x00b9), top: B:72:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00de -> B:40:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ec -> B:40:0x00e1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.ha9 r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6b.b(ha9, nq4):java.lang.Object");
    }

    public final boolean c() {
        return ((Map) this.h.a.getValue()).size() < ((Number) this.i.getValue()).intValue();
    }

    public final boolean d() {
        return ((Map) this.h.a.getValue()).size() > 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, nq4 nq4Var) {
        q6b q6bVar;
        String str2;
        if (nq4Var instanceof q6b) {
            q6bVar = (q6b) nq4Var;
            int i = q6bVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6bVar.g = i - Integer.MIN_VALUE;
            } else {
                q6bVar = new q6b(this, nq4Var);
            }
        } else {
            q6bVar = new q6b(this, nq4Var);
        }
        Object objN = q6bVar.e;
        int i2 = q6bVar.g;
        ifh ifhVar = this.f;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(objN);
            if (!this.c) {
                return Boolean.FALSE;
            }
            String strD = ((lge) ifhVar.getValue()).d("", str);
            if (strD.length() == 0) {
                return Boolean.FALSE;
            }
            q6bVar.d = strD;
            q6bVar.g = 1;
            objN = e9i.N(this.h, q6bVar);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
            str2 = strD;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = q6bVar.d;
            ch3.d0(objN);
        }
        Collection collectionValues = ((Map) objN).values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z = false;
        } else {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                String strV = ((xb9) ((j6b) it.next()).a()).V();
                if (cqk.d(strV != null ? ((lge) ifhVar.getValue()).d("", strV) : null, str2)) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final ha9 f() {
        ha9 ha9Var;
        ha9 ha9Var2;
        je9 je9Var = je9.d;
        gm0.x(this.e, "getNotLoggedInAccountId()", null);
        Map map = (Map) this.g.a.getValue();
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                ha9Var = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            ha9Var = (ha9) entry.getKey();
            if (((s7f) ((j6b) entry.getValue()).a()).t() != -1) {
                ha9Var = null;
            }
        } while (ha9Var == null);
        if (ha9Var != null) {
            String str = this.e;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.i("getNotLoggedInAccountId() reuse account ", ha9Var), null);
            }
            return ha9Var;
        }
        hj8 hj8Var = new hj8(0, Integer.MAX_VALUE, 1);
        s9a s9aVar = new s9a(15);
        Iterator it2 = hj8Var.iterator();
        do {
            gj8 gj8Var = (gj8) it2;
            if (!gj8Var.c) {
                ore.f("Sequence contains no element matching the predicate.");
                return null;
            }
            ha9Var2 = (ha9) s9aVar.invoke(gj8Var.next());
        } while (map.get(ha9Var2) != null);
        String str2 = this.e;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, qv1.i("getNotLoggedInAccountId() creating new ", ha9Var2), null);
        }
        ol olVar = this.b.f;
        qvb qvbVar = (qvb) (olVar != null ? olVar : null).invoke(ha9Var2);
        qvbVar.b();
        qvbVar.a();
        qvbVar.c();
        return ha9Var2;
    }
}
