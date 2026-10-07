package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public class dt extends ex8 {
    public final /* synthetic */ AppCompatTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(AppCompatTextView appCompatTextView) {
        super(2, appCompatTextView);
        this.c = appCompatTextView;
    }

    @Override // defpackage.ex8, defpackage.ct
    public final void g(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // defpackage.ex8, defpackage.ct
    public final void l(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
