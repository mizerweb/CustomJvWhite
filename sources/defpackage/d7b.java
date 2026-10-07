package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d7b implements pah, Serializable {
    public final int a;

    public d7b() {
        oc9.p(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // defpackage.pah
    public final Object get() {
        return new ArrayList(this.a);
    }
}
