package ru.ok.android.externcalls.sdk.audio.internal;

import defpackage.cf7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.Logger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/DeviceSwitchHelper;", "T", "", "", "isEnabled", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "", "logTag", "Lkotlin/Function1;", "Lsbi;", "applyDevice", "<init>", "(ZLru/ok/android/externcalls/sdk/audio/Logger;Ljava/lang/String;Lcf7;)V", "device", "onDeviceSwitchRequested", "(Ljava/lang/Object;)V", "onDeviceSwitched", "()V", "Z", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Ljava/lang/String;", "Lcf7;", "pendingAudioDevice", "Ljava/lang/Object;", "ongoingAudioDevice", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceSwitchHelper<T> {
    private final cf7 applyDevice;
    private final boolean isEnabled;
    private final String logTag;
    private final Logger logger;
    private T ongoingAudioDevice;
    private T pendingAudioDevice;

    public DeviceSwitchHelper(boolean z, Logger logger, String str, cf7 cf7Var) {
        this.isEnabled = z;
        this.logger = logger;
        this.logTag = str;
        this.applyDevice = cf7Var;
    }

    public final void onDeviceSwitchRequested(T device) {
        if (!this.isEnabled) {
            this.applyDevice.invoke(device);
            return;
        }
        T t = this.pendingAudioDevice;
        if (t == null) {
            this.logger.d(this.logTag, "Pending device not yet present. Register " + device + " as new one");
            this.pendingAudioDevice = device;
            this.ongoingAudioDevice = null;
            this.applyDevice.invoke(device);
            return;
        }
        T t2 = this.ongoingAudioDevice;
        if (t2 == null) {
            boolean zEquals = t.equals(device);
            Logger logger = this.logger;
            String str = this.logTag;
            if (zEquals) {
                logger.d(str, "Pending device " + t + " is the same with proposed one, ignore");
                return;
            }
            logger.d(str, "Pending device " + t + " is not the same as proposed one - " + device + ". Keep it as ongoing");
            this.ongoingAudioDevice = device;
            return;
        }
        if (t2.equals(device)) {
            this.logger.d(this.logTag, "Pending device " + t + " is not the same as proposed one, but ongoing device " + t2 + " is, ignore");
            return;
        }
        if (t.equals(device)) {
            this.logger.d(this.logTag, "Pending device " + t + " is the same as proposed one, reset ongoing device " + t2 + " to null");
            this.ongoingAudioDevice = null;
            return;
        }
        this.ongoingAudioDevice = device;
        this.logger.d(this.logTag, "Pending device " + t + " and ongoing device " + t2 + " are both not the same as proposed one, replace ongoing device with " + device);
    }

    public final void onDeviceSwitched() {
        if (this.isEnabled) {
            this.logger.d(this.logTag, "Pending device doesn't matter anymore. Reset");
            this.pendingAudioDevice = null;
            T t = this.ongoingAudioDevice;
            this.ongoingAudioDevice = null;
            Logger logger = this.logger;
            String str = this.logTag;
            if (t == null) {
                logger.d(str, "Pending device reset done, no ongoing device found");
                return;
            }
            logger.d(str, "Pending device reset done, but ongoing device found, start flow again for " + t);
            onDeviceSwitchRequested(t);
        }
    }
}
