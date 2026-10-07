package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* JADX INFO: loaded from: classes3.dex */
public final class v6f implements rb0 {
    public final CallsAudioManager a;

    public v6f(CallsAudioManager callsAudioManager) {
        this.a = callsAudioManager;
    }

    @Override // defpackage.rb0
    public final void a(CallsAudioManager.State state) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAudioController", "setting audio state: " + state, null);
            }
        }
        CallsAudioManager.changeStateAsync$default(this.a, state, null, null, 6, null);
    }

    @Override // defpackage.rb0
    public final void b(a80 a80Var) {
        CallsAudioManager.AudioDeviceType audioDeviceType;
        int i = w6f.$EnumSwitchMapping$1[qt4.D(a80Var.a)];
        if (i == 1) {
            audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
        } else if (i == 2) {
            audioDeviceType = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        } else if (i == 3) {
            audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        } else if (i == 4) {
            audioDeviceType = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        } else {
            if (i != 5) {
                ore.o();
                return;
            }
            audioDeviceType = CallsAudioManager.AudioDeviceType.NONE;
        }
        CallsAudioManager.setAudioDeviceAsync$default(this.a, new CallsAudioDeviceInfo(audioDeviceType, a80Var.b), null, null, 6, null);
    }

    @Override // defpackage.rb0
    public final void c(l82 l82Var) {
        CallsAudioManager callsAudioManager = this.a;
        if (l82Var != null) {
            callsAudioManager.setOnAudioDeviceChangeListener(new qyb(19, l82Var));
        } else {
            callsAudioManager.setOnAudioDeviceChangeListener(null);
        }
    }

    @Override // defpackage.rb0
    public final void d(boolean z) {
        CallsAudioManager.setSpeakerEnabledAsync$default(this.a, true, true, null, null, 12, null);
    }

    @Override // defpackage.rb0
    public final Set getAvailableAudioDevices() {
        List<CallsAudioDeviceInfo> availableAudioDevices = this.a.getAvailableAudioDevices();
        LinkedHashSet linkedHashSet = new LinkedHashSet(availableAudioDevices.size());
        Iterator<T> it = availableAudioDevices.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(x6f.a((CallsAudioDeviceInfo) it.next()));
        }
        return linkedHashSet;
    }

    @Override // defpackage.rb0
    public final a80 getCurrentDevice() {
        return x6f.a(this.a.getCurrentDevice());
    }

    @Override // defpackage.rb0
    public final void release() {
        CallsAudioManager.releaseAsync$default(this.a, null, null, 3, null);
        gm0.n("CallAudioController", "SdkAudioManagerRouteDelegate released");
    }
}
