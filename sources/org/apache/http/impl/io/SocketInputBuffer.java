package org.apache.http.impl.io;

import defpackage.ore;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SocketInputBuffer extends AbstractSessionInputBuffer {
    private final Socket socket;

    public SocketInputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        if (socket == null) {
            ore.p("Socket may not be null");
            throw null;
        }
        this.socket = socket;
        init(socket.getInputStream(), 8192, httpParams);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws IOException {
        boolean zHasBufferedData = hasBufferedData();
        if (!zHasBufferedData) {
            int soTimeout = this.socket.getSoTimeout();
            try {
                try {
                    this.socket.setSoTimeout(i);
                    fillBuffer();
                    boolean zHasBufferedData2 = hasBufferedData();
                    this.socket.setSoTimeout(soTimeout);
                    return zHasBufferedData2;
                } catch (InterruptedIOException e) {
                    if (!(e instanceof SocketTimeoutException)) {
                        throw e;
                    }
                    this.socket.setSoTimeout(soTimeout);
                    return zHasBufferedData;
                }
            } catch (Throwable th) {
                this.socket.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return zHasBufferedData;
    }

    public boolean isStale() throws IOException {
        boolean z = false;
        if (hasBufferedData()) {
            return false;
        }
        int soTimeout = this.socket.getSoTimeout();
        try {
            this.socket.setSoTimeout(1);
            if (fillBuffer() == -1) {
                z = true;
            }
        } catch (SocketTimeoutException unused) {
        } catch (IOException unused2) {
            return true;
        } finally {
            this.socket.setSoTimeout(soTimeout);
        }
        return z;
    }
}
