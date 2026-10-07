package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import java.util.ArrayList;
import one.me.calls.ui.ui.call.CallScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hx1 implements ej1 {
    public final /* synthetic */ CallScreen a;

    public hx1(CallScreen callScreen) {
        this.a = callScreen;
    }

    public final void a(int i) {
        l6m l6mVar = CallScreen.D1;
        CallScreen callScreen = this.a;
        View viewQ1 = callScreen.Q1();
        ViewStub viewStub = viewQ1 instanceof ViewStub ? (ViewStub) viewQ1 : null;
        boolean z = i > 1 && callScreen.getContext().getResources().getConfiguration().orientation == 1;
        if (viewStub == null || n7j.n(viewStub) || z) {
            if (viewStub != null) {
                TextView textView = new TextView(callScreen.getContext());
                textView.setLayoutParams(new uf4(-2, -2));
                q9i.a(q9i.m, textView);
                a8g a8gVar = pq3.j;
                textView.setTextColor(a8gVar.l(textView).b.getText().d);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText(R.string.call_opponents_scroll_to_start);
                Drawable drawableMutate = textView.getContext().getDrawable(R.drawable.icon_chevron_left_mini).mutate();
                ArrayList arrayList = soh.a;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawableTintList(ColorStateList.valueOf(a8gVar.l(textView).b.getIcon().d));
                textView.setVisibility(8);
                int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                textView.setPadding(iK, iK, iK, iK);
                qe7.H(textView, 300L, new t8(9, callScreen));
                n7j.m(viewStub, textView, null);
            }
            isk.d(callScreen.Q1(), z, 0L, null, 6);
        }
    }
}
