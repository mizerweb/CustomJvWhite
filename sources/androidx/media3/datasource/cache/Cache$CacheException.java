package androidx.media3.datasource.cache;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Cache$CacheException extends IOException {
    public Cache$CacheException(String str) {
        super(str);
    }

    public Cache$CacheException(IOException iOException) {
        super(iOException);
    }

    public Cache$CacheException(String str, IOException iOException) {
        super(str, iOException);
    }
}
