package ru.ok.android.externcalls.sdk.stat.accept;

import defpackage.af7;
import defpackage.fi1;
import defpackage.sbi;
import defpackage.vi2;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/accept/AcceptCallStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "", "isCaller", "isMe", "isConcurrent", "Lsbi;", "onAcceptCall", "(ZZZ)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AcceptCallStat extends SingleShotStat {
    public AcceptCallStat(af7 af7Var) {
        super(af7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sbi onAcceptCall$lambda$0(fi1 fi1Var) {
        fi1.a(fi1Var, "call_accepted_incoming", EventItemValueKt.toEventItemValue("concurrent"), null, 4);
        return sbi.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sbi onAcceptCall$lambda$1(fi1 fi1Var) {
        fi1.a(fi1Var, "call_accepted_outgoing", null, null, 6);
        return sbi.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sbi onAcceptCall$lambda$2(fi1 fi1Var) {
        fi1.a(fi1Var, "call_accepted_incoming", null, null, 6);
        return sbi.a;
    }

    public final void onAcceptCall(boolean isCaller, boolean isMe, boolean isConcurrent) {
        if (isCaller && isMe && isConcurrent) {
            reportOnce(new vi2(2));
            return;
        }
        if (isCaller && !isMe && !isConcurrent) {
            reportOnce(new vi2(3));
        } else {
            if (isCaller || !isMe || isConcurrent) {
                return;
            }
            reportOnce(new vi2(4));
        }
    }
}
