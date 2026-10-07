package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xof extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bpf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xof(bpf bpfVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = bpfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        bpf bpfVar = this.g;
        switch (i) {
            case 0:
                xof xofVar = new xof(bpfVar, lq4Var, 0);
                xofVar.f = obj;
                return xofVar;
            default:
                xof xofVar2 = new xof(bpfVar, lq4Var, 1);
                xofVar2.f = obj;
                return xofVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((xof) create((epd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((xof) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        int i = this.e;
        sbi sbiVar = sbi.a;
        bpf bpfVar = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                epd epdVar = (epd) obj2;
                ch3.d0(obj);
                if (epdVar != null) {
                    Long l = epdVar.a;
                    ynh ynhVar = epdVar.b;
                    Integer numValueOf = Integer.valueOf(R.drawable.icon_warning);
                    ic6 ic6Var = bpfVar.z;
                    long j = bpfVar.G.get();
                    if (l != null && l.longValue() == j) {
                        dq4 dq4Var = bpfVar.b;
                        xt4 xt4VarA = ((n0c) bpfVar.D()).a();
                        yt4 yt4VarC = bpfVar.C();
                        xt4VarA.getClass();
                        yab.i0(dq4Var, lvb.x0(xt4VarA, yt4VarC), 0, new apf(bpfVar, null, 3), 2);
                        a8j.x(ic6Var, new ouf(ynhVar, numValueOf));
                    } else if (l == null) {
                        a8j.x(ic6Var, new ouf(ynhVar, numValueOf));
                    }
                }
                break;
            default:
                gu4 gu4Var = (gu4) obj2;
                ch3.d0(obj);
                ic6 ic6Var2 = bpfVar.z;
                ny8 ny8Var = bpfVar.l;
                AtomicReference atomicReference = bpfVar.F;
                try {
                    atomicReference.set(String.valueOf(System.currentTimeMillis()));
                    Uri uriFromFile = Uri.fromFile(((ju6) ny8Var.getValue()).t((String) atomicReference.get()));
                    if (!uriFromFile.toString().startsWith("content://")) {
                        uriFromFile = ((ju6) ny8Var.getValue()).i(bpfVar.f, u1m.b(uriFromFile));
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
                    gm0.V(gu4Var.getClass().getName(), "capturePhoto: failed to capture photo", thA);
                    atomicReference.set(null);
                    a8j.x(ic6Var2, new ouf(new tnh(R.string.oneme_settings_cant_open_camera), Integer.valueOf(R.drawable.icon_warning)));
                }
                if (!(poeVar instanceof poe)) {
                    a8j.x(ic6Var2, new muf((Intent) poeVar));
                }
                break;
        }
        return sbiVar;
    }
}
