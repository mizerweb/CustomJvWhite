package ru.ok.android.externcalls.sdk.asr_online.internal.commands;

import defpackage.af7;
import defpackage.kql;
import defpackage.o91;
import defpackage.q4g;
import defpackage.vj7;
import defpackage.zvh;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "Lkotlin/Function0;", "Lo91;", "getCall", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Laf7;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "isEnabled", "Lsbi;", "enableAsrOnline", "(Z)V", "onMigratedToServerCallTopology", "()V", "Laf7;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "isAsrOnlineEnabled", "Z", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AsrOnlineCommandsExecutorImpl implements AsrOnlineCommandsExecutor {
    private final af7 getCall;
    private boolean isAsrOnlineEnabled;
    private final SignalingProvider signalingProvider;

    public AsrOnlineCommandsExecutorImpl(af7 af7Var, SignalingProvider signalingProvider) {
        this.getCall = af7Var;
        this.signalingProvider = signalingProvider;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void enableAsrOnline(boolean isEnabled) {
        this.isAsrOnlineEnabled = isEnabled;
        o91 o91Var = (o91) this.getCall.invoke();
        if (o91Var == null) {
            return;
        }
        if (!o91Var.n0.I(zvh.b)) {
            o91 o91Var2 = (o91) this.getCall.invoke();
            if (o91Var2 != null) {
                o91Var2.n0.R(isEnabled);
                return;
            }
            return;
        }
        vj7 vj7VarB = kql.b(null, "request-asr");
        q4g signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            signaling.k(vj7VarB);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void onMigratedToServerCallTopology() {
        o91 o91Var;
        if (!this.isAsrOnlineEnabled || (o91Var = (o91) this.getCall.invoke()) == null) {
            return;
        }
        o91Var.n0.R(this.isAsrOnlineEnabled);
    }
}
