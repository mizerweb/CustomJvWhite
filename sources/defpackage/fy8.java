package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fy8 extends FrameLayout {
    public static final /* synthetic */ int q = 0;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final Paint k;
    public final int[] l;
    public final RectF m;
    public ImageView n;
    public fy8 o;
    public final ImageView p;

    public fy8(Context context) {
        super(context);
        this.a = yl5.d().getDisplayMetrics().density * 12.0f;
        this.b = yl5.d().getDisplayMetrics().density * 4.0f;
        this.c = yl5.d().getDisplayMetrics().density * 31.0f;
        this.d = yl5.d().getDisplayMetrics().density * 49.0f;
        this.e = yl5.d().getDisplayMetrics().density * 20.0f;
        this.f = yl5.d().getDisplayMetrics().density * 64.0f;
        this.g = yl5.d().getDisplayMetrics().density * 40.0f;
        this.h = yl5.d().getDisplayMetrics().density * 200.0f;
        this.i = yl5.d().getDisplayMetrics().density * 59.0f;
        this.j = yl5.d().getDisplayMetrics().density * 16.0f;
        Paint paint = new Paint(1);
        pq3.j.e(context).m();
        paint.setColor(-1375731713);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        this.k = paint;
        this.l = new int[2];
        this.m = new RectF();
        int iJ = gm0.J(((double) yl5.d().getDisplayMetrics().density) * 72.8d);
        int iK = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        ImageView imageViewD = qv1.d(context, R.id.story_delete_layer_icon_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iJ, iJ);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = iK;
        imageViewD.setLayoutParams(layoutParams);
        imageViewD.setImageResource(R.drawable.avd_delete_hover_in);
        imageViewD.setVisibility(8);
        imageViewD.setAlpha(0.0f);
        this.p = imageViewD;
        setId(R.id.story_layer_drag_overlay_id);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setWillNotDraw(false);
        addView(imageViewD);
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ImageView imageView = this.n;
        if (imageView != null && (viewPropertyAnimatorAnimate2 = imageView.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        this.n = null;
        fy8 fy8Var = this.o;
        if (fy8Var != null && (viewPropertyAnimatorAnimate = fy8Var.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        this.o = null;
    }

    public final ImageView getDeleteIcon() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float f = this.a;
        float f2 = this.b;
        float f3 = this.a;
        Paint paint = this.k;
        canvas.drawRoundRect(f3, f3, width - f, f + f2, f2, f2, paint);
        canvas.drawCircle(this.c, this.d, this.e, paint);
        float f4 = this.i;
        float f5 = this.j;
        canvas.drawRoundRect(this.f, this.g, this.h, f4, f5, f5, paint);
    }
}
