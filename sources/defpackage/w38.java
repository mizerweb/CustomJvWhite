package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w38 extends View {
    public final cf7 a;
    public Drawable b;
    public float c;
    public final Rect d;
    public final int e;
    public final float f;
    public final Paint g;
    public final Matrix h;
    public final int[] i;

    public w38(Context context, cf7 cf7Var) {
        super(context, null);
        this.a = cf7Var;
        this.b = getContext().getDrawable(R.drawable.icon_user_add).mutate();
        this.d = new Rect();
        this.e = 3;
        this.f = 0.9f;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.g = paint;
        this.h = new Matrix();
        this.i = new int[]{tre.I0(0, 0.75f), -16777216};
    }

    public final void a(Canvas canvas, float f, float f2, float f3, int i, u38 u38Var) {
        List listSingletonList;
        Drawable.ConstantState constantState;
        if (i >= this.e) {
            return;
        }
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i2 * 45;
            double radians = Math.toRadians(i3);
            u38 u38Var2 = u38.d;
            if (u38Var == u38Var2 || u38Var.a.contains(Double.valueOf(radians))) {
                float fCos = (((float) Math.cos(radians)) * f3) + f;
                float fSin = (((float) Math.sin(radians)) * f3) + f2;
                float fK = gm0.K(((Number) this.a.invoke((u38Var != u38Var2 || i3 % 90 == 0) ? Integer.valueOf(i) : Integer.valueOf(i + 1))).intValue() * yl5.d().getDisplayMetrics().density) / 2;
                int i4 = (int) (fCos - fK);
                int i5 = (int) (fSin - fK);
                int i6 = (int) (fCos + fK);
                int i7 = (int) (fSin + fK);
                Rect rect = this.d;
                rect.set(i4, i5, i6, i7);
                Drawable drawable = this.b;
                Drawable drawableNewDrawable = (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    drawableNewDrawable.setBounds(rect);
                }
                if (drawableNewDrawable != null) {
                    drawableNewDrawable.draw(canvas);
                }
                rect.setEmpty();
            }
        }
        int i8 = v38.$EnumSwitchMapping$0[u38Var.ordinal()];
        if (i8 == 1) {
            listSingletonList = Collections.singletonList(Double.valueOf(Math.toRadians(180.0d)));
        } else if (i8 == 2) {
            listSingletonList = Collections.singletonList(Double.valueOf(Math.toRadians(0.0d)));
        } else {
            if (i8 != 3) {
                ore.o();
                return;
            }
            listSingletonList = xw3.P0(Double.valueOf(Math.toRadians(180.0d)), Double.valueOf(Math.toRadians(0.0d)));
        }
        List list = listSingletonList;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            arrayList.add(new ylc(Float.valueOf((((float) Math.cos(dDoubleValue)) * f3) + f), Float.valueOf((((float) Math.sin(dDoubleValue)) * f3) + f2)));
        }
        int iOrdinal = u38Var.ordinal();
        float f4 = this.f;
        if (iOrdinal == 0) {
            ylc ylcVar = (ylc) arrayList.get(0);
            a(canvas, ((Number) ylcVar.a).floatValue(), ((Number) ylcVar.b).floatValue(), f4 * f3, 1 + i, u38.b);
            return;
        }
        if (iOrdinal == 1) {
            ylc ylcVar2 = (ylc) arrayList.get(0);
            a(canvas, ((Number) ylcVar2.a).floatValue(), ((Number) ylcVar2.b).floatValue(), f4 * f3, 1 + i, u38.c);
            return;
        }
        if (iOrdinal != 2) {
            ore.o();
            return;
        }
        ylc ylcVar3 = (ylc) arrayList.get(0);
        float fFloatValue = ((Number) ylcVar3.a).floatValue();
        float fFloatValue2 = ((Number) ylcVar3.b).floatValue();
        ylc ylcVar4 = (ylc) arrayList.get(1);
        float fFloatValue3 = ((Number) ylcVar4.a).floatValue();
        float fFloatValue4 = ((Number) ylcVar4.b).floatValue();
        float f5 = f4 * f3;
        int i9 = 1 + i;
        a(canvas, fFloatValue, fFloatValue2, f5, i9, u38.b);
        a(canvas, fFloatValue3, fFloatValue4, f5, i9, u38.c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RadialGradient radialGradient = new RadialGradient(width, height, Math.max(width, height), this.i, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.h;
        matrix.reset();
        matrix.setScale(1.0f, 0.4f, width, height);
        radialGradient.setLocalMatrix(matrix);
        Paint paint = this.g;
        paint.setShader(radialGradient);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        a(canvas2, width, height, this.c, 0, u38.d);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void setIcon$common(int i) {
        this.b = getContext().getDrawable(i).mutate();
        invalidate();
    }

    public final void setInitialRadius$common(float f) {
        this.c = f;
        invalidate();
    }

    public final void setIcon$common(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }
}
