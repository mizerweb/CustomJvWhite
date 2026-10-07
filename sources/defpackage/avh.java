package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class avh extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public avh(avh avhVar) {
        super((ViewGroup.MarginLayoutParams) avhVar);
        this.a = 0;
        this.a = avhVar.a;
    }

    public avh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
