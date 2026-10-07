package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y3h extends s7g implements r46 {
    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        k3h k3hVar = (k3h) k79Var;
        izb izbVar = (izb) this.a;
        long j = k3hVar.a;
        izbVar.setId((int) j);
        CharSequence charSequence = k3hVar.b;
        izbVar.setTitle(charSequence);
        izbVar.j(j, charSequence, k3hVar.c);
        izbVar.setReaction(k3hVar.d);
    }

    @Override // defpackage.r46
    public final void g() {
        ((izb) this.a).g();
    }
}
