package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class qv7 {
    public static final Range f = new Range(120, 120);
    public final bg2 a;
    public final ifh b;
    public final ifh c;
    public final ifh d;
    public final ifh e;

    public qv7(bg2 bg2Var) {
        this.a = bg2Var;
        final int i = 0;
        this.b = new ifh(new af7(this) { // from class: pv7
            public final /* synthetic */ qv7 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                qv7 qv7Var = this.b;
                switch (i2) {
                    case 0:
                        int[] iArr = (int[]) ((qb2) qv7Var.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i3 : iArr) {
                                if (i3 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) qv7Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            qr7.d();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = mag.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = mag.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        bg2 bg2Var2 = qv7Var.a;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qb2) bg2Var2).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new a4h(streamConfigurationMap, new sjc(bg2Var2));
                        }
                        ore.p("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((a4h) qv7Var.d.getValue()).c.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? a.n1(highSpeedVideoSizes) : r66.a;
                }
            }
        });
        final int i2 = 1;
        this.c = new ifh(new af7(this) { // from class: pv7
            public final /* synthetic */ qv7 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                qv7 qv7Var = this.b;
                switch (i3) {
                    case 0:
                        int[] iArr = (int[]) ((qb2) qv7Var.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i4 : iArr) {
                                if (i4 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) qv7Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            qr7.d();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = mag.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = mag.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        bg2 bg2Var2 = qv7Var.a;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qb2) bg2Var2).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new a4h(streamConfigurationMap, new sjc(bg2Var2));
                        }
                        ore.p("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((a4h) qv7Var.d.getValue()).c.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? a.n1(highSpeedVideoSizes) : r66.a;
                }
            }
        });
        final int i3 = 2;
        this.d = new ifh(new af7(this) { // from class: pv7
            public final /* synthetic */ qv7 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                qv7 qv7Var = this.b;
                switch (i4) {
                    case 0:
                        int[] iArr = (int[]) ((qb2) qv7Var.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i5 : iArr) {
                                if (i5 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) qv7Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            qr7.d();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = mag.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = mag.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        bg2 bg2Var2 = qv7Var.a;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qb2) bg2Var2).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new a4h(streamConfigurationMap, new sjc(bg2Var2));
                        }
                        ore.p("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((a4h) qv7Var.d.getValue()).c.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? a.n1(highSpeedVideoSizes) : r66.a;
                }
            }
        });
        final int i4 = 3;
        this.e = new ifh(new af7(this) { // from class: pv7
            public final /* synthetic */ qv7 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                qv7 qv7Var = this.b;
                switch (i5) {
                    case 0:
                        int[] iArr = (int[]) ((qb2) qv7Var.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i6 : iArr) {
                                if (i6 == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) qv7Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            qr7.d();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = mag.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = mag.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        bg2 bg2Var2 = qv7Var.a;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qb2) bg2Var2).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new a4h(streamConfigurationMap, new sjc(bg2Var2));
                        }
                        ore.p("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((a4h) qv7Var.d.getValue()).c.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? a.n1(highSpeedVideoSizes) : r66.a;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return r66.a;
        }
        ArrayList arrayList = new ArrayList((Collection) ww3.r1(list));
        Iterator it = ww3.l1(list, 1).iterator();
        while (it.hasNext()) {
            arrayList.retainAll((List) it.next());
        }
        return arrayList;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && ww3.k1(list).size() == 1) {
            List listC = c((Size) list.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (cqk.d(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Object poeVar;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((a4h) this.d.getValue()).c.b;
            poeVar = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Range[] rangeArr = (Range[]) (poeVar instanceof poe ? null : poeVar);
        return rangeArr != null ? ww3.T1(a.Y0(rangeArr)) : r66.a;
    }
}
