package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface xt3 extends Closeable, l68, HasExtraData {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    l68 getImageInfo();

    i1e getQualityInfo();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
