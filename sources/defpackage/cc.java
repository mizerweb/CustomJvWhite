package defpackage;

import android.text.Editable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class cc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Editable b;

    public /* synthetic */ cc(View view, Editable editable, int i) {
        this.a = i;
        this.b = editable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object[] spans = null;
        int i2 = 0;
        Editable editable = this.b;
        switch (i) {
            case 0:
                if (editable != null) {
                    try {
                        spans = editable.getSpans(0, editable.length(), hi.class);
                        break;
                    } catch (Throwable unused) {
                    }
                    if (spans == null) {
                        spans = new hi[0];
                    }
                    hi[] hiVarArr = (hi[]) spans;
                    int length = hiVarArr.length;
                    while (i2 < length) {
                        ((rn) hiVarArr[i2]).b.start();
                        i2++;
                    }
                }
                break;
            default:
                try {
                    spans = editable.getSpans(0, editable.length(), hi.class);
                    break;
                } catch (Throwable unused2) {
                }
                if (spans == null) {
                    spans = new hi[0];
                }
                int length2 = spans.length;
                while (i2 < length2) {
                    ((rn) ((hi) spans[i2])).b.start();
                    i2++;
                }
                break;
        }
    }
}
