package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ifl;
import defpackage.iwk;
import defpackage.j0b;
import defpackage.k74;
import defpackage.ph5;
import defpackage.u64;
import defpackage.u8l;
import defpackage.v64;
import defpackage.wd6;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        u64 u64VarB = v64.b(ifl.class);
        u64VarB.a(ph5.a(j0b.class));
        u64VarB.f = new k74() { // from class: vtk
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new ifl((j0b) h74Var.a(j0b.class));
            }
        };
        v64 v64VarB = u64VarB.b();
        u64 u64VarB2 = v64.b(u8l.class);
        u64VarB2.a(ph5.a(ifl.class));
        u64VarB2.a(ph5.a(wd6.class));
        u64VarB2.a(ph5.a(j0b.class));
        u64VarB2.f = new k74() { // from class: pxk
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new u8l((ifl) h74Var.a(ifl.class), (wd6) h74Var.a(wd6.class), (j0b) h74Var.a(j0b.class));
            }
        };
        return iwk.j(v64VarB, u64VarB2.b());
    }
}
