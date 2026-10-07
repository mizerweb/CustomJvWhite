package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xud extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dvd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xud(dvd dvdVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = dvdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        dvd dvdVar = this.g;
        switch (i) {
            case 0:
                xud xudVar = new xud(dvdVar, lq4Var, 0);
                xudVar.f = obj;
                return xudVar;
            case 1:
                xud xudVar2 = new xud(dvdVar, lq4Var, 1);
                xudVar2.f = obj;
                return xudVar2;
            case 2:
                xud xudVar3 = new xud(dvdVar, lq4Var, 2);
                xudVar3.f = obj;
                return xudVar3;
            default:
                xud xudVar4 = new xud(dvdVar, lq4Var, 3);
                xudVar4.f = obj;
                return xudVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((xud) create((tjd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((xud) create((qud) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((xud) create((ipd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((xud) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        int i = this.e;
        sbi sbiVar = sbi.a;
        dvd dvdVar = this.g;
        switch (i) {
            case 0:
                tjd tjdVar = (tjd) this.f;
                ch3.d0(obj);
                dvdVar.Z.setValue(tjdVar.a);
                dvdVar.J.setValue(tjdVar.b);
                dvdVar.X.setValue(tjdVar.c);
                return sbiVar;
            case 1:
                qud qudVar = (qud) this.f;
                ch3.d0(obj);
                a8j.x(dvdVar.B, qudVar);
                return sbiVar;
            case 2:
                ic6 ic6Var = dvdVar.B;
                wjd wjdVar = dvdVar.p1;
                ipd ipdVar = (ipd) this.f;
                ch3.d0(obj);
                if (!(ipdVar instanceof fpd)) {
                    if (!(ipdVar instanceof gpd)) {
                        ore.o();
                        return null;
                    }
                    Long l = ((gpd) ipdVar).a;
                    if (l.longValue() != wjdVar.h()) {
                        return sbiVar;
                    }
                    a8j.x(ic6Var, new pud(4, new tnh(R.string.profile_change_avatar_success), Integer.valueOf(R.drawable.ic_check_filled_24)));
                    return sbiVar;
                }
                fpd fpdVar = (fpd) ipdVar;
                Long l2 = fpdVar.a;
                ynh ynhVar = fpdVar.b;
                if (l2.longValue() != wjdVar.h()) {
                    return sbiVar;
                }
                dq4 dq4Var = dvdVar.b;
                xt4 xt4VarB = ((n0c) dvdVar.F()).b();
                yt4 yt4VarE = dvdVar.E();
                xt4VarB.getClass();
                yab.i0(dq4Var, lvb.x0(xt4VarB, yt4VarE), 0, new zud(dvdVar, null, 2), 2);
                a8j.x(ic6Var, new pud(4, ynhVar, Integer.valueOf(R.drawable.icon_warning)));
                return sbiVar;
            default:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                try {
                    AtomicReference atomicReference = dvdVar.q1;
                    ny8 ny8Var = dvdVar.r;
                    Uri uriFromFile = Uri.fromFile(((ju6) ny8Var.getValue()).t((String) atomicReference.updateAndGet(new g23(7))));
                    if (!uriFromFile.toString().startsWith("content://")) {
                        uriFromFile = ((ju6) ny8Var.getValue()).i((Context) dvdVar.r1.getValue(), u1m.b(uriFromFile));
                    }
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", uriFromFile);
                    intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                    poeVar = intent;
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    gm0.V(gu4Var.getClass().getName(), "capturePhoto: failed to capture photo", thA);
                    dvdVar.Q();
                }
                if (!(poeVar instanceof poe)) {
                    a8j.x(dvdVar.B, new gud((Intent) poeVar));
                }
                return sbiVar;
        }
    }
}
