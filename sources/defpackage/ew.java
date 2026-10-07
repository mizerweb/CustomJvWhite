package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class ew extends c2 {
    public final transient int g;

    public ew() {
        super(u44.b(12));
        oc9.p(3, "expectedValuesPerKey");
        this.g = 3;
    }

    @Override // defpackage.c2
    public final Collection h() {
        return new ArrayList(this.g);
    }
}
