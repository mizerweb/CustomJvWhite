package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class js extends ih {
    public final is d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public js(is isVar) {
        super(isVar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = isVar;
    }

    @Override // defpackage.ih
    public final void B(AttributeSet attributeSet, int i) {
        super.B(attributeSet, R.attr.seekBarStyle);
        is isVar = this.d;
        Context context = isVar.getContext();
        int[] iArr = l3e.g;
        vbf vbfVarK = vbf.k(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        i7j.k(isVar, isVar.getContext(), iArr, attributeSet, (TypedArray) vbfVarK.b, R.attr.seekBarStyle, 0);
        Drawable drawableE = vbfVarK.e(0);
        if (drawableE != null) {
            isVar.setThumb(drawableE);
        }
        Drawable drawableD = vbfVarK.d(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = drawableD;
        if (drawableD != null) {
            drawableD.setCallback(isVar);
            drawableD.setLayoutDirection(isVar.getLayoutDirection());
            if (drawableD.isStateful()) {
                drawableD.setState(isVar.getDrawableState());
            }
            I();
        }
        isVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.g = vt5.c(typedArray.getInt(3, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = vbfVarK.c(2);
            this.h = true;
        }
        vbfVarK.l();
        I();
    }

    public final void I() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void J(Canvas canvas) {
        if (this.e != null) {
            is isVar = this.d;
            int max = isVar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((isVar.getWidth() - isVar.getPaddingLeft()) - isVar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(isVar.getPaddingLeft(), isVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
