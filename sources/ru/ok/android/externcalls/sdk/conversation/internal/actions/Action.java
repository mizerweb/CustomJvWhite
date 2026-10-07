package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import defpackage.v7g;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0006\u001a\u00028\u0000H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Action;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionParams;", "P", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionResult;", "R", "", "params", "Lv7g;", "execute", "(Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionParams;)Lv7g;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface Action<P extends ActionParams, R extends ActionResult> {
    v7g execute(P params);
}
