package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class rxc extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(qxc qxcVar) {
        String string;
        izb izbVar = (izb) this.a;
        izbVar.setId(Long.hashCode(qxcVar.m));
        izbVar.setActivated(qxcVar.l);
        izbVar.setTitle(qxcVar.c.a(this));
        ynh ynhVar = qxcVar.d;
        izbVar.setSubtitle(ynhVar != null ? ynhVar.b(izbVar.getContext()) : null);
        izbVar.setOnClickListener(null);
        Long l = qxcVar.b;
        if (l != null) {
            long jLongValue = l.longValue();
            CharSequence charSequence = qxcVar.i;
            Uri uri = qxcVar.e;
            if (uri == null || (string = uri.toString()) == null) {
                string = Uri.EMPTY.toString();
            }
            izbVar.j(jLongValue, charSequence, string);
        } else {
            Integer num = qxcVar.j;
            if (num != null) {
                izbVar.m(num.intValue(), qxcVar.k);
            }
        }
        izbVar.setVerified(qxcVar.g);
    }
}
