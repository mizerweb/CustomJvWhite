package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h67 extends hih {
    public final ArrayList c;

    public h67(ArrayList arrayList) {
        super(kfc.G3);
        this.c = arrayList;
        d("foldersOrder", arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h67) && cqk.d(this.c, ((h67) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
