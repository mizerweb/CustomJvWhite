package ru.ok.android.externcalls.sdk.stat.finish;

import defpackage.af7;
import defpackage.cf7;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.sbi;
import defpackage.ww3;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.stat.finish.CallFinishStat;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/finish/CallFinishStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "callEventualStatSender", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "reason", "", "Lru/ok/android/externcalls/sdk/rate/RateHint;", "rateReasons", "", "errorText", "", "isCaller", "Lsbi;", "report", "(Lfi1;Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;Ljava/util/List;Ljava/lang/String;Z)V", "onCallFinished", "(Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;Ljava/util/List;Ljava/lang/String;Z)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallFinishStat extends SingleShotStat {
    public CallFinishStat(af7 af7Var) {
        super(af7Var);
    }

    public static /* synthetic */ void onCallFinished$default(CallFinishStat callFinishStat, ConversationEndReason conversationEndReason, List list, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        callFinishStat.onCallFinished(conversationEndReason, list, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sbi onCallFinished$lambda$0(CallFinishStat callFinishStat, ConversationEndReason conversationEndReason, List list, String str, boolean z, fi1 fi1Var) {
        callFinishStat.report(fi1Var, conversationEndReason, list, str, z);
        return sbi.a;
    }

    private final void report(fi1 callEventualStatSender, ConversationEndReason reason, List<RateHint> rateReasons, String errorText, boolean isCaller) {
        if ((reason instanceof ConversationEndReason.Missed) && isCaller) {
            reason = ConversationEndReason.CallTimeout.INSTANCE;
        }
        if (errorText == null) {
            errorText = "";
        }
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(errorText);
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set("reason", reason.getKey());
        List<RateHint> list = rateReasons;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RateHint) it.next()).getReason());
        }
        eventItemsMap.set("rate_reasons", ww3.z1(ww3.L1(arrayList), ",", null, null, null, 62));
        ((gi1) callEventualStatSender).d("call_finish", eventItemValue, eventItemsMap);
    }

    public static /* synthetic */ void report$default(CallFinishStat callFinishStat, fi1 fi1Var, ConversationEndReason conversationEndReason, List list, String str, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        callFinishStat.report(fi1Var, conversationEndReason, list, str, z);
    }

    public final void onCallFinished(final ConversationEndReason reason, final List<RateHint> rateReasons, final String errorText, final boolean isCaller) {
        reportOnce(new cf7() { // from class: aj1
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                return CallFinishStat.onCallFinished$lambda$0(this.a, reason, rateReasons, errorText, isCaller, (fi1) obj);
            }
        });
    }
}
