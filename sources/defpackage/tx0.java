package defpackage;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class tx0 extends r6g {
    public final Context n;
    public final int o;

    public tx0(Context context) {
        super(new u55[1], new sx0[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.r6g
    public final u55 f() {
        return new u55(1);
    }

    @Override // defpackage.r6g
    public final v55 g() {
        return new sx0(this);
    }

    @Override // defpackage.r6g
    public final DecoderException h(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.r6g
    public final DecoderException i(u55 u55Var, v55 v55Var, boolean z) {
        sx0 sx0Var = (sx0) v55Var;
        ByteBuffer byteBuffer = u55Var.d;
        byteBuffer.getClass();
        lvb.b0(byteBuffer.hasArray());
        lvb.R(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointA = vqi.A(context);
                    int i = pointA.x;
                    int i2 = pointA.y;
                    b87 b87Var = u55Var.b;
                    if (b87Var != null) {
                        int i3 = b87Var.M;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = b87Var.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = np0.r;
                }
            }
            sx0Var.d = xel.a(byteBuffer.array(), byteBuffer.remaining(), iMax, null);
            sx0Var.b = u55Var.f;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
