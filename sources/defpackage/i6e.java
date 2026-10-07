package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class i6e {
    public final Context a;

    public i6e(Context context) {
        this.a = context;
    }

    public final int a() {
        return hsl.c(this.a) >= 360 ? 32 : 28;
    }
}
