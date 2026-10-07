package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l7c implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                p1c p1cVar = (p1c) obj;
                if (i != 3) {
                    return false;
                }
                ml9.d(p1cVar);
                return true;
            default:
                return ((Boolean) ((cf7) obj).invoke(Integer.valueOf(i))).booleanValue();
        }
    }
}
