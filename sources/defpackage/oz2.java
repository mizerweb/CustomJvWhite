package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.devmenu.tools.ChatInfoDevWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class oz2 extends LinearLayout implements eph {
    public final TextView a;

    public oz2(ChatInfoDevWidget chatInfoDevWidget, Context context) {
        super(context);
        TextView textView = new TextView(getContext());
        this.a = textView;
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        setOrientation(1);
        a8g a8gVar = pq3.j;
        setBackgroundColor(a8gVar.h(this).b().c);
        p1c p1cVar = new p1c(getContext(), 14);
        p1cVar.setHint("id чата");
        int i = 2;
        p1cVar.addTextChangedListener(new a3(i, chatInfoDevWidget));
        p1cVar.setSingleLine(true);
        addView(p1cVar);
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setSingleLine(false);
        textView.setText((CharSequence) null);
        textView.setTextColor(a8gVar.h(textView).getText().b);
        textView.setOnLongClickListener(new cw0(i, textView));
        addView(textView);
        chatInfoDevWidget.c = textView;
    }

    public final TextView getTextView() {
        return this.a;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        a8g a8gVar = pq3.j;
        setBackgroundColor(a8gVar.h(this).b().c);
        this.a.setTextColor(a8gVar.h(this).getText().b);
    }
}
