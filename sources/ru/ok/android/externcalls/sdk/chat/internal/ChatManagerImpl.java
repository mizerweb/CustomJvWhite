package ru.ok.android.externcalls.sdk.chat.internal;

import defpackage.af7;
import defpackage.cf7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager;
import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ>\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/internal/ChatManagerImpl;", "Lru/ok/android/externcalls/sdk/chat/ChatManager;", "Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;", "Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;)V", "Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;", "listener", "Lsbi;", "addListener", "(Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "message", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "sendMessage", "(Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;", "Lru/ok/android/externcalls/sdk/chat/internal/listener/ChatListenerManager;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatManagerImpl implements ChatManager, ChatCommandExecutor, ChatListenerManager {
    private final ChatCommandExecutor commandExecutor;
    private final ChatListenerManager listenerManager;

    public ChatManagerImpl(ChatCommandExecutor chatCommandExecutor, ChatListenerManager chatListenerManager) {
        this.commandExecutor = chatCommandExecutor;
        this.listenerManager = chatListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager
    public void addListener(ChatManagerListener listener) {
        this.listenerManager.addListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager
    public void removeListener(ChatManagerListener listener) {
        this.listenerManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor
    public void sendMessage(OutboundMessage message, af7 onSuccess, cf7 onError) {
        this.commandExecutor.sendMessage(message, onSuccess, onError);
    }
}
