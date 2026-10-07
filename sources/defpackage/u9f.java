package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u9f implements z9f {
    public final qw2 a;
    public final e8f b;
    public final daf c;
    public final x9f d;
    public final z9f e;

    public u9f(qw2 qw2Var, e8f e8fVar, daf dafVar, x9f x9fVar, y9f y9fVar) {
        this.a = qw2Var;
        this.b = e8fVar;
        this.c = dafVar;
        this.d = x9fVar;
        this.e = y9fVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #1 {all -> 0x00f5, blocks: (B:36:0x0091, B:39:0x00cc), top: B:66:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4 A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:22:0x0056, B:43:0x00d4, B:45:0x00e4, B:46:0x00ee), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r3 == r12) goto L56;
     */
    @Override // defpackage.z9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r18, defpackage.nq4 r19) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9f.a(java.lang.String, nq4):java.lang.Object");
    }

    public final ArrayList b(String str, m8b m8bVar, m8b m8bVar2) {
        ue7 ue7VarE;
        ArrayList arrayList = new ArrayList();
        qw2 qw2Var = this.a;
        hre hreVarA = ((n25) qw2Var.n.get()).a();
        hreVarA.getClass();
        boolean zX0 = r5h.X0(str);
        List listT1 = r66.a;
        int i = 1;
        if (!zX0 && (ue7VarE = ve7.e(str)) != null) {
            te7 te7Var = ue7VarE.a;
            te7 te7Var2 = te7Var.c;
            te7 te7Var3 = ue7VarE.b;
            te7 te7Var4 = te7Var3.c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String str2 = te7Var.a;
            String str3 = te7Var.b;
            linkedHashSet.addAll(te7Var2 != null ? (List) ch3.G(((ph3) hreVarA.e()).a, true, false, new jh3(0, str3, str2, te7Var2.a, te7Var2.b)) : (List) ch3.G(((ph3) hreVarA.e()).a, true, false, new z92(str3, str2, i)));
            String str4 = te7Var3.a;
            String str5 = te7Var3.b;
            linkedHashSet.addAll(te7Var4 != null ? (List) ch3.G(((ph3) hreVarA.e()).a, true, false, new jh3(1, str5, str4, te7Var4.a, te7Var4.b)) : (List) ch3.G(((ph3) hreVarA.e()).a, true, false, new z92(str5, str4, 2)));
            listT1 = ww3.T1(linkedHashSet);
        }
        if (!p90.D(listT1)) {
            EnumSet enumSet = qw2.K;
            Iterator it = listT1.iterator();
            while (it.hasNext()) {
                rt2 rt2VarN = qw2Var.N(((Long) it.next()).longValue());
                if (rt2VarN != null) {
                    qw2Var.p.b.a();
                    if (qw2.y(rt2VarN, enumSet, false)) {
                        try {
                            if (rt2VarN.W()) {
                                try {
                                    if (!m8bVar2.d(rt2VarN.a)) {
                                        vg4 vg4VarW = rt2VarN.w();
                                        daf dafVar = this.c;
                                        if (vg4VarW != null) {
                                            try {
                                                if (!m8bVar.d(vg4VarW.v())) {
                                                    arrayList.add(dafVar.a(rt2VarN, str));
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                gm0.V("qw2", "iterateChatsByQuery fail", th);
                                            }
                                        }
                                        arrayList.add(dafVar.a(rt2VarN, str));
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            bx3.Y0(arrayList, new xa8(24));
        }
        return arrayList;
    }
}
