package defpackage;

import android.os.Parcel;
import android.os.SystemClock;
import android.webkit.WebChromeClient;
import one.video.transloader.task.UploadTask;

/* JADX INFO: loaded from: classes3.dex */
public final class eth implements bki, vtj, rg4, whe {
    public Object a;

    public /* synthetic */ eth(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, nq4 nq4Var) {
        vgk vgkVar;
        if (nq4Var instanceof vgk) {
            vgkVar = (vgk) nq4Var;
            int i = vgkVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgkVar.f = i - Integer.MIN_VALUE;
            } else {
                vgkVar = new vgk(this, nq4Var);
            }
        } else {
            vgkVar = new vgk(this, nq4Var);
        }
        Object obj = vgkVar.d;
        int i2 = vgkVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return ((roe) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        zfh zfhVar = (zfh) this.a;
        vgkVar.f = 1;
        Object objA = zfhVar.a(str, vgkVar);
        hu4 hu4Var = hu4.a;
        return objA == hu4Var ? hu4Var : objA;
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) throws Exception {
        Double d = (Double) obj;
        d.getClass();
        double dDoubleValue = d.doubleValue();
        ykc ykcVar = (ykc) this.a;
        double d2 = ykcVar.i;
        iaa iaaVar = ykcVar.f;
        double dAbs = Math.abs(dDoubleValue - d2);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        vke vkeVar = ykcVar.a;
        boolean z = dAbs > vkeVar.a;
        boolean z2 = jElapsedRealtime - ykcVar.j > ((long) vkeVar.c);
        if (z || z2) {
            ykcVar.j = jElapsedRealtime;
            iaaVar.invoke("submit p2p network status");
            ykcVar.i = d.doubleValue();
            ykcVar.e.invoke(d);
            return;
        }
        iaaVar.invoke("not valuable network status diff: " + dAbs + ": " + ykcVar.i + " -> " + d);
    }

    @Override // defpackage.bki
    public void g(long j, long j2) {
        if (j == 0) {
            return;
        }
        UploadTask uploadTask = (UploadTask) this.a;
        uploadTask.k.K(new g03(2, j, j2, uploadTask));
    }

    @Override // defpackage.vtj
    public void m(WebChromeClient.FileChooserParams fileChooserParams) {
        a8j.x(((ioj) this.a).C1, new er6(fileChooserParams));
    }

    @Override // defpackage.vtj
    public void p(String str) {
        ioj iojVar = (ioj) this.a;
        iojVar.getClass();
        iojVar.G(new inj(str));
    }

    @Override // defpackage.whe
    public void accept(Object obj, Object obj2) {
        zlk zlkVar = new zlk((qjh) obj2, 0);
        llk llkVar = (llk) ((emk) obj).p();
        hp hpVar = (hp) this.a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(llkVar.e);
        int i = ykk.a;
        parcelObtain.writeStrongBinder(zlkVar);
        ykk.c(parcelObtain, hpVar);
        llkVar.G(1, parcelObtain);
    }
}
