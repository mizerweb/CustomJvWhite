package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class lgb extends View {
    public final Paint a;
    public final Path b;
    public LinearGradient c;
    public LinearGradient d;
    public final float e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgb(Context context) {
        super(context, null, 0);
        final int i = 0;
        final int i2 = 1;
        this.a = new Paint(1);
        this.b = new Path();
        this.e = yl5.d().getDisplayMetrics().density * 16.0f;
        this.f = rx8.P(3, new af7(this) { // from class: kgb
            public final /* synthetic */ lgb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                lgb lgbVar = this.b;
                switch (i3) {
                    case 0:
                        float f = lgbVar.e;
                        return new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
                    default:
                        float f2 = lgbVar.e;
                        return new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
                }
            }
        });
        this.g = rx8.P(3, new af7(this) { // from class: kgb
            public final /* synthetic */ lgb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                lgb lgbVar = this.b;
                switch (i3) {
                    case 0:
                        float f = lgbVar.e;
                        return new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
                    default:
                        float f2 = lgbVar.e;
                        return new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
                }
            }
        });
        this.h = rx8.P(3, new cka(6));
        this.i = rx8.P(3, new cka(7));
    }

    private final float[] getMirroredRadii() {
        return (float[]) this.f.getValue();
    }

    private final float[] getRadii() {
        return (float[]) this.g.getValue();
    }

    private final int[] getShaderColors() {
        return (int[]) this.h.getValue();
    }

    private final float[] getShaderPositions() {
        return (float[]) this.i.getValue();
    }

    public final LinearGradient a(boolean z) {
        LinearGradient linearGradient = this.d;
        if (!z && linearGradient != null) {
            return linearGradient;
        }
        LinearGradient linearGradient2 = new LinearGradient(getWidth(), 0.0f, 0.0f, 0.0f, getShaderColors(), getShaderPositions(), Shader.TileMode.CLAMP);
        this.d = linearGradient2;
        return linearGradient2;
    }

    public final LinearGradient b(boolean z) {
        LinearGradient linearGradient = this.c;
        if (!z && linearGradient != null) {
            return linearGradient;
        }
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, getShaderColors(), getShaderPositions(), Shader.TileMode.CLAMP);
        this.c = linearGradient2;
        return linearGradient2;
    }

    public final void c() {
        float[] mirroredRadii = this.j ? getMirroredRadii() : getRadii();
        Path path = this.b;
        path.reset();
        path.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), mirroredRadii, Path.Direction.CW);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.b, this.a);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        a(true);
        b(true);
        this.a.setShader(this.j ? a(false) : b(false));
        c();
        invalidate();
    }

    public final void setMirrored(boolean z) {
        this.j = z;
        this.a.setShader(z ? a(false) : b(false));
        c();
        invalidate();
    }
}
