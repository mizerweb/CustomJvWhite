package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class r56 extends yab {
    public final q56 h;

    public r56(TextView textView) {
        this.h = new q56(textView);
    }

    @Override // defpackage.yab
    public final void C0(boolean z) {
        if (l46.k != null) {
            this.h.C0(z);
        }
    }

    @Override // defpackage.yab
    public final void D0(boolean z) {
        boolean z2 = l46.k != null;
        q56 q56Var = this.h;
        if (z2) {
            q56Var.D0(z);
        } else {
            q56Var.j = z;
        }
    }

    @Override // defpackage.yab
    public final InputFilter[] K(InputFilter[] inputFilterArr) {
        return !(l46.k != null) ? inputFilterArr : this.h.K(inputFilterArr);
    }

    @Override // defpackage.yab
    public final TransformationMethod L0(TransformationMethod transformationMethod) {
        return !(l46.k != null) ? transformationMethod : this.h.L0(transformationMethod);
    }

    @Override // defpackage.yab
    public final boolean e0() {
        return this.h.j;
    }
}
