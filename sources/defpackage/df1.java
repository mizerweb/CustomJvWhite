package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.LazyConversation;

/* JADX INFO: loaded from: classes3.dex */
public final class df1 extends kgl {
    public final LazyConversation a;

    public df1(LazyConversation lazyConversation) {
        this.a = lazyConversation;
    }

    @Override // defpackage.kgl
    public final Conversation b() {
        return this.a.getConversation();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df1) && this.a.equals(((df1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Lazy(lazyConversation=" + this.a + ")";
    }
}
