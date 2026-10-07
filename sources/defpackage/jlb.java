package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jlb {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public final boolean d;
    public final Bundle e;
    public ArrayList f;
    public int g;
    public boolean h;

    public jlb(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.d = true;
        this.h = true;
        this.a = iconCompat;
        this.b = qlb.c(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = 0;
        this.h = true;
    }

    public final klb a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<bie> arrayList3 = this.f;
        if (arrayList3 != null) {
            for (bie bieVar : arrayList3) {
                if (bieVar.b()) {
                    arrayList.add(bieVar);
                } else {
                    arrayList2.add(bieVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new klb(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (bie[]) arrayList2.toArray(new bie[arrayList2.size()]), this.d, this.g, this.h);
    }

    public jlb(int i, PendingIntent pendingIntent, String str) {
        this(i != 0 ? IconCompat.c(null, "", i) : null, str, pendingIntent, new Bundle());
    }
}
