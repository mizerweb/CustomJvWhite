package ru.ok.android.externcalls.sdk.feedback.internal.commands;

import defpackage.af7;
import defpackage.cf7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "", "", "key", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lkotlin/Function0;", "onSuccess", "sendFeedback", "(Ljava/lang/String;Lcf7;Laf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface FeedbackCommandsExecutor {
    void sendFeedback(String key, cf7 onError, af7 onSuccess);
}
