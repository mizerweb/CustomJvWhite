package defpackage;

import java.util.Comparator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class li3 extends ni3 {
    public final LinkedHashSet d;
    public final zc6 e;

    public li3(LinkedHashSet linkedHashSet) {
        super("all.chat.folder");
        this.d = linkedHashSet;
        this.e = new zc6(linkedHashSet);
    }

    @Override // defpackage.ni3
    public final Comparator a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li3) && this.d.equals(((li3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "All(favorites=" + this.d + ")";
    }
}
