package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class z15 extends m4j {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z15(Uri uri, int i) {
        super(uui.c, uri, false);
        this.d = i;
        switch (i) {
            case 1:
                super(uui.b, uri, false);
                break;
            case 2:
                super(uui.d, uri, false);
                break;
            case 3:
                super(uui.a, uri, false);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.m4j
    public final m4j c(String str) {
        int i = this.d;
        Uri uri = this.b;
        switch (i) {
            case 0:
                return new z15(m4j.d(uri, str), 0);
            case 1:
                return new z15(m4j.d(uri, str), 1);
            case 2:
                return new z15(m4j.d(uri, str), 2);
            default:
                return new z15(m4j.d(uri, str), 3);
        }
    }
}
