package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e84 extends ur0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public v1i j;

    public abstract void A(Object obj, ur0 ur0Var, ush ushVar);

    public final void B(Object obj, ur0 ur0Var) {
        HashMap map = this.h;
        lvb.R(!map.containsKey(obj));
        b84 b84Var = new y4a() { // from class: b84
            public final /* synthetic */ Object b;

            public /* synthetic */ b84() {
                obj = obj;
            }

            @Override // defpackage.y4a
            public final void a(ur0 ur0Var2, ush ushVar) {
                this.a.A(obj, ur0Var2, ushVar);
            }
        };
        c84 c84Var = new c84(this, obj);
        map.put(obj, new d84(ur0Var, b84Var, c84Var));
        Handler handler = this.i;
        handler.getClass();
        ur0Var.b(handler, c84Var);
        Handler handler2 = this.i;
        handler2.getClass();
        ur0Var.a(handler2, c84Var);
        v1i v1iVar = this.j;
        z3d z3dVar = this.g;
        z3dVar.getClass();
        ur0Var.n(b84Var, v1iVar, z3dVar);
        if (this.b.isEmpty()) {
            ur0Var.f(b84Var);
        }
    }

    @Override // defpackage.ur0
    public void g() {
        for (d84 d84Var : this.h.values()) {
            d84Var.a.f(d84Var.b);
        }
    }

    @Override // defpackage.ur0
    public void i() {
        for (d84 d84Var : this.h.values()) {
            d84Var.a.h(d84Var.b);
        }
    }

    @Override // defpackage.ur0
    public void m() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((d84) it.next()).a.m();
        }
    }

    @Override // defpackage.ur0
    public void s() {
        HashMap map = this.h;
        for (d84 d84Var : map.values()) {
            ur0 ur0Var = d84Var.a;
            c84 c84Var = d84Var.c;
            ur0Var.r(d84Var.b);
            ur0Var.u(c84Var);
            ur0Var.t(c84Var);
        }
        map.clear();
    }

    public final void w(Object obj) {
        d84 d84Var = (d84) this.h.get(obj);
        d84Var.getClass();
        d84Var.a.f(d84Var.b);
    }

    public abstract x4a x(Object obj, x4a x4aVar);

    public long y(Object obj, long j, x4a x4aVar) {
        return j;
    }

    public int z(int i, Object obj) {
        return i;
    }
}
