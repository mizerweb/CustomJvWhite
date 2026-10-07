package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.iz0;
import defpackage.k19;
import defpackage.l6m;
import defpackage.ldf;
import defpackage.ou7;
import defpackage.ph5;
import defpackage.sai;
import defpackage.so2;
import defpackage.u64;
import defpackage.v64;
import defpackage.x0e;
import defpackage.xt4;
import defpackage.xw3;
import defpackage.yl0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lv64;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<v64> getComponents() {
        u64 u64VarA = v64.a(new x0e(yl0.class, xt4.class));
        u64VarA.a(new ph5(new x0e(yl0.class, Executor.class), 1, 0));
        u64VarA.f = ldf.f;
        v64 v64VarB = u64VarA.b();
        u64 u64VarA2 = v64.a(new x0e(k19.class, xt4.class));
        u64VarA2.a(new ph5(new x0e(k19.class, Executor.class), 1, 0));
        u64VarA2.f = l6m.h;
        v64 v64VarB2 = u64VarA2.b();
        u64 u64VarA3 = v64.a(new x0e(iz0.class, xt4.class));
        u64VarA3.a(new ph5(new x0e(iz0.class, Executor.class), 1, 0));
        u64VarA3.f = so2.i;
        v64 v64VarB3 = u64VarA3.b();
        u64 u64VarA4 = v64.a(new x0e(sai.class, xt4.class));
        u64VarA4.a(new ph5(new x0e(sai.class, Executor.class), 1, 0));
        u64VarA4.f = ou7.g;
        return xw3.P0(v64VarB, v64VarB2, v64VarB3, u64VarA4.b());
    }
}
