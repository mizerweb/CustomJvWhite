package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class is extends SeekBar {
    public final js a;

    public is(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        dqh.a(this, getContext());
        js jsVar = new js(this);
        this.a = jsVar;
        jsVar.B(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        js jsVar = this.a;
        is isVar = jsVar.d;
        Drawable drawable = jsVar.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(isVar.getDrawableState())) {
            isVar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.J(canvas);
    }
}
