package org.apache.http.impl.conn;

import defpackage.c;
import defpackage.ore;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    private static final PlainSocketFactory staticPlainSocketFactory = new PlainSocketFactory();
    protected SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry) {
        if (schemeRegistry != null) {
            this.schemeRegistry = schemeRegistry;
        } else {
            ore.p("Scheme registry must not be null.");
            throw null;
        }
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc A[SYNTHETIC] */
    @Override // org.apache.http.conn.ClientConnectionOperator
    public void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) throws IOException {
        LayeredSocketFactory layeredSocketFactory;
        SocketFactory socketFactory;
        int i;
        int i2;
        int i3;
        ConnectException connectException;
        if (operatedClientConnection == null) {
            ore.p("Connection must not be null.");
            return;
        }
        if (httpHost == null) {
            ore.p("Target host must not be null.");
            return;
        }
        if (httpParams == null) {
            ore.p("Parameters must not be null.");
            return;
        }
        if (operatedClientConnection.isOpen()) {
            ore.p("Connection must not be open.");
            return;
        }
        Scheme scheme = this.schemeRegistry.getScheme(httpHost.getSchemeName());
        SocketFactory socketFactory2 = scheme.getSocketFactory();
        if (socketFactory2 instanceof LayeredSocketFactory) {
            layeredSocketFactory = (LayeredSocketFactory) socketFactory2;
            socketFactory = staticPlainSocketFactory;
        } else {
            layeredSocketFactory = null;
            socketFactory = socketFactory2;
        }
        InetAddress[] allByName = InetAddress.getAllByName(httpHost.getHostName());
        for (int i4 = 0; i4 < allByName.length; i4 = i3 + 1) {
            Socket socketCreateSocket = socketFactory.createSocket();
            operatedClientConnection.opening(socketCreateSocket, httpHost);
            try {
                try {
                    try {
                        String hostAddress = allByName[i4].getHostAddress();
                        i = i4;
                        i2 = 1;
                        try {
                            Socket socketConnectSocket = socketFactory.connectSocket(socketCreateSocket, hostAddress, scheme.resolvePort(httpHost.getPort()), inetAddress, 0, httpParams);
                            if (socketCreateSocket != socketConnectSocket) {
                                operatedClientConnection.opening(socketConnectSocket, httpHost);
                                socketCreateSocket = socketConnectSocket;
                            }
                            try {
                                prepareSocket(socketCreateSocket, httpContext, httpParams);
                                if (layeredSocketFactory == null) {
                                    operatedClientConnection.openCompleted(socketFactory2.isSecure(socketCreateSocket), httpParams);
                                    return;
                                }
                                Socket socketCreateSocket2 = layeredSocketFactory.createSocket(socketCreateSocket, httpHost.getHostName(), scheme.resolvePort(httpHost.getPort()), true);
                                if (socketCreateSocket2 != socketCreateSocket) {
                                    operatedClientConnection.opening(socketCreateSocket2, httpHost);
                                }
                                operatedClientConnection.openCompleted(socketFactory2.isSecure(socketCreateSocket2), httpParams);
                                return;
                            } catch (SocketException e) {
                                e = e;
                                i3 = i;
                                if (i3 == allByName.length - i2) {
                                    if (e instanceof ConnectException) {
                                        connectException = (ConnectException) e;
                                    } else {
                                        ConnectException connectException2 = new ConnectException(e.getMessage());
                                        connectException2.initCause(e);
                                        connectException = connectException2;
                                    }
                                    throw new HttpHostConnectException(httpHost, connectException);
                                }
                            } catch (ConnectTimeoutException e2) {
                                e = e2;
                                i3 = i;
                                if (i3 != allByName.length - i2) {
                                    throw e;
                                }
                            }
                        } catch (SocketException e3) {
                            e = e3;
                            i3 = i;
                            if (i3 == allByName.length - i2) {
                                if (e instanceof ConnectException) {
                                    connectException = (ConnectException) e;
                                } else {
                                    ConnectException connectException3 = new ConnectException(e.getMessage());
                                    connectException3.initCause(e);
                                    connectException = connectException3;
                                }
                                throw new HttpHostConnectException(httpHost, connectException);
                            }
                        } catch (ConnectTimeoutException e4) {
                            e = e4;
                            i3 = i;
                            if (i3 != allByName.length - i2) {
                                throw e;
                            }
                        }
                    } catch (SocketException e5) {
                        e = e5;
                        i = i4;
                        i2 = 1;
                    }
                } catch (ConnectTimeoutException e6) {
                    e = e6;
                    i = i4;
                    i2 = 1;
                }
            } catch (SocketException e7) {
                e = e7;
                i3 = i4;
                i2 = 1;
            }
        }
    }

    public void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) throws IOException {
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        int linger = HttpConnectionParams.getLinger(httpParams);
        if (linger >= 0) {
            socket.setSoLinger(linger > 0, linger);
        }
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public void updateSecureConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (operatedClientConnection == null) {
            ore.p("Connection must not be null.");
            return;
        }
        if (httpHost == null) {
            ore.p("Target host must not be null.");
            return;
        }
        if (httpParams == null) {
            ore.p("Parameters must not be null.");
            return;
        }
        if (!operatedClientConnection.isOpen()) {
            ore.p("Connection must be open.");
            return;
        }
        Scheme scheme = this.schemeRegistry.getScheme(httpHost.getSchemeName());
        if (!(scheme.getSocketFactory() instanceof LayeredSocketFactory)) {
            c.f(scheme.getName(), ") must have layered socket factory.", "Target scheme (");
            return;
        }
        LayeredSocketFactory layeredSocketFactory = (LayeredSocketFactory) scheme.getSocketFactory();
        try {
            Socket socketCreateSocket = layeredSocketFactory.createSocket(operatedClientConnection.getSocket(), httpHost.getHostName(), scheme.resolvePort(httpHost.getPort()), true);
            prepareSocket(socketCreateSocket, httpContext, httpParams);
            operatedClientConnection.update(socketCreateSocket, httpHost, layeredSocketFactory.isSecure(socketCreateSocket), httpParams);
        } catch (ConnectException e) {
            throw new HttpHostConnectException(httpHost, e);
        }
    }
}
