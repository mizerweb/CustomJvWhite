package defpackage;

import one.me.sdk.media.transformer.MediaTransformException;

/* JADX INFO: loaded from: classes3.dex */
public final class j56 extends Throwable {
    public final /* synthetic */ int a = 1;

    public j56(MediaTransformException mediaTransformException) {
        super(mediaTransformException.getMessage(), mediaTransformException);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 1:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    public j56() {
        super("Failure occurred while trying to finish a future.");
    }

    public j56(Throwable th) {
        super("Необработанная ошибка", th);
    }
}
