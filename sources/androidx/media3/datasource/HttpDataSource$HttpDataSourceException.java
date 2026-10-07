package androidx.media3.datasource;

import defpackage.n1g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(int i, int i2, IOException iOException) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.b = i2;
    }

    public static HttpDataSource$HttpDataSourceException a(int i, IOException iOException) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !n1g.b0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new HttpDataSource$HttpDataSourceException(i2, i, iOException);
    }

    public HttpDataSource$HttpDataSourceException(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.b = 1;
    }

    public HttpDataSource$HttpDataSourceException(int i) {
        super(i == 2000 ? 2001 : i);
        this.b = 1;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.b = 1;
    }
}
