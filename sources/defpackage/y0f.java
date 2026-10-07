package defpackage;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandlesVM;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y0f implements a1f {
    public final b1f a;
    public boolean b;
    public Bundle c;
    public final ifh d;

    public y0f(b1f b1fVar, i8j i8jVar) {
        this.a = b1fVar;
        this.d = new ifh(new ys7(2, i8jVar));
    }

    @Override // defpackage.a1f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((v0f) entry.getValue()).b().a();
            if (!cqk.d(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.c = bundle;
        this.b = true;
    }
}
