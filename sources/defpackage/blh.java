package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class blh {
    public final alh a;
    public final zkh b;
    public final boolean c;

    public blh(alh alhVar, zkh zkhVar, boolean z) {
        this.a = alhVar;
        this.b = zkhVar;
        this.c = z;
    }

    public final String toString() {
        return s5h.x0("\n        TcpConnectStrategy(\n            isForeground=" + this.c + "\n            dispatcher=" + this.a + "\n            task=" + this.b + "\n        )\n    ");
    }
}
