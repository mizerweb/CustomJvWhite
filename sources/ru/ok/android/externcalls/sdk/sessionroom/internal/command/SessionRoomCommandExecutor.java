package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.af7;
import defpackage.cf7;
import defpackage.cnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;", "", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestAttention", "(Laf7;Lcf7;)V", "Lcnf;", "roomId", "joinRoom", "(Lcnf;Laf7;Lcf7;)V", "leaveRoom", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface SessionRoomCommandExecutor {
    void joinRoom(cnf roomId, af7 onSuccess, cf7 onError);

    void leaveRoom(af7 onSuccess, cf7 onError);

    void requestAttention(af7 onSuccess, cf7 onError);
}
