package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class km5 {
    public final Intent a;
    public final String b;

    public km5(Intent intent, String str) {
        this.a = intent;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km5)) {
            return false;
        }
        km5 km5Var = (km5) obj;
        return this.a.equals(km5Var.a) && this.b.equals(km5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DirectionsIntentHolder(intent=" + this.a + ", tag=" + this.b + ")";
    }
}
