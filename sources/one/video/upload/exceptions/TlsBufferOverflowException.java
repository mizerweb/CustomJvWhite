package one.video.upload.exceptions;

import defpackage.j95;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/video/upload/exceptions/TlsBufferOverflowException;", "Ljava/io/IOException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "one-video-upload_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TlsBufferOverflowException extends IOException {
    public /* synthetic */ TlsBufferOverflowException(String str, Throwable th, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public TlsBufferOverflowException(String str, Throwable th) {
        super(str, th);
    }
}
