package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum bo6 {
    MESSAGE("Message"),
    CHAT_MESSAGE("ChatMessage"),
    CHANNEL_MESSAGE("ChatMessage-channel"),
    CHANNEL_MESSAGE_EDITED("ChatMessageEdited-channel"),
    CHAT_SYSTEM_MESSAGE("ChatSystemMessage"),
    CHAT_REPLY("ChatReply"),
    GROUP_CHAT("GroupChat"),
    SCHEDULED("Scheduled"),
    MESSAGE_EDITED("MessageEdited"),
    CHAT_MESSAGE_EDITED("ChatMessageEdited"),
    UNKNOWN("Unknown");

    public static final bo6[] b = values();
    public final String a;

    bo6(String str) {
        this.a = str;
    }
}
