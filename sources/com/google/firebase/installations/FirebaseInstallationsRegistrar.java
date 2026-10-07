package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.dif;
import defpackage.eu6;
import defpackage.h74;
import defpackage.iz0;
import defpackage.ou7;
import defpackage.ov6;
import defpackage.ph5;
import defpackage.pu7;
import defpackage.s63;
import defpackage.sv6;
import defpackage.tv6;
import defpackage.u64;
import defpackage.v64;
import defpackage.x0e;
import defpackage.xhc;
import defpackage.yl0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static tv6 lambda$getComponents$0(h74 h74Var) {
        return new sv6((ov6) h74Var.a(ov6.class), h74Var.n(pu7.class), (ExecutorService) h74Var.i(new x0e(yl0.class, ExecutorService.class)), new dif((Executor) h74Var.i(new x0e(iz0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<v64> getComponents() {
        u64 u64VarB = v64.b(tv6.class);
        u64VarB.a = LIBRARY_NAME;
        u64VarB.a(ph5.a(ov6.class));
        u64VarB.a(new ph5(0, 1, pu7.class));
        u64VarB.a(new ph5(new x0e(yl0.class, ExecutorService.class), 1, 0));
        u64VarB.a(new ph5(new x0e(iz0.class, Executor.class), 1, 0));
        u64VarB.f = new eu6(5);
        v64 v64VarB = u64VarB.b();
        ou7 ou7Var = new ou7(0);
        u64 u64VarB2 = v64.b(ou7.class);
        u64VarB2.e = 1;
        u64VarB2.f = new s63(6, ou7Var);
        return Arrays.asList(v64VarB, u64VarB2.b(), xhc.b(LIBRARY_NAME, "18.0.0"));
    }
}
