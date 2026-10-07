package ru.ok.android.externcalls.sdk.stat.warmup;

import android.os.SystemClock;
import defpackage.af7;
import defpackage.cf7;
import defpackage.esh;
import defpackage.fg7;
import defpackage.fi1;
import defpackage.gsh;
import defpackage.sbi;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lesh;", "timeProvider", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Lesh;Laf7;)V", "callEventualStatSender", "Lsbi;", "report", "(Lfi1;)V", "onConversationPrepared", "()V", "Lesh;", "", "startTimeMs", "J", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationPreparedStat extends SingleShotStat {
    private final long startTimeMs;
    private final esh timeProvider;

    public ConversationPreparedStat(esh eshVar, af7 af7Var) {
        super(af7Var);
        this.timeProvider = eshVar;
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(fi1 callEventualStatSender) {
        ((gsh) this.timeProvider).getClass();
        fi1.a(callEventualStatSender, "call_warmup", EventItemValueKt.toEventItemValue(SystemClock.elapsedRealtime() - this.startTimeMs), null, 4);
    }

    public final void onConversationPrepared() {
        reportOnce(new AnonymousClass1(this));
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat$onConversationPrepared$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass1 extends fg7 implements cf7 {
        public AnonymousClass1(Object obj) {
            super(1, 0, ConversationPreparedStat.class, obj, "report", "report(Lru/ok/android/webrtc/stat/call/methods/eventual/CallEventualStatSender;)V");
        }

        @Override // defpackage.cf7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((fi1) obj);
            return sbi.a;
        }

        public final void invoke(fi1 fi1Var) {
            ((ConversationPreparedStat) this.receiver).report(fi1Var);
        }
    }
}
