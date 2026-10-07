package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.ScreenShareException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q31(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int iIntValue;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                s31 s31Var = (s31) this.d;
                int i = this.b;
                int i2 = this.c;
                while (true) {
                    int i3 = s31Var.j;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    ww6 ww6Var = s31Var.i;
                    int i4 = s31Var.e;
                    ww6Var.getClass();
                    hj8 hj8VarF0 = oc9.f0(0, i4);
                    ArrayList arrayList = new ArrayList(yw3.W0(hj8VarF0, 10));
                    Iterator it = hj8VarF0.iterator();
                    while (true) {
                        gj8 gj8Var = (gj8) it;
                        if (gj8Var.c) {
                            arrayList.add(Integer.valueOf(ww6Var.k(gj8Var.nextInt() + i3)));
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (s31Var.l.contains(Integer.valueOf(((Number) obj).intValue()))) {
                                    arrayList2.add(obj);
                                }
                            }
                            Set setX1 = ww3.X1(arrayList2);
                            ArrayDeque arrayDeque = new ArrayDeque(lof.Y(s31Var.f.keySet(), setX1));
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (arrayList2.isEmpty()) {
                                        iIntValue = (int) (s31Var.e * 0.5f);
                                    } else {
                                        int size = arrayList2.size();
                                        iIntValue = ((Number) arrayList2.get(oc9.v((int) (size * 0.5f), 0, size - 1))).intValue();
                                    }
                                    s31Var.g = iIntValue;
                                    s31Var.h = false;
                                    return;
                                }
                                int iIntValue2 = ((Number) it2.next()).intValue();
                                if (s31Var.f.get(Integer.valueOf(iIntValue2)) == null) {
                                    int i5 = s31Var.j;
                                    if (i5 == -1 || setX1.contains(Integer.valueOf(i5))) {
                                        Integer num = (Integer) arrayDeque.pollFirst();
                                        int iIntValue3 = num != null ? num.intValue() : -1;
                                        r31 r31Var = (r31) s31Var.f.get(Integer.valueOf(iIntValue3));
                                        au3 au3VarY = r31Var != null ? r31Var.a.y() : null;
                                        if (au3VarY == null) {
                                            k2d k2dVar = s31Var.a;
                                            k2dVar.getClass();
                                            au3 au3VarC = k2dVar.c(i, i2, Bitmap.Config.ARGB_8888);
                                            r31Var = new r31(au3VarC);
                                            au3VarY = au3VarC.clone();
                                        }
                                        r31Var.b = true;
                                        try {
                                            s31Var.f(iIntValue2, au3VarY);
                                            au3VarY.close();
                                            s31Var.f.remove(Integer.valueOf(iIntValue3));
                                            r31Var.b = false;
                                            s31Var.f.put(Integer.valueOf(iIntValue2), r31Var);
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                rx8.n(au3VarY, th);
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                he2 he2Var = (he2) this.d;
                int i6 = this.b;
                int i7 = this.c;
                he2Var.b = i6;
                tvj.g("CameraController", "setEnabledUseCases: failed to enable use cases properly for enabledUseCases = " + Integer.toBinaryString(i7) + ", restoring back previous values " + Integer.toBinaryString(i6));
                return;
            case 2:
                bc7 bc7Var = (bc7) this.d;
                int i8 = this.b;
                int i9 = this.c;
                if (bc7Var.i && bc7Var.j && bc7Var.f != null) {
                    try {
                        bc7Var.f.changeCaptureFormat(i8, i9, 0);
                        return;
                    } catch (Throwable th3) {
                        bc7Var.c.reportException("FrameCapturerImpl", "", new ScreenShareException("Error change capture format", th3));
                        return;
                    }
                }
                return;
            case 3:
                ((n7b) ((i1m) this.d).a).e.h(this.b, this.c);
                return;
            case 4:
                g5f g5fVar = (g5f) this.d;
                int i10 = this.b;
                int i11 = this.c;
                bc7 bc7Var2 = g5fVar.d;
                if (bc7Var2 != null) {
                    bc7Var2.a(i10, i11);
                    return;
                }
                return;
            case 5:
                ((n8g) ((gj2) this.d).c).d.h(this.b, this.c);
                return;
            case 6:
                zbh zbhVar = (zbh) this.d;
                int i12 = this.b;
                int i13 = this.c;
                if (zbhVar.i != i12) {
                    zbhVar.i = i12;
                    z2 = true;
                }
                if (zbhVar.h != i13) {
                    zbhVar.h = i13;
                } else {
                    z = z2;
                }
                if (z) {
                    zbhVar.f();
                    return;
                }
                return;
            case 7:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.b, this.c);
                return;
            case 8:
                ((SurfaceViewRenderer) this.d).lambda$onFrameResolutionChanged$0(this.b, this.c);
                return;
            default:
                TextureViewRenderer.updateFrameDimensionsAndReportEvents$lambda$0((TextureViewRenderer) this.d, this.b, this.c);
                return;
        }
    }
}
