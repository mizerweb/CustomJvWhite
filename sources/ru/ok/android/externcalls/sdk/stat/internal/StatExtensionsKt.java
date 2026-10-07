package ru.ok.android.externcalls.sdk.stat.internal;

import defpackage.ore;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.Conversation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"asString", "", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "isAnon", "", "calls-sdk"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class StatExtensionsKt {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Conversation.CallType.values().length];
            try {
                iArr[Conversation.CallType.Incoming.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Conversation.CallType.Outgoing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Conversation.CallType.Join.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String asString(Conversation.CallType callType, boolean z) {
        if (z) {
            return "anonym_join";
        }
        int i = WhenMappings.$EnumSwitchMapping$0[callType.ordinal()];
        if (i == 1) {
            return "incoming";
        }
        if (i == 2) {
            return "outgoing";
        }
        if (i == 3) {
            return "join";
        }
        ore.o();
        return null;
    }

    public static /* synthetic */ String asString$default(Conversation.CallType callType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return asString(callType, z);
    }
}
