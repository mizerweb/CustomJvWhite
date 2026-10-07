package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class m04 extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(e04 e04Var) {
        String string;
        izb izbVar = (izb) this.a;
        izbVar.setCallButtonMode(dzb.a);
        izbVar.setTitle(e04Var.b);
        izbVar.setSubtitleTextColor(czb.b);
        CharSequence charSequenceB = e04Var.e.b(izbVar.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        izbVar.setSubtitle(charSequenceB);
        long j = e04Var.a;
        CharSequence charSequence = e04Var.d;
        Uri uri = e04Var.c;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        izbVar.j(j, charSequence, string);
        izbVar.setSelectionEnabled(false);
        izbVar.setOnClickListener(null);
    }
}
