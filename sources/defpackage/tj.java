package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class tj {
    public final EnhancedVectorDrawable a;
    public final ArrayList b;
    public final ArrayMap c;

    public tj(EnhancedVectorDrawable enhancedVectorDrawable, ArrayList arrayList, ArrayMap arrayMap) {
        this.a = enhancedVectorDrawable;
        this.b = arrayList;
        this.c = arrayMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return this.a.equals(tjVar.a) && this.b.equals(tjVar.b) && this.c.equals(tjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ParsedResource(drawable=" + this.a + ", animators=" + this.b + ", targetNameMap=" + this.c + ")";
    }
}
