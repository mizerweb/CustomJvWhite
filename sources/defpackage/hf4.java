package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class hf4 implements scg {
    public static final gf4 a = new gf4();

    @Override // defpackage.scg
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.scg
    public final boolean b() {
        boolean z = ff4.d;
        return df4.c();
    }

    @Override // defpackage.scg
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.scg
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            i2d i2dVar = i2d.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) xvc.a(list).toArray(new String[0]));
        }
    }
}
