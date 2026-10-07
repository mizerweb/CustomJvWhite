package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l3h {
    public final vg4 a;
    public final k1h b;

    public l3h(vg4 vg4Var, k1h k1hVar) {
        this.a = vg4Var;
        this.b = k1hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l3h) {
            l3h l3hVar = (l3h) obj;
            if (this.a == l3hVar.a && cqk.d(this.b, l3hVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k1h k1hVar = this.b;
        return iHashCode + (k1hVar == null ? 0 : k1hVar.hashCode());
    }

    public final String toString() {
        return "StoryViewerModel(contact=" + this.a + ", reaction=" + this.b + ")";
    }
}
