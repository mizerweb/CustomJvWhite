package ru.ok.android.externcalls.sdk.stereo.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/exception/PromotedLimitExceeded;", "Lru/ok/android/externcalls/sdk/stereo/exception/StereoRoomException;", "<init>", "()V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PromotedLimitExceeded extends StereoRoomException {
    public PromotedLimitExceeded() {
        super("Promoted participant limit exceeded", null, 2, null);
    }
}
