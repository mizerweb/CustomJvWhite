package ru.ok.android.externcalls.sdk.stat.start;

import android.os.SystemClock;
import defpackage.af7;
import defpackage.cf7;
import defpackage.esh;
import defpackage.fg7;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.gsh;
import defpackage.j95;
import defpackage.r5h;
import defpackage.sbi;
import defpackage.xw3;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.externcalls.sdk.stat.internal.StatExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Lesh;", "timeProvider", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Lru/ok/android/externcalls/sdk/Conversation$CallType;Lesh;Laf7;)V", "callEventualStatSender", "Lsbi;", "report", "(Lfi1;)V", "", "getWarmupStatusString", "()Ljava/lang/String;", "onConversationStarted", "()V", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "Lesh;", "", "startTimeMs", "J", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationStartedStat extends SingleShotStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String STATUS_FINISHED = "warmup_finished";

    @Deprecated
    public static final String STATUS_IN_PROGRESS = "warmup_inprogress";

    @Deprecated
    public static final String STATUS_STARTED = "warmup_start";
    private final Conversation.CallType callType;
    private final long startTimeMs;
    private final esh timeProvider;

    public ConversationStartedStat(Conversation.CallType callType, esh eshVar, af7 af7Var) {
        super(af7Var);
        this.callType = callType;
        this.timeProvider = eshVar;
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    private final String getWarmupStatusString() {
        return STATUS_STARTED;
    }

    public final void report(fi1 callEventualStatSender) {
        ((gsh) this.timeProvider).getClass();
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(SystemClock.elapsedRealtime() - this.startTimeMs);
        EventItemsMap eventItemsMap = new EventItemsMap();
        List listP0 = xw3.P0(StatExtensionsKt.asString$default(this.callType, false, 1, null), getWarmupStatusString());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP0) {
            if (!r5h.X0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl((String) it.next())));
        }
        if (!arrayList2.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            eventItemsMap.set(SdkMetricStatEvent.STRING_VALUE_KEY, jSONObject.put("labels", jSONArray).toString());
        }
        ((gi1) callEventualStatSender).d("call_start", eventItemValue, eventItemsMap);
    }

    public final void onConversationStarted() {
        reportOnce(new AnonymousClass1(this));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat$Companion;", "", "<init>", "()V", "STATUS_STARTED", "", "STATUS_IN_PROGRESS", "STATUS_FINISHED", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat$onConversationStarted$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass1 extends fg7 implements cf7 {
        public AnonymousClass1(Object obj) {
            super(1, 0, ConversationStartedStat.class, obj, "report", "report(Lru/ok/android/webrtc/stat/call/methods/eventual/CallEventualStatSender;)V");
        }

        @Override // defpackage.cf7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((fi1) obj);
            return sbi.a;
        }

        public final void invoke(fi1 fi1Var) {
            ((ConversationStartedStat) this.receiver).report(fi1Var);
        }
    }
}
