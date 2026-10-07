package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fcd extends FrameLayout {
    public final boolean a;
    public Integer b;
    public Integer c;
    public AppCompatTextView d;
    public ImageView e;

    public fcd(Context context, boolean z) {
        super(context);
        this.a = z;
        setMinimumHeight(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        n1g.N(new zu(3, (lq4) null, 11), this);
    }

    public final kbc getCurrentTheme() {
        boolean z = this.a;
        a8g a8gVar = pq3.j;
        return z ? a8gVar.l(this).b : a8gVar.h(this);
    }

    public final void b(Integer num, Integer num2) {
        if (num == null) {
            gm0.Y(fcd.class.getName(), "Early return in addIcon cuz of icon is null");
            return;
        }
        int iIntValue = num.intValue();
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(iIntValue);
        int iIntValue2 = num2 != null ? num2.intValue() : R.attr.icon_primary;
        this.b = Integer.valueOf(iIntValue2);
        imageView.setImageTintList(ColorStateList.valueOf(oc9.Z(iIntValue2, getCurrentTheme())));
        n1g.N(new vqa(this, (lq4) null, 11), imageView);
        this.e = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        addView(this.e, layoutParams);
    }

    public final void c(fcd fcdVar, ynh ynhVar, Integer num, boolean z, boolean z2) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(fcdVar.getContext());
        q9i.a(q9i.e, appCompatTextView);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setText(ynhVar.b(appCompatTextView.getContext()));
        int iIntValue = num != null ? num.intValue() : R.attr.text_primary;
        this.c = Integer.valueOf(iIntValue);
        appCompatTextView.setTextColor(oc9.Z(iIntValue, getCurrentTheme()));
        n1g.N(new vqa(this, (lq4) null, 12), appCompatTextView);
        this.d = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart((z || z2) ? gm0.K(48.0f * yl5.d().getDisplayMetrics().density) : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        layoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        layoutParams.bottomMargin = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        fcdVar.addView(this.d, layoutParams);
    }
}
