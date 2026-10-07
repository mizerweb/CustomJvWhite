package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class d68 {
    public static final d68 c = new d68(new qg7(4));
    public final Bitmap.Config a;
    public final Bitmap.Config b;

    public d68(qg7 qg7Var) {
        this.a = (Bitmap.Config) qg7Var.b;
        this.b = (Bitmap.Config) qg7Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d68 d68Var = (d68) obj;
        return this.a == d68Var.a && this.b == d68Var.b;
    }

    public final int hashCode() {
        int iOrdinal = (this.a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.b;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.u(100, "minDecodeIntervalMs");
        dc9VarC.u(Integer.MAX_VALUE, "maxDimensionPx");
        dc9VarC.w("decodePreviewFrame", false);
        dc9VarC.w("useLastFrameForPreview", false);
        dc9VarC.w("useEncodedImageForPreview", false);
        dc9VarC.w("decodeAllFrames", false);
        dc9VarC.w("forceStaticImage", false);
        dc9VarC.v(this.a.name(), "bitmapConfigName");
        dc9VarC.v(this.b.name(), "animatedBitmapConfigName");
        dc9VarC.v(null, "customImageDecoder");
        dc9VarC.v(null, "bitmapTransformation");
        dc9VarC.v(null, "colorSpace");
        return zo5.w(sb, dc9VarC.toString(), "}");
    }
}
