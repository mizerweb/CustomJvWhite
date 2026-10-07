package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b7a extends LinearLayout implements eph {
    public boolean a;
    public final ImageView b;
    public final TextView c;

    public b7a(Context context) {
        super(context, null, 0);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setLayoutParams(layoutParams);
        this.b = imageView;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setMaxWidth(gm0.K(72.0f * yl5.d().getDisplayMetrics().density));
        q9i.a(q9i.k, textView);
        this.c = textView;
        setId(R.id.media_bar__media_type_picker_button);
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setMinimumWidth(gm0.K(60.0f * yl5.d().getDisplayMetrics().density));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), getPaddingBottom());
        addView(imageView);
        addView(textView);
        a();
    }

    public final void a() {
        boolean z = this.a;
        ImageView imageView = this.b;
        a8g a8gVar = pq3.j;
        TextView textView = this.c;
        if (z) {
            textView.setTextColor(a8gVar.h(this).getText().b);
            imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(this).getIcon().b));
        } else {
            textView.setTextColor(a8gVar.h(this).getText().d);
            imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(this).getIcon().d));
        }
    }

    public final ImageView getIcon() {
        return this.b;
    }

    public final TextView getText() {
        return this.c;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        a();
    }

    public final void setIsSelected(boolean z) {
        this.a = z;
        a();
    }

    public final void setState(n7a n7aVar) {
        this.c.setText(n7aVar.c);
        this.b.setImageResource(n7aVar.b);
    }
}
