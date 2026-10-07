package androidx.media3.common;

import defpackage.zo5;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoFrameProcessingException extends Exception {
    public VideoFrameProcessingException(long j, Throwable th) {
        super(j == -9223372036854775807L ? " @UNSET" : zo5.j(j, " @"), th);
    }

    public static VideoFrameProcessingException a(long j, Exception exc) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(j, exc);
    }

    public VideoFrameProcessingException(Throwable th) {
        this(-9223372036854775807L, th);
    }

    public VideoFrameProcessingException(String str) {
        super(str.concat(" @UNSET"));
    }
}
