package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class drc {
    public f83 a;
    public boolean c;
    public gu4 d;
    public rrc e;
    public exb f;
    public boolean g;
    public ftc h;
    public yc6 i;
    public bsc b = new bsc();
    public final u8b j = new u8b();
    public final u8b k = new u8b();

    public final erc a() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "PerfRegistrarConfigBuilder", zo5.q("Building new config with settings: isLazy->", ", isPersistent->", this.c, this.g), null);
            }
        }
        if (!this.c) {
            if (this.e == null) {
                ore.k("Required value was null.");
                return null;
            }
            gu4 gu4Var = this.d;
            if ((gu4Var != null ? new krc(gu4Var) : null) == null) {
                ore.k("Required value was null.");
                return null;
            }
            if (this.f == null) {
                ore.k("Required value was null.");
                return null;
            }
        }
        if (this.g) {
            if (this.h == null) {
                ore.k("Required value was null.");
                return null;
            }
            this.k.b(zsc.a);
        }
        boolean z = this.c;
        boolean z2 = this.g;
        f83 f83Var = this.a;
        if (f83Var != null) {
            return new erc(z, z2, f83Var, this.b, this.k, this.d, this.j, this.i, this.f, this.e, this.h);
        }
        ore.k("Required value was null.");
        return null;
    }

    public final void b(String str) {
        this.a = new brc(5, Collections.singletonList(str));
    }

    public final void c() {
        this.j.b(new ik4(24));
    }

    public final void d(zj5 zj5Var) {
        this.j.b(new g3(24, zj5Var));
    }

    public final void e(zqc zqcVar) {
        this.k.b(zqcVar);
    }

    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.k.b((zqc) it.next());
        }
    }
}
