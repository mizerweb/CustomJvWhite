package defpackage;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* JADX INFO: loaded from: classes2.dex */
public final class go5 {
    public final ConversationVideoTrackParticipantKey a;
    public final int b;
    public final int c;

    public go5(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, int i, int i2) {
        this.a = conversationVideoTrackParticipantKey;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go5)) {
            return false;
        }
        go5 go5Var = (go5) obj;
        return this.a.equals(go5Var.a) && this.b == go5Var.b && this.c == go5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayLayout(track=");
        sb.append(this.a);
        sb.append(", w=");
        sb.append(this.b);
        sb.append(", h=");
        return zo5.t(sb, this.c, ")");
    }
}
