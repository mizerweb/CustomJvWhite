package defpackage;

import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ffd implements ActionResult {
    public final ConversationParams a;
    public final Set b;

    public ffd(ConversationParams conversationParams, Set set) {
        this.a = conversationParams;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffd)) {
            return false;
        }
        ffd ffdVar = (ffd) obj;
        return cqk.d(this.a, ffdVar.a) && this.b.equals(ffdVar.b);
    }

    public final int hashCode() {
        ConversationParams conversationParams = this.a;
        return this.b.hashCode() + ((conversationParams == null ? 0 : conversationParams.hashCode()) * 31);
    }

    public final String toString() {
        return "PrepareResult(conversationParams=" + this.a + ", unresolvedParticipantIds=" + this.b + ")";
    }
}
