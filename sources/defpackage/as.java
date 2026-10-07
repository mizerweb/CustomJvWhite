package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class as {
    public final TextView a;
    public final pgg b;

    public as(TextView textView) {
        this.a = textView;
        pgg pggVar = new pgg();
        pggVar.a = new r56(textView);
        this.b = pggVar;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((yab) this.b.a).K(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, l3e.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((yab) this.b.a).C0(z);
    }

    public final void d(boolean z) {
        ((yab) this.b.a).D0(z);
    }
}
