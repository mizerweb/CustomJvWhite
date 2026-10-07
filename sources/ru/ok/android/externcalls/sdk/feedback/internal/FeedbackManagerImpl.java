package ru.ok.android.externcalls.sdk.feedback.internal;

import defpackage.af7;
import defpackage.cf7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutor;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b \u0010\u001fJ \u0010!\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006%"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/FeedbackManagerImpl;", "Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;)V", "", "key", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "source", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lkotlin/Function0;", "onSuccess", "sendFeedback", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;Lcf7;Laf7;)V", "(Ljava/lang/String;Lcf7;Laf7;)V", "", "millis", "setTimeout", "(J)V", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "getOwnCurrentFeedback", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;)V", "removeListener", "ownFeedbackSent", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;)V", "Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FeedbackManagerImpl implements FeedbackManager, FeedbackCommandsExecutor, FeedbackListenerManager {
    private final FeedbackCommandsExecutor commandExecutor;
    private final FeedbackListenerManager listenerManager;

    public FeedbackManagerImpl(FeedbackCommandsExecutor feedbackCommandsExecutor, FeedbackListenerManager feedbackListenerManager) {
        this.commandExecutor = feedbackCommandsExecutor;
        this.listenerManager = feedbackListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager, ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void addListener(FeedbackListener listener) {
        this.listenerManager.addListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager, ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public ParticipantFeedback getOwnCurrentFeedback() {
        return this.listenerManager.getOwnCurrentFeedback();
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void ownFeedbackSent(String key, ParticipantFeedbackSource source) {
        this.listenerManager.ownFeedbackSent(key, source);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager, ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void removeListener(FeedbackListener listener) {
        this.listenerManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager
    public void sendFeedback(String key, ParticipantFeedbackSource source, cf7 onError, af7 onSuccess) {
        this.commandExecutor.sendFeedback(key, onError, onSuccess);
        this.listenerManager.ownFeedbackSent(key, source);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.FeedbackManager, ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void setTimeout(long millis) {
        this.listenerManager.setTimeout(millis);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutor
    public void sendFeedback(String key, cf7 onError, af7 onSuccess) {
        this.commandExecutor.sendFeedback(key, onError, onSuccess);
    }
}
