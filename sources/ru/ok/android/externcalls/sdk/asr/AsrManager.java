package ru.ok.android.externcalls.sdk.asr;

import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import defpackage.dnf;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJE\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/AsrManager;", "", "", "fileName", "Ldnf;", "sessionRoomId", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Ljava/lang/String;Ldnf;Laf7;Lcf7;)V", "stopRecord", "(Ldnf;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;", "listener", "addAsrRecordListener", "(Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;)V", "removeAsrRecordListener", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface AsrManager {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void startRecord$default(AsrManager asrManager, String str, dnf dnfVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: startRecord");
            return;
        }
        if ((i & 2) != 0) {
            dnfVar = null;
        }
        if ((i & 4) != 0) {
            af7Var = null;
        }
        if ((i & 8) != 0) {
            cf7Var = null;
        }
        asrManager.startRecord(str, dnfVar, af7Var, cf7Var);
    }

    static /* synthetic */ void stopRecord$default(AsrManager asrManager, dnf dnfVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: stopRecord");
            return;
        }
        if ((i & 1) != 0) {
            dnfVar = null;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        asrManager.stopRecord(dnfVar, af7Var, cf7Var);
    }

    void addAsrRecordListener(AsrRecordListener listener);

    void removeAsrRecordListener(AsrRecordListener listener);

    void startRecord(String fileName, dnf sessionRoomId, af7 onSuccess, cf7 onError);

    void stopRecord(dnf sessionRoomId, af7 onSuccess, cf7 onError);
}
