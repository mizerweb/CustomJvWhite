package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rm9 extends s2 {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ tm9 b;

    public rm9(Map.Entry entry, tm9 tm9Var) {
        this.a = entry;
        this.b = tm9Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.h(entry.getKey(), entry.getValue());
    }
}
