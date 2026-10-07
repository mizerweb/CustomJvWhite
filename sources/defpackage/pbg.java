package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes3.dex */
public final class pbg extends lfe implements tg8 {
    public final int u;
    public final gc4 v;
    public final bc4 w;
    public final /* synthetic */ qbg x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbg(qbg qbgVar, int i, gc4 gc4Var, bc4 bc4Var) {
        super(bc4Var);
        this.x = qbgVar;
        this.u = i;
        this.v = gc4Var;
        this.w = bc4Var;
    }

    public final String B() {
        Editable text = this.w.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final void C(String str) {
        bc4 bc4Var = this.w;
        bc4Var.setText(str);
        bc4Var.setSelection(bc4Var.length());
    }
}
