package ru.ok.android.externcalls.sdk.signaling;

import defpackage.cf7;
import defpackage.q4g;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lq4g;", "get", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lcf7;)Lq4g;", "calls-sdk"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class SignalingProviderKt {
    public static final q4g get(SignalingProvider signalingProvider, cf7 cf7Var) {
        if (signalingProvider.getSignaling() == null && cf7Var != null) {
            cf7Var.invoke(new ConversationNotPreparedException());
        }
        return signalingProvider.getSignaling();
    }
}
