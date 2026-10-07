package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class m8a extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(l8a l8aVar) {
        String string;
        izb izbVar = (izb) this.a;
        long j = l8aVar.a;
        izbVar.setId(Long.hashCode(j));
        izbVar.setEnabled(l8aVar.j);
        izbVar.setTitle(l8aVar.b);
        izbVar.setSubtitle(l8aVar.d.b(izbVar.getContext()));
        izbVar.setVerified(l8aVar.g);
        ynh ynhVar = l8aVar.m;
        izbVar.setAlias(ynhVar != null ? ynhVar.b(izbVar.getContext()) : null);
        izbVar.i();
        izbVar.setOnClickListener(null);
        CharSequence charSequence = l8aVar.f;
        Uri uri = l8aVar.e;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        izbVar.j(j, charSequence, string);
        izbVar.setSelectionEnabled(false);
    }
}
