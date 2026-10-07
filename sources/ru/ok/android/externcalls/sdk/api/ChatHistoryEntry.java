package ru.ok.android.externcalls.sdk.api;

import defpackage.qt4;
import defpackage.s4g;
import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* JADX INFO: loaded from: classes3.dex */
public class ChatHistoryEntry extends s4g {
    public final ConversationParticipant sender;

    public ChatHistoryEntry(String str, boolean z, ConversationParticipant conversationParticipant) {
        super(str, z);
        this.sender = conversationParticipant;
    }

    @Override // defpackage.s4g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return this.sender.equals(((ChatHistoryEntry) obj).sender);
        }
        return false;
    }

    @Override // defpackage.s4g
    public int hashCode() {
        return this.sender.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChatHistoryEntry{sender=");
        sb.append(this.sender);
        sb.append(", message='");
        sb.append(this.message);
        sb.append("', direct=");
        return qt4.r(sb, this.direct, "}");
    }
}
