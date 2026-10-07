package defpackage;

import android.util.SparseIntArray;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
public final class abd {
    public final cbd a;
    public final nhb b;
    public final cbd c;
    public final uba d;
    public final cbd e;
    public final nhb f;
    public final cbd g;
    public final nhb h;
    public final String i;
    public final int j;

    public abd(gvb gvbVar) {
        int i;
        qe7.v();
        this.a = i85.a();
        this.b = nhb.e();
        cbd cbdVar = (cbd) gvbVar.b;
        this.c = cbdVar == null ? ta5.a() : cbdVar;
        uba ubaVar = (uba) gvbVar.c;
        this.d = ubaVar == null ? mhb.b() : ubaVar;
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(np0.q, 5);
        sparseIntArray.put(np0.r, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            i = 3145728;
        } else {
            i = iMin < 33554432 ? 6291456 : 12582912;
        }
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.e = new cbd(i, iMin2 < 16777216 ? iMin2 / 2 : (iMin2 / 4) * 3, sparseIntArray, -1);
        this.f = nhb.e();
        cbd cbdVar2 = (cbd) gvbVar.d;
        this.g = cbdVar2 == null ? grl.a() : cbdVar2;
        this.h = nhb.e();
        String str = (String) gvbVar.a;
        this.i = str == null ? "legacy" : str;
        this.j = 4194304;
        qe7.v();
    }
}
