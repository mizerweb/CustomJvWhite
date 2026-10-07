package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.b4i;
import defpackage.d4i;
import defpackage.dzh;
import defpackage.g4i;
import defpackage.g71;
import defpackage.h74;
import defpackage.ph5;
import defpackage.sz8;
import defpackage.u64;
import defpackage.v64;
import defpackage.x0e;
import defpackage.xhc;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ d4i lambda$getComponents$0(h74 h74Var) {
        g4i.b((Context) h74Var.a(Context.class));
        return g4i.a().c(g71.f);
    }

    public static /* synthetic */ d4i lambda$getComponents$1(h74 h74Var) {
        g4i.b((Context) h74Var.a(Context.class));
        return g4i.a().c(g71.f);
    }

    public static /* synthetic */ d4i lambda$getComponents$2(h74 h74Var) {
        g4i.b((Context) h74Var.a(Context.class));
        return g4i.a().c(g71.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<v64> getComponents() {
        u64 u64VarB = v64.b(d4i.class);
        u64VarB.a = LIBRARY_NAME;
        u64VarB.a(ph5.a(Context.class));
        u64VarB.f = new dzh(8);
        v64 v64VarB = u64VarB.b();
        u64 u64VarA = v64.a(new x0e(sz8.class, d4i.class));
        u64VarA.a(ph5.a(Context.class));
        u64VarA.f = new dzh(9);
        v64 v64VarB2 = u64VarA.b();
        u64 u64VarA2 = v64.a(new x0e(b4i.class, d4i.class));
        u64VarA2.a(ph5.a(Context.class));
        u64VarA2.f = new dzh(10);
        return Arrays.asList(v64VarB, v64VarB2, u64VarA2.b(), xhc.b(LIBRARY_NAME, "18.2.0"));
    }
}
