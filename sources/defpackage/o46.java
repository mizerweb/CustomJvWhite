package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes2.dex */
public final class o46 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile o46 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new ieg(cls, charSequence) : super.newEditable(charSequence);
    }
}
