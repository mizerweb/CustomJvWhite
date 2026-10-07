package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;

/* JADX INFO: loaded from: classes.dex */
public interface g32 extends ConversationEventsListener, b32, MediaConnectionListener {
    @Override // defpackage.b32
    default void b(String str) {
    }

    @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    default void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
    }

    @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    default void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }
}
