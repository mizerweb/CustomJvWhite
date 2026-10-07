package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class eki implements rj6 {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final k3f d;
    public final Provider e;
    public final Provider f;
    public final Provider g;

    public eki(Provider provider, Provider provider2, Provider provider3, k3f k3fVar, Provider provider4, Provider provider5, Provider provider6) {
        this.a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = k3fVar;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.a.get();
        nwa nwaVar = (nwa) this.b.get();
        uxe uxeVar = (uxe) this.c.get();
        kr6 kr6Var = (kr6) this.d.get();
        Executor executor = (Executor) this.e.get();
        uxe uxeVar2 = (uxe) this.f.get();
        lu8 lu8Var = new lu8();
        nv8 nv8Var = new nv8(13);
        uxe uxeVar3 = (uxe) this.g.get();
        z18 z18Var = new z18();
        z18Var.a = context;
        z18Var.b = nwaVar;
        z18Var.c = uxeVar;
        z18Var.d = kr6Var;
        z18Var.e = executor;
        z18Var.f = uxeVar2;
        z18Var.g = lu8Var;
        z18Var.h = nv8Var;
        z18Var.i = uxeVar3;
        return z18Var;
    }
}
