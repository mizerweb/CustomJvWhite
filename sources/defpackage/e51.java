package defpackage;

import android.R;
import android.app.job.JobScheduler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e51 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};

    public static JobScheduler a(JobScheduler jobScheduler) {
        return jobScheduler.forNamespace("androidx.work.systemjobscheduler");
    }

    public static void b(e31 e31Var, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = e31Var.e;
            int i2 = e31Var.f;
            int i3 = e31Var.g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            j = e31Var.d;
            if (j == e31Var.a.b) {
                ore.k("no more bytes");
                return;
            }
        } while (e31Var.g(j == -1 ? 0L : j + ((long) (e31Var.g - e31Var.f))) != -1);
    }
}
