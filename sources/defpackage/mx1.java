package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Map;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mx1 implements ug4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mx1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ug4
    public final void accept(Object obj) {
        int i = this.a;
        lq4 lq4Var = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((njd) obj2).c(Boolean.valueOf(((fzc) obj).a));
                break;
            case 1:
                hj2 hj2Var = (hj2) obj2;
                v3j v3jVar = (v3j) obj;
                if (v3jVar instanceof q3j) {
                    q3j q3jVar = (q3j) v3jVar;
                    if (q3jVar.d != 0) {
                        gm0.n(hj2.class.getName(), "onCameraError");
                        zf2 zf2Var = hj2Var.f;
                        if (zf2Var != null) {
                            ((ft0) zf2Var).y(new CameraExceptionImpl(q3jVar.e));
                        }
                    } else {
                        gm0.n(hj2.class.getName(), "onVideoTaken");
                        zf2 zf2Var2 = hj2Var.f;
                        if (zf2Var2 != null) {
                            File file = q3jVar.a.b.c;
                            k2e k2eVar = (k2e) ((ft0) zf2Var2).a;
                            if (k2eVar.getCanRecordingVideo()) {
                                n2e n2eVar = k2eVar.d;
                                if (n2eVar == null) {
                                    n2eVar = null;
                                }
                                a8j.t(n2eVar, ((n0c) n2eVar.i).b(), new t20(n2eVar, file, lq4Var, 29), 2);
                            }
                        }
                    }
                }
                break;
            case 2:
                ((dee) obj2).L = (Uri) obj;
                break;
            case 3:
                dj0 dj0Var = (dj0) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i2 = dj0Var.b - ((ei0) entry.getKey()).f;
                    if (((ei0) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int iK = y1i.k(i2);
                    zbh zbhVar = (zbh) entry.getValue();
                    zbhVar.getClass();
                    wxl.d(new q31(zbhVar, iK, -1, 6));
                }
                break;
            case 4:
                oo ooVar = (oo) obj2;
                tvj.a("SurfaceViewImpl", "Safe to release surface.");
                if (ooVar != null) {
                    ooVar.g();
                }
                break;
            case 5:
                ((r72) obj2).b((cj0) obj);
                break;
            default:
                i5b i5bVar = (i5b) obj2;
                tvj.a("VideoEncoderSession", "Surface can be closed: " + ((cj0) obj).b);
                i5bVar.g = null;
                ((r72) i5bVar.l).b((m86) i5bVar.f);
                i5bVar.a();
                break;
        }
    }
}
