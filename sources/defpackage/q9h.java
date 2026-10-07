package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class q9h {
    public final o9h a;
    public final ArrayList b;

    public q9h(o9h o9hVar, ArrayList arrayList) {
        this.a = o9hVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9h)) {
            return false;
        }
        q9h q9hVar = (q9h) obj;
        return this.a == q9hVar.a && this.b.equals(q9hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestionSearchResult(state=" + this.a + ", mentions=" + this.b + ")";
    }
}
