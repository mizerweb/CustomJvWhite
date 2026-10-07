package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.b4i;
import defpackage.d4i;
import defpackage.h74;
import defpackage.ore;
import defpackage.ov6;
import defpackage.ph5;
import defpackage.q7h;
import defpackage.qu7;
import defpackage.tv6;
import defpackage.u64;
import defpackage.uv6;
import defpackage.v64;
import defpackage.wa5;
import defpackage.x0e;
import defpackage.xe5;
import defpackage.xhc;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(x0e x0eVar, h74 h74Var) {
        ov6 ov6Var = (ov6) h74Var.a(ov6.class);
        if (h74Var.a(uv6.class) == null) {
            return new FirebaseMessaging(ov6Var, h74Var.n(xe5.class), h74Var.n(qu7.class), (tv6) h74Var.a(tv6.class), h74Var.g(x0eVar), (q7h) h74Var.a(q7h.class));
        }
        ore.m();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<v64> getComponents() {
        x0e x0eVar = new x0e(b4i.class, d4i.class);
        u64 u64VarB = v64.b(FirebaseMessaging.class);
        u64VarB.a = LIBRARY_NAME;
        u64VarB.a(ph5.a(ov6.class));
        u64VarB.a(new ph5(0, 0, uv6.class));
        u64VarB.a(new ph5(0, 1, xe5.class));
        u64VarB.a(new ph5(0, 1, qu7.class));
        u64VarB.a(ph5.a(tv6.class));
        u64VarB.a(new ph5(x0eVar, 0, 1));
        u64VarB.a(ph5.a(q7h.class));
        u64VarB.f = new wa5(x0eVar, 1);
        if (u64VarB.d == 0) {
            u64VarB.d = 1;
            return Arrays.asList(u64VarB.b(), xhc.b(LIBRARY_NAME, "24.0.1"));
        }
        ore.k("Instantiation type has already been set.");
        return null;
    }
}
