package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w17 extends gq0 {
    public final gq0 c;
    public final String d;
    public final ny8 e;
    public volatile r17 f;

    public w17(gq0 gq0Var, ki3 ki3Var, ny8 ny8Var, xhh xhhVar) {
        super(xhhVar);
        this.c = gq0Var;
        this.d = w17.class.getName();
        this.e = ny8Var;
        dq4 dq4VarA = cqk.a(((n0c) xhhVar).a());
        lq4 lq4Var = null;
        yab.i0(dq4VarA, null, 0, new qn6(this, lq4Var, 17), 3);
        e9i.j0(new fz6((jz) ki3Var.c, new qob(this, lq4Var, 28), 3), dq4VarA).Y(new g3(13, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object f(w17 w17Var, r17 r17Var, r17 r17Var2, nq4 nq4Var) {
        v17 v17Var;
        r17 r17Var3;
        LinkedHashSet linkedHashSet;
        r17 r17Var4;
        LinkedHashSet linkedHashSet2;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof v17) {
            v17Var = (v17) nq4Var;
            int i = v17Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                v17Var.j = i - Integer.MIN_VALUE;
            } else {
                v17Var = new v17(w17Var, nq4Var);
            }
        } else {
            v17Var = new v17(w17Var, nq4Var);
        }
        Object obj = v17Var.h;
        hu4 hu4Var = hu4.a;
        int i2 = v17Var.j;
        if (i2 == 0) {
            ch3.d0(obj);
            if (r17Var != null && !r17Var.equals(r17Var2)) {
                if (cqk.d(r17Var.d, r17Var2.d) && r17Var.q.equals(r17Var2.q)) {
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    g(r17Var.e, r17Var2.e, linkedHashSet3);
                    g(r17Var.p, r17Var2.p, linkedHashSet3);
                    g(r17Var.j, r17Var2.j, linkedHashSet3);
                    if (!linkedHashSet3.isEmpty()) {
                        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                        xn3 xn3Var = (xn3) w17Var.e.getValue();
                        v17Var.d = r17Var;
                        v17Var.e = r17Var2;
                        v17Var.f = linkedHashSet3;
                        v17Var.g = linkedHashSet4;
                        v17Var.j = 1;
                        Object objN = xn3Var.n(linkedHashSet3, v17Var);
                        if (objN == hu4Var) {
                            return hu4Var;
                        }
                        r17Var3 = r17Var2;
                        linkedHashSet = linkedHashSet3;
                        obj = objN;
                        r17Var4 = r17Var;
                        linkedHashSet2 = linkedHashSet4;
                    }
                } else {
                    String str = w17Var.d;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, qv1.k("Invalidate all chats from handleFolderDiff, folderId:", r17Var.a), null);
                    }
                    w17Var.b(rh3.a);
                }
                w17Var.f = r17Var2;
            }
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        linkedHashSet2 = v17Var.g;
        linkedHashSet = v17Var.f;
        r17Var3 = v17Var.e;
        r17Var4 = v17Var.d;
        ch3.d0(obj);
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            linkedHashSet2.add(new Long(((rt2) it.next()).a));
        }
        String str2 = w17Var.d;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            String str3 = r17Var4.a;
            int size = linkedHashSet.size();
            int size2 = linkedHashSet2.size();
            StringBuilder sbR = c0a.r(size, "ChatsUpdate from handleFolderDiff, folderId:", str3, ", diffSize:", ", localSize:");
            sbR.append(size2);
            a4cVar2.c(je9Var, str2, sbR.toString(), null);
        }
        w17Var.b(new qh3(linkedHashSet2, true, linkedHashSet, false));
        r17Var2 = r17Var3;
        w17Var.f = r17Var2;
        return sbiVar;
    }

    public static void g(Set set, Set set2, LinkedHashSet linkedHashSet) {
        if (set.isEmpty() && set2.isEmpty()) {
            return;
        }
        if (set.isEmpty()) {
            linkedHashSet.addAll(set2);
            return;
        }
        if (set2.isEmpty()) {
            linkedHashSet.addAll(set);
            return;
        }
        Set setY = lof.Y(set, set2);
        Set setY2 = lof.Y(set2, set);
        linkedHashSet.addAll(setY);
        linkedHashSet.addAll(setY2);
    }

    @Override // defpackage.gq0
    public final void a(qh3 qh3Var) {
        this.c.a(qh3Var);
    }
}
