package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class dge {
    public final int a;
    public final int b;
    public final boolean c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final mj9 h = new mj9(100);
    public final p41 i;

    public dge(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        p41 p41VarB = yab.b(Integer.MAX_VALUE, 0, null, 6);
        this.i = p41VarB;
        ir2 ir2VarE = e9i.E(p41VarB);
        ghb ghbVar = ew5.b;
        e9i.j0(new fz6(e9i.r(new cy6(qe7.O(100, lw5.MILLISECONDS), null, ir2VarE)), new gce(this, (lq4) null, 2), 3), (wmi) ny8Var.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ab A[LOOP:3: B:87:0x025a->B:102:0x02ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x0317 A[LOOP:0: B:127:0x0311->B:129:0x0317, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x032d  */
    /* JADX WARN: Code duplicated, block: B:135:0x034a  */
    /* JADX WARN: Code duplicated, block: B:159:0x036b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x036d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0241 A[EDGE_INSN: B:173:0x0241->B:171:0x0241 BREAK  A[LOOP:3: B:87:0x025a->B:102:0x02ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0241 A[EDGE_INSN: B:174:0x0241->B:171:0x0241 BREAK  A[LOOP:3: B:87:0x025a->B:102:0x02ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0230  */
    /* JADX WARN: Code duplicated, block: B:84:0x0247  */
    /* JADX WARN: Code duplicated, block: B:89:0x026a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0277  */
    /* JADX WARN: Code duplicated, block: B:93:0x027d  */
    /* JADX WARN: Code duplicated, block: B:95:0x029a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x02d2 -> B:126:0x0302). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0300 -> B:126:0x0302). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.dge r41, java.util.List r42, defpackage.nq4 r43) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dge.a(dge, java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    public final Object b(long j, long j2, Uri uri, long j3, boolean z, nq4 nq4Var) {
        bge bgeVar;
        boolean z2;
        String strD;
        Object poeVar;
        Object poeVar2;
        String str;
        if (nq4Var instanceof bge) {
            bgeVar = (bge) nq4Var;
            int i = bgeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgeVar.g = i - Integer.MIN_VALUE;
            } else {
                bgeVar = new bge(this, nq4Var);
            }
        } else {
            bgeVar = new bge(this, nq4Var);
        }
        Object objM0 = bgeVar.e;
        int i2 = bgeVar.g;
        rs0 rs0Var = rs0.b;
        us0 us0Var = us0.e;
        String str2 = 0;
        str2 = 0;
        if (i2 == 0) {
            ch3.d0(objM0);
            if (!c(uri)) {
                return uri;
            }
            ele eleVar = new ele(j, j2, j3);
            mj9 mj9Var = this.h;
            jge jgeVar = (jge) mj9Var.c(eleVar);
            if (jgeVar != null) {
                if (z) {
                    strD = jgeVar.b;
                } else {
                    strD = vs0.d(jgeVar.a, us0Var, rs0Var);
                    if (strD == null) {
                        strD = "";
                    }
                }
                if (strD.length() > 0) {
                    try {
                        poeVar = Uri.parse(strD);
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    Uri uri2 = Uri.EMPTY;
                    boolean z3 = poeVar instanceof poe;
                    Object obj = poeVar;
                    if (z3) {
                        obj = uri2;
                    }
                    Uri uri3 = (Uri) obj;
                    if (!c(uri3)) {
                        return uri3;
                    }
                }
                mj9Var.e(eleVar);
            }
            b78 b78Var = (b78) this.f.getValue();
            b78Var.getClass();
            oo6 oo6Var = new oo6(11, uri);
            b78Var.f.c(oo6Var);
            b78Var.g.c(oo6Var);
            v78 v78VarA = v78.a(uri);
            if (v78VarA == null) {
                ore.k("Required value was null.");
                return null;
            }
            j85 j85Var = b78Var.h;
            j85Var.getClass();
            l6g l6gVarO = j85Var.o(v78VarA.b);
            cn5 cn5Var = (cn5) b78Var.c.get();
            cn5Var.b().d(l6gVarO);
            cn5Var.c().d(l6gVarO);
            Iterator it = cn5Var.a().entrySet().iterator();
            while (it.hasNext()) {
                ((w41) ((Map.Entry) it.next()).getValue()).d(l6gVarO);
            }
            i64 i64Var = (i64) this.g.compute(eleVar, new mw1(10, new uv2(this, 9, eleVar)));
            ghb ghbVar = ew5.b;
            long jO = qe7.O(5, lw5.SECONDS);
            cb2 cb2Var = new cb2(i64Var, str2, 2);
            bgeVar.d = z;
            bgeVar.g = 1;
            objM0 = lvb.M0(jO, cb2Var, bgeVar);
            hu4 hu4Var = hu4.a;
            if (objM0 == hu4Var) {
                return hu4Var;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = bgeVar.d;
            ch3.d0(objM0);
        }
        jge jgeVar2 = (jge) objM0;
        if (z2) {
            if (jgeVar2 != null) {
                str = jgeVar2.b;
            }
        } else if (jgeVar2 != null) {
            String strD2 = vs0.d(jgeVar2.a, us0Var, rs0Var);
            str2 = strD2 != null ? strD2 : "";
        }
        if (str2 == 0 || str2.length() == 0) {
            str2 = str;
            str2 = str;
            return Uri.EMPTY;
        }
        try {
            str2 = str;
            poeVar2 = Uri.parse(str2);
        } catch (Throwable th2) {
            poeVar2 = new poe(th2);
        }
        return poeVar2 instanceof poe ? Uri.EMPTY : poeVar2;
    }

    public final boolean c(Uri uri) {
        Object poeVar;
        String queryParameter;
        Long lC0;
        try {
            boolean z = false;
            if (this.c) {
                if (((s7f) ((et3) this.e.getValue())).f() >= ((uri == null || (queryParameter = uri.getQueryParameter(ClientCookie.EXPIRES_ATTR)) == null || (lC0 = y5h.C0(queryParameter)) == null) ? BuildConfig.MAX_TIME_TO_UPLOAD : lC0.longValue())) {
                    z = true;
                }
            }
            poeVar = Boolean.valueOf(z);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object obj = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = obj;
        }
        return ((Boolean) poeVar).booleanValue();
    }
}
