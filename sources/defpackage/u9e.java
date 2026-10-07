package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class u9e extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(s9e s9eVar) {
        boolean z = s9eVar.g;
        View view = this.a;
        if (z) {
            ((t9e) view).setAvatarShape(cwb.a);
        }
        ((t9e) view).setAvatar(s9eVar.c);
        ((t9e) view).setAbbreviation(gm0.a(s9eVar.d, Long.valueOf(this.e)));
        ((t9e) view).setName(s9eVar.b);
        ((t9e) view).setVerified(s9eVar.f);
        ((t9e) view).setOnline(s9eVar.e);
    }
}
