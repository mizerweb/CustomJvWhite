package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class pm7 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final String d = pm7.class.getName();

    public pm7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r10 == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r7, defpackage.us0 r9, defpackage.nq4 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.nm7
            if (r0 == 0) goto L13
            r0 = r10
            nm7 r0 = (defpackage.nm7) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            nm7 r0 = new nm7
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f
            int r1 = r0.h
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r10)
            goto L76
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r4
        L31:
            long r7 = r0.d
            us0 r9 = r0.e
            defpackage.ch3.d0(r10)
            goto L51
        L39:
            defpackage.ch3.d0(r10)
            ny8 r10 = r6.b
            java.lang.Object r10 = r10.getValue()
            no4 r10 = (defpackage.no4) r10
            r0.e = r9
            r0.d = r7
            r0.h = r3
            java.lang.Object r10 = r10.i(r7)
            if (r10 != r5) goto L51
            goto L75
        L51:
            vg4 r10 = (defpackage.vg4) r10
            if (r10 == 0) goto L5a
            java.lang.String r1 = r10.k()
            goto L5b
        L5a:
            r1 = r4
        L5b:
            if (r10 == 0) goto L62
            java.lang.String r3 = r10.z(r9)
            goto L63
        L62:
            r3 = r4
        L63:
            if (r3 != 0) goto L67
            java.lang.String r3 = ""
        L67:
            if (r1 != 0) goto L79
            r0.e = r4
            r0.d = r7
            r0.h = r2
            java.lang.Object r10 = r6.b(r7, r9, r0)
            if (r10 != r5) goto L76
        L75:
            return r5
        L76:
            mm7 r10 = (defpackage.mm7) r10
            return r10
        L79:
            mm7 r6 = new mm7
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            java.lang.CharSequence r7 = r10.u()
            tj0 r7 = defpackage.gm0.a(r7, r9)
            r6.<init>(r1, r3, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pm7.a(long, us0, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(long j, us0 us0Var, nq4 nq4Var) {
        om7 om7Var;
        us0 us0Var2;
        long[] jArr;
        Throwable th;
        Object poeVar;
        je9 je9Var = je9.f;
        if (nq4Var instanceof om7) {
            om7Var = (om7) nq4Var;
            int i = om7Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                om7Var.i = i - Integer.MIN_VALUE;
            } else {
                om7Var = new om7(this, nq4Var);
            }
        } else {
            om7Var = new om7(this, nq4Var);
        }
        Object obj = om7Var.g;
        hu4 hu4Var = hu4.a;
        int i2 = om7Var.i;
        if (i2 == 0) {
            ch3.d0(obj);
            long[] jArr2 = {j};
            try {
                rzb rzbVar = (rzb) this.a.getValue();
                List listSingletonList = Collections.singletonList(new Long(j));
                om7Var.e = us0Var;
                om7Var.f = jArr2;
                om7Var.d = j;
                om7Var.i = 1;
                Object objG = ((sih) rzbVar.a.getValue()).a.g(new wy2(ww3.U1(listSingletonList), (Long) null), om7Var);
                if (objG == hu4Var) {
                    return hu4Var;
                }
                us0Var2 = us0Var;
                jArr = jArr2;
                obj = objG;
            } catch (Throwable th2) {
                us0Var2 = us0Var;
                jArr = jArr2;
                th = th2;
                poeVar = new poe(th);
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = om7Var.d;
            jArr = om7Var.f;
            us0Var2 = om7Var.e;
            try {
                ch3.d0(obj);
            } catch (Throwable th3) {
                th = th3;
                poeVar = new poe(th);
            }
        }
        poeVar = (rj4) obj;
        boolean z = poeVar instanceof poe;
        if (!z) {
            ((tj4) this.c.getValue()).a((rj4) poeVar, jArr, j);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.r("getContactTitleFromServer: Fail ", thA), null);
            }
        }
        if (z) {
            poeVar = null;
        }
        rj4 rj4Var = (rj4) poeVar;
        pj4 pj4Var = rj4Var != null ? (pj4) ww3.t1(rj4Var.h()) : null;
        String strA = pj4Var != null ? pj4Var.a() : null;
        if (strA == null || strA.length() == 0) {
            String str2 = this.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.j(j, "DisplayName from server contact is null, id: "), null);
            }
        }
        if (strA == null) {
            strA = "";
        }
        String strD = pj4Var != null ? pj4Var.d(us0Var2) : null;
        if (strD == null) {
            strD = "";
        }
        Long l = new Long(j);
        Pattern pattern = m3c.a;
        String strB = pj4Var != null ? pj4Var.b() : null;
        return new mm7(strA, strD, gm0.a(m3c.b(strB != null ? strB : "", pj4Var != null ? pj4Var.c() : null), l));
    }
}
