package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class gf4 implements cg5 {
    @Override // defpackage.cg5
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = ff4.d;
        return df4.c() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.cg5
    public final scg d(SSLSocket sSLSocket) {
        return new hf4();
    }
}
