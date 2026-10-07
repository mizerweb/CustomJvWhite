package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e4m {
    public static boolean a = true;

    public static final c8b a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
        c8b c8bVar = new c8b();
        c8bVar.e(1, i);
        c8bVar.e(2, i2);
        c8bVar.e(4, i3);
        c8bVar.e(8, i4);
        c8bVar.e(65536, i5);
        c8bVar.e(16, i6);
        c8bVar.e(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, i7);
        c8bVar.e(32, i8);
        c8bVar.e(4194304, i9);
        c8bVar.e(64, i10);
        c8bVar.e(8388608, i11);
        c8bVar.e(np0.n, i12);
        c8bVar.e(1048576, i13);
        c8bVar.e(np0.m, i14);
        c8bVar.e(2097152, i15);
        c8bVar.e(16777216, i16);
        c8bVar.e(i17, i18);
        c8bVar.e(i19, i20);
        c8bVar.e(i21, i22);
        c8bVar.e(np0.q, i23);
        c8bVar.e(131072, i24);
        c8bVar.e(262144, i25);
        c8bVar.e(524288, i26);
        return c8bVar;
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            q7j.b(viewGroup, z);
        } else if (a) {
            try {
                q7j.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
