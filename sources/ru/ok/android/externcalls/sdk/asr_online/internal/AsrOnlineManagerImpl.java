package ru.ok.android.externcalls.sdk.asr_online.internal;

import defpackage.af7;
import defpackage.m91;
import defpackage.o91;
import defpackage.sb1;
import defpackage.ux;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/AsrOnlineManagerImpl;", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineManager;", "Lsb1;", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManager;", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "commandExecutor", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;", "listenerManager", "Lkotlin/Function0;", "Lo91;", "getCall", "<init>", "(Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;Laf7;)V", "", "isAsrAvailable", "()Z", "isEnabled", "Lsbi;", "enableAsrOnline", "(Z)V", "Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;", "listener", "addAsrOnlineListener", "(Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;)V", "removeAsrOnlineListener", "Lux;", "asrRecvDataPackage", "onAsrDataPackage", "(Lux;)V", "isAvailable", "onAsrAvailableChanged", "onMigratedToServerCallTopology", "()V", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;", "Laf7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AsrOnlineManagerImpl implements AsrOnlineManager, sb1, AsrOnlineListenerManager, AsrOnlineCommandsExecutor {
    private final AsrOnlineCommandsExecutor commandExecutor;
    private final af7 getCall;
    private final AsrOnlineListenerManagerImpl listenerManager;

    public AsrOnlineManagerImpl(AsrOnlineCommandsExecutor asrOnlineCommandsExecutor, AsrOnlineListenerManagerImpl asrOnlineListenerManagerImpl, af7 af7Var) {
        this.commandExecutor = asrOnlineCommandsExecutor;
        this.listenerManager = asrOnlineListenerManagerImpl;
        this.getCall = af7Var;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void addAsrOnlineListener(AsrOnlineListener listener) {
        this.listenerManager.addAsrOnlineListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void enableAsrOnline(boolean isEnabled) {
        this.commandExecutor.enableAsrOnline(isEnabled);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager
    public boolean isAsrAvailable() {
        o91 o91Var = (o91) this.getCall.invoke();
        if (o91Var != null) {
            return o91Var.t.contains(m91.f);
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void onAsrAvailableChanged(boolean isAvailable) {
        this.listenerManager.onAsrAvailableChanged(isAvailable);
    }

    @Override // defpackage.sb1
    public void onAsrDataPackage(ux asrRecvDataPackage) {
        this.listenerManager.onAsrDataPackage(asrRecvDataPackage);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void onMigratedToServerCallTopology() {
        this.commandExecutor.onMigratedToServerCallTopology();
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void removeAsrOnlineListener(AsrOnlineListener listener) {
        this.listenerManager.removeAsrOnlineListener(listener);
    }
}
