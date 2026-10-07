package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h5c {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public h5c(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    public final void a(int i) {
        v45 v45VarD = d();
        v45VarD.getClass();
        gm0.n("v45", "cancelAll");
        mjg mjgVar = v45VarD.c;
        s45 s45Var = new s45(false, null, null, false, null, Integer.valueOf(i), 31);
        mjgVar.getClass();
        mjgVar.j(null, s45Var);
        ((id9) this.a.getValue()).getClass();
    }

    public final void b(long j) {
        v45 v45VarD = d();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            v45VarD.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "v45", zo5.j(j, "cancelServerChatId "), null);
            }
        }
        mjg mjgVar = v45VarD.c;
        s45 s45Var = new s45(false, null, ui9.a(j), false, null, null, 59);
        mjgVar.getClass();
        mjgVar.j(null, s45Var);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public final void c(ArrayList arrayList) {
        ArrayList arrayList2;
        v45 v45VarD = d();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            arrayList2 = arrayList;
        } else {
            v45VarD.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                arrayList2 = arrayList;
                a4cVar.c(je9Var, "v45", "cancelServerChatIds ".concat(ww3.z1(arrayList2, null, null, null, null, 63)), null);
            } else {
                arrayList2 = arrayList;
            }
        }
        mjg mjgVar = v45VarD.c;
        s45 s45Var = new s45(false, null, rx8.j0(arrayList2), false, null, null, 59);
        mjgVar.getClass();
        mjgVar.j(null, s45Var);
    }

    public final v45 d() {
        return (v45) this.c.getValue();
    }

    public final void e() {
        v45 v45VarD = d();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            v45VarD.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "v45", "notifyAllChats", null);
            }
        }
        v45VarD.c.setValue(s45.i);
        i();
    }

    public final void f(long j) {
        v45 v45VarD = d();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            v45VarD.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "v45", zo5.j(j, "notify #"), null);
            }
        }
        v45VarD.c.setValue(s45.h);
        i();
    }

    public final void g(long j, String str) {
        v45 v45VarD = d();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            v45VarD.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "v45", zo5.j(j, "notifyServerChatIds #"), null);
            }
        }
        mjg mjgVar = v45VarD.c;
        m8b m8bVarA = ui9.a(j);
        l8b l8bVar = ki9.a;
        l8b l8bVar2 = new l8b();
        l8bVar2.l(j, str);
        s45 s45Var = new s45(false, m8bVarA, null, false, l8bVar2, null, 45);
        mjgVar.getClass();
        mjgVar.j(null, s45Var);
        i();
    }

    public final void h(m8b m8bVar) {
        v45 v45VarD = d();
        v45VarD.getClass();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "v45", "notifyServerChatIds ".concat(m8b.k(m8bVar, 31)), null);
            }
        }
        if (m8bVar.j()) {
            mjg mjgVar = v45VarD.c;
            s45 s45Var = new s45(false, rx8.b(m8bVar), null, false, null, null, 61);
            mjgVar.getClass();
            mjgVar.j(null, s45Var);
        }
        i();
    }

    public final void i() {
        ((p1g) this.b.getValue()).e();
    }
}
