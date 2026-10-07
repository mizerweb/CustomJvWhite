package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class k21 implements scg {
    public static final j21 a = new j21();

    @Override // defpackage.scg
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.scg
    public final boolean b() {
        boolean z = i21.d;
        return h21.e();
    }

    @Override // defpackage.scg
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.scg
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            i2d i2dVar = i2d.a;
            parameters.setApplicationProtocols((String[]) xvc.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
