package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class et extends dt {
    public final /* synthetic */ AppCompatTextView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.d = appCompatTextView;
    }

    @Override // defpackage.ex8, defpackage.ct
    public final void j(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
