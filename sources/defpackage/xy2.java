package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class xy2 extends kih {
    public final ArrayList c;

    public xy2(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy2) && this.c.equals(((xy2) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chatReactionsSettings=" + this.c + ")";
    }
}
