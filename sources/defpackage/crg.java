package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Iterator;
import org.webrtc.CameraEnumerationAndroid;

/* JADX INFO: loaded from: classes2.dex */
public final class crg implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ crg(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return e9i.D(Integer.valueOf(((dd8) obj).a), Integer.valueOf(((dd8) obj2).a));
            case 1:
                Iterator it = ((bi2) obj).b.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(i4h.n.indexOf(((h4h) it.next()).h));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(i4h.n.indexOf(((h4h) it.next()).h));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((bi2) obj2).b.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(i4h.n.indexOf(((h4h) it2.next()).h));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(i4h.n.indexOf(((h4h) it2.next()).h));
                            if (numValueOf3.compareTo(numValueOf4) < 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return e9i.D(numValueOf, numValueOf3);
                    }
                }
                qr7.d();
                return 0;
            case 2:
                Iterator it3 = ((bi2) obj).b.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf5 = Integer.valueOf(i4h.p.indexOf(new d4h(((h4h) it3.next()).c)));
                    while (it3.hasNext()) {
                        Integer numValueOf6 = Integer.valueOf(i4h.p.indexOf(new d4h(((h4h) it3.next()).c)));
                        if (numValueOf5.compareTo(numValueOf6) < 0) {
                            numValueOf5 = numValueOf6;
                        }
                    }
                    Iterator it4 = ((bi2) obj2).b.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf7 = Integer.valueOf(i4h.p.indexOf(new d4h(((h4h) it4.next()).c)));
                        while (it4.hasNext()) {
                            Integer numValueOf8 = Integer.valueOf(i4h.p.indexOf(new d4h(((h4h) it4.next()).c)));
                            if (numValueOf7.compareTo(numValueOf8) < 0) {
                                numValueOf7 = numValueOf8;
                            }
                        }
                        return e9i.D(numValueOf5, numValueOf7);
                    }
                }
                qr7.d();
                return 0;
            case 3:
                return e9i.D(((bhh) obj).a, ((bhh) obj2).a);
            case 4:
                return e9i.D(((dhh) obj).a, ((dhh) obj2).a);
            case 5:
                return e9i.D(((kwi) ((u4j) obj2).b).c(), ((kwi) ((u4j) obj).b).c());
            case 6:
                return e9i.D(Long.valueOf(((pv0) obj).getSliceTime()), Long.valueOf(((pv0) obj2).getSliceTime()));
            case 7:
                CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) obj;
                CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) obj2;
                return Integer.compare(captureFormat2.width * captureFormat2.height, captureFormat.width * captureFormat.height);
            case 8:
                return e9i.D(Long.valueOf(((pv0) obj).getSliceTime()), Long.valueOf(((pv0) obj2).getSliceTime()));
            default:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
        }
    }
}
