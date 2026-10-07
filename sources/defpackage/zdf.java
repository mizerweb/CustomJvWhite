package defpackage;

import android.net.Uri;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zdf extends s7g {
    public static final /* synthetic */ int y = 0;
    public final qyb u;
    public final l1c v;
    public final AppCompatTextView w;
    public oh7 x;

    public zdf(qyb qybVar, l1c l1cVar, AppCompatTextView appCompatTextView, LinearLayout linearLayout) {
        super(linearLayout);
        this.u = qybVar;
        this.v = l1cVar;
        this.w = appCompatTextView;
        qe7.H(linearLayout, 300L, new gwc(19, this));
        n1g.N(new vqa(this, (lq4) null, 28), appCompatTextView);
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(oh7 oh7Var) {
        String string;
        this.x = oh7Var;
        ch7 ch7VarC = oh7Var.a.a.c();
        boolean z = ch7VarC instanceof ah7;
        AppCompatTextView appCompatTextView = this.w;
        if (z) {
            string = appCompatTextView.getContext().getString(((ah7) ch7VarC).a);
        } else {
            if (!(ch7VarC instanceof bh7)) {
                ore.o();
                return;
            }
            string = ((bh7) ch7VarC).a;
        }
        appCompatTextView.setText(string);
        Uri uri = oh7Var.b;
        l1c l1cVar = this.v;
        if (uri == null) {
            l1c.j(l1cVar, null, null, 6);
            return;
        }
        w78 w78VarD = w78.d(uri);
        w78VarD.h = true;
        l1c.j(l1cVar, w78VarD.a(), null, 6);
    }
}
