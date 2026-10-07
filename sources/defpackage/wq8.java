package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class wq8 extends s7g {
    public final dc9 u;

    public wq8(Context context, dc9 dc9Var) {
        super(new izb(context, true));
        this.u = dc9Var;
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(rq8 rq8Var) {
        String string;
        izb izbVar = (izb) this.a;
        izbVar.setCallButtonMode(dzb.b);
        izbVar.setTitle(rq8Var.b);
        long j = rq8Var.a;
        CharSequence charSequence = rq8Var.d;
        Uri uri = rq8Var.c;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        izbVar.j(j, charSequence, string);
        izbVar.setSelectionEnabled(false);
        izbVar.setOnClickListener(null);
    }
}
