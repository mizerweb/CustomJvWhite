package defpackage;

import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: classes.dex */
public final class yad extends a {
    @Override // androidx.recyclerview.widget.a
    public final void clear() {
    }

    @Override // androidx.recyclerview.widget.a
    public final void putRecycledView(lfe lfeVar) {
        if (lfeVar == null) {
            return;
        }
        getScrapDataForType(lfeVar.f).a.size();
        super.putRecycledView(lfeVar);
    }
}
