package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qb2 implements bg2 {
    public final String a;
    public final CameraCharacteristics b;
    public final kc2 c;
    public final Set d;
    public final ArrayMap e = new ArrayMap();
    public final ArrayMap f = new ArrayMap();
    public final ny8 g;
    public final ny8 h;

    public qb2(String str, CameraCharacteristics cameraCharacteristics, kc2 kc2Var, Set set) {
        this.a = str;
        this.b = cameraCharacteristics;
        this.c = kc2Var;
        this.d = set;
        final int i = 0;
        af7 af7Var = new af7(this) { // from class: pb2
            public final /* synthetic */ qb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Set setX1;
                int i2 = i;
                List list = r66.a;
                c76 c76Var = c76.a;
                qb2 qb2Var = this.b;
                switch (i2) {
                    case 0:
                        String str2 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ef2.b(str2)) + "#supportedExtensions");
                                kc2 kc2Var2 = qb2Var.c;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setX1 = ww3.X1(kc2Var2.e(str2).getSupportedExtensions());
                                    break;
                                } else {
                                    setX1 = c76Var;
                                }
                                return setX1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ef2.b(str2)), e);
                            return c76Var;
                        }
                    case 1:
                        String str3 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = qb2Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) ef2.b(str3)) + '}', e2);
                            return c76Var;
                        }
                    case 2:
                        String str4 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = qb2Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ef2.b(str4)), e3);
                            return c76Var;
                        }
                    case 3:
                        String str5 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = qb2Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ef2.b(str5)), e4);
                            return c76Var;
                        }
                    case 4:
                        String str6 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = qb2Var.b.getPhysicalCameraIds();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ef2.b(str6)) + ": " + physicalCameraIds);
                                ArrayList arrayList = new ArrayList(yw3.W0(physicalCameraIds, 10));
                                for (String str7 : physicalCameraIds) {
                                    ef2.a(str7);
                                    arrayList.add(new ef2(str7));
                                }
                                return ww3.X1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e5);
                            return c76Var;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e6);
                            return c76Var;
                        }
                    case 5:
                        String str8 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List availablePhysicalCameraRequestKeys = qb2Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    list = availablePhysicalCameraRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c76Var;
                        }
                    case 6:
                        String str9 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List availableSessionCharacteristicsKeys = qb2Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    list = availableSessionCharacteristicsKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c76Var;
                        }
                    default:
                        String str10 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List availableSessionKeys = qb2Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    list = availableSessionKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c76Var;
                        }
                }
            }
        };
        final int i2 = 2;
        this.g = rx8.P(2, af7Var);
        final int i3 = 1;
        rx8.P(2, new af7(this) { // from class: pb2
            public final /* synthetic */ qb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Set setX1;
                int i4 = i3;
                List list = r66.a;
                c76 c76Var = c76.a;
                qb2 qb2Var = this.b;
                switch (i4) {
                    case 0:
                        String str2 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ef2.b(str2)) + "#supportedExtensions");
                                kc2 kc2Var2 = qb2Var.c;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setX1 = ww3.X1(kc2Var2.e(str2).getSupportedExtensions());
                                    break;
                                } else {
                                    setX1 = c76Var;
                                }
                                return setX1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ef2.b(str2)), e);
                            return c76Var;
                        }
                    case 1:
                        String str3 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = qb2Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) ef2.b(str3)) + '}', e2);
                            return c76Var;
                        }
                    case 2:
                        String str4 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = qb2Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ef2.b(str4)), e3);
                            return c76Var;
                        }
                    case 3:
                        String str5 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = qb2Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ef2.b(str5)), e4);
                            return c76Var;
                        }
                    case 4:
                        String str6 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = qb2Var.b.getPhysicalCameraIds();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ef2.b(str6)) + ": " + physicalCameraIds);
                                ArrayList arrayList = new ArrayList(yw3.W0(physicalCameraIds, 10));
                                for (String str7 : physicalCameraIds) {
                                    ef2.a(str7);
                                    arrayList.add(new ef2(str7));
                                }
                                return ww3.X1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e5);
                            return c76Var;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e6);
                            return c76Var;
                        }
                    case 5:
                        String str8 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List availablePhysicalCameraRequestKeys = qb2Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    list = availablePhysicalCameraRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c76Var;
                        }
                    case 6:
                        String str9 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List availableSessionCharacteristicsKeys = qb2Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    list = availableSessionCharacteristicsKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c76Var;
                        }
                    default:
                        String str10 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List availableSessionKeys = qb2Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    list = availableSessionKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c76Var;
                        }
                }
            }
        });
        rx8.P(2, new af7(this) { // from class: pb2
            public final /* synthetic */ qb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Set setX1;
                int i4 = i2;
                List list = r66.a;
                c76 c76Var = c76.a;
                qb2 qb2Var = this.b;
                switch (i4) {
                    case 0:
                        String str2 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ef2.b(str2)) + "#supportedExtensions");
                                kc2 kc2Var2 = qb2Var.c;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setX1 = ww3.X1(kc2Var2.e(str2).getSupportedExtensions());
                                    break;
                                } else {
                                    setX1 = c76Var;
                                }
                                return setX1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ef2.b(str2)), e);
                            return c76Var;
                        }
                    case 1:
                        String str3 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = qb2Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) ef2.b(str3)) + '}', e2);
                            return c76Var;
                        }
                    case 2:
                        String str4 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = qb2Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ef2.b(str4)), e3);
                            return c76Var;
                        }
                    case 3:
                        String str5 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = qb2Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ef2.b(str5)), e4);
                            return c76Var;
                        }
                    case 4:
                        String str6 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = qb2Var.b.getPhysicalCameraIds();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ef2.b(str6)) + ": " + physicalCameraIds);
                                ArrayList arrayList = new ArrayList(yw3.W0(physicalCameraIds, 10));
                                for (String str7 : physicalCameraIds) {
                                    ef2.a(str7);
                                    arrayList.add(new ef2(str7));
                                }
                                return ww3.X1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e5);
                            return c76Var;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e6);
                            return c76Var;
                        }
                    case 5:
                        String str8 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List availablePhysicalCameraRequestKeys = qb2Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    list = availablePhysicalCameraRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c76Var;
                        }
                    case 6:
                        String str9 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List availableSessionCharacteristicsKeys = qb2Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    list = availableSessionCharacteristicsKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c76Var;
                        }
                    default:
                        String str10 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List availableSessionKeys = qb2Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    list = availableSessionKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c76Var;
                        }
                }
            }
        });
        final int i4 = 3;
        rx8.P(2, new af7(this) { // from class: pb2
            public final /* synthetic */ qb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Set setX1;
                int i5 = i4;
                List list = r66.a;
                c76 c76Var = c76.a;
                qb2 qb2Var = this.b;
                switch (i5) {
                    case 0:
                        String str2 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ef2.b(str2)) + "#supportedExtensions");
                                kc2 kc2Var2 = qb2Var.c;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setX1 = ww3.X1(kc2Var2.e(str2).getSupportedExtensions());
                                    break;
                                } else {
                                    setX1 = c76Var;
                                }
                                return setX1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ef2.b(str2)), e);
                            return c76Var;
                        }
                    case 1:
                        String str3 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = qb2Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) ef2.b(str3)) + '}', e2);
                            return c76Var;
                        }
                    case 2:
                        String str4 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = qb2Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ef2.b(str4)), e3);
                            return c76Var;
                        }
                    case 3:
                        String str5 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = qb2Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ef2.b(str5)), e4);
                            return c76Var;
                        }
                    case 4:
                        String str6 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = qb2Var.b.getPhysicalCameraIds();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ef2.b(str6)) + ": " + physicalCameraIds);
                                ArrayList arrayList = new ArrayList(yw3.W0(physicalCameraIds, 10));
                                for (String str7 : physicalCameraIds) {
                                    ef2.a(str7);
                                    arrayList.add(new ef2(str7));
                                }
                                return ww3.X1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e5);
                            return c76Var;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e6);
                            return c76Var;
                        }
                    case 5:
                        String str8 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List availablePhysicalCameraRequestKeys = qb2Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    list = availablePhysicalCameraRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c76Var;
                        }
                    case 6:
                        String str9 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List availableSessionCharacteristicsKeys = qb2Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    list = availableSessionCharacteristicsKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c76Var;
                        }
                    default:
                        String str10 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List availableSessionKeys = qb2Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    list = availableSessionKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c76Var;
                        }
                }
            }
        });
        final int i5 = 4;
        rx8.P(2, new af7(this) { // from class: pb2
            public final /* synthetic */ qb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Set setX1;
                int i6 = i5;
                List list = r66.a;
                c76 c76Var = c76.a;
                qb2 qb2Var = this.b;
                switch (i6) {
                    case 0:
                        String str2 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ef2.b(str2)) + "#supportedExtensions");
                                kc2 kc2Var2 = qb2Var.c;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setX1 = ww3.X1(kc2Var2.e(str2).getSupportedExtensions());
                                    break;
                                } else {
                                    setX1 = c76Var;
                                }
                                return setX1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ef2.b(str2)), e);
                            return c76Var;
                        }
                    case 1:
                        String str3 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = qb2Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) ef2.b(str3)) + '}', e2);
                            return c76Var;
                        }
                    case 2:
                        String str4 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = qb2Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ef2.b(str4)), e3);
                            return c76Var;
                        }
                    case 3:
                        String str5 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = qb2Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ef2.b(str5)), e4);
                            return c76Var;
                        }
                    case 4:
                        String str6 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = qb2Var.b.getPhysicalCameraIds();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ef2.b(str6)) + ": " + physicalCameraIds);
                                ArrayList arrayList = new ArrayList(yw3.W0(physicalCameraIds, 10));
                                for (String str7 : physicalCameraIds) {
                                    ef2.a(str7);
                                    arrayList.add(new ef2(str7));
                                }
                                return ww3.X1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e5);
                            return c76Var;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e6);
                            return c76Var;
                        }
                    case 5:
                        String str8 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List availablePhysicalCameraRequestKeys = qb2Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    list = availablePhysicalCameraRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c76Var;
                        }
                    case 6:
                        String str9 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List availableSessionCharacteristicsKeys = qb2Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    list = availableSessionCharacteristicsKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c76Var;
                        }
                    default:
                        String str10 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List availableSessionKeys = qb2Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    list = availableSessionKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c76Var;
                        }
                }
            }
        });
        final int i6 = 5;
        rx8.P(2, new af7(this) { // from class: pb2
            public final /* synthetic */ qb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Set setX1;
                int i7 = i6;
                List list = r66.a;
                c76 c76Var = c76.a;
                qb2 qb2Var = this.b;
                switch (i7) {
                    case 0:
                        String str2 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ef2.b(str2)) + "#supportedExtensions");
                                kc2 kc2Var2 = qb2Var.c;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setX1 = ww3.X1(kc2Var2.e(str2).getSupportedExtensions());
                                    break;
                                } else {
                                    setX1 = c76Var;
                                }
                                return setX1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ef2.b(str2)), e);
                            return c76Var;
                        }
                    case 1:
                        String str3 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = qb2Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) ef2.b(str3)) + '}', e2);
                            return c76Var;
                        }
                    case 2:
                        String str4 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = qb2Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ef2.b(str4)), e3);
                            return c76Var;
                        }
                    case 3:
                        String str5 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = qb2Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ef2.b(str5)), e4);
                            return c76Var;
                        }
                    case 4:
                        String str6 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = qb2Var.b.getPhysicalCameraIds();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ef2.b(str6)) + ": " + physicalCameraIds);
                                ArrayList arrayList = new ArrayList(yw3.W0(physicalCameraIds, 10));
                                for (String str7 : physicalCameraIds) {
                                    ef2.a(str7);
                                    arrayList.add(new ef2(str7));
                                }
                                return ww3.X1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e5);
                            return c76Var;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e6);
                            return c76Var;
                        }
                    case 5:
                        String str8 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List availablePhysicalCameraRequestKeys = qb2Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    list = availablePhysicalCameraRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c76Var;
                        }
                    case 6:
                        String str9 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List availableSessionCharacteristicsKeys = qb2Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    list = availableSessionCharacteristicsKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c76Var;
                        }
                    default:
                        String str10 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List availableSessionKeys = qb2Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    list = availableSessionKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c76Var;
                        }
                }
            }
        });
        final int i7 = 6;
        rx8.P(2, new af7(this) { // from class: pb2
            public final /* synthetic */ qb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Set setX1;
                int i8 = i7;
                List list = r66.a;
                c76 c76Var = c76.a;
                qb2 qb2Var = this.b;
                switch (i8) {
                    case 0:
                        String str2 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ef2.b(str2)) + "#supportedExtensions");
                                kc2 kc2Var2 = qb2Var.c;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setX1 = ww3.X1(kc2Var2.e(str2).getSupportedExtensions());
                                    break;
                                } else {
                                    setX1 = c76Var;
                                }
                                return setX1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ef2.b(str2)), e);
                            return c76Var;
                        }
                    case 1:
                        String str3 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = qb2Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) ef2.b(str3)) + '}', e2);
                            return c76Var;
                        }
                    case 2:
                        String str4 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = qb2Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ef2.b(str4)), e3);
                            return c76Var;
                        }
                    case 3:
                        String str5 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = qb2Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ef2.b(str5)), e4);
                            return c76Var;
                        }
                    case 4:
                        String str6 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = qb2Var.b.getPhysicalCameraIds();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ef2.b(str6)) + ": " + physicalCameraIds);
                                ArrayList arrayList = new ArrayList(yw3.W0(physicalCameraIds, 10));
                                for (String str7 : physicalCameraIds) {
                                    ef2.a(str7);
                                    arrayList.add(new ef2(str7));
                                }
                                return ww3.X1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e5);
                            return c76Var;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e6);
                            return c76Var;
                        }
                    case 5:
                        String str8 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List availablePhysicalCameraRequestKeys = qb2Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    list = availablePhysicalCameraRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c76Var;
                        }
                    case 6:
                        String str9 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List availableSessionCharacteristicsKeys = qb2Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    list = availableSessionCharacteristicsKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c76Var;
                        }
                    default:
                        String str10 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List availableSessionKeys = qb2Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    list = availableSessionKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c76Var;
                        }
                }
            }
        });
        final int i8 = 7;
        this.h = rx8.P(2, new af7(this) { // from class: pb2
            public final /* synthetic */ qb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                Set setX1;
                int i9 = i8;
                List list = r66.a;
                c76 c76Var = c76.a;
                qb2 qb2Var = this.b;
                switch (i9) {
                    case 0:
                        String str2 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) ef2.b(str2)) + "#supportedExtensions");
                                kc2 kc2Var2 = qb2Var.c;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    setX1 = ww3.X1(kc2Var2.e(str2).getSupportedExtensions());
                                    break;
                                } else {
                                    setX1 = c76Var;
                                }
                                return setX1;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) ef2.b(str2)), e);
                            return c76Var;
                        }
                    case 1:
                        String str3 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = qb2Var.b.getKeys();
                                if (keys != null) {
                                    list = keys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) ef2.b(str3)) + '}', e2);
                            return c76Var;
                        }
                    case 2:
                        String str4 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = qb2Var.b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys != null) {
                                    list = availableCaptureRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) ef2.b(str4)), e3);
                            return c76Var;
                        }
                    case 3:
                        String str5 = qb2Var.a;
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = qb2Var.b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys != null) {
                                    list = availableCaptureResultKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) ef2.b(str5)), e4);
                            return c76Var;
                        }
                    case 4:
                        String str6 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) ef2.b(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = qb2Var.b.getPhysicalCameraIds();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) ef2.b(str6)) + ": " + physicalCameraIds);
                                ArrayList arrayList = new ArrayList(yw3.W0(physicalCameraIds, 10));
                                for (String str7 : physicalCameraIds) {
                                    ef2.a(str7);
                                    arrayList.add(new ef2(str7));
                                }
                                return ww3.X1(arrayList);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e5);
                            return c76Var;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) ef2.b(str6)), e6);
                            return c76Var;
                        }
                    case 5:
                        String str8 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List availablePhysicalCameraRequestKeys = qb2Var.b.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    list = availablePhysicalCameraRequestKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return c76Var;
                        }
                    case 6:
                        String str9 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                List availableSessionCharacteristicsKeys = qb2Var.b.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    list = availableSessionCharacteristicsKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return c76Var;
                        }
                    default:
                        String str10 = qb2Var.a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return c76Var;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List availableSessionKeys = qb2Var.b.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    list = availableSessionKeys;
                                }
                                return ww3.X1(list);
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return c76Var;
                        }
                }
            }
        });
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(CameraCharacteristics.class))) {
            return this.b;
        }
        return null;
    }

    public final Object c(CameraCharacteristics.Key key) {
        Object obj;
        if (this.d.contains(key)) {
            try {
                return this.b.get(key);
            } catch (AssertionError unused) {
                c.u(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
                return null;
            }
        }
        synchronized (this.e) {
            obj = this.e.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.b.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.e) {
                this.e.put(key, obj2);
            }
            return obj2;
        } catch (AssertionError unused2) {
            c.u(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
            return null;
        }
    }
}
