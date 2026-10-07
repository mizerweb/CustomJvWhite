package defpackage;

import android.text.Spannable;

/* JADX INFO: loaded from: classes.dex */
public interface gn9 extends ft4 {
    default void a(Spannable spannable, int i, int i2) {
        n1g.e0(spannable, this, i, i2, 33);
    }

    default byte b() {
        return (byte) 127;
    }

    int getType();
}
