package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class v70 extends AudioDeviceCallback {
    public final /* synthetic */ x70 a;

    public v70(x70 x70Var) {
        this.a = x70Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        x70 x70Var = this.a;
        x70Var.h(u70.b((Context) x70Var.b, (p70) x70Var.j, (AudioDeviceInfo) x70Var.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        x70 x70Var = this.a;
        if (vqi.m(audioDeviceInfoArr, (AudioDeviceInfo) x70Var.i)) {
            x70Var.i = null;
        }
        x70Var.h(u70.b((Context) x70Var.b, (p70) x70Var.j, (AudioDeviceInfo) x70Var.i));
    }
}
