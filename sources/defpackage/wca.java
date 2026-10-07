package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wca {
    public final ArrayList a;
    public final List b;

    public wca(ArrayList arrayList, List list) {
        this.a = arrayList;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wca)) {
            return false;
        }
        wca wcaVar = (wca) obj;
        return this.a.equals(wcaVar.a) && this.b.equals(wcaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MergedSearchResults(displayResults=" + this.a + ", trimmedPublicResults=" + this.b + ")";
    }
}
