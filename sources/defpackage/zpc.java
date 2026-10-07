package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zpc {
    public final gjg a;
    public final mjg b;
    public final r8e c;
    public final pzf d;
    public final q8e e;

    public zpc(dq4 dq4Var, xhh xhhVar, gjg gjgVar) {
        this.a = gjgVar;
        mjg mjgVarA = p90.a(cqc.a);
        this.b = mjgVarA;
        this.c = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, 1, 1);
        this.d = pzfVarB;
        this.e = new q8e(pzfVarB);
        e9i.j0(e9i.T(new fz6(e9i.H(new jz(gjgVar, 13), new wf0(17)), new w8(2, this, zpc.class, "handleChat", "handleChat(Lru/ok/tamtam/chats/Chat;)V", 4, 23), 3), ((n0c) xhhVar).a()), dq4Var);
    }

    public final q8e a() {
        return this.e;
    }

    public final r8e b() {
        return this.c;
    }
}
