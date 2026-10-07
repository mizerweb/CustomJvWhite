package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0m {
    public static final int a(RecyclerView recyclerView, int i, int i2) {
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        if (width <= 0) {
            width = (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        }
        int i3 = width - (i * i2);
        int i4 = i2 - 1;
        return i3 / (i4 >= 1 ? i4 : 1);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, np4.f(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }
}
