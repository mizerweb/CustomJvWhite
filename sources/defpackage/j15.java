package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class j15 extends q99 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j15(Uri uri) {
        super(uui.c, uri, true);
        boolean z = nec.a;
    }

    @Override // defpackage.m4j
    public final m4j c(String str) {
        return new j15(m4j.d(this.b, str));
    }
}
