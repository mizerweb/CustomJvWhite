package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ixi extends TextView {
    public ixi(Context context) {
        super(context, null, 0);
        kbc kbcVarH = pq3.j.h(this);
        setTextColor(-1);
        q9i.a(q9i.x, this);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        setIncludeFontPadding(false);
        setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        setGravity(8388627);
        setBackground(qyj.T(Integer.valueOf(kbcVarH.b().g), null, null, gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
    }

    public final void a(long j) {
        Context context = getContext();
        pq3.j.h(this);
        Drawable drawableD = sb8.D(R.drawable.icon_video_call_fill_mini, -1, context);
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawableD, (Drawable) null, (Drawable) null, (Drawable) null);
        if (drawableD instanceof AnimationDrawable) {
            post(new f4g(9, (AnimationDrawable) drawableD));
        }
        String[] strArr = woh.b;
        setText(mxl.a(j));
        setVisibility(0);
    }
}
