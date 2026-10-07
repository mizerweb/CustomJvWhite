package ru.ok.android.externcalls.sdk.events;

import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* JADX INFO: loaded from: classes.dex */
public interface RecordEventListener {
    default void onRecordDataChanged() {
    }

    default void onRecordError(String str) {
    }

    default void onRecordStarted() {
    }

    default void onRecordStopped(ConversationParticipant conversationParticipant) {
    }
}
