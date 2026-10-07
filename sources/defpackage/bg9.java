package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bg9 extends zq0 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final m8b e;

    public bg9(long j, boolean z, boolean z2, boolean z3, m8b m8bVar) {
        super(j);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = m8bVar;
    }

    @Override // defpackage.zq0
    public final String toString() {
        int i = this.e.d;
        StringBuilder sbU = qt4.u(this.a, "LoginEvent(requestId=", ", isFirstLogin=", this.b);
        qv1.v(", hasNewMessages=", ", videoChatHistory=", sbU, this.c, this.d);
        return qv1.o(sbU, ", chats=", i, ")");
    }
}
