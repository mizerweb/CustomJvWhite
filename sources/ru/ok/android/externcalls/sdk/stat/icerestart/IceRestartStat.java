package ru.ok.android.externcalls.sdk.stat.icerestart;

import defpackage.af7;
import defpackage.fi1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/icerestart/IceRestartStat;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Laf7;)V", "Lsbi;", "onIceRestart", "()V", "Laf7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IceRestartStat {
    private final af7 getEventualStatSender;

    public IceRestartStat(af7 af7Var) {
        this.getEventualStatSender = af7Var;
    }

    public final void onIceRestart() {
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            fi1.a(fi1Var, "ice_restart", null, null, 6);
        }
    }
}
