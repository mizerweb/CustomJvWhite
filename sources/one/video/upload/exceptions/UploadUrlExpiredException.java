package one.video.upload.exceptions;

import defpackage.j95;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/video/upload/exceptions/UploadUrlExpiredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "one-video-upload_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UploadUrlExpiredException extends Exception {
    public /* synthetic */ UploadUrlExpiredException(String str, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : str);
    }

    public UploadUrlExpiredException(String str) {
        super(str);
    }

    public UploadUrlExpiredException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
