package defpackage;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface x18 {
    long getContentLength();

    String getContentType();

    void writeTo(OutputStream outputStream);
}
