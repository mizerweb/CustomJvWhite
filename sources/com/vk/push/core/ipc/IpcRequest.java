package com.vk.push.core.ipc;

import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import defpackage.c;
import defpackage.cf7;
import defpackage.ck2;
import defpackage.j95;
import defpackage.qf7;
import defpackage.rl0;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\"#JA\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052 \b\u0002\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00028\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0082\u0001\u0002$%¨\u0006&"}, d2 = {"Lcom/vk/push/core/ipc/IpcRequest;", "T", "V", "", "service", "Lcom/vk/push/common/AppInfo;", CandidateTypeHintConfig.TYPE_HOST, "Lkotlin/Function1;", "Lsbi;", "onRequestFinished", "execute", "(Ljava/lang/Object;Lcom/vk/push/common/AppInfo;Lcf7;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onError", "(Ljava/lang/Exception;)V", "a", "Lcf7;", "getTransformErrorResult", "()Lcf7;", "transformErrorResult", "Lck2;", "b", "Lck2;", "getContinuation", "()Lck2;", "continuation", "", DatabaseHelper.COMPRESSED_COLUMN_NAME, "Ljava/lang/String;", "getIpcCallName", "()Ljava/lang/String;", "ipcCallName", "AsyncRequest", "SimpleRequest", "Lcom/vk/push/core/ipc/IpcRequest$AsyncRequest;", "Lcom/vk/push/core/ipc/IpcRequest$SimpleRequest;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class IpcRequest<T, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final cf7 transformErrorResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final ck2 continuation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String ipcCallName;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003Bu\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\f\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00028\u00030\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00030\u0013¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00028\u00022\u0006\u0010\u0018\u001a\u00020\u000b2\u001e\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003\u0012\u0004\u0012\u00020\u00060\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R-\u0010\f\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/vk/push/core/ipc/IpcRequest$AsyncRequest;", "T", "V", "Lcom/vk/push/core/ipc/IpcRequest;", "Lkotlin/Function2;", "Lcom/vk/push/core/base/AsyncCallback;", "Lsbi;", "ipcCall", "", "ipcCallName", "Lcom/vk/push/core/base/AidlResult;", "Lcom/vk/push/common/AppInfo;", "transformSuccessResult", "Lcom/vk/push/common/Logger;", "logger", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transformErrorResult", "Lck2;", "continuation", "<init>", "(Lqf7;Ljava/lang/String;Lqf7;Lcom/vk/push/common/Logger;Lcf7;Lck2;)V", "service", CandidateTypeHintConfig.TYPE_HOST, "onRequestFinished", "execute", "(Ljava/lang/Object;Lcom/vk/push/common/AppInfo;Lcf7;)V", "d", "Lqf7;", "getIpcCall", "()Lqf7;", "e", "Ljava/lang/String;", "getIpcCallName", "()Ljava/lang/String;", "f", "getTransformSuccessResult", "g", "Lcom/vk/push/common/Logger;", "getLogger", "()Lcom/vk/push/common/Logger;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AsyncRequest<T, V> extends IpcRequest<T, V> {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final qf7 ipcCall;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final String ipcCallName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final qf7 transformSuccessResult;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final Logger logger;

        public AsyncRequest(qf7 qf7Var, String str, qf7 qf7Var2, Logger logger, cf7 cf7Var, ck2 ck2Var) {
            super(cf7Var, ck2Var, str, null);
            this.ipcCall = qf7Var;
            this.ipcCallName = str;
            this.transformSuccessResult = qf7Var2;
            this.logger = logger;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public void execute(T service, final AppInfo host, final cf7 onRequestFinished) {
            Logger.DefaultImpls.info$default(this.logger, getIpcCallName() + " ipc request is starting", null, 2, null);
            this.ipcCall.invoke(service, new AsyncCallback.Stub() { // from class: com.vk.push.core.ipc.IpcRequest$AsyncRequest$execute$1
                @Override // com.vk.push.core.base.AsyncCallback
                public void onResult(AidlResult<?> result) {
                    Object objInvoke;
                    Exception excExceptionOrNull = result.exceptionOrNull();
                    IpcRequest.AsyncRequest asyncRequest = this.c;
                    if (excExceptionOrNull == null) {
                        result.getData();
                        Logger.DefaultImpls.info$default(asyncRequest.getLogger(), asyncRequest.getIpcCallName() + " ipc request is success", null, 2, null);
                        objInvoke = asyncRequest.getTransformSuccessResult().invoke(result, host);
                    } else {
                        Logger.DefaultImpls.info$default(asyncRequest.getLogger(), asyncRequest.getIpcCallName() + " ipc request is failure", null, 2, null);
                        objInvoke = asyncRequest.getTransformErrorResult().invoke(excExceptionOrNull);
                    }
                    CoroutineExtensionsKt.safeResume(asyncRequest.getContinuation(), objInvoke);
                    onRequestFinished.invoke(asyncRequest);
                }
            });
        }

        public final qf7 getIpcCall() {
            return this.ipcCall;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public String getIpcCallName() {
            return this.ipcCallName;
        }

        public final Logger getLogger() {
            return this.logger;
        }

        public final qf7 getTransformSuccessResult() {
            return this.transformSuccessResult;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003BW\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00028\u00030\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00030\u000f¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00028\u00022\u0006\u0010\u0014\u001a\u00020\u00052\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003\u0012\u0004\u0012\u00020\u00150\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/vk/push/core/ipc/IpcRequest$SimpleRequest;", "T", "V", "Lcom/vk/push/core/ipc/IpcRequest;", "Lkotlin/Function2;", "Lcom/vk/push/common/AppInfo;", "ipcCall", "", "ipcCallName", "Lcom/vk/push/common/Logger;", "logger", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transformErrorResult", "Lck2;", "continuation", "<init>", "(Lqf7;Ljava/lang/String;Lcom/vk/push/common/Logger;Lcf7;Lck2;)V", "service", CandidateTypeHintConfig.TYPE_HOST, "Lsbi;", "onRequestFinished", "execute", "(Ljava/lang/Object;Lcom/vk/push/common/AppInfo;Lcf7;)V", "d", "Lqf7;", "getIpcCall", "()Lqf7;", "e", "Ljava/lang/String;", "getIpcCallName", "()Ljava/lang/String;", "f", "Lcom/vk/push/common/Logger;", "getLogger", "()Lcom/vk/push/common/Logger;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SimpleRequest<T, V> extends IpcRequest<T, V> {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final qf7 ipcCall;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final String ipcCallName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final Logger logger;

        public SimpleRequest(qf7 qf7Var, String str, Logger logger, cf7 cf7Var, ck2 ck2Var) {
            super(cf7Var, ck2Var, str, null);
            this.ipcCall = qf7Var;
            this.ipcCallName = str;
            this.logger = logger;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public void execute(T service, AppInfo host, cf7 onRequestFinished) {
            Logger.DefaultImpls.info$default(this.logger, getIpcCallName() + " ipc request is starting", null, 2, null);
            CoroutineExtensionsKt.safeResume(getContinuation(), this.ipcCall.invoke(service, host));
            onRequestFinished.invoke(this);
        }

        public final qf7 getIpcCall() {
            return this.ipcCall;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public String getIpcCallName() {
            return this.ipcCallName;
        }

        public final Logger getLogger() {
            return this.logger;
        }
    }

    public IpcRequest(cf7 cf7Var, ck2 ck2Var, String str, j95 j95Var) {
        this.transformErrorResult = cf7Var;
        this.continuation = ck2Var;
        this.ipcCallName = str;
    }

    public static /* synthetic */ void execute$default(IpcRequest ipcRequest, Object obj, AppInfo appInfo, cf7 cf7Var, int i, Object obj2) throws RemoteException {
        if (obj2 != null) {
            c.i("Super calls with default arguments not supported in this target, function: execute");
            return;
        }
        if ((i & 4) != 0) {
            cf7Var = rl0.i;
        }
        ipcRequest.execute(obj, appInfo, cf7Var);
    }

    public abstract void execute(T service, AppInfo host, cf7 onRequestFinished) throws RemoteException;

    public final ck2 getContinuation() {
        return this.continuation;
    }

    public String getIpcCallName() {
        return this.ipcCallName;
    }

    public final cf7 getTransformErrorResult() {
        return this.transformErrorResult;
    }

    public final void onError(Exception e) {
        CoroutineExtensionsKt.safeResume(this.continuation, this.transformErrorResult.invoke(e));
    }
}
