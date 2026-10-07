package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class klb {
    public final Bundle a;
    public IconCompat b;
    public final bie[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public klb(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, bie[] bieVarArr, boolean z, int i, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.e() == 2) {
            this.g = iconCompat.d();
        }
        this.h = qlb.c(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = bieVarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
    }

    public final IconCompat a() {
        int i;
        if (this.b == null && (i = this.g) != 0) {
            this.b = IconCompat.c(null, "", i);
        }
        return this.b;
    }

    public klb(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
    }
}
