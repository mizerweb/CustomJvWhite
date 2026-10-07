package ru.ok.android.externcalls.sdk.feedback;

import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "", "", "key", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "source", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lkotlin/Function0;", "onSuccess", "sendFeedback", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;Lcf7;Laf7;)V", "", "millis", "setTimeout", "(J)V", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "getOwnCurrentFeedback", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;)V", "removeListener", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface FeedbackManager {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void sendFeedback$default(FeedbackManager feedbackManager, String str, ParticipantFeedbackSource participantFeedbackSource, cf7 cf7Var, af7 af7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: sendFeedback");
            return;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        if ((i & 8) != 0) {
            af7Var = null;
        }
        feedbackManager.sendFeedback(str, participantFeedbackSource, cf7Var, af7Var);
    }

    void addListener(FeedbackListener listener);

    ParticipantFeedback getOwnCurrentFeedback();

    void removeListener(FeedbackListener listener);

    void sendFeedback(String key, ParticipantFeedbackSource source, cf7 onError, af7 onSuccess);

    void setTimeout(long millis);
}
