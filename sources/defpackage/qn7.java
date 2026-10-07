package defpackage;

import android.net.Uri;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qn7 implements k79 {
    public final long a;
    public final String b;
    public final xcd c;
    public final xcd d;
    public final boolean e;
    public final Uri f;
    public final pj4 g;
    public final List h;
    public final long i;

    public qn7(long j, String str, xcd xcdVar, xcd xcdVar2, boolean z, Uri uri, pj4 pj4Var, List list) {
        this.a = j;
        this.b = str;
        this.c = xcdVar;
        this.d = xcdVar2;
        this.e = z;
        this.f = uri;
        this.g = pj4Var;
        this.h = list;
        this.i = j;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.i;
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.oneme_contactlist_global_contact_view_type;
    }
}
