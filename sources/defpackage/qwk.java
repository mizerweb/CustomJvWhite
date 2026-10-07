package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.telecom.CallAudioState;
import android.telecom.CallEndpoint;
import android.telephony.TelephonyManager;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qwk {
    public static final a80 a(CallAudioState callAudioState) {
        int route = callAudioState.getRoute();
        int i = 1;
        if (route != 1) {
            i = 2;
            if (route == 2) {
                i = 3;
            } else if (route == 4) {
                i = 4;
            } else if (route != 8) {
                i = 5;
            }
        }
        return i == 3 ? d(callAudioState.getActiveBluetoothDevice()) : f(i);
    }

    public static final String b(int i) {
        int i2 = b80.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == 1) {
            return CallsAudioDeviceInfo.EARPIECE;
        }
        if (i2 == 2) {
            return CallsAudioDeviceInfo.SPEAKERPHONE;
        }
        if (i2 == 3) {
            return "bluetooth";
        }
        if (i2 == 4) {
            return "wired_headset";
        }
        if (i2 == 5) {
            return "";
        }
        ore.o();
        return null;
    }

    public static void c(Context context, ndb ndbVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            ldb ldbVar = new ldb(ndbVar);
            telephonyManager.registerTelephonyCallback(ndbVar.a, ldbVar);
            telephonyManager.unregisterTelephonyCallback(ldbVar);
        } catch (RuntimeException unused) {
            ndbVar.d(5);
        }
    }

    public static final a80 d(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return f(3);
        }
        String address = bluetoothDevice.getAddress();
        String strO = null;
        try {
            String name = bluetoothDevice.getName();
            if (name != null && !r5h.X0(name)) {
                strO = name;
            }
        } catch (SecurityException unused) {
        }
        if (strO == null) {
            strO = c0a.o("Bluetooth [", bluetoothDevice.getAddress(), "]");
        }
        return new a80(3, strO, address);
    }

    public static final a80 e(CallEndpoint callEndpoint) {
        int endpointType = callEndpoint.getEndpointType();
        int i = 1;
        if (endpointType != 1) {
            i = 3;
            if (endpointType != 2) {
                if (endpointType != 3) {
                    i = endpointType != 4 ? 5 : 2;
                } else {
                    i = 4;
                }
            }
        }
        return new a80(i, callEndpoint.getEndpointType() == 2 ? callEndpoint.getEndpointName().toString() : b(i), callEndpoint.getEndpointType() == 2 ? callEndpoint.getIdentifier().toString() : p.m(i));
    }

    public static final a80 f(int i) {
        return new a80(i, b(i), p.m(i));
    }
}
