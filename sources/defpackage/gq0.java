package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gq0 {
    public final pzf a = e9i.b(0, 0, 7);
    public final dq4 b;

    public gq0(xhh xhhVar) {
        this.b = cqk.a(((n0c) xhhVar).a());
    }

    public abstract void a(qh3 qh3Var);

    public final void b(sh3 sh3Var) {
        yab.i0(this.b, null, 0, new qob(this, sh3Var, null, 7), 3);
    }

    public final void c() {
        gm0.n(getClass().getName(), "Invalidate all chats from chatsEvents.invalidate");
        b(rh3.a);
    }

    public final j3 d() {
        ghb ghbVar = ew5.b;
        return tre.N(this.a, qe7.O(300, lw5.MILLISECONDS), new dz(2));
    }

    public final void e(m8b m8bVar, m8b m8bVar2) {
        b(new qh3(rx8.d0(m8bVar), false, rx8.d0(m8bVar2), false));
    }
}
