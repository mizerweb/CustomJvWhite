package androidx.camera.core;

/* JADX INFO: loaded from: classes3.dex */
public class ImageCaptureException extends Exception {
    public final int a;

    public ImageCaptureException(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
