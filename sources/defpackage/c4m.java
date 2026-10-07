package defpackage;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c4m {
    public static sg8 c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return new sg8(inputConnection, new oo6(12, view));
    }

    public int a(View view, int i) {
        return 0;
    }

    public int b(View view, int i) {
        return 0;
    }

    public int d(int i) {
        return i;
    }

    public int e(View view) {
        return 0;
    }

    public int f(View view) {
        return 0;
    }

    public void g(View view, int i) {
    }

    public void h(int i) {
    }

    public abstract void i(View view, int i, int i2);

    public abstract void j(View view, float f, float f2);

    public abstract boolean k(View view, int i);
}
