package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ku2 extends View {
    public ote a;
    public kwb b;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ote oteVar = this.a;
        if (oteVar != null) {
            oteVar.setCallback(this.b);
        }
        this.a = null;
        this.b = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kwb kwbVar;
        ote oteVar = this.a;
        if (oteVar != null && (kwbVar = this.b) != null && getWidth() > 0 && kwbVar.getMeasuredWidth() > 0) {
            float width = getWidth() / kwbVar.getMeasuredWidth();
            oteVar.setBounds(0, 0, kwbVar.getMeasuredWidth(), kwbVar.getMeasuredWidth());
            int iSave = canvas.save();
            canvas.scale(width, width, 0.0f, 0.0f);
            try {
                oteVar.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }
}
