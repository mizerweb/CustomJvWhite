package defpackage;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public final class cn8 {
    public final InetAddress a;
    public final fn8 b;

    public cn8(InetAddress inetAddress, fn8 fn8Var) {
        this.a = inetAddress;
        this.b = fn8Var;
    }

    public final String toString() {
        return "Ip(" + this.a + "|stat=" + this.b + ")";
    }
}
