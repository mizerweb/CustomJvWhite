package ru.ok.android.externcalls.sdk.api.retry;

import defpackage.cf7;
import defpackage.epe;
import defpackage.fg7;
import defpackage.hg7;
import defpackage.i3f;
import defpackage.kh6;
import defpackage.p64;
import defpackage.p7d;
import defpackage.qn0;
import defpackage.qqb;
import defpackage.s81;
import defpackage.sbi;
import defpackage.sqb;
import defpackage.v7g;
import defpackage.y3e;
import defpackage.z2f;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Metadata;
import ru.ok.android.api.http.HttpStatusApiException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a1\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0006\u001a1\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0006\u001a9\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"", "T", "Lv7g;", "Ly3e;", "logger", "retryApiCallForOutgoing", "(Lv7g;Ly3e;)Lv7g;", "retryApiCallForJoining", "retryApiCallForIncoming", "retryApiCallForBackgroundWork", "retryApiCallForFastWorkRequired", "retryWithFastBackoff", "retryWithSlowBackoff", "Lqn0;", "backoff", "retryApiWithBackoff", "(Lv7g;Ly3e;Lqn0;)Lv7g;", "createFastBackoff", "()Lqn0;", "createSlowBackoff", "", "throwable", "", "retryApiExceptionFilter", "(Ljava/lang/Throwable;)Z", "", "LOG_TAG", "Ljava/lang/String;", "calls-sdk"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class RetryKt {
    private static final String LOG_TAG = "CallsApiRetry";

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.api.retry.RetryKt$retryApiWithBackoff$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass1 extends fg7 implements cf7 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, RetryKt.class, "retryApiExceptionFilter", "retryApiExceptionFilter(Ljava/lang/Throwable;)Z", 1);
        }

        @Override // defpackage.cf7
        public final Boolean invoke(Throwable th) {
            return Boolean.valueOf(RetryKt.retryApiExceptionFilter(th));
        }
    }

    private static final qn0 createFastBackoff() {
        return new qn0(new kh6(15), 5000L);
    }

    private static final qn0 createSlowBackoff() {
        return new qn0(new kh6(10), 10000L);
    }

    public static final <T> v7g retryApiCallForBackgroundWork(v7g v7gVar, y3e y3eVar) {
        return retryWithSlowBackoff(v7gVar, y3eVar);
    }

    public static final <T> v7g retryApiCallForFastWorkRequired(v7g v7gVar, y3e y3eVar) {
        return retryWithFastBackoff(v7gVar, y3eVar);
    }

    public static final <T> v7g retryApiCallForIncoming(v7g v7gVar, y3e y3eVar) {
        return retryWithSlowBackoff(v7gVar, y3eVar);
    }

    public static final <T> v7g retryApiCallForJoining(v7g v7gVar, y3e y3eVar) {
        return retryWithFastBackoff(v7gVar, y3eVar);
    }

    public static final <T> v7g retryApiCallForOutgoing(v7g v7gVar, y3e y3eVar) {
        return retryWithFastBackoff(v7gVar, y3eVar);
    }

    public static final boolean retryApiExceptionFilter(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof SocketException) || (th instanceof SSLProtocolException) || (th instanceof SSLPeerUnverifiedException) || (th instanceof SSLHandshakeException) || (th instanceof SSLException) || (th instanceof HttpRetryException)) {
            return true;
        }
        if (!(th instanceof HttpStatusApiException)) {
            return (th instanceof ProtocolException) || (th instanceof IOException);
        }
        int i = ((HttpStatusApiException) th).a;
        return i == 502 || i == 504;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> v7g retryApiWithBackoff(v7g v7gVar, y3e y3eVar, qn0 qn0Var) {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        s81 s81Var = new s81(15, y3eVar);
        p7d p7dVar = new p7d(20, y3eVar);
        z2f z2fVarA = i3f.a();
        z2fVarA.getClass();
        v7gVar.getClass();
        qn0Var.getClass();
        anonymousClass1.getClass();
        return new p64(1, new sqb(v7gVar instanceof hg7 ? ((hg7) v7gVar).b() : new qqb(1, v7gVar), new epe(anonymousClass1, qn0Var, s81Var, z2fVarA, p7dVar), 2));
    }

    public static final sbi retryApiWithBackoff$lambda$0(y3e y3eVar, Throwable th, int i) {
        y3eVar.log(LOG_TAG, "retry attempt " + i + " after " + th);
        return sbi.a;
    }

    public static final sbi retryApiWithBackoff$lambda$1(y3e y3eVar, Throwable th) {
        y3eVar.log(LOG_TAG, "retry failed with last exception " + th);
        return sbi.a;
    }

    private static final <T> v7g retryWithFastBackoff(v7g v7gVar, y3e y3eVar) {
        return retryApiWithBackoff(v7gVar, y3eVar, createFastBackoff());
    }

    private static final <T> v7g retryWithSlowBackoff(v7g v7gVar, y3e y3eVar) {
        return retryApiWithBackoff(v7gVar, y3eVar, createSlowBackoff());
    }
}
