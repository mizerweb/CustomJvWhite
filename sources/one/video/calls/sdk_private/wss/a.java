package one.video.calls.sdk_private.wss;

import defpackage.i2d;
import defpackage.y3e;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends SSLSocketFactory {
    public final y3e a;
    public final X509TrustManager b;
    public final SSLSocketFactory c;
    public String d;

    public a(y3e y3eVar, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyStoreException {
        y3eVar.getClass();
        this.a = y3eVar;
        if (x509TrustManager == null) {
            i2d i2dVar = i2d.a;
            x509TrustManager = i2d.a.m();
        }
        this.b = x509TrustManager;
        if (sSLSocketFactory == null) {
            i2d i2dVar2 = i2d.a;
            sSLSocketFactory = i2d.a.l(x509TrustManager);
        }
        this.c = sSLSocketFactory;
    }

    public final Socket a(Socket socket) {
        try {
            String str = this.d;
            if (str != null) {
                SSLSocket sSLSocket = socket instanceof SSLSocket ? (SSLSocket) socket : null;
                if (sSLSocket != null) {
                    SSLParameters sSLParameters = ((SSLSocket) socket).getSSLParameters();
                    sSLParameters.setServerNames(Collections.singletonList(new SNIHostName(str)));
                    sSLSocket.setSSLParameters(sSLParameters);
                }
            }
            return socket;
        } catch (IllegalArgumentException e) {
            this.a.logException("SNI_Provider", "Can't apply requested " + this.d, e);
            return socket;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.c.createSocket();
        if (socketCreateSocket != null) {
            return a(socketCreateSocket);
        }
        return null;
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
        Socket socketCreateSocket = this.c.createSocket(inetAddress, i);
        if (socketCreateSocket != null) {
            return a(socketCreateSocket);
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.c.createSocket(inetAddress, i, inetAddress2, i2);
        if (socketCreateSocket != null) {
            return a(socketCreateSocket);
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.c.createSocket(socket, str, i, z);
        if (socketCreateSocket != null) {
            return a(socketCreateSocket);
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.c.createSocket(str, i);
        if (socketCreateSocket != null) {
            return a(socketCreateSocket);
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.c.createSocket(str, i, inetAddress, i2);
        if (socketCreateSocket != null) {
            return a(socketCreateSocket);
        }
        return null;
    }
}
