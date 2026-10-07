package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface bj5<DetectionResultT> extends Closeable, c19 {
    public static final int a0 = 1;
    public static final int b0 = 2;
    public static final int c0 = 3;
    public static final int d0 = 4;
    public static final int e0 = 5;
    public static final int f0 = 6;
    public static final int g0 = 7;
    public static final int h0 = 8;
    public static final int i0 = 9;
    public static final int j0 = 10;
    public static final int k0 = 11;

    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    Task C0(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    Task M(Bitmap bitmap, int i);

    Task h0(Image image, int i, Matrix matrix);

    Task i(Image image, int i);

    int i0();
}
