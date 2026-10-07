package defpackage;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* JADX INFO: loaded from: classes.dex */
public final class p4j {
    public final boolean a;
    public final ConversationVideoTrackParticipantKey b;
    public final boolean c;

    public p4j(boolean z, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z2) {
        this.a = z;
        this.b = conversationVideoTrackParticipantKey;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4j)) {
            return false;
        }
        p4j p4jVar = (p4j) obj;
        return this.a == p4jVar.a && this.b.equals(p4jVar.b) && this.c == p4jVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoState(isEnabled=");
        sb.append(this.a);
        sb.append(", track=");
        sb.append(this.b);
        sb.append(", isSelf=");
        return qt4.r(sb, this.c, ")");
    }
}
