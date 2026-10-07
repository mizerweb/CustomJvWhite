package ru.ok.android.externcalls.sdk.utils.cancelable;

import defpackage.ko5;
import defpackage.s63;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lko5;", "Lru/ok/android/externcalls/sdk/utils/cancelable/Cancelable;", "toCancelable", "(Lko5;)Lru/ok/android/externcalls/sdk/utils/cancelable/Cancelable;", "calls-sdk"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class DisposableCancelableKt {
    public static final Cancelable toCancelable(ko5 ko5Var) {
        return new s63(17, ko5Var);
    }
}
