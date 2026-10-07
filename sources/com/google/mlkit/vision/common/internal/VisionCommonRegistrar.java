package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import defpackage.cqk;
import defpackage.k74;
import defpackage.l5l;
import defpackage.ph5;
import defpackage.rul;
import defpackage.tre;
import defpackage.u64;
import defpackage.v64;
import defpackage.xyl;
import defpackage.y7m;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        u64 u64VarB = v64.b(a.class);
        u64VarB.a(new ph5(2, 0, a.d.class));
        l5l l5lVar = new k74() { // from class: l5l
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new a(h74Var.k(x0e.a(a.d.class)));
            }
        };
        tre.L(l5lVar, "Null factory");
        u64VarB.f = l5lVar;
        v64 v64VarB = u64VarB.b();
        rul rulVar = xyl.b;
        Object[] objArr = {v64VarB};
        cqk.R(objArr, 1);
        return new y7m(objArr, 1);
    }
}
