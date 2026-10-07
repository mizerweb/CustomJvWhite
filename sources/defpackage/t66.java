package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class t66 extends View implements eph {
    public int[] a;
    public final Drawable b;
    public final Paint c;

    public t66(Context context) {
        super(context);
        this.a = ((oac) pq3.j.h(this).d().b).a;
        this.b = getContext().getDrawable(R.drawable.icon_new_story).mutate();
        setLayerType(2, null);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setShader(a());
        this.c = paint;
    }

    public final LinearGradient a() {
        return new LinearGradient(0.0f, 0.0f, gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density), this.a, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.b.draw(canvas);
        canvas.drawRect(0.0f, 0.0f, width, height, this.c);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.b.setBounds(0, 0, i, i2);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a = ((oac) kbcVar.d().b).a;
        this.c.setShader(a());
    }
}
