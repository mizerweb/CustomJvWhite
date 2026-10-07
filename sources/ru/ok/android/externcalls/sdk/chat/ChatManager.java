package ru.ok.android.externcalls.sdk.chat;

import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006JA\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/ChatManager;", "", "Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;", "listener", "Lsbi;", "addListener", "(Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "message", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "sendMessage", "(Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;Laf7;Lcf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ChatManager {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void sendMessage$default(ChatManager chatManager, OutboundMessage outboundMessage, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: sendMessage");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        chatManager.sendMessage(outboundMessage, af7Var, cf7Var);
    }

    void addListener(ChatManagerListener listener);

    void removeListener(ChatManagerListener listener);

    void sendMessage(OutboundMessage message, af7 onSuccess, cf7 onError);
}
