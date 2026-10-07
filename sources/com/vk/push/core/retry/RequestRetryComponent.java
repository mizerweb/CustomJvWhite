package com.vk.push.core.retry;

import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.backoff.ExponentialBackOff;
import defpackage.j95;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0006*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/vk/push/core/retry/RequestRetryComponent;", "", "Lcom/vk/push/core/backoff/BackOff;", "backOff", "<init>", "(Lcom/vk/push/core/backoff/BackOff;)V", "T", "Lkotlin/Function1;", "Llq4;", "Lroe;", "request", "invoke-gIAlu-s", "(Lcf7;Llq4;)Ljava/lang/Object;", "invoke", "", "exception", "", "isRetryableError", "(Ljava/lang/Throwable;)Z", "Lcom/vk/push/common/Logger;", "getLogger", "()Lcom/vk/push/common/Logger;", "logger", "Companion", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class RequestRetryComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long b = 1000;
    public static final long c = 32000;
    public final BackOff a;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/retry/RequestRetryComponent$Companion;", "", "Lcom/vk/push/core/backoff/BackOff;", "createDefaultBackOffForRequest", "()Lcom/vk/push/core/backoff/BackOff;", "", "INITIAL_BACKOFF_IN_MILLISECONDS", "J", "", "MAX_ATTEMPTS", "I", "MAX_BACKOFF_IN_MILLISECONDS", "", "SCALE_FACTOR", "D", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public Companion(j95 j95Var) {
        }

        public final BackOff createDefaultBackOffForRequest() {
            return new ExponentialBackOff.Builder().initialBackOff(RequestRetryComponent.b).maxBackOff(RequestRetryComponent.c).scaleFactor(2.0d).build();
        }
    }

    public RequestRetryComponent(BackOff backOff) {
        this.a = backOff;
    }

    public abstract Logger getLogger();

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (defpackage.rx8.t(r11, r1) == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0103, code lost:
    
        if (r0 == r8) goto L44;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00c0, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f1 -> B:17:0x0044). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object m27invokegIAlus(defpackage.cf7 r18, defpackage.lq4 r19) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.retry.RequestRetryComponent.m27invokegIAlus(cf7, lq4):java.lang.Object");
    }

    public abstract boolean isRetryableError(Throwable exception);
}
