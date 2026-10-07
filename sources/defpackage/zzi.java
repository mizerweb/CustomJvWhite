package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zzi extends FrameLayout {
    public final x5j a;
    public final ShapeDrawable b;
    public final Drawable c;
    public final ImageView d;
    public ViewPropertyAnimator e;

    public zzi(Context context) {
        super(context);
        x5j x5jVar = new x5j(context);
        x5jVar.setId(R.id.chat_screen__video_msg_video_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        x5jVar.setLayoutParams(layoutParams);
        x5jVar.setVideoShape(s5j.a);
        x5jVar.setVideoContentMode(r5j.b);
        this.a = x5jVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setTintList(ColorStateList.valueOf(getVolumeIconBackgroundColor()));
        this.b = shapeDrawable;
        int volumeIconColor = getVolumeIconColor();
        Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_sound_crossed_fill).mutate();
        sb8.m0(volumeIconColor, drawableMutate);
        this.c = drawableMutate;
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams2);
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setBackground(shapeDrawable);
        imageView.setImageDrawable(drawableMutate);
        n1g.N(new zu(this, (lq4) null, 16), imageView);
        this.d = imageView;
        addView(x5jVar);
        addView(imageView);
    }

    public final int getVolumeIconBackgroundColor() {
        return pq3.j.h(this).h().i;
    }

    public final int getVolumeIconColor() {
        pq3.j.h(this);
        return -1;
    }

    public final void c(boolean z) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator duration = this.d.animate().alpha(z ? 1.0f : 0.0f).setDuration(200L);
        this.e = duration;
        if (duration != null) {
            duration.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.e = null;
        super.onDetachedFromWindow();
    }
}
