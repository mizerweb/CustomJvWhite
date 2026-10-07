package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qw8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ qw8(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
        }
    }
}
