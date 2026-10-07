package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wf3 extends a8j {
    public static final /* synthetic */ zv8[] A = {new z8b(wf3.class, "createChannelJob", "getCreateChannelJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, wf3.class, "updateChannelJob", "getUpdateChannelJob()Lkotlinx/coroutines/Job;")};
    public final long[] c;
    public final jhg d;
    public final gjf e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final mjg p;
    public final r8e q;
    public final ic6 r;
    public final ic6 s;
    public final AtomicLong t;
    public final p3c u;
    public final p3c v;
    public sgg w;
    public volatile String x;
    public String y;
    public String z;

    public wf3(long[] jArr, jhg jhgVar, gjf gjfVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11) {
        this.c = jArr;
        this.d = jhgVar;
        this.e = gjfVar;
        this.f = ny8Var;
        this.g = ny8Var3;
        this.h = ny8Var2;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = ny8Var6;
        this.l = ny8Var7;
        this.m = ny8Var8;
        this.n = ny8Var11;
        this.o = ny8Var10;
        lq4 lq4Var = null;
        mjg mjgVarA = p90.a(new tf3(null, null, null));
        this.p = mjgVarA;
        this.q = new r8e(mjgVarA);
        this.r = new ic6(null);
        this.s = new ic6(null);
        this.t = new AtomicLong();
        this.u = qyj.S();
        this.v = qyj.S();
        this.y = "";
        this.z = "";
        if (jhgVar == jhg.CHANNEL) {
            e9i.j0(new fz6(new q8e(((rv4) ny8Var9.getValue()).a), new uf3(this, ny8Var2, ny8Var10, lq4Var, 0), 3), this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable B(wf3 wf3Var, String str, Rect rect, nq4 nq4Var) {
        vf3 vf3Var;
        Serializable poeVar;
        int i;
        Bitmap bitmap;
        File file;
        if (nq4Var instanceof vf3) {
            vf3Var = (vf3) nq4Var;
            int i2 = vf3Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vf3Var.j = i2 - Integer.MIN_VALUE;
            } else {
                vf3Var = new vf3(wf3Var, nq4Var);
            }
        } else {
            vf3Var = new vf3(wf3Var, nq4Var);
        }
        Object objV = vf3Var.h;
        int i3 = vf3Var.j;
        hu4 hu4Var = hu4.a;
        try {
            if (i3 == 0) {
                ch3.d0(objV);
                xt4 xt4VarB = ((n0c) wf3Var.C()).b();
                wre wreVar = new wre(str, rect, wf3Var, 10);
                vf3Var.d = wf3Var;
                i = 0;
                vf3Var.g = 0;
                vf3Var.j = 1;
                objV = qyj.V(xt4VarB, wreVar, vf3Var);
                if (objV == hu4Var) {
                }
                return hu4Var;
            }
            if (i3 == 1) {
                int i4 = vf3Var.g;
                wf3 wf3Var2 = vf3Var.d;
                ch3.d0(objV);
                i = i4;
                wf3Var = wf3Var2;
            } else {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file = vf3Var.f;
                bitmap = vf3Var.e;
                ch3.d0(objV);
            }
            bitmap.recycle();
            poeVar = file.getAbsolutePath();
            if (roe.a(poeVar) != null) {
                gm0.n(wf3.class.getName(), "local crop failed. Crop will be applied after update from server");
            }
            if (poeVar instanceof poe) {
                return null;
            }
            return poeVar;
            Bitmap bitmap2 = (Bitmap) objV;
            if (bitmap2 != null) {
                ju6 ju6VarD = wf3Var.D();
                ju6VarD.getClass();
                File fileP = ju6VarD.p(null, "jpg");
                xt4 xt4VarB2 = ((n0c) wf3Var.C()).b();
                wre wreVar2 = new wre(fileP, bitmap2, wf3Var, 11);
                vf3Var.d = null;
                vf3Var.e = bitmap2;
                vf3Var.f = fileP;
                vf3Var.g = i;
                vf3Var.j = 2;
                if (qyj.V(xt4VarB2, wreVar2, vf3Var) != hu4Var) {
                    bitmap = bitmap2;
                    file = fileP;
                    bitmap.recycle();
                    poeVar = file.getAbsolutePath();
                }
                return hu4Var;
            }
            poeVar = null;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            gm0.n(wf3.class.getName(), "local crop failed. Crop will be applied after update from server");
        }
        if (poeVar instanceof poe) {
            return null;
        }
        return poeVar;
    }

    public final xhh C() {
        return (xhh) this.h.getValue();
    }

    public final ju6 D() {
        return (ju6) this.i.getValue();
    }

    public final void E() {
        Object poeVar;
        if (!((wsc) this.g.getValue()).c(wsc.n)) {
            a8j.x(this.r, lf3.b);
            return;
        }
        try {
            this.x = String.valueOf(System.currentTimeMillis());
            Uri uriFromFile = Uri.fromFile(D().t(this.x));
            if (!uriFromFile.toString().startsWith("content://")) {
                uriFromFile = D().i((Context) this.m.getValue(), u1m.b(uriFromFile));
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriFromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            poeVar = intent;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            this.x = null;
            h8c h8cVar = (h8c) this.l.getValue();
            h8cVar.m(new tnh(R.string.cant_open_camera));
            h8cVar.h(new w8c(R.drawable.icon_warning));
            h8cVar.p();
            gm0.V(wf3.class.getName(), "capturePhoto: failed to capture photo", thA);
        }
        if (poeVar instanceof poe) {
            return;
        }
        a8j.x(this.r, new kf3((Intent) poeVar));
    }
}
