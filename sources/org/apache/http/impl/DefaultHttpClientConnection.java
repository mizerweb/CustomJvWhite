package org.apache.http.impl;

import defpackage.ore;
import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultHttpClientConnection extends SocketHttpClientConnection {
    @Override // org.apache.http.impl.SocketHttpClientConnection
    public void bind(Socket socket, HttpParams httpParams) throws IOException {
        if (socket == null) {
            ore.p("Socket may not be null");
            return;
        }
        if (httpParams == null) {
            ore.p("HTTP parameters may not be null");
            return;
        }
        assertNotOpen();
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        int linger = HttpConnectionParams.getLinger(httpParams);
        if (linger >= 0) {
            socket.setSoLinger(linger > 0, linger);
        }
        super.bind(socket, httpParams);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        if (isOpen()) {
            stringBuffer.append(getRemotePort());
        } else {
            stringBuffer.append("closed");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
