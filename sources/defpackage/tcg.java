package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class tcg extends s30 {
    public final Socket m;

    public tcg(Socket socket) {
        this.m = socket;
    }

    @Override // defpackage.s30
    public final void k() {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e) {
            Logger logger = xsb.a;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? r5h.L0(message, "getsockname failed", false) : false) {
                    xsb.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                    return;
                }
            }
            throw e;
        } catch (Exception e2) {
            xsb.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
