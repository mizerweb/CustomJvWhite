package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class o0e extends a8j {
    public static final /* synthetic */ zv8[] p;
    public final vo7 c;
    public final xhh d;
    public final r8e e;
    public final p48 f;
    public final ic6 g;
    public final p3c h;
    public final mjg i;
    public final r8e j;
    public final sgg k;
    public final mjg l;
    public final r8e m;
    public final mjg n;
    public final r8e o;

    static {
        z8b z8bVar = new z8b(o0e.class, "scanLocalImageJob", "getScanLocalImageJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        p = new zv8[]{z8bVar};
    }

    public o0e(vo7 vo7Var, xhh xhhVar) throws IllegalAccessException, InvocationTargetException {
        p48 i0bVar;
        this.c = vo7Var;
        this.d = xhhVar;
        this.e = vo7Var.h;
        String str = vo7Var.i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "GoogleMlKit analyzer", null);
            }
        }
        op0 op0Var = (op0) vo7Var.c.getValue();
        if (op0Var == null) {
            String str2 = vo7Var.i;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "Error during access scanner, return stub", null);
                }
            }
            i0bVar = new eu6(16);
        } else {
            i0bVar = new i0b(Collections.singletonList(op0Var), vo7Var.b, new ro7(op0Var, 0, vo7Var));
        }
        this.f = i0bVar;
        this.g = new ic6(null);
        this.h = qyj.S();
        Boolean bool = Boolean.FALSE;
        mjg mjgVarA = p90.a(bool);
        this.i = mjgVarA;
        this.j = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(bool);
        this.l = mjgVarA2;
        this.m = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(bool);
        this.n = mjgVarA3;
        this.o = new r8e(mjgVarA3);
        sgg sggVar = this.k;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.k = a8j.t(this, ((n0c) xhhVar).a(), new i20(this, null, 23), 2);
    }

    public final void B(o1f o1fVar) {
        a8j.x(this.g, new m0e(o1fVar));
    }

    @Override // defpackage.a8j
    public final void y() {
        op0 op0Var = (op0) this.c.c.getValue();
        if (op0Var != null) {
            op0Var.close();
        }
    }
}
