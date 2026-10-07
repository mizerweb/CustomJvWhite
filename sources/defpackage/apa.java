package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class apa {
    public final ite a;
    public final et3 b;
    public final pzf c;
    public final q8e d;

    public apa(ite iteVar, et3 et3Var, t51 t51Var) {
        this.a = iteVar;
        this.b = et3Var;
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.c = pzfVarB;
        this.d = new q8e(pzfVarB);
        t51Var.d(this);
    }

    public final void a(sga sgaVar) {
        yab.i0(this.a, null, 0, new af8(this, sgaVar, (lq4) null, 20), 3);
    }

    @l7h
    public final void onEvent(lc8 lc8Var) {
        a(new hga(lc8Var.b, ui9.a(lc8Var.c), lc8Var.g == ((s7f) this.b).t()));
    }

    @l7h
    public final void onEvent(ajc ajcVar) {
        a(new hga(ajcVar.b, ui9.a(ajcVar.d), true));
    }

    @l7h
    public final void onEvent(kfi kfiVar) {
        a(new qga(kfiVar.b, ui9.a(kfiVar.c)));
    }

    @l7h
    public final void onEvent(lfi lfiVar) {
        a(new qga(lfiVar.b, rx8.j0(lfiVar.c)));
    }

    @l7h
    public final void onEvent(j3b j3bVar) {
        List list = j3bVar.e;
        if (list.isEmpty()) {
            return;
        }
        a(new nga(j3bVar.b, rx8.j0(list)));
    }
}
