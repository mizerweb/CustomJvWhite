package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.a0g;
import defpackage.bnk;
import defpackage.fs3;
import defpackage.j0b;
import defpackage.jnk;
import defpackage.k74;
import defpackage.l0b;
import defpackage.lie;
import defpackage.n1g;
import defpackage.p0b;
import defpackage.ph5;
import defpackage.s8l;
import defpackage.st3;
import defpackage.u64;
import defpackage.v64;
import defpackage.wd6;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        v64 v64Var = a0g.c;
        u64 u64VarB = v64.b(p0b.class);
        u64VarB.a(ph5.a(j0b.class));
        u64VarB.f = new k74() { // from class: jmk
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new p0b((j0b) h74Var.a(j0b.class));
            }
        };
        v64 v64VarB = u64VarB.b();
        u64 u64VarB2 = v64.b(l0b.class);
        u64VarB2.f = new k74() { // from class: dqk
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new l0b();
            }
        };
        v64 v64VarB2 = u64VarB2.b();
        u64 u64VarB3 = v64.b(lie.class);
        u64VarB3.a(new ph5(2, 0, lie.a.class));
        u64VarB3.f = new k74() { // from class: qtk
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new lie(h74Var.k(x0e.a(lie.a.class)));
            }
        };
        v64 v64VarB3 = u64VarB3.b();
        u64 u64VarB4 = v64.b(wd6.class);
        u64VarB4.a(new ph5(1, 1, l0b.class));
        u64VarB4.f = new k74() { // from class: mxk
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new wd6(h74Var.n(l0b.class));
            }
        };
        v64 v64VarB4 = u64VarB4.b();
        u64 u64VarB5 = v64.b(fs3.class);
        u64VarB5.f = new k74() { // from class: l1l
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return fs3.a();
            }
        };
        v64 v64VarB5 = u64VarB5.b();
        u64 u64VarB6 = v64.b(st3.a.class);
        u64VarB6.a(ph5.a(fs3.class));
        u64VarB6.f = new k74() { // from class: h5l
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new st3.a((fs3) h74Var.a(fs3.class));
            }
        };
        v64 v64VarB6 = u64VarB6.b();
        u64 u64VarB7 = v64.b(s8l.class);
        u64VarB7.a(ph5.a(j0b.class));
        u64VarB7.f = new k74() { // from class: r8l
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new s8l((j0b) h74Var.a(j0b.class));
            }
        };
        v64 v64VarB7 = u64VarB7.b();
        u64 u64VarB8 = v64.b(lie.a.class);
        u64VarB8.e = 1;
        u64VarB8.a(new ph5(1, 1, s8l.class));
        u64VarB8.f = new k74() { // from class: gcl
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new lie.a(kz4.class, h74Var.n(s8l.class));
            }
        };
        v64 v64VarB8 = u64VarB8.b();
        bnk bnkVar = jnk.b;
        Object[] objArr = {v64Var, v64VarB, v64VarB2, v64VarB3, v64VarB4, v64VarB5, v64VarB6, v64VarB7, v64VarB8};
        n1g.l0(objArr, 9);
        return jnk.g(objArr, 9);
    }
}
