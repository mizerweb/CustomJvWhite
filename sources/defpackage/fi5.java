package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi5 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (i != 6) {
                    return false;
                }
                nl9.c(textView);
                return true;
            default:
                if (i == 6) {
                    textView.clearFocus();
                }
                return false;
        }
    }
}
