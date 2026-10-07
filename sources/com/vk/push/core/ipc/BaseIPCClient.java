package com.vk.push.core.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.DelayedAction;
import com.vk.push.core.utils.PackageExtenstionsKt;
import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.gr0;
import defpackage.gv7;
import defpackage.hr0;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.ir0;
import defpackage.j95;
import defpackage.jr0;
import defpackage.kr0;
import defpackage.kr6;
import defpackage.lq4;
import defpackage.lr0;
import defpackage.lvb;
import defpackage.mr0;
import defpackage.ore;
import defpackage.poe;
import defpackage.qe;
import defpackage.qf7;
import defpackage.rl0;
import defpackage.sbi;
import defpackage.t20;
import defpackage.z5h;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u0000 9*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003:;9B[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014H$¢\u0006\u0004\b\u0016\u0010\u0017Ji\u0010\"\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0016\u0010\u001f\u001a\u0012\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\u0004\u0012\u00028\u00010\u000b2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010 0\u000bH\u0084@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0091\u0001\u0010(\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u001c\u0010&\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u00192\u0016\u0010\u001f\u001a\u0012\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\u0004\u0012\u00028\u00010\u000b2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010 0\u000b2\b\b\u0002\u0010'\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u0010\u0011\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u001b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/vk/push/core/ipc/BaseIPCClient;", "Landroid/os/IInterface;", "T", "", "Landroid/content/Context;", "context", "", "Lcom/vk/push/common/AppInfo;", "preferredHosts", "", "closeConnectionTimeoutMillis", "Lkotlin/Function1;", "Lsbi;", "onCloseConnection", "Lkotlin/Function0;", "onNoHostsToBind", "Lcom/vk/push/common/Logger;", "logger", "<init>", "(Landroid/content/Context;Ljava/util/List;JLcf7;Laf7;Lcom/vk/push/common/Logger;)V", "Landroid/os/IBinder;", "service", "createInterface", "(Landroid/os/IBinder;)Landroid/os/IInterface;", "V", "Lkotlin/Function2;", "ipcCall", "", "ipcCallName", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transformErrorResult", "Landroid/content/ComponentName;", "componentNameCreator", "makeSimpleRequest", "(Lqf7;Ljava/lang/String;Lcf7;Lcf7;Llq4;)Ljava/lang/Object;", "Lcom/vk/push/core/base/AsyncCallback;", "Lcom/vk/push/core/base/AidlResult;", "transformSuccessResult", "timeoutInMillis", "makeAsyncRequest", "(Lqf7;Ljava/lang/String;Lqf7;Lcf7;Lcf7;JLlq4;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/util/List;", "getPreferredHosts", "()Ljava/util/List;", "f", "Lny8;", "getLogger", "()Lcom/vk/push/common/Logger;", "getLogTag", "()Ljava/lang/String;", "logTag", "Companion", "gr0", "kr6", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseIPCClient<T extends IInterface> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long DEFAULT_CLOSE_CONNECTION_TIMEOUT_MILLIS = 10000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List preferredHosts;
    public final long c;
    public final cf7 d;
    public final af7 e;
    public final ifh f;
    public final ifh g;
    public volatile kr6 h;
    public final AtomicBoolean i;
    public final ExecutorService j;
    public final Set k;
    public final BaseIPCClient$connection$1 l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/vk/push/core/ipc/BaseIPCClient$Companion;", "", "", "DEFAULT_CLOSE_CONNECTION_TIMEOUT_MILLIS", "J", "DEFAULT_REQUEST_TIMEOUT_IN_MINUTES", "RECONNECTION_TIMEOUT", "THREAD_POOL_KEEP_ALIVE", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public Companion(j95 j95Var) {
        }
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [com.vk.push.core.ipc.BaseIPCClient$connection$1] */
    public BaseIPCClient(Context context, List<AppInfo> list, long j, cf7 cf7Var, af7 af7Var, final Logger logger) {
        this.context = context;
        this.preferredHosts = list;
        this.c = j;
        this.d = cf7Var;
        this.e = af7Var;
        if (list.isEmpty()) {
            ore.p("Preferred hosts must not be empty");
            throw null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((AppInfo) obj).getPackageName())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != this.preferredHosts.size()) {
            ore.p("Found duplicate package names in preferred hosts");
            throw null;
        }
        if (this.c < 0) {
            ore.p("closeConnectionTimeoutMillis must be >= 0");
            throw null;
        }
        this.f = new ifh(new kr0(logger, 0, this));
        this.g = new ifh(new hr0(this, 1));
        this.i = new AtomicBoolean(false);
        this.j = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
        this.k = Collections.synchronizedSet(new LinkedHashSet());
        this.l = new ServiceConnection() { // from class: com.vk.push.core.ipc.BaseIPCClient$connection$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName name) {
                BaseIPCClient.access$handleOnBindingDied(this.a, name);
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName name) {
                Logger.DefaultImpls.warn$default(logger, "Null binding from " + name.getPackageName(), null, 2, null);
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                BaseIPCClient baseIPCClient = this.a;
                baseIPCClient.i.set(true);
                BaseIPCClient.access$handleOnServiceConnected(baseIPCClient, name, service);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                BaseIPCClient.access$handleOnServiceDisconnected(this.a, name);
            }
        };
    }

    public static final void access$executeWhenConnected(BaseIPCClient baseIPCClient, IpcRequest ipcRequest, cf7 cf7Var) {
        NoHostsToBindException unknownBindingException;
        kr6 kr6Var = baseIPCClient.h;
        IInterface iInterface = kr6Var != null ? (IInterface) kr6Var.c : null;
        kr6 kr6Var2 = baseIPCClient.h;
        AppInfo appInfo = kr6Var2 != null ? (AppInfo) kr6Var2.a : null;
        if (iInterface != null && appInfo != null) {
            try {
                baseIPCClient.k.add(ipcRequest);
                ipcRequest.execute(iInterface, appInfo, new ir0(baseIPCClient, 0));
                return;
            } catch (RemoteException e) {
                baseIPCClient.getLogger().warn("RemoteException while executing request", e);
                return;
            }
        }
        NoHostsToBindException noHostsToBindException = null;
        for (AppInfo appInfo2 : baseIPCClient.preferredHosts) {
            try {
                ComponentName componentName = (ComponentName) cf7Var.invoke(appInfo2.getPackageName());
                if (componentName == null) {
                    Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Component name from host " + appInfo2.getPackageName() + " is null", null, 2, null);
                    unknownBindingException = new ComponentCreationFailedException();
                    noHostsToBindException = unknownBindingException;
                } else {
                    gr0 gr0VarC = baseIPCClient.c(appInfo2, componentName, ipcRequest);
                    if (cqk.d(gr0VarC, BaseIPCClient$BindingResult$Ok.INSTANCE)) {
                        return;
                    } else {
                        noHostsToBindException = f(gr0VarC);
                    }
                }
            } catch (SecurityException e2) {
                baseIPCClient.getLogger().error("No permission to bind to " + appInfo2.getPackageName(), e2);
                noHostsToBindException = new SecurityBindingException();
            } catch (Exception e3) {
                baseIPCClient.getLogger().error("Unable to bind service", e3);
                unknownBindingException = new UnknownBindingException(e3);
            }
        }
        Logger.DefaultImpls.error$default(baseIPCClient.getLogger(), "No available hosts found. Binding has failed, giving up.", null, 2, null);
        if (noHostsToBindException == null) {
            noHostsToBindException = new NoHostsToBindException();
        }
        ipcRequest.onError(noHostsToBindException);
        af7 af7Var = baseIPCClient.e;
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void access$handleOnBindingDied(BaseIPCClient baseIPCClient, ComponentName componentName) {
        Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Binding to " + componentName.getPackageName() + " has died", null, 2, null);
        baseIPCClient.g();
        kr6 kr6Var = baseIPCClient.h;
        if (kr6Var != null) {
            baseIPCClient.j.submit(new qe(baseIPCClient, 18, kr6Var));
        }
    }

    public static final void access$handleOnServiceConnected(BaseIPCClient baseIPCClient, ComponentName componentName, IBinder iBinder) {
        Object next;
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "On service connected! Remote host package name = " + componentName.getPackageName(), null, 2, null);
        Iterator it = baseIPCClient.preferredHosts.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!z5h.G0(((AppInfo) next).getPackageName(), componentName.getPackageName(), true));
        AppInfo appInfo = (AppInfo) next;
        if (appInfo == null) {
            Logger.DefaultImpls.error$default(baseIPCClient.getLogger(), "onServiceConnected: host is null", null, 2, null);
            return;
        }
        IInterface iInterfaceCreateInterface = baseIPCClient.createInterface(iBinder);
        baseIPCClient.h = new kr6(appInfo, componentName, iInterfaceCreateInterface);
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Service connection to " + componentName.getPackageName() + " has been established", null, 2, null);
        jr0 jr0Var = new jr0(baseIPCClient, iInterfaceCreateInterface, appInfo, 0);
        if (baseIPCClient.k.isEmpty()) {
            return;
        }
        baseIPCClient.j.submit(new qe(baseIPCClient, 17, jr0Var));
    }

    public static final void access$handleOnServiceDisconnected(BaseIPCClient baseIPCClient, ComponentName componentName) {
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Service has been disconnected, host: " + componentName.getPackageName(), null, 2, null);
        kr6 kr6Var = baseIPCClient.h;
        baseIPCClient.h = kr6Var != null ? new kr6((AppInfo) kr6Var.a, (ComponentName) kr6Var.b, null) : null;
    }

    public static NoHostsToBindException f(gr0 gr0Var) {
        if (cqk.d(gr0Var, BaseIPCClient$BindingResult$InvalidSignature.INSTANCE)) {
            return new InvalidSignatureException();
        }
        if (cqk.d(gr0Var, BaseIPCClient$BindingResult$BindServiceFailed.INSTANCE)) {
            return new BindingFailedException();
        }
        return null;
    }

    public static /* synthetic */ Object makeAsyncRequest$default(BaseIPCClient baseIPCClient, qf7 qf7Var, String str, qf7 qf7Var2, cf7 cf7Var, cf7 cf7Var2, long j, lq4 lq4Var, int i, Object obj) {
        if (obj == null) {
            return baseIPCClient.makeAsyncRequest(qf7Var, str, qf7Var2, cf7Var, cf7Var2, (i & 32) != 0 ? 180000L : j, lq4Var);
        }
        c.i("Super calls with default arguments not supported in this target, function: makeAsyncRequest");
        return null;
    }

    public List a() {
        return getPreferredHosts();
    }

    public final gr0 b(AppInfo appInfo, ComponentName componentName) throws NoSuchAlgorithmException {
        boolean zValidateCallingPackage;
        String packageName = appInfo.getPackageName();
        Context context = this.context;
        if (cqk.d(packageName, context.getPackageName())) {
            zValidateCallingPackage = true;
        } else {
            zValidateCallingPackage = PackageExtenstionsKt.validateCallingPackage(context, appInfo.getPubKey(), appInfo.getPackageName());
            if (!zValidateCallingPackage) {
                Logger.DefaultImpls.error$default(getLogger(), "Signature validation for " + appInfo.getPackageName() + " has failed", null, 2, null);
            }
        }
        if (!zValidateCallingPackage) {
            return BaseIPCClient$BindingResult$InvalidSignature.INSTANCE;
        }
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return context.bindService(intent, this.l, 1) ? BaseIPCClient$BindingResult$Ok.INSTANCE : BaseIPCClient$BindingResult$BindServiceFailed.INSTANCE;
    }

    public final gr0 c(AppInfo appInfo, ComponentName componentName, IpcRequest ipcRequest) throws NoSuchAlgorithmException {
        gr0 gr0VarB = b(appInfo, componentName);
        if (!cqk.d(gr0VarB, BaseIPCClient$BindingResult$Ok.INSTANCE)) {
            Logger.DefaultImpls.info$default(getLogger(), "Unable to bind to " + appInfo.getPackageName() + ", trying next host", null, 2, null);
            return gr0VarB;
        }
        Logger.DefaultImpls.info$default(getLogger(), "bindService to " + appInfo.getPackageName() + " via " + ipcRequest.getIpcCallName() + " function returns true, waiting for connection establishment", null, 2, null);
        this.k.add(ipcRequest);
        kr6 kr6Var = this.h;
        IInterface iInterface = kr6Var != null ? (IInterface) kr6Var.c : null;
        if (iInterface == null) {
            this.h = new kr6(appInfo, componentName, null);
            return gr0VarB;
        }
        Logger.DefaultImpls.info$default(getLogger(), "bindService to " + appInfo.getPackageName() + " via " + ipcRequest.getIpcCallName() + ", remoteService already exists", null, 2, null);
        jr0 jr0Var = new jr0(this, iInterface, appInfo, 0);
        if (!this.k.isEmpty()) {
            this.j.submit(new qe(this, 17, jr0Var));
        }
        return gr0VarB;
    }

    public abstract T createInterface(IBinder service);

    public final void d() {
        ((DelayedAction) this.g.getValue()).runWithDelay(this.c);
    }

    public final boolean e() {
        Object objG = g();
        kr6 kr6Var = this.h;
        this.h = kr6Var != null ? new kr6((AppInfo) kr6Var.a, (ComponentName) kr6Var.b, null) : null;
        Logger logger = getLogger();
        StringBuilder sb = new StringBuilder("Service connection is released success = ");
        boolean z = !(objG instanceof poe);
        sb.append(z);
        Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
        this.d.invoke(this);
        return z;
    }

    public final Object g() {
        try {
            if (this.i.compareAndSet(true, false)) {
                Logger.DefaultImpls.info$default(getLogger(), "Unbind service", null, 2, null);
                this.context.unbindService(this.l);
            } else {
                Logger.DefaultImpls.info$default(getLogger(), "Unbind service skipped", null, 2, null);
            }
            return sbi.a;
        } catch (Throwable th) {
            return new poe(th);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract String getLogTag();

    public final Logger getLogger() {
        return (Logger) this.f.getValue();
    }

    public final List<AppInfo> getPreferredHosts() {
        return this.preferredHosts;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final <V> Object makeAsyncRequest(qf7 qf7Var, String str, qf7 qf7Var2, cf7 cf7Var, cf7 cf7Var2, long j, lq4 lq4Var) throws Throwable {
        lr0 lr0Var;
        BaseIPCClient<T> baseIPCClient;
        cf7 cf7Var3;
        cf7 cf7Var4;
        BaseIPCClient<T> baseIPCClient2;
        Object objInvoke;
        if (lq4Var instanceof lr0) {
            lr0Var = (lr0) lq4Var;
            int i = lr0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lr0Var.h = i - Integer.MIN_VALUE;
            } else {
                lr0Var = new lr0(this, lq4Var);
            }
        } else {
            lr0Var = new lr0(this, lq4Var);
        }
        lr0 lr0Var2 = lr0Var;
        Object objJ0 = lr0Var2.f;
        int i2 = lr0Var2.h;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf7 cf7Var5 = lr0Var2.e;
                BaseIPCClient<T> baseIPCClient3 = lr0Var2.d;
                try {
                    ch3.d0(objJ0);
                    baseIPCClient2 = baseIPCClient3;
                    baseIPCClient2.d();
                    return objJ0;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    cf7Var4 = cf7Var5;
                    baseIPCClient = baseIPCClient3;
                    baseIPCClient.getLogger().warn("Timeout exceeded while executing AIDL request", e);
                    objInvoke = cf7Var4.invoke(e);
                    baseIPCClient.d();
                    return objInvoke;
                } catch (CancellationException e2) {
                    e = e2;
                    cf7Var3 = cf7Var5;
                    baseIPCClient = baseIPCClient3;
                    baseIPCClient.getLogger().warn("AIDL request was cancelled. Release connection immediately", e);
                    baseIPCClient.e();
                    objInvoke = cf7Var3.invoke(e);
                    baseIPCClient.d();
                    return objInvoke;
                } catch (Throwable th) {
                    th = th;
                    baseIPCClient = baseIPCClient3;
                    baseIPCClient.d();
                    throw th;
                }
            }
            ch3.d0(objJ0);
            try {
                gv7 gv7Var = new gv7(this, qf7Var, str, qf7Var2, cf7Var, cf7Var2, null, 1);
                lr0Var2.d = this;
                lr0Var2.e = cf7Var;
                lr0Var2.h = 1;
                objJ0 = lvb.J0(j, gv7Var, lr0Var2);
                hu4 hu4Var = hu4.a;
                if (objJ0 == hu4Var) {
                    return hu4Var;
                }
                baseIPCClient2 = this;
                baseIPCClient2.d();
                return objJ0;
            } catch (TimeoutCancellationException e3) {
                e = e3;
                baseIPCClient = this;
                cf7Var4 = cf7Var;
                baseIPCClient.getLogger().warn("Timeout exceeded while executing AIDL request", e);
                objInvoke = cf7Var4.invoke(e);
                baseIPCClient.d();
                return objInvoke;
            } catch (CancellationException e4) {
                e = e4;
                baseIPCClient = this;
                cf7Var3 = cf7Var;
                baseIPCClient.getLogger().warn("AIDL request was cancelled. Release connection immediately", e);
                baseIPCClient.e();
                objInvoke = cf7Var3.invoke(e);
                baseIPCClient.d();
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                baseIPCClient = this;
                baseIPCClient.d();
                throw th;
            }
            baseIPCClient.d();
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final <V> Object makeSimpleRequest(qf7 qf7Var, String str, cf7 cf7Var, cf7 cf7Var2, lq4 lq4Var) throws Throwable {
        mr0 mr0Var;
        BaseIPCClient<T> baseIPCClient;
        cf7 cf7Var3;
        cf7 cf7Var4;
        BaseIPCClient<T> baseIPCClient2;
        Object objInvoke;
        if (lq4Var instanceof mr0) {
            mr0Var = (mr0) lq4Var;
            int i = mr0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mr0Var.h = i - Integer.MIN_VALUE;
            } else {
                mr0Var = new mr0(this, lq4Var);
            }
        } else {
            mr0Var = new mr0(this, lq4Var);
        }
        mr0 mr0Var2 = mr0Var;
        Object objJ0 = mr0Var2.f;
        int i2 = mr0Var2.h;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf7 cf7Var5 = mr0Var2.e;
                BaseIPCClient<T> baseIPCClient3 = mr0Var2.d;
                try {
                    ch3.d0(objJ0);
                    baseIPCClient2 = baseIPCClient3;
                    baseIPCClient2.d();
                    return objJ0;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    cf7Var4 = cf7Var5;
                    baseIPCClient = baseIPCClient3;
                    baseIPCClient.getLogger().warn("Timeout exceeded while executing AIDL request", e);
                    objInvoke = cf7Var4.invoke(e);
                    baseIPCClient.d();
                    return objInvoke;
                } catch (CancellationException e2) {
                    e = e2;
                    cf7Var3 = cf7Var5;
                    baseIPCClient = baseIPCClient3;
                    baseIPCClient.getLogger().warn("AIDL request was cancelled. Release connection immediately", e);
                    baseIPCClient.e();
                    objInvoke = cf7Var3.invoke(e);
                    baseIPCClient.d();
                    return objInvoke;
                } catch (Throwable th) {
                    th = th;
                    baseIPCClient = baseIPCClient3;
                    baseIPCClient.d();
                    throw th;
                }
            }
            ch3.d0(objJ0);
            try {
                t20 t20Var = new t20(this, qf7Var, str, cf7Var, cf7Var2, null, 1);
                mr0Var2.d = this;
                mr0Var2.e = cf7Var;
                mr0Var2.h = 1;
                objJ0 = lvb.J0(180000L, t20Var, mr0Var2);
                hu4 hu4Var = hu4.a;
                if (objJ0 == hu4Var) {
                    return hu4Var;
                }
                baseIPCClient2 = this;
                baseIPCClient2.d();
                return objJ0;
            } catch (TimeoutCancellationException e3) {
                e = e3;
                baseIPCClient = this;
                cf7Var4 = cf7Var;
                baseIPCClient.getLogger().warn("Timeout exceeded while executing AIDL request", e);
                objInvoke = cf7Var4.invoke(e);
                baseIPCClient.d();
                return objInvoke;
            } catch (CancellationException e4) {
                e = e4;
                baseIPCClient = this;
                cf7Var3 = cf7Var;
                baseIPCClient.getLogger().warn("AIDL request was cancelled. Release connection immediately", e);
                baseIPCClient.e();
                objInvoke = cf7Var3.invoke(e);
                baseIPCClient.d();
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                baseIPCClient = this;
                baseIPCClient.d();
                throw th;
            }
            baseIPCClient.d();
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public /* synthetic */ BaseIPCClient(Context context, List list, long j, cf7 cf7Var, af7 af7Var, Logger logger, int i, j95 j95Var) {
        this(context, list, (i & 4) != 0 ? 10000L : j, (i & 8) != 0 ? rl0.c : cf7Var, af7Var, logger);
    }
}
