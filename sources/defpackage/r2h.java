package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class r2h extends dq0 {
    public TextView g;

    @Override // defpackage.dq0
    public final void a() {
        addView(this.b);
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setTextColor(getCustomTheme().getText().b);
        q9i.a(q9i.f, textView);
        this.g = textView;
        setContentView(textView);
        addView(this.g);
    }

    public final void setTime(String str) {
        View contentView = getContentView();
        TextView textView = contentView instanceof TextView ? (TextView) contentView : null;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
