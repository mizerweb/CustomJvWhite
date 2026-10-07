package ru.ok.android.externcalls.sdk.layout;

import defpackage.yvi;

/* JADX INFO: loaded from: classes3.dex */
public final class ConversationDisplayLayoutItem {
    private final yvi layout;
    private final ConversationVideoTrackParticipantKey videoTrackParticipantKey;

    public ConversationDisplayLayoutItem(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, yvi yviVar) {
        this.videoTrackParticipantKey = conversationVideoTrackParticipantKey;
        this.layout = yviVar;
    }

    public yvi getLayout() {
        return this.layout;
    }

    public ConversationVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.videoTrackParticipantKey;
    }
}
