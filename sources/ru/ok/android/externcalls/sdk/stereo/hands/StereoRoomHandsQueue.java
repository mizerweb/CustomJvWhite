package ru.ok.android.externcalls.sdk.stereo.hands;

import defpackage.c;
import defpackage.cf7;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0011\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "", "", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "getQueue", "()Ljava/util/Collection;", "", "getTotalCount", "()I", "", "hasMore", "()Z", "Lkotlin/Function1;", "Lsbi;", "onSuccess", "", "onError", "loadMoreElements", "(Lcf7;Lcf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface StereoRoomHandsQueue {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void loadMoreElements$default(StereoRoomHandsQueue stereoRoomHandsQueue, cf7 cf7Var, cf7 cf7Var2, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: loadMoreElements");
            return;
        }
        if ((i & 1) != 0) {
            cf7Var = null;
        }
        if ((i & 2) != 0) {
            cf7Var2 = null;
        }
        stereoRoomHandsQueue.loadMoreElements(cf7Var, cf7Var2);
    }

    Collection<StereoHandQueueItem> getQueue();

    int getTotalCount();

    boolean hasMore();

    void loadMoreElements(cf7 onSuccess, cf7 onError);
}
