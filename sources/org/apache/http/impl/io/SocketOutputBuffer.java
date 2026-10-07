package org.apache.http.impl.io;

import defpackage.ore;
import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        if (socket != null) {
            init(socket.getOutputStream(), 8192, httpParams);
        } else {
            ore.p("Socket may not be null");
            throw null;
        }
    }
}
