package ru.ok.android.externcalls.sdk.id.peer;

import defpackage.h4e;
import defpackage.i4e;
import defpackage.j95;
import defpackage.ore;
import defpackage.rx8;
import defpackage.si9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "", "<init>", "()V", "generatePeerId", "", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PeerIdGenerator {
    private static final Companion Companion = new Companion(null);
    private static final long MIN_JS_SAFE_LONG = -9007199254740991L;
    private static final long MAX_JS_SAFE_LONG = 9007199254740991L;
    private static final si9 PEER_ID_RANGE = new si9(MIN_JS_SAFE_LONG, MAX_JS_SAFE_LONG, false);

    public final long generatePeerId() {
        si9 si9Var = PEER_ID_RANGE;
        h4e h4eVar = i4e.a;
        try {
            return rx8.U(si9Var);
        } catch (IllegalArgumentException e) {
            ore.f(e.getMessage());
            return 0L;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator$Companion;", "", "<init>", "()V", "", "MAX_JS_SAFE_LONG", "J", "MIN_JS_SAFE_LONG", "Lsi9;", "PEER_ID_RANGE", "Lsi9;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
