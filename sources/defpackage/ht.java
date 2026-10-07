package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ht extends gt {
    @Override // defpackage.gt, defpackage.jt
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.jt
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
