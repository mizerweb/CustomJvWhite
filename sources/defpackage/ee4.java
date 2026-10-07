package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.telecom.CallAudioState;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ee4 extends iq0 {
    public int f;
    public a80 g;

    @Override // defpackage.rb0
    public final void b(a80 a80Var) {
        je9 je9Var = je9.d;
        String str = a80Var.c;
        if (a80Var.a == 3 && str != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            BluetoothDevice remoteDevice = defaultAdapter != null ? defaultAdapter.getRemoteDevice(str) : null;
            if (remoteDevice != null) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallAudioController", nbh.w("setAudioDevice via requestBluetoothAudio: ", a80Var.b, "(address=", str, ")"), null);
                }
                re1 re1VarA = this.a.a();
                if (re1VarA != null) {
                    re1VarA.requestBluetoothAudio(remoteDevice);
                    return;
                } else {
                    gm0.Y("CallConnectionController", "requestBluetoothAudio: no active connection");
                    return;
                }
            }
        }
        int i = b80.$EnumSwitchMapping$0[qt4.D(a80Var.a)];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 8;
            } else if (i == 3) {
                i2 = 2;
            } else if (i == 4) {
                i2 = 4;
            } else if (i != 5) {
                ore.o();
                return;
            }
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallAudioController", nbh.r(i2, "setAudioDevice via setAudioRoute: ", a80Var.b, " -> route="), null);
        }
        re1 re1VarA2 = this.a.a();
        if (re1VarA2 != null) {
            re1VarA2.setAudioRoute(i2);
        } else {
            gm0.Y("CallConnectionController", "setAudioRoute: no active connection");
        }
    }

    @Override // defpackage.rb0
    public final void c(l82 l82Var) {
        ue1 ue1Var = this.a;
        if (l82Var != null) {
            ue1Var.n = new w14(this, 2, l82Var);
        } else {
            ue1Var.n = null;
        }
    }

    @Override // defpackage.rb0
    public final void d(boolean z) {
        if (f(z)) {
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAudioController", zo5.h(8, "setSpeakerEnabled(true) via setAudioRoute: route="), null);
            }
        }
        re1 re1VarA = this.a.a();
        if (re1VarA != null) {
            re1VarA.setAudioRoute(8);
        } else {
            gm0.Y("CallConnectionController", "setAudioRoute: no active connection");
        }
    }

    @Override // defpackage.rb0
    public final Set getAvailableAudioDevices() {
        CallAudioState callAudioState = this.a.r;
        if (callAudioState == null) {
            gm0.n("CallAudioController", "availableAudioDevices: callAudioState is null, returning empty");
            return c76.a;
        }
        gof gofVar = new gof();
        if ((callAudioState.getSupportedRouteMask() & 1) != 0) {
            gofVar.add(qwk.f(1));
        }
        if ((callAudioState.getSupportedRouteMask() & 8) != 0) {
            gofVar.add(qwk.f(2));
        }
        if ((callAudioState.getSupportedRouteMask() & 2) != 0) {
            Collection supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices();
            if (supportedBluetoothDevices.isEmpty()) {
                gofVar.add(qwk.f(3));
            } else {
                Iterator it = supportedBluetoothDevices.iterator();
                while (it.hasNext()) {
                    gofVar.add(qwk.d((BluetoothDevice) it.next()));
                }
            }
        }
        if ((callAudioState.getSupportedRouteMask() & 4) != 0) {
            gofVar.add(qwk.f(4));
        }
        return p90.e(gofVar);
    }

    @Override // defpackage.rb0
    public final a80 getCurrentDevice() {
        a80 a80Var = this.g;
        a80 a80Var2 = a80.d;
        if (a80Var.equals(a80Var2)) {
            a80Var = null;
        }
        if (a80Var != null) {
            return a80Var;
        }
        CallAudioState callAudioState = this.a.r;
        a80 a80VarA = callAudioState != null ? qwk.a(callAudioState) : null;
        return a80VarA == null ? a80Var2 : a80VarA;
    }
}
