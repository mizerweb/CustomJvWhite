package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class jee implements a1f {
    public final LinkedHashSet a = new LinkedHashSet();

    public jee(b1f b1fVar) {
        b1fVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.a1f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }

    public final void b(String str) {
        this.a.add(str);
    }
}
