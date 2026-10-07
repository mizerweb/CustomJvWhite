package defpackage;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class wcg extends SSLSocketFactory {
    public final cp9 a;
    public final String b = qt4.j(System.identityHashCode(this), wcg.class.getName(), "@");
    public final SSLCertificateSocketFactory c;

    public wcg(Context context, cp9 cp9Var) {
        SSLSessionCache sSLSessionCache;
        this.a = cp9Var;
        try {
            sSLSessionCache = new SSLSessionCache(context.getDir("tamtam_sslcache", 0));
        } catch (IOException e) {
            gm0.V(this.b, "failed to create ssl cache with specified dir", e);
            sSLSessionCache = new SSLSessionCache(context);
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(5000, sSLSessionCache);
        this.c = sSLCertificateSocketFactory;
        sSLCertificateSocketFactory.setTrustManagers(new cp9[]{this.a});
    }

    public final Socket a(String str, af7 af7Var) {
        if (str == null || str.length() == 0) {
            return (Socket) af7Var.invoke();
        }
        String str2 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "createSocketWithHost, host=".concat(str), null);
            }
        }
        this.a.d.set(str);
        try {
            return (Socket) af7Var.invoke();
        } finally {
            this.a.c(str);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(final Socket socket, final String str, final int i, final boolean z) {
        return a(str, new af7() { // from class: vcg
            @Override // defpackage.af7
            public final Object invoke() {
                return this.a.c.createSocket(socket, str, i, z);
            }
        });
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.c.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.c.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.c;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.c;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket();
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return a(str, new t86(this, str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(final String str, final int i, final InetAddress inetAddress, final int i2) {
        return a(str, new af7() { // from class: ucg
            @Override // defpackage.af7
            public final Object invoke() {
                return this.a.c.createSocket(str, i, inetAddress, i2);
            }
        });
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        SSLCertificateSocketFactory sSLCertificateSocketFactory = this.c;
        Socket socketCreateSocket = sSLCertificateSocketFactory.createSocket(inetAddress, i, inetAddress2, i2);
        sSLCertificateSocketFactory.setUseSessionTickets(socketCreateSocket, true);
        return socketCreateSocket;
    }
}
