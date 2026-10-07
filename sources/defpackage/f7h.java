package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class f7h {
    public static final /* synthetic */ zv8[] f;
    public final e5d a;
    public final ny8 c;
    public final ny8 d;
    public final String b = f7h.class.getName();
    public final p3c e = qyj.S();

    static {
        z8b z8bVar = new z8b(f7h.class, "unsubscribeJob", "getUnsubscribeJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public f7h(e5d e5dVar, wmi wmiVar, ny8 ny8Var, ny8 ny8Var2) {
        this.a = e5dVar;
        this.c = ny8Var;
        this.d = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r12v0, types: [rt2] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [rt2] */
    /* JADX WARN: Type inference failed for: r13v5, types: [rt2] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static final Object a(f7h f7hVar, rt2 rt2Var, nq4 nq4Var) {
        e7h e7hVar;
        ?? r13;
        ?? r12;
        ?? r0;
        ?? r14;
        ?? r15;
        Throwable thA;
        String str;
        a4c a4cVar;
        je9 je9Var;
        ?? r16;
        ?? r17;
        f7hVar.getClass();
        if (nq4Var instanceof e7h) {
            e7hVar = (e7h) nq4Var;
            int i = e7hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7hVar.h = i - Integer.MIN_VALUE;
            } else {
                e7hVar = new e7h(f7hVar, nq4Var);
            }
        } else {
            e7hVar = new e7h(f7hVar, nq4Var);
        }
        Object objG = e7hVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = e7hVar.h;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    rt2 rt2Var2 = e7hVar.d;
                    ch3.d0(objG);
                    r17 = rt2Var2;
                } else {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj = e7hVar.e;
                    rt2 rt2Var3 = e7hVar.d;
                    ch3.d0(objG);
                    r0 = rt2Var3;
                    r16 = obj;
                }
                r14 = r0;
                r15 = r16;
                thA = roe.a(r15);
                if (thA != null) {
                    str = f7hVar.b;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.j(r14.A(), "Fail su chat unsubscribe, id:"), thA);
                        }
                    }
                }
                return sbi.a;
            }
            ch3.d0(objG);
            wy2 wy2Var = new wy2(rt2Var.A());
            sih sihVar = (sih) f7hVar.d.getValue();
            e7hVar.d = rt2Var;
            e7hVar.e = null;
            e7hVar.h = 1;
            objG = sihVar.a.g(wy2Var, e7hVar);
            r17 = rt2Var;
            if (objG == hu4Var) {
                return hu4Var;
            }
            Object obj2 = objG;
            r13 = r17;
            rt2Var = obj2;
            r12 = rt2Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poe poeVar = new poe(th);
            r13 = rt2Var;
            r12 = poeVar;
        }
        boolean z = r12 instanceof poe;
        r15 = r12;
        r14 = r13;
        if (!z) {
            String str2 = f7hVar.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, zo5.j(r13.A(), "Success su chat unsubscribe, id:"), null);
                }
            }
            xn3 xn3Var = (xn3) f7hVar.c.getValue();
            long j = r13.a;
            c9 c9Var = new c9();
            e7hVar.d = r13;
            e7hVar.e = r12;
            e7hVar.h = 2;
            if (xn3Var.d(j, c9Var, e7hVar) == hu4Var) {
                return hu4Var;
            }
            r0 = r13;
            r16 = r12;
            r14 = r0;
            r15 = r16;
        }
        thA = roe.a(r15);
        if (thA != null) {
            str = f7hVar.b;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(r14.A(), "Fail su chat unsubscribe, id:"), thA);
                }
            }
        }
        return sbi.a;
    }
}
