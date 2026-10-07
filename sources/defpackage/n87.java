package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class n87 {
    public final LinkedHashSet a;
    public final y3f b;

    public n87(LinkedHashSet linkedHashSet, y3f y3fVar) {
        this.a = linkedHashSet;
        this.b = y3fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n87)) {
            return false;
        }
        n87 n87Var = (n87) obj;
        return this.a.equals(n87Var.a) && this.b == n87Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ForwardInAppReviewData(triggeredConditions=" + this.a + ", screen=" + this.b + ")";
    }
}
