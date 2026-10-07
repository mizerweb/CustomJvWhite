package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;

/* JADX INFO: loaded from: classes2.dex */
public final class ef1 extends kgl {
    public final Conversation a;

    public ef1(Conversation conversation) {
        this.a = conversation;
    }

    @Override // defpackage.kgl
    public final Conversation b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef1) && this.a.equals(((ef1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Started(conversation=" + this.a + ")";
    }
}
