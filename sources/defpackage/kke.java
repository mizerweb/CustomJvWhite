package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class kke {
    public final ArrayList a;
    public final boolean b;

    public kke(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kke)) {
            return false;
        }
        kke kkeVar = (kke) obj;
        return this.a.equals(kkeVar.a) && this.b == kkeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplyKeyboard(buttons=" + this.a + ", defaultInputDisabled=" + this.b + ")";
    }
}
